package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

enum Color {
    ROJO, AZUL, VERDE, AMARILLO, BLANCO, NARANJA
}

public class Cubo {
    private Color[][][] cubo;

    public Color[][][] getCubo() {
        return cubo;
    }

    // Constructor que asigna los colores de forma aleatoria al cubo rubik
    // Respetando el límite de 9 casillas por cada color
    public Cubo() {
        // Crear el arreglo tridimensional para el estado
        // El cubo tiene 3 filas, 3 columnas y 6 caras
        this.cubo = new Color[3][3][6];
        // Obtener el arreglo de todos los valores de la enumeración Color
        Color[] colores = Color.values();
        // Crear un arreglo auxiliar para llevar la cuenta de cuántas veces se ha usado cada color
        // El tamaño del arreglo es igual al número de colores posibles
        int[] contador = new int[colores.length];
        // Recorrer cada fila del estado
        for (int i = 0; i < 3; i++) {
            // Recorrer cada columna del estado
            for (int j = 0; j < 3; j++) {
                // Recorrer cada cara del estado
                for (int k = 0; k < 6; k++) {
                    // Elegir un color al azar del arreglo de colores
                    int indice = (int) (Math.random() * colores.length);
                    Color color = colores[indice];
                    // Verificar si el color elegido ya ha alcanzado el límite de 9 casillas
                    while (contador[indice] >= 9) {
                        // Si es así, elegir otro color al azar
                        indice = (int) (Math.random() * colores.length);
                        color = colores[indice];
                    }
                    // Asignar el color a la casilla
                    this.cubo[i][j][k] = color;
                    // Incrementar el contador del color elegido
                    contador[indice]++;
                }
            }
        }
    }
    // Método para imprimir el estado del cubo rubik por cara
    public void imprimirEstado() {
        // Crear un arreglo de cadenas con los nombres de las caras
        String[] nombres = {"Cara frontal", "Cara posterior", "Cara izquierda", "Cara derecha", "Cara inferior", "Cara superior"};
        // Recorrer cada cara del estado
        for (int k = 0; k < 6; k++) {
            // Imprimir el nombre de la cara según el índice usando el arreglo de nombres
            System.out.println(nombres[k] + ":");
            // Recorrer cada fila de la cara
            for (int i = 0; i < 3; i++) {
                // Recorrer cada columna de la fila
                for (int j = 0; j < 3; j++) {
                    // Imprimir el color de la casilla con un espacio
                    System.out.print(this.cubo[i][j][k] + " ");
                }
                // Imprimir un salto de línea al final de la fila
                System.out.println();
            }
            // Imprimir un salto de línea al final de la cara
            System.out.println();
        }
    }
    
    public void movR1(){
        Color []filaSuperiorFrontal = {this.cubo[0][0][0], this.cubo[0][1][0], this.cubo[0][2][0]};
    }
}
