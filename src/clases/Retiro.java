package clases;

public class Retiro extends Transaccion{
	public Retiro() {}
	
	public double retirar(double amount, double saldo) {
		
		if(amount<=saldo) {

			return saldo-amount;

		} else {

			return 0.0;
		}
		
		
	}
}
