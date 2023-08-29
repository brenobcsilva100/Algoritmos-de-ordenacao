package com.example.demo.service;

public class AlgoritmosDeOrdenacao {

    private int vetor[] = {25,57,48,37,12,92,33};

    public void setVetor(int vetor[]){
        this.vetor = vetor;
    }

    public void bubbleSort(){
        int it;
        int pos;
        int temp;

        System.out.println("Realizando bubbleSort em um vetor de " +
                vetor.length + " elementos");

        for(it=0;it<vetor.length-1;it++){
            for(pos=0;pos<vetor.length-1-it;pos++){
                if(vetor[pos]>vetor[pos+1]){
                    temp        = vetor[pos];
                    vetor[pos]  =vetor[pos+1];
                    vetor[pos+1]=temp;
                }
            }
            System.out.println("---> Final da iteracao: " + it);
            mostrarVetor();
        }
    }

    public void selectionSort(){
        int it, temp;
        int posMenorInicial;
        int posMenor;
        int i;

        for(it = 0;it<vetor.length-1;it++){
            posMenorInicial=it;
            posMenor=it+1;
            for(i=posMenorInicial+1;i<vetor.length;i++) {
                if (vetor[i] < vetor[posMenor]) {
                    posMenor = i;
                }
            }
                System.out.println("Menor Element Encontrado na iteracao esta " +
                        "na posicao " + posMenor);
            if(vetor[posMenor]<vetor[posMenorInicial]){
                temp=vetor[posMenorInicial];
                vetor[posMenorInicial]=vetor[posMenor];
                vetor[posMenor]=temp;
            }
            System.out.println("Iteracao " + it);
            mostrarVetor();
        }
    }

    public static void main(String[] args) {

        int[] vetor = new int[10];

        for(int i=0;i<vetor.length;i++){
            vetor[i] = (int)(Math.random()*vetor.length);
        }

        System.out.println("Desordenado");
        for(int i=0;i<vetor.length;i++){
            System.out.print(vetor[i] + " ");
        }

        int aux, j;
        for(int i=1; i<vetor.length;i++){
            aux = vetor[i];
            j=i-1;
            while (j>=0 && vetor[j]>aux){
                vetor[j+1]=vetor[j];
                j--;
            }
            vetor[j+1]=aux;
        }
        System.out.println("Ordenado");
        for(int i=0;i<vetor.length;i++){
            System.out.print(vetor[i] + " ");
        }
    }

    public void mostrarVetor(){
        for(int i=0;i<vetor.length;i++){
            System.out.print(vetor[i]+" ");
        }
        System.out.println("");
    }

}
