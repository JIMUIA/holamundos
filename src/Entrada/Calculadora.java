package Entrada;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner Calculadora = new Scanner(System.in);
        float suma, resta, multiplicacion, div, resto;
        float num_uno, num_dos;

        System.out.print(" Ingresa primer valor : ");
        num_uno = Calculadora.nextFloat();
        System.out.print(" Ingresa segundo valor : ");
        num_dos = Calculadora.nextFloat();
        suma = num_uno + num_dos;
        resta = num_uno - num_dos;
        multiplicacion = num_uno * num_dos;
        div = (num_uno / num_dos);
        resto = num_uno % num_dos;
        System.out.println(" El resultado de la suma es: " + suma);
        System.out.println(" El resultado de la resta es: " + resta);
        System.out.println(" El resultado de la multiplicacion es: " + multiplicacion);
        System.out.println(" El resultado de la division es: " + div);
        System.out.println(" El resultado de la division es: " + Math.round(div));
        System.out.println(" El resultado de la resto es: " + resto);


    }
}
