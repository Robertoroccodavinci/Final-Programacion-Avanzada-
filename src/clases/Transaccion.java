package clases;

import java.util.*;

public abstract class Transaccion {
	
	private Calendar fecha;
	private boolean estado;
	
	public Transaccion() {
		
	}
	public String getTipo() {
		return this.getClass().getSimpleName();
	}
	public void setFecha() {
		this.fecha=Calendar.getInstance();
	}
	public Calendar getFecha() {
		return fecha;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public boolean getEstado() {
		return estado;
	}
	
	
	
	
	
}
