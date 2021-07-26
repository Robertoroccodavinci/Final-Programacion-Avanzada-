package clases;

public class Cuenta {
	
	private int nCuenta;
	private Saldo sal;
	private Deposito dep;
	private Retiro ret;
		
	public Cuenta(double saldo,int nCuenta) {
		setNCuenta(nCuenta);
		sal=new Saldo(saldo);
		dep=new Deposito();
		ret=new Retiro();
	}
	
	public void setNCuenta(int nCuenta) {
		
		if(String.valueOf(nCuenta).length()==5) {
			this.nCuenta=nCuenta; 
		}else {
			throw new IllegalArgumentException("ERROR");
		}
	
	}
	
	public int getNCuenta() {
		return nCuenta;
	}
			
	public double consultaSaldo() {
		return sal.getSaldo();
	}
	public boolean depositar(double monto) {
		if(dep.depositar(monto,consultaSaldo())>0.0) {
			sal.setSaldo(dep.depositar(monto,consultaSaldo()));
			return true;
		}
		return false;
		
	}
	public boolean retirar(double monto) {
		if(ret.retirar(monto, consultaSaldo())>0.0) {
			sal.setSaldo(ret.retirar(monto, consultaSaldo()));
			return true;
		}
		return false;
		
		
	}
	
}
