package clases;

public class Pantalla {

	public Pantalla() {
	
	}
	//INICIO
	public void mensajeInicio() {
		System.out.println("################################################################\n"+
						   "####                                                        ####\n"+
						   "####                    - BIENVENIDO -                      ####\n"+
						   "####                                                        ####\n"+
						   "################################################################\n");
	}
	
	//INICIO SESION
	public void mensajeNIP() {
		System.out.println("################################################################\n"+
						   "####                                                        ####\n"+
						   "####                   INGRESE NUMERO DE                    ####\n"+
						   "####               IDENTIFICACION DE USUARIO                ####\n"+
						   "####                                                        ####\n"+
						   "################################################################\n");
	}
	public void mensajeNCuenta() {
		System.out.println("################################################################\n"+
						   "####                                                        ####\n"+
						   "####               INGRESE NUMERO DE CUENTA                 ####\n"+
						   "####                                                        ####\n"+
						   "################################################################\n");
	}
	public void mensajeInicioSesion(String nombre, String apellido) {
		int espacios=44;
		
		int es=String.valueOf(nombre).length()+1+String.valueOf(apellido).length();
		
		String agregar="";
		
			int result= espacios-es;
			for(int i=1; i<result;i++){
				agregar+=" ";
			}
				
		System.out.println("################################################################\n"+
						   "####                                                        ####\n"+
						   "####      - BIENVENIDO USUARIO! -                           ####\n"+
						   "####      - "+nombre.toUpperCase()+" "+apellido.toUpperCase()+" -"+agregar+"   ####\n"+
						   "####                                                        ####\n"+
						   "################################################################\n");
		
	}
	
	//MENU
	public void mensajeMenu() {
		System.out.println("################################################################\n"+
						   "####                                                        ####\n"+
						   "####    - INGRESE NUMERO DE TRANSACCION  -                  ####\n"+
  					       "####    - > OPCION 1: CONSULTAR SALDO    -                  ####\n"+
				 	       "####    - > OPCION 2: DEPOSITAR          -                  ####\n"+
				 	       "####    - > OPCION 3: RETIRAR            -                  ####\n"+
						   "####    - > OPCION 4: SALIR              -                  ####\n"+
						   "####                                                        ####\n"+
						   "################################################################\n");
	}
	
	
	//CONSULTAR SALDO
	public void mensajeConsultaSaldo(double saldo) {
		int espacios=36;//23
		int es=String.valueOf(saldo).length();
		int result= espacios-es;
		String agregar="";
			for(int i=1; i<result;i++){
				agregar+=" ";
			}	
		


		System.out.println("################################################################\n"+
						   "####                                                       #####\n"+
						   "####           - CONSULTA SALDO -                          #####\n"+
					       "####       SALDO: "+saldo+agregar+"      #####\n"+
						   "####                                                       #####\n"+
						   "################################################################\n");
	}
	
	//DEPOSITAR
	public void mensajeInicioDepositar() {
		System.out.println("################################################################\n"+
						   "####                                                        ####\n"+
						   "####             - INGRESE MONTO A DEPOSITAR -              ####\n"+
					       "####                                                        ####\n"+
						   "################################################################\n");
		
	}
	
