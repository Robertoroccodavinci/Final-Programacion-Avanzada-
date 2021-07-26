package clases;

public class Deposito extends Transaccion{
	
	public Deposito() {
		
	}
	
	public double depositar(double monto,double saldo) {
		
		if(monto>0.0) {
			
			return monto+saldo;
		
		}else {			
		
			return 0.0;
		}
		
	}
}
