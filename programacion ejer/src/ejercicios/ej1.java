package ejercicios;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		double n1,n2,n3,n4,n5,n6,n7,def,nq,nt,np,ne;
		
		System.out.println("digite nota quiz 1");
		n1= entrada.nextDouble();
		System.out.println("digite nota quiz 2");
		n2= entrada.nextDouble();
		System.out.println("digite nota taller 1");
		n3= entrada.nextDouble();
		System.out.println("digite nota taller 2");
		n4= entrada.nextDouble();
		System.out.println("digite nota examen 1");
		n5= entrada.nextDouble();
		System.out.println("digite nota examen");
		n6= entrada.nextDouble();
		System.out.println("digite nota proyecto");
		n7= entrada.nextDouble();
		
		nq=((n1+n2)/2)*0.2;
		nt=((n3+n4)/2)*0.1;
		ne=((n5+n6)/2)*0.4;
		np=n7*0.3;
		def=(nq+nt+ne+np);
		System.out.println("definitiva:");
		System.out.println(def);
		
		

	}

}
