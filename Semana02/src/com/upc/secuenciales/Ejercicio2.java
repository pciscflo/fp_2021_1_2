package com.upc.secuenciales;

import java.util.Scanner;

public class Ejercicio2 {
    public  static final double PI = 3.1416;
    public static final double G = 6.67*Math.pow(10,-11);
    public static void main(String[] args) {
        //Calcular el area de un circulo
        Scanner sc = new Scanner(System.in);
        double radio, area;
        System.out.println("Ingrese radio:");
        radio = sc.nextDouble();
        area = Math.PI*Math.pow(radio,2); // area = Math.PI*radio*radio;
        //System.out.println("Resultado:"+area);
        System.out.printf("Resultado:%.2f",area);
    }
}
