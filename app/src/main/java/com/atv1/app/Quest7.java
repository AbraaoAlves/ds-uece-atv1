package com.atv1.app;

/**
 * 7.
 *  Elabore um algoritmo que leia um número inteiro positivo n, 
 * e preencha duas listas Lx e Ly, cada uma com n valores gerados aleatoriamente 
 * no intervalo de 1 a 2n. 
 * 
 * Em seguida, armazenar em 
 * uma lista Lz os elementos de Lx que não estão em Ly
 */

public class Quest7 {

  public static void main(String[] args) {
    int n = 20;

    ListaEncadeada Lx = new ListaEncadeada();
    ListaEncadeada Ly = new ListaEncadeada();
    ListaEncadeada Lz = new ListaEncadeada();

    for (int i = 0; i < n; i++) {
      int nx = getRandomNumber(1, 2*n);
      Lx.adicionaFinal(nx);
      
      int ny = getRandomNumber(1, 2*n);
      Ly.adicionaFinal(ny);
    }

    System.out.println("Lista Lx:");
    Lx.imprimeLista();

    System.out.println("Lista Ly:");
    Ly.imprimeLista();

    for (int i = 0; i < n; i++) {
      int element= Lx.get(i);

      for (int j = 0; j< n; j++){
        int other = Ly.get(j);

        if (element == other) {
          break;
        }
        // se for o ultimo item a comparar:
        if (j == n-1){
          // adiciona ao Lz
          Lz.adicionaFinal(element);
        }
      }
    }

    System.out.println("Lista Lz:");
    Lz.imprimeLista();
  }

  private static int getRandomNumber(int min, int max) {
    int number = (int) (Math.random() * (max)) + min;
    return number;
  } 
}

