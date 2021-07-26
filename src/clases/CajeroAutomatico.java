package clases;

public class CajeroAutomatico {
	
	private Banco banco;
	private Usuario user;
	private Dispensador dis;
	private Pantalla pan;
	private Teclado tec;
	private RanuraDeposito ran;
		
	public CajeroAutomatico() {
		banco=Banco.getInstance();
		dis=new Dispensador();
		pan=new Pantalla();
		tec=new Teclado();
		ran=new RanuraDeposito();
	}
	
	public Dispensador getDispensador() {
		return dis;
	}
	public Pantalla getPantalla() {
		return pan;
	}
	public Teclado getTeclado() {
		return tec;
	}
	public RanuraDeposito getRanuraDeposito() {
		return ran;
	}
	public Usuario getUsuario() {
		return user;
	}
	public Banco getBanco() {
		return banco;
	}
	
	public boolean iniciarSesion(int NIP, int nCuenta) {
		int cont=0;
		Usuario usuario;
		do {
			usuario=banco.getUsuario(cont);	
			if(usuario.getNIP()==NIP) {
				if(usuario.getCuenta().getNCuenta()==nCuenta) {
					
					user=usuario;
					return true;
				} else {
					cont++;
				}
			} else {
				cont++;
				
			}
			
		}while(cont!=banco.getNumUsuarios());
		return false;
		
		
	}
	
	public boolean depositar(double monto) {
		
		if(user.getCuenta().depositar(monto)==true) {
			ran.depositar(monto, user.getCuenta().getNCuenta());
			return true;
		}
		return false;
		
	}
	
	public boolean retirar(double monto) {
		if(user.getCuenta().retirar(monto)==true) {
			getDispensador().retirarDinero(monto);
			return true;
		}
		return false;
	}
	
	public double consultaSaldo() {
		return user.getCuenta().consultaSaldo();
	}
	
	
	
	
}
