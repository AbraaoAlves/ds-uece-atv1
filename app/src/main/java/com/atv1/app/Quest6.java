package com.atv1.app;


/**
 * 
 * Elabore um algoritmo que leia um número inteiro positivo n, e preencha uma lista com n
 * elementos inteiros, com valores gerados aleatoriamente no intervalo de 1 a 10, apresente-a
 * e, em seguida, elimine as ocorrências de elementos repetidos (a primeira ocorrência de cada
 * elemento deve ser mantida na lista).
 */
public class Quest6 {
  public static void main(String[] args) {
    int n = 20;
    ListaEncadeada lista = new ListaEncadeada();

    for (int i = 0; i < n; i++) {
      int number = getRandomNumber(1, 10);
      lista.adicionaFinal(number);
    }

    System.out.println("Lista gerada:");
    lista.imprimeLista();


    System.out.println("\nLista não duplicada:");
    lista.imprimeLista();
  }

  private static int getRandomNumber(int min, int max) {
    int number = (int) (Math.random() * (max)) + min;
    return number;
  } 
}
