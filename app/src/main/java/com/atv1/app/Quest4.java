package com.atv1.app;


/**
 *  Elabore um algoritmo em Linguagem Java 
 * que realize a busca binária de um valor x em um vetor A com n elementos.
 * 
 *  Faça a análise da complexidade de tempo do seu algoritmo, 
 * em notação assintótica, para o melhor e o pior casos.
 */

public class Quest4 {
  public static void main(String[] args) {
    int n = 20;
    
    int[] A = new int[n];
    // preenche o vetor    
    for (int i = 0; i < n; i++) {
      A[i] = (i*2)+1;
      System.out.print(A[i]+", ");
    }
    
    int x = 15;
    // busca binária
    int pos = buscaBinaria(A, x);
    
    System.out.println("Posição do elemento " + x + " no vetor: " + pos);
  }
  /**
   * Busca o valor x no vetor A usando busca binária
   * 
   * @param vetor - vetor ordenado em ordem crescente
   * @param x - valor a ser encontrado
   * @return {int} - posição do valor x no vetor, ou -1 se não encontrado
   */
  private static int buscaBinaria(int[] vetor, int x) {
    int inicio = 0;
    int fim = vetor.length - 1;
    
    while (inicio <= fim) {
      int meio = inicio + (fim - inicio) / 2;
      
      if (vetor[meio] == x) {
        return meio;
      } 
      
      if (vetor[meio] < x) {
        inicio = meio + 1;
      } else {
        fim = meio - 1;
      }
    }    

    return -1;
  }
}
