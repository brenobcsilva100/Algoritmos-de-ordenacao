package com.example.demo.service;

public class GeradorDeValores {

    static int vetor[];

    public static void main(String args[]){
        vetor = new int[Integer.parseInt(args[0])];
        System.out.println("Criei um vetor de tamanho: " + vetor.length);
    }

}
