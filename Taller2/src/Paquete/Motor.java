package test
//package Paquete;

public class Motor {
	public int numeroCilindros;
	public String tipo;
	public int registro;
	
	void cambiarRegistro(int registro) {
		this.registro=registro;
	}
		
	
	void asignarTipo(String tipo) {
		if ("electrico".equals(tipo)||"gasolina".equals(tipo)) {
			this.tipo = tipo;
		}
	}
		//tipos = ["electrico", "gasolina"];
	//if tipo in tipos:
		//this.tipo=tipo
}
