package com.example.demo.service;

public class BrenobubbleSort {

    public static void main(String[] args) {

        int vetor[] = {1,23,8,5,9,6,7,4,8,5,9,1,52,2,63,58};
        int aux;

        System.out.println("Vetor desordenado");
        for(int i=0;i<vetor.length;i++){
            System.out.print(vetor[i] + " ");
        }


        for(int i=0;i<vetor.length;i++){
            for(int j=i+1;j<vetor.length;j++){
                if(vetor[i]>vetor[j]){
                    aux = vetor[j];
                    vetor[j]=vetor[i];
                    vetor[i]=aux;
                }
            }
        }

        System.out.println("Vetor ordenado");
        for(int i=0;i<vetor.length;i++){
            System.out.print(vetor[i] + " ");
        }
    }
}
