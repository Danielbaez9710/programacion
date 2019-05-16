package ejercicios;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		int mayor=0,ganador =0,perdedor= 0,menor=9999;
		int v[]=new int[5];
		Scanner leer=new Scanner(System.in);
	
		for(int i=0;i<5;i++){
		System.out.println("ingrese numero acciones del jugador "+(i+1)+": ");
		v[i]=leer.nextInt();
		v[i]*=1000;
		if(v[i]>mayor){
			mayor=v[i];
			ganador=(i+1);
		}
	}
		
		for(int i=0;i<5;i++){
			if(v[i]<menor){
				menor=v[i];
				perdedor=(i+1);
		}}
		for(int i=0;i<5;i++){
			System.out.print("Acciones jugador "+(i+1)+": " );
			System.out.println(v[i]);
		}
		
		System.out.println("jugador con mas acciones es el: "+ganador);
		System.out.println("cantidad de acciones es: "+mayor);
		System.out.println("jugador con menos acciones es el: "+perdedor);
		System.out.println("cantidad de acciones es: "+menor);

}}
