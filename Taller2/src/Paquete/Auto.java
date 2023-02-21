package test
package Paquete;

public class Auto {
	public String modelo;
	public int precio;
	public Asiento asiento[];
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos() {
		int cantidad = 0;
		for (int i=0; i<asientos.lenght;i++) {
			if (asientos[i]!=null) {
				cantidad++;
			}
		}
		return cantidad
	}
	public String verificarIntegridad() {
		if(motor.registro==registro) {
			for (int i=0; i<asientos.lenght;i++) {
				if (asientos[i]!=null) {
					if(registro !=asientos[i].registros) {
				}
			}
		}
			
	}
		else {}
}
