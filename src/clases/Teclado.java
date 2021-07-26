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
		//MENU 
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
		
		//DEPOSITAR O RETIRAR
		
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
	
	
}
