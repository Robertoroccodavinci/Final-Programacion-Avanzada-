package clases;

public class Saldo extends Transaccion{
	
	private double saldo;
	
	public Saldo(double saldo) {
		
		this.saldo=saldo;
		
	}
	
	public void setSaldo(double monto) { 
		
		if (monto>0.0)
			saldo=monto;
		else 
			throw new IllegalArgumentException("monto debe ser mayor a 0.0");
    }
	
	public double getSaldo() {
        return saldo;
    }

	 public String toString() {
    	return "\nSALDO: "+saldo+"$.\n";
    	
	 }
}
