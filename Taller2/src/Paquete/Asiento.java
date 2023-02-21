package test
//package Paquete;

public class Asiento {
	public String color;
	public int precio;
	public int registro;
	
	void cambiarColor(String color) {
		if (color.equals("rojo") || color.equals("verde")|| color.equals("amarillo")|| color.equals("negro")|| color.equals("blanco")) {
			this.color = color;
		}
		//colores = ["rojo", "verde", "amarillo", "negro", "blanco"];
		//if color in colores:
			//this.color=color				
	}
	

}
