package clases;

public class Dispensador {
	
	private int cant;
	private int valor;
	
	public Dispensador() {
		cant = 500;
		valor = 20;
	}
	
	public double getDinero() {
		return cant*valor;
	}
	
	public void retirarDinero(double monto) {
		cant-=monto/20;		
	}
	
}
