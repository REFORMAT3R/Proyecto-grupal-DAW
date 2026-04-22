import java.util.*;
public class Main{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ponga el primer número");
        double num1 = sc.nextDouble();
        System.out.println("Ponga el segundo número");
        double num2 = sc.nextDouble();
        Calculator calculadora = new Calculator();

        System.out.println("Adición: " + calculadora.add(num1, num2));
        System.out.println("Resta: " + calculadora.sub(num1, num2));
        System.out.println("Multiplicación: " + calculadora.mul(num1, num2));
        System.out.println("División: " + calculadora.div(num1, num2));
        System.out.println("Módulo: " + calculadora.mod(num1, num2));
    }
}