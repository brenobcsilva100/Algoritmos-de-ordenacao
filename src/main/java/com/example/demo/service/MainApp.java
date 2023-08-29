package com.example.demo.service;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        AlgoritmosDeOrdenacao alg = new AlgoritmosDeOrdenacao();
//        alg.bubbleSort();

        alg.selectionSort();
        alg.mostrarVetor();

    }

}
