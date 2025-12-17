export interface AnalisisRespuesta {
  resultado: string;
  errores: string[];
}

export async function analizarCodigo(codigo: string): Promise<AnalisisRespuesta> {
  try {
    const response = await fetch("http://localhost:8080/api/analizador", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify({ codigo }),
    });

    if (!response.ok) {
      throw new Error(`Error del servidor: ${response.status}`);
    }

    const data = await response.json();
    return {
      resultado: data.resultado || "",
      errores: data.errores || [],
    };
  } catch (error) {
    return {
      resultado: "",
      errores: ["Error de conexión con el servidor."],
    };
  }
}
