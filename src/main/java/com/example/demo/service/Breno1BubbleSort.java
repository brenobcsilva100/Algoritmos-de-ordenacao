package com.example.demo.service;

public class Breno1BubbleSort {

    public static void main(String[] args) {

        int[] vetor = {1,2,5,4,78,4,855,5,8,41,447,7,4,9};
        int aux;

        System.out.println("Vetor desordenado");
        for(int i=0;i<vetor.length;i++){
            System.out.print(vetor[i] + " ");
        }

        for(int i=0;i<vetor.length;i++){
            for(int j=i+1;j<vetor.length;j++){
                if(vetor[i]>vetor[j]) {
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }

        System.out.println("Vetor ordenado");
        for(int i=0;i<vetor.length;i++){
            System.out.print(vetor[i]+ " ");
        }

    }

}
