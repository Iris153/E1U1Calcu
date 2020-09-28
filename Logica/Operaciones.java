package main.Logica;

import java.util.Scanner;



public class Operaciones  {
    
    public int a1,a2,a3,a4,a5,a6,a7,a8;
    public int RS, RR, RM, RD;
   Scanner leer = new Scanner(System.in);
   
   public int Suma(int RS){
       System.out.println("Numero 1: ");
       a1=leer.nextInt();
       System.out.println("Numero 2: ");
       a2=leer.nextInt();
       RS=a1+a2;
       System.out.println("La suma es: "+RS);
       return RS;
   }
   public int Resta(int RR){
       System.out.println("Dame un numero: ");
       a3=leer.nextInt();
       System.out.println("Dame un numero: ");
       a4=leer.nextInt();
       RR=a3-a4;
       System.out.println("La division es: "+RR);
       return RR;
       
   }
   public int Multiplicacion(int RM){
        System.out.println("dame un numero: ");
       a7=leer.nextInt();
       System.out.println("dame un numero: ");
       a8=leer.nextInt();
       RM=a7*a8;
       System.out.println("La multiplicacion es: "+RM);
       return RM;
   }
   public int Division(int RD){
       System.out.println("Divisor: ");
       a5=leer.nextInt();
       System.out.println("Dividendo: ");
       a6=leer.nextInt();
       RD=a5/a6;
       System.out.println("La division es: "+RD);
       return RD;
   }
   
   
   
    
    
}
