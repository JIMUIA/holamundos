package Entrada;

import java.io.BufferedReader; //librerias de io
import java.io.InputStreamReader;

public class Buffer {
    public static void main(String[] args) {
        //Generar un IMPUTSTRINGREADER desde teclado otra opcion para recibir datos por teclado
        InputStreamReader sr = new InputStreamReader(System.in);

        //Generar un BUFFER que se guarda en BUFFER
        BufferedReader bf = new BufferedReader(sr);
        //Solicitar entrada y guardar
        String nombre, apellido;
        try { //Corrige un error generado por la libreria io.
            System.out.print(" Ingresa tu nombre: ");
            nombre = bf.readLine();
            System.out.print(" Tu primer apellido: ");
            apellido = bf.readLine();
        } catch (Exception e) {
            nombre = " ";
            apellido = " ";
        }
        System.out.print(" Tu nombre es : " + nombre);
        System.out.print(" Tu apellido es : " + apellido);
    }
}
