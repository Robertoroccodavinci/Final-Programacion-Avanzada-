package clases;

public class Banco {
	
	private final static Banco instance=new Banco();
	private Usuario[] usuario;
	private int numUsuarios;
	
	private Banco() {
		usuario=new Usuario[10];
		numUsuarios=0;
	}
	
	public static Banco getInstance() {
		return instance;
	}
	
	public int getNumUsuarios() {
		return numUsuarios;
	}
		
	public void addUsuario(String nombre, String apellido, int NIP,double saldo, int nCuenta) {
        int i = numUsuarios++;
        usuario[i] = new Usuario(nombre,apellido,NIP,saldo,nCuenta);
    }
	
	public Usuario getUsuario(int index) {
		return usuario[index];
	}
	
	
	
	
}
