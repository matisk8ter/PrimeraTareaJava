package com.sofka.proyect;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        Persona obPersona = new Persona();

        System.out.println("Ingrese Nombre de usuario");
        obPersona.setNombre(captura.nextLine());
        System.out.println("ingrese un numero de celular");
        obPersona.setTelefono(captura.nextInt());
        System.out.println("ingrese su edad");
        obPersona.setEdad(captura.nextInt());
        System.out.println("Bienvenido señor " + obPersona.getNombre() +
                " , es un placer para nosotros contar con una persona de "+obPersona.getTelefono()+
                " años." + "\nPróximamente nos comunicaremos con usted al numero "+obPersona.getEdad()+
                "\nFeliz día");


    }
}
