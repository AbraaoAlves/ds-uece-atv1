package com.atv1.app;

public class ListaEncadeada {
	private No inicioLista;
	private int quantidadeElementos;
	
	public ListaEncadeada() {
		inicioLista = null;
		quantidadeElementos = 0;
	}
	
	public boolean isListaVazia() {
		if(inicioLista == null)
			return true;
		else
			return false;
	}
	
	public void adicionaFinal(int e) {
		No novo = new No(e);
		
		if(isListaVazia()) {
			inicioLista = novo;
		} else {
			No aux = inicioLista;
			
			while(aux.proximoNo != null)
				aux = aux.proximoNo;
			
			aux.proximoNo = novo;
		}
		
		quantidadeElementos++;
	}
	
	public void removeFinal() {
		if(isListaVazia()) {
			System.out.println("Lista Vazia");
			return;
		}
		
		No elementoRemovido = inicioLista;
		
		if(quantidadeElementos == 1) {
			inicioLista = null;
		} else {
			No auxiliar = inicioLista;
			
			while(elementoRemovido.proximoNo != null) {
				auxiliar = elementoRemovido;
				elementoRemovido = elementoRemovido.proximoNo;
			}
			
			auxiliar.proximoNo = null;
		}
		
		quantidadeElementos--;
		
		System.out.println("Elemento removido " + elementoRemovido.elemento);
	}
	
	public void adicionaInicio(int e) {
		No novo = new No(e);
		
		novo.proximoNo = inicioLista;
		inicioLista = novo;
	}
	
	public void removeInicio() {
		if(isListaVazia()) {
			System.out.println("Lista vazia");
			return;
		}
		
		No elementoRemovido = inicioLista;
		
		inicioLista = inicioLista.proximoNo;
				
		System.out.println("Elemento removido: " + elementoRemovido.elemento);
		quantidadeElementos--;
		
	}
	
	public void adicionaPosicao(int e, int pos) {
		if(pos <= 0) {
			adicionaInicio(e);
		} else {
			if(pos >= quantidadeElementos) {
				adicionaFinal(e);
			} else {
				int posicao = 1;
				No novo = new No(e);
				No aux = inicioLista;
				
				while(posicao < pos) {
					aux = aux.proximoNo;
					posicao++;
				}
				
				novo.proximoNo = aux.proximoNo;
				aux.proximoNo = novo;
				
				quantidadeElementos++;
			}
				
		}
	}
	
	public void removePosicao(int pos) {
		if(isListaVazia()) {
			System.out.println("Lista vazia");
			return;
		}
		
		if(pos <= 0) {
			removeInicio();
		} else {
			No aux = inicioLista;
			No removido = inicioLista;
			int posicao = 1;
			
			while(removido != null && posicao <= pos) {
				aux = removido;
				removido = removido.proximoNo;
				posicao++;
			}
			
			if(removido == null) // último elemento
				aux.proximoNo = null;
			else 
				aux.proximoNo = removido.proximoNo;
				
			System.out.println("Elemento removido: " + removido.elemento);
			quantidadeElementos--;
		}
	}
	
	public void imprimeLista() {
		No aux = inicioLista;
		
		while(aux != null) {
			System.out.print(aux.elemento + "    ");
			aux = aux.proximoNo;
		}
		System.out.print("\n");
	}
	
	public int getQuantidadeElementos() {
		return quantidadeElementos;
	}

  public int get(int pos) {
    if (pos < 0 || pos >= quantidadeElementos) {
			throw new IllegalArgumentException("Posição inválida");
		}
		No aux = inicioLista;

		for (int i = 0; i < pos; i++) {
			if (aux == null) {
				throw new IllegalArgumentException("Posição inválida");
			}
			aux = aux.proximoNo;
		}
		return aux.elemento;
  }
	
}
