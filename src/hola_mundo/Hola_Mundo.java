
package hola_mundo;

import java.util.Scanner;


public class Hola_Mundo {

   
    public static void main(String[] args) {
        
        Scanner sc =new Scanner (System.in);
        System.out.println("Bienvenido, esta es mi calculadora\n"
                + "Ingresa el primer numero a operar");
        int a= sc.nextInt();
        System.out.println("Ingresa el segundo numero a operar");
        int b =sc.nextInt();
        System.out.println("La suma de las dos cantidades es: " + (a+b));
       
        
    }
    
}
