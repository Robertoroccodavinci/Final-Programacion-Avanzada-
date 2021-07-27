package clases;

import java.util.*;

public class Teclado {
	
	private boolean error;
	private Scanner sca;
	
	public int numInt(int largo,int tipo) {
		sca=new Scanner(System.in);
		int resultado=0;
		
		//INICIO SESION
		if(largo==5&&tipo==1||tipo==2) {
			do {
				try {
					resultado=sca.nextInt();
					if(String.valueOf(resultado).length()==largo) {
						error=false;
					}else {
						if(tipo==1) {System.out.println("  ERROR: INGRESE NIP DE USUARIO VALIDO  \n");}
						else if(tipo==2) {System.out.println("  ERROR: INGRESE NUMERO DE CUENTA VALIDO  \n");}
						sca.nextLine();
					}
				}catch(InputMismatchException e){
					if(tipo==1) {System.out.println("  ERROR: INGRESE NIP DE USUARIO VALIDO  \n");}
					else if(tipo==2) {System.out.println("  ERROR: INGRESE NUMERO DE CUENTA VALIDO  \n");}
					error=true;
					sca.nextLine();
				}
				
			}while(error==true);
		} 
		//MENU TRANSACCIONES
		else if(largo==1&&tipo==3) {
			do {
				try {
					resultado=sca.nextInt();
					if(String.valueOf(resultado).length()==largo&&resultado<5) {
						error=false;
					}else {
						System.out.println("  ERROR: INGRESE NUMERO VALIDO  \n");
						sca.nextLine();
					}
				}catch(InputMismatchException e){
					System.out.println("  ERROR: INGRESE NUMERO VALIDO  \n");
					error=true;
					sca.nextLine();
				}
				
			}while(error==true);
		}
		
		return resultado;
	}
	
	public double numDouble() {
		sca=new Scanner(System.in);
		double resultado=0.0;
		
		//DEPOSITAR
		
			do {
				try {
					resultado=sca.nextDouble();
					
					
				}catch(InputMismatchException e){
					System.out.println("  ERROR: INGRESE NUMERO VALIDO  \n");
					error=true;
					sca.nextLine();
				}
				
			}while(error==true);
		 
			return resultado;
	}
	public double numRetirar(){
		int resultado=0;
		double monto=0;
		do {
			try {
				resultado=sca.nextInt();
				if(resultado<=5&&resultado>0) {
					error=false;
				}else {
					System.out.println("  ERROR: INGRESE NUMERO VALIDO  \n");
					sca.nextLine();
				}
			}catch(InputMismatchException e){
				System.out.println("  ERROR: INGRESE NUMERO VALIDO  \n");
				error=true;
				sca.nextLine();
			}
			
		}while(error==true);

		switch(resultado){
			case 1:
				monto=20;
				break;
			case 2:
				monto=100;
				break;
			case 3:
				monto=1000;
				break;
			case 4:
				monto=5000;
				break;	
			case 5:
				monto=10000;
				break;
		}
		
		return monto;
	}

	public void continuar() {
		sca=new Scanner(System.in);
		
		String continuar;
		System.out.println("< - PRESIONE CUALQUIER TECLA PARA CONTINUAR - >");

		try {
			continuar=sca.nextLine();
		}catch(Exception e){
			
		}
			
	}
	
	
}
