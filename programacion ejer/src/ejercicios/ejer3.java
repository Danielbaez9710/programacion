package ejercicios;

import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		
		int decena,centena,unidad;
		float codigo=0;
		String nombre="";
		 
		Scanner leer=new Scanner(System.in);
		System.out.println("ingrese nombre usuario");
		nombre=leer.nextLine();

		for(int i=0;i<1;i++){
		System.out.println("digite una contraseña de tres digitos");
		codigo=leer.nextInt();
		
		
		if((codigo>0) && (codigo<=999)){
			System.out.println(nombre);
		
			System.out.println("su codigo es: "+codigo);
		}
		else{
			System.out.println("error, vuelva a intentarlo");
		i--;
				System.out.println("digite una contraseña de tres digitos");
				codigo=leer.nextInt();
			}
		}
		centena=(int) (codigo/100);
		codigo%=100;
		decena=(int) (codigo/10);
		codigo%=10;
		unidad=(int) (codigo/1);
		codigo%=1;
		
		System.out.print("el codigo al reves es:  ");
		System.out.print(unidad);
		System.out.print(decena);
		System.out.println(centena);
		
		if(unidad==centena){
			System.out.println("el codigo es capicua");
		}
		else{
			System.out.println("el codigo no es capicua");
		}


		
		
		}
		}
	


