package ejercicios;

import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
	int n,f=1,i;
	Scanner leer=new Scanner(System.in);
	System.out.println("ingrese numero");
	n=leer.nextInt();
	
	for(i=1;i<=n;i++){
		f=f*i;
	}
	System.out.println("el factorial es: "+f);

	}

}
