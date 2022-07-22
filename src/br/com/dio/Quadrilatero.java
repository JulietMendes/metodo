package br.com.dio;

/* Criar uma aplicação que calcula a área dos 3 quadriláteros notáveis: quadrado, retângulo e trapézio. */

public class Quadrilatero {

    // mantem o nome do metodo, muda a lista de parametros

    public static void area(double lado) {

        System.out.println("Área do quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2){

        System.out.println("Área do retângulo: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("Àrea do trapézio: " + ((baseMaior+baseMenor)*altura)/2);

    }

}
