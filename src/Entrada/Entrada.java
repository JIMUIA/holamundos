package Entrada;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        char inicial;
        float altura;
        System.out.println(" Escribe tu nombre : ");
        nombre = entrada.nextLine(); //lee todo con espacios
        System.out.println(" Tu nombre es : " + nombre);

        System.out.println(" Escribe tus apellidos : ");
        nombre = entrada.next();//Se detiene en el primer espacio
        System.out.println(" Tu apellido es : " + nombre);

        //Escaner para edad y altura
        System.out.println(" Dame tu edad : ");
        edad = entrada.nextInt();
        System.out.println("Tu edad es : " + edad);

        System.out.println(" Dame tu altura : ");
        altura = entrada.nextFloat();
        System.out.println("Tu altura es :  " + altura);

        // caracteres
        System.out.println(" Dame tu inicial : ");
        inicial = entrada.next().charAt(0);
        System.out.println(" Tu inicial es: " + inicial);

    }
}
