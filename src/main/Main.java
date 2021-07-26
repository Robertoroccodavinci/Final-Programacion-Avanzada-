package main;




import clases.*;

public class Main {

	public static void main(String[] args) {
		
		CajeroAutomatico ca=new CajeroAutomatico();
		
		//CREAMOS USUARIOS Y CUENTAS, E IMPRIMIMOS LOS DATOS 
		inicializarUsuarios(ca.getBanco());
				
		int	cont=0;
		do{
			ca.getPantalla().mensajeInicio();
			ca.getPantalla().mensajeNIP();
			int numeroUsuario = ca.getTeclado().numInt(5,1);
			ca.getPantalla().mensajeNCuenta();
			int numeroCuenta = ca.getTeclado().numInt(5,2);
			
			if(ca.iniciarSesion(numeroUsuario, numeroCuenta)==true) {

				ca.getPantalla().mensajeInicioSesion(ca.getUsuario().getNombre(), ca.getUsuario().getApellido());
				ca.getTeclado().continuar();
				
				int contt=0;
				do{
					ca.getPantalla().mensajeMenu();
					int numeroTransaccion=ca.getTeclado().numInt(1,3);
				
					switch(numeroTransaccion) {
						case 1: 
							ca.getPantalla().mensajeConsultaSaldo(ca.consultaSaldo());
							ca.getTeclado().continuar();
							break;
						case 2: 
							ca.getPantalla().mensajeInicioDepositar();
							double monto=ca.getTeclado().numDouble();
							ca.getPantalla().mensajeDepositar(monto,ca.consultaSaldo(), ca.depositar(monto));
							ca.getTeclado().continuar();
							break;
						case 3:
							ca.getPantalla().mensajeInicioRetirar();
							double montoR=ca.getTeclado().numDouble();
							ca.getPantalla().mensajeRetirar(montoR,ca.consultaSaldo(), ca.retirar(montoR));
							ca.getTeclado().continuar();
							break;
						case 4:
							ca.getPantalla().mensajeSalir();
							ca.getTeclado().continuar();
							
							contt=1;
							break;
					}
				}while(contt==0);
			}
		}while(cont==0);

	}
	
	//METODO PARA INICIALIZAR USUARIOS Y MOSTRARLOS
	private static void inicializarUsuarios(Banco banco) {
		Usuario usuario;
		
		// CREAR USUARIOS CON NOMBRE Y APELLIDO Y CUENTAS CON SALDO INICIAL
		String[] nombre= {"Jane","Jose","Pepito","Carlos","Martin","Luis"};
		String[] apellido= {"Simms","Perez","Fuentes","Caruso","Alvarez","Podest�"};
		int[] fechaNac= {12,23,29,5,3,16,2,5,7,8,11,10,1991,1989,2000,1984,2001,1998};
		double[] saldoInicial= {50500, 33330, 40460, 72830, 9820, 56981};
		int[] NIP= {87462, 15874, 98562, 54185, 15648, 87954};
		int[] nCuenta= {25875, 96874, 78954, 32465, 25436, 31975};	
		int uCont=0;

		do {
			
			banco.addUsuario(nombre[uCont],apellido[uCont], NIP[uCont],saldoInicial[uCont],nCuenta[uCont]);
	        usuario = banco.getUsuario(uCont);
	        usuario.setFechaNac(fechaNac[uCont], fechaNac[(uCont+6)], fechaNac[(uCont+12)]);
		
			uCont++;
		} while(uCont!=nombre.length);


        
        // MOSTRAR USUARIOS
		
        int cont=0;
        String contenido="";
        do {
        	contenido+="#####################<Usuario: "+(cont+1)+">########################\n"+
					   "Nombre y Apellido: "+banco.getUsuario(cont).getNombre()+" "+banco.getUsuario(cont).getApellido()+"\n"+
					   "Fecha Nacimiento: "+banco.getUsuario(cont).getFechaNac()+"\n"+
					   "Saldo: "+banco.getUsuario(cont).getCuenta().consultaSaldo()+"\n"+
					   "NIP: "+banco.getUsuario(cont).getNIP()+"\n"+
					   "Numero de Cuenta: "+banco.getUsuario(cont).getCuenta().getNCuenta()+"\n";
        	
        	cont=cont+1;
        	
        }while(cont!=banco.getNumUsuarios());
        
        System.out.println(contenido);
        
    }

}
