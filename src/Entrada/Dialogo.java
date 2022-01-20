package Entrada;

import javax.swing.*;

public class Dialogo {
    public static void main(String[] args) {
        //JOption pane Intro dat String integer char double
        String nombre;
        int edad;
        char inicial;
        double altura;

        nombre = JOptionPane.showInputDialog(" Ingresa tu nombre: ");
        JOptionPane.showMessageDialog(null, " Tu nombre es : " + nombre);

        edad = Integer.parseInt(JOptionPane.showInputDialog("Dime tu edad "));
        inicial = JOptionPane.showInputDialog(" Cual es tu inicial ").charAt(0);
        altura = Double.parseDouble(JOptionPane.showInputDialog("dame tu altura:"));
        JOptionPane.showMessageDialog(null, " Tu nombre es : " + nombre);
        JOptionPane.showMessageDialog(null, " Tu edad es : " + edad);
        JOptionPane.showMessageDialog(null, " Tu inicial es : " + inicial);
        JOptionPane.showMessageDialog(null, " Tu altura es : " + altura);

    }
}
