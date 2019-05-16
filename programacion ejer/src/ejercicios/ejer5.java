package ejercicios;

import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
	int a,b,c,i=3,n;
	Scanner leer=new Scanner(System.in);
	System.out.println("ingrese numero");
	n=leer.nextInt();
	a=0;
	b=1;
	System.out.println(a+b);
	for(i=2;i<=n;i++){
		c=a+b;
		a=b;
		b=c;
		System.out.println(c);
	}

	}

}
