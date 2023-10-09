/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

public class Main {


    public static void main(String[] args) {
        Cubo cubo3x3x3 = new Cubo();
        System.out.println("Estado del Cubo 3x3x3:");
        cubo3x3x3.imprimirEstado();
    }
    
}
//Cara frontal: 0
//Cara posterior: 1
//Cara izquierda: 2
//Cara derecha: 3
//Cara inferior: 4
//Cara superior: 5