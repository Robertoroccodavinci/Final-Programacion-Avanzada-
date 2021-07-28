package main;




import clases.*;

public class Main {

	public static void main(String[] args) {
		
		CajeroAutomatico ca=new CajeroAutomatico();
		
		//CREAMOS USUARIOS Y CUENTAS, E IMPRIMIMOS LOS DATOS 
		inicializarUsuarios(ca.getBanco());
				
		int	cont=0;

		do{
			//MENSAJE DE BIEVENIDA
			ca.getPantalla().mensajeInicio();
			int numeroCuenta;
			int numeroUsuario;

			// INICIO DE SESION, INGRESO DE NIP Y NUMERO DE CUENTA
			do{
				ca.getPantalla().mensajeNIP();
				numeroUsuario = ca.getTeclado().numInt(5,1);
				ca.getPantalla().mensajeNCuenta();
				numeroCuenta = ca.getTeclado().numInt(5,2);
			}while(ca.iniciarSesion(numeroUsuario, numeroCuenta)==false);
			
			// SESION INICIADA
			ca.getPantalla().mensajeInicioSesion(ca.getUsuario().getNombre(), ca.getUsuario().getApellido());
			ca.getTeclado().continuar();
			
			int contt=0;
			do{
				//MENU DE TRANSACCIONES
				ca.getPantalla().mensajeMenu();
				int numeroTransaccion=ca.getTeclado().numInt(1,3);
			
				switch(numeroTransaccion) {
					//CONSULTA DE SALDO
					case 1: 
						ca.getPantalla().mensajeConsultaSaldo(ca.consultaSaldo());
						ca.getTeclado().continuar();
						break;
					//DEPOSITAR	
					case 2: 
						ca.getPantalla().mensajeInicioDepositar();
						double monto=ca.getTeclado().numDouble();
						ca.getPantalla().mensajeDepositar(monto,ca.consultaSaldo(), ca.depositar(monto));
						ca.getTeclado().continuar();
						break;
					//RETIRAR	
					case 3:
						ca.getPantalla().mensajeInicioRetirar(ca.consultaSaldo());
						double montoR=ca.getTeclado().numRetirar();
						ca.getPantalla().mensajeRetirar(montoR,ca.consultaSaldo(), ca.retirar(montoR));
						ca.getTeclado().continuar();
						break;
					//SALIR	
					case 4:
						ca.getPantalla().mensajeSalir();
						ca.getTeclado().continuar();
						
						contt=1;
						break;
				}
			}while(contt==0);
			
		}while(cont==0);

	}
	
	//METODO PARA INICIALIZAR USUARIOS Y MOSTRARLOS
	private static void inicializarUsuarios(Banco banco) {
				
		// BASE DE DATOS DE USUARIOS CON NOMBRE, APELLIDO, NIP Y CUENTAS CON SALDO INICIAL Y NUMERO DE CUENTA
		String[] nombre= {"Jane","Jose","Pepito","Carlos","Martin","Luis"};
		String[] apellido= {"Simms","Perez","Fuentes","Caruso","Alvarez","Podest�"};
		double[] saldoInicial= {50500, 33330, 40460, 72830, 9820, 56981};
		int[] NIP= {87462, 15874, 98562, 54185, 15648, 87954};
		int[] nCuenta= {25875, 96874, 78954, 32465, 25436, 31975};	
		int uCont=0;

		//CREAMOS USUARIOS
		do {
			banco.addUsuario(nombre[uCont],apellido[uCont], NIP[uCont],saldoInicial[uCont],nCuenta[uCont]);

			uCont++;
		} while(uCont!=nombre.length);


        
        // MOSTRAR USUARIOS
		
        int cont=0;
        String contenido="";
        do {
        	contenido+="#####################<Usuario: "+(cont+1)+">########################\n"+
					   "Nombre y Apellido: "+banco.getUsuario(cont).getNombre()+" "+banco.getUsuario(cont).getApellido()+"\n"+
					   "Saldo: "+banco.getUsuario(cont).getCuenta().consultaSaldo()+"\n"+
					   "NIP: "+banco.getUsuario(cont).getNIP()+"\n"+
					   "Numero de Cuenta: "+banco.getUsuario(cont).getCuenta().getNCuenta()+"\n";
        	
        	cont=cont+1;
        }while(cont!=banco.getNumUsuarios());
        
        System.out.println(contenido);
        
    }

}
