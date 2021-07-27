package clases;

import java.util.*;

public class Usuario {
	
	private int NIP;
	private Cuenta cuenta;
	private String nombre;
	private String apellido;
			
	public Usuario(String nombre,String apellido,int NIP,double saldo, int nCuenta) {
		setNombre(nombre);
		setApellido(apellido);
		setNIP(NIP);
		setCuenta(saldo, nCuenta);
	}
	
	public void setNIP(int result) {
		if(String.valueOf(result).length()==5) {
			this.NIP=result; 
		}else {
			throw new IllegalArgumentException("ERROR");
		}
		
	}
	public int getNIP() { 
		return NIP; 
	}
	public void setNombre(String nombre) {
		this.nombre=nombre; 
	}
	public String getNombre() { 
		return nombre; 
	}
	public void setApellido(String apellido) {
		this.apellido=apellido; 
	}
	public String getApellido() {
		return apellido; 
	}
	public void setCuenta(double saldo,int nCuenta) {
		this.cuenta=new Cuenta(saldo,nCuenta); 
	}
	public Cuenta getCuenta() {
		return cuenta;
	}
		
	
}
