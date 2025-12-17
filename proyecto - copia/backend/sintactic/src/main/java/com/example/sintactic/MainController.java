package com.example.sintactic;

import org.springframework.web.bind.annotation.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

@RestController
@RequestMapping("/api/analizador")
@CrossOrigin(origins = "*") // permite solicitudes desde cualquier frontend
public class MainController {

    @PostMapping
    public Map<String, Object> analizar(@RequestBody Map<String, String> request) {
        String input = request.get("codigo");
        Map<String, Object> response = new HashMap<>();

        AntlrLexer lexer = new AntlrLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AntlrParser parser = new AntlrParser(tokens);

        SyntaxErrorListener errorListener = new SyntaxErrorListener();
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);

        ParseTree tree = parser.prog();

        List<String> errores = errorListener.getErrors();

        if (!errores.isEmpty()) {
            response.put("errores", errores);
            response.put("resultado", "");
        } else {
            EvalVisitor evalVisitor = new EvalVisitor();
            evalVisitor.visit(tree);

            if (!evalVisitor.getErrors().isEmpty()) {
                response.put("errores", evalVisitor.getErrors());
                response.put("resultado", "");
            } else {
                List<String> resultados = new ArrayList<>();
                evalVisitor.getVariables().forEach((k, v) -> resultados.add(k + " = " + v));
                response.put("resultado", String.join("\n", resultados));
                response.put("errores", Collections.emptyList());
            }
        }

        return response;
    }
}