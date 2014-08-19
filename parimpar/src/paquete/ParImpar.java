package paquete;
import java.util.Scanner;

public class ParImpar {
	static Scanner num;
	
	public static void main(String[] args) {
        num = new Scanner(System.in);
		
		System.out.println("****Ingrese el numero a evaluar****");
       
		int num1 = num.nextInt();
       
        if(num1%2==0)
        	System.out.println("\n\"El número ingresado es par\"");
        else
        	System.out.println("\n\"El número ingresado es impar\"");
       
        
	}

}
