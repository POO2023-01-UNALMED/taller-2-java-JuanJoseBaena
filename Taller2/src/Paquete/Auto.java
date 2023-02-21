package test
//package Paquete;

public class Auto {
	public String modelo;
	public int precio;
	public Asiento[] asientos;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos() {
		int anch = asientos.lenght;
		int contAsientos = 0;
		for (int i=0 ; i<anch ; i++) {
			if(asientos[i]==null) {
				contAsientos = contAsientos;
			}else {
				contAsientos++;
			}
		//int cantidad = 0;
		//for (int i=0; i<asientos.lenght;i++) {
			//if (asientos[i]!=null) {
				//cantidad++;
			}
		}
		return contAsientos;
	}
	public String verificarIntegridad() {
		int RegistroAuto = registro;
		int RegistroMotor = motor.registro;
		int cont = asientos.length;
		
		for (int i = 0 ; i< cont ; i++) {
			if (asientos[i] != null) {
				if (asientos[i].registro !=RegistroMotor) {
					return "Las piezas no son originales";
		//if(motor.registro==registro) {
			//for (int i=0; i<asientos.lenght;i++) {
				//if (asientos[i]!=null) {
					//if(registro !=asientos[i].registros) {
				}
				if (asientos[i].registro !=RegistroAuto) {
					return "Las piezas no son originales";
			}
		}
			
	}
	return"Auto original";
}
