package com.atv1.app;

import java.util.Random;

/**
 * 
 *  Elabore um algoritmo que leia um número inteiro positivo n, e 
 *  preencha uma lista com n elementos, com valores gerados aleatoriamente 
 *  no intervalo de 1 a 2n, de forma que os valores fiquem dispostos em ordem crescente
 */

public class Quest5 {
  public static void main(String[] args){
    int n = 20;
    ListaEncadeada lista = new ListaEncadeada();

    for (int i = 0 ; i<n ; i++) {
      Random random = new Random();
      
      // Gerar um número aleatório de 1 a 2*n
      int number = random.nextInt(2*n) + 1;
 
      lista.adicionaFinal(number);
    }


    System.out.println("Lista ordenada:");
    lista.imprimeLista();
  }  
}
