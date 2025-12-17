import { useState } from "react";
import TextareaAutosize from "@mui/material/TextareaAutosize";
import { Button } from "@mui/material";
import "@fontsource/orbitron";
import "./Apps.css";
import { analizarCodigo } from "./services/api";
export default function AnalizadorSintactico() {
  const [code, setCode] = useState("");
  const [resultado, setResultado] = useState("");
  const [errores, setErrores] = useState<string[]>([]);

  const handleAnalizar = async () => {
    const data = await analizarCodigo(code);
    setResultado(data.resultado);
    setErrores(data.errores);
  };

  return (
    <div style={{ backgroundColor: "#000", minHeight: "100vh", width: "80vw" }}>
      <header style={{ display: "flex", alignItems: "center", justifyContent: "space-between", padding: "5px 50px", marginTop: "20px", borderTop: "3px solid white", borderBottom: "3px solid white" }}>
        <h1 style={{ color: "#BF111B", fontFamily: "Orbitron, sans-serif", fontSize: "1.8rem" }}>
          Compiladores Poyecto 2
        </h1>
        <img src="/logo.jpg" alt="Logo" style={{ height: "60px" }} />
      </header>

      <div className="contenido">
        <section style={{ width: "100%", padding: "30px 5vw", background: "#ffa500", marginTop: "20px", boxSizing: "border-box" }}>
          <h3 style={{ color: "#000", textAlign: "center" }}>Ingresa tu código</h3>
          <div style={{ display: "flex", gap: "10px", alignItems: "stretch", justifyContent: "center", flexWrap: "wrap" }}>
            <TextareaAutosize
              value={code}
              onChange={(e) => setCode(e.target.value)}
              placeholder="Ej: A == 5 + (3 * 2)"
              style={{
                flex: 1,
                width: "100%",
                minHeight: "100px",
                maxHeight: "100px",
                background: "#ffa500",
                color: "#000",
                padding: "10px",
                fontFamily: "monospace",
                fontSize: "16px",
                border: "2px solid #000",
                borderRadius: "12px",
                resize: "none",
                outline: "none",
                overflow: "auto",
                boxSizing: "border-box"
              }}
            />
            <Button
              onClick={handleAnalizar}
              variant="contained"
              style={{ background: "#000", color: "#BF111B", height: "100px", borderRadius: "12px", outline: "none" }}>
              Analizar
            </Button>
          </div>
        </section>

        <section style={{ width: "100%", padding: "30px 5vw", background: "#ff8c00", boxSizing: "border-box" }}>
          <h3 style={{ color: "#000", textAlign: "center" }}>Resultado</h3>
          <textarea
            readOnly
            value={resultado}
            style={{
              width: "100%",
              height: "100px",
              background: "#ff8c00",
              color: "#000",
              padding: "10px",
              fontFamily: "monospace",
              fontSize: "16px",
              border: "2px solid #000",
              borderRadius: "12px",
              resize: "none",
              overflow: "auto",
              outline: "none",
              boxSizing: "border-box",
            }}
          />
        </section>

        <section style={{ width: "100%", padding: "30px 5vw", background: "#BF111B", boxSizing: "border-box", marginTop: "40px" }}>
          <h3 style={{ color: "#000", textAlign: "center" }}>Errores</h3>
          <textarea
            readOnly
            value={errores.length === 0 ? "Sin errores." : errores.join("\n")}
            style={{
              width: "100%",
              height: "100px",
              background: "#BF111B",
              color: errores.length ? "#fff" : "#000",
              padding: "10px",
              fontFamily: "monospace",
              fontSize: "16px",
              border: "2px solid #000",
              borderRadius: "12px",
              resize: "none",
              overflow: "auto",
              outline: "none",
              boxSizing: "border-box"
            }}
          />
        </section>
      </div>
    </div>
  );
}
