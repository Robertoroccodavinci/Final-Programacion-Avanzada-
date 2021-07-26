package clases;

public class Pantalla {

	public Pantalla() {
	
	}
	//INICIO
	public void mensajeInicio() {
		System.out.println("###########################################\n"+
						   "####                                   ####\n"+
						   "####          - BIENVENIDO -           ####\n"+
						   "####                                   ####\n"+
						   "###########################################\n");
	}
	
	//INICIO SESION
	public void mensajeNIP() {
		System.out.println("###########################################\n"+
						   "####                                   ####\n"+
						   "####         INGRESE NUMERO DE         ####\n"+
						   "####     IDENTIFICACION DE USUARIO     ####\n"+
						   "####                                   ####\n"+
						   "###########################################\n");
	}
	public void mensajeNCuenta() {
		System.out.println("###########################################\n"+
						   "####                                   ####\n"+
						   "####     INGRESE NUMERO DE CUENTA      ####\n"+
						   "####                                   ####\n"+
						   "###########################################\n");
	}
	public void mensajeInicioSesion(String nombre, String apellido) {
		System.out.println("###########################################\n"+
						   "####                                       \n"+
						   "####      - BIENVENIDO USUARIO! -          \n"+
						   "####      - "+nombre.toUpperCase()+" "+apellido.toUpperCase()+" - \n"+
						   "####                                       \n"+
						   "###########################################\n");
		
	}
	
	//MENU
	public void mensajeMenu() {
		System.out.println("###########################################\n"+
						   "####                                   ####\n"+
						   "#### - INGRESE NUMERO DE TRANSACCION - ####\n"+
  					       "#### -> OPCION 1: CONSULTAR SALDO    - ####\n"+
				 	       "#### -> OPCION 2: DEPOSITAR          - ####\n"+
				 	       "#### -> OPCION 3: RETIRAR            - ####\n"+
						   "#### -> OPCION 4: SALIR              - ####\n"+
						   "####                                   ####\n"+
						   "###########################################\n");
	}
	
	
	//CONSULTAR SALDO
	public void mensajeConsultaSaldo(double saldo) {
		System.out.println("###########################################\n"+
						   "####                                       \n"+
						   "####       - CONSULTA SALDO -              \n"+
					       "####         SALDO: "+saldo+"              \n"+
						   "####                                       \n"+
						   "###########################################\n");
	}
	
	//DEPOSITAR
	public void mensajeInicioDepositar() {
		System.out.println("###########################################\n"+
						   "####                                   ####\n"+
						   "####   - INGRESE MONTO A DEPOSITAR -   ####\n"+
					       "####                                   ####\n"+
						   "###########################################\n");
		
	}
	
	public void mensajeDepositar(double monto, double saldo, boolean estado) {
		String mensaje="";
		if(estado==false) {
			mensaje="\n   ERROR: INGRESE UN VALOR MAYOR A 0.0.";
		}else {
			mensaje="\n   SALDO ACTUAL: "+(saldo+monto);
		}
		System.out.println("###########################################\n"+
						   "####                                       \n"+
						   "####     - TRANSACCION: DEPOSITAR -        \n"+
					       "####      SALDO: "+saldo+"                 \n"+
				 	       "####      MONTO A DEPOSITAR: "+monto+"     \n"+
				 	       "####      ESTADO DE TRANSACCION: "+estado+"\n"+
				 	       "####      "+mensaje+"                      \n"+
						   "####                                       \n"+
						   "###########################################\n");
		
	}
	
	
	//RETIRAR
	public void mensajeInicioRetirar() {
		System.out.println("###########################################\n"+
						   "####                                   ####\n"+
						   "####    - INGRESE MONTO A RETIRAR -    ####\n"+
					       "####                                   ####\n"+
						   "###########################################\n");
	}
	public void mensajeRetirar(double monto, double saldo, boolean estado) {
		
		String mensaje="";
		if(estado==false) {
			mensaje="   ERROR: INGRESE UN VALOR MENOS O IGUAL AL SALDO";
		}else {
			mensaje="   SALDO ACTUAL: "+(saldo-monto);
		}
		System.out.println("###########################################\n"+
						   "####                                       \n"+
						   "####     - TRANSACCION: RETIRAR -          \n"+
					       "####      SALDO: "+saldo+"                 \n"+
				 	       "####      MONTO A RETIRAR: "+monto+"       \n"+
				 	       "####      ESTADO DE TRANSACCION: "+estado+"\n"+
				 	       "####      "+mensaje+"                      \n"+
						   "####                                       \n"+
						   "###########################################\n");
	}

	//SALIR
	public void mensajeSalir() {
		System.out.println("###########################################\n"+
						   "####                                   ####\n"+
						   "####        GRACIAS POR UTILIZAR       ####\n"+
						   "####        NUESTRO SERVICIO DE        ####\n"+
						   "####        CAJEROS AUTOMATICOS        ####\n"+
						   "####                                   ####\n"+
						   "###########################################\n");
		
		
	}
	
	
}