	public void mensajeDepositar(double monto, double saldo, boolean estado) {
		int espacios=46;
		int[] es=new int[4];
		String[] agregar=new String[4];
		es[0]= String.valueOf(monto).length()+19;
		es[1]= String.valueOf(saldo).length()+7;
		es[2]= String.valueOf(estado).length()+23;
		agregar[0]="";
		agregar[1]="";
		agregar[2]="";
		agregar[3]="";

		String mensaje;
		if(estado==false) {
			mensaje="ERROR: INGRESE UN VALOR MAYOR A 0.0.";
		}else {
			mensaje="SALDO ACTUAL: "+(saldo+monto);
		}
		es[3]= String.valueOf(mensaje).length();

		for(int i=0; i<4;i++){
			int result= espacios-es[i];
			for(int k=1; k<result;k++){
				agregar[i]+=" ";
			}	
		}

		System.out.println("################################################################\n"+
						   "####                                                        ####\n"+
						   "####               - TRANSACCION: DEPOSITAR -               ####\n"+
					       "####      SALDO: "+saldo+agregar[1]+"     ####\n"+
				 	       "####      MONTO A DEPOSITAR: "+monto+agregar[0]+"     ####\n"+
				 	       "####      ESTADO DE TRANSACCION: "+estado+agregar[2]+"     ####\n"+
				 	       "####      "+mensaje+agregar[3]+"     ####\n"+
						   "####                                                        ####\n"+
						   "################################################################\n");
	}
	
	
	//RETIRAR
	public void mensajeInicioRetirar(double saldo) {
		
		String opciones="";
		if(saldo>100){
			opciones+="####    - > OPCION 1: 20                 -                  ####\n";
			opciones+="####    - > OPCION 2: 100                -                  ####\n";
		}
		if(saldo>1000){
			opciones+="####    - > OPCION 3: 1000               -                  ####\n";
		}
		if(saldo>5000){
			opciones+="####    - > OPCION 4: 5000               -                  ####\n";			
		}
		if(saldo>10000){
			opciones+="####    - > OPCION 5: 10000              -                  ####\n";
		}
		





		System.out.println("################################################################\n"+
					       "####                                                        ####\n"+
						   "####    - INGRESE MONTO A RETIRAR        -                  ####\n"+
						   opciones+
						   "####                                                        ####\n"+
						   "################################################################\n");
	

	}
	
	public void mensajeErrorRetirar() {
		System.out.println("################################################################\n"+
						   "####                                                        ####\n"+
						   "####                       - ERROR -                        ####\n"+
						   "####        - EL CAJERO CUENTA CON BILLETES DE 20$ -        ####\n"+
						   "####     - EL MONTO INGRESADO NO DEBE DE SER REDONDO -      ####\n"+
						   "####         - INGRESE VALORES COMO 100,500,1000 -          ####\n"+
					       "####                                                        ####\n"+
						   "################################################################\n");
	}
	public void mensajeRetirar(double monto, double saldo, boolean estado) {
		int espacios=46;
		int[] es=new int[4];
		String[] agregar=new String[4];
		es[0]= String.valueOf(monto).length()+17;
		es[1]= String.valueOf(saldo).length()+7;
		es[2]= String.valueOf(estado).length()+23;
		agregar[0]="";
		agregar[1]="";
		agregar[2]="";
		agregar[3]="";

		String mensaje;
		if(estado==false) {
			mensaje="ERROR: INGRESE UN VALOR MENOS O IGUAL AL SALDO";
		}else {
			mensaje="SALDO ACTUAL: "+(saldo-monto);
		}
		es[3]= String.valueOf(mensaje).length();

		for(int i=0; i<4;i++){
			int result= espacios-es[i];
			for(int k=1; k<result;k++){
				agregar[i]+=" ";
			}	
		}

		System.out.println("################################################################\n"+
						   "####                                                        ####\n"+
						   "####                - TRANSACCION: RETIRAR -                ####\n"+
					       "####      SALDO: "+saldo+agregar[1]+"     ####\n"+
				 	       "####      MONTO A RETIRAR: "+monto+agregar[0]+"     ####\n"+
				 	       "####      ESTADO DE TRANSACCION: "+estado+agregar[2]+"     ####\n"+
				 	       "####      "+mensaje+agregar[3]+"     ####\n"+
						   "####                                                        ####\n"+
						   "################################################################\n");
	}

	//SALIR
	public void mensajeSalir() {
		System.out.println("################################################################\n"+
						   "####                                                        ####\n"+
						   "####                  GRACIAS POR UTILIZAR                  ####\n"+
						   "####                  NUESTRO SERVICIO DE                   ####\n"+
						   "####                  CAJEROS AUTOMATICOS                   ####\n"+
						   "####                                                        ####\n"+
						   "################################################################\n");
		
	}
	
	
}
