package br.edu.ifce.estruturadedados.lista;

public class Lista<T> implements TADLista<T> {
	
	private T[] lista;
	private int posicao;
	
	public Lista(int tamanho) {
		lista = (T[]) new Object[tamanho];
		posicao = -1;
	}

	@Override
	public void insereValor(T valor, int indice) {
		//Realiza as validações
		if (listaCheia()) {
			System.out.println("Lista Cheia. Valor " + valor + " não inserido.");
			return;
		}
		//Verifica se o índice é válido
		if (indice < 0 || indice > posicao + 1) {
			System.out.println("Índice " + indice + " inválido. Valor " + valor + " não inserido.");
			return;
		}
		
		//Desloca todos elementos iguais ou posteriores ao índice uma posição a direita
		for (int i = posicao; i >= indice; i--) {
			lista[i + 1] = lista[i];
		}
		lista[indice] = valor;
		posicao++;

	}

	@Override
	public T removeValor(int indice) {
		//Realiza validações 
		if(listaVazia()) {
			System.out.println("Lista Vazia. Não há elementos para remoção.");
			return null;
		}
		//Valida se o índice é válido
		if (indice < 0 || indice > posicao) {
			System.out.println("Índice " + indice + " inválido. Elemento não removido.");
			return null;
		}
		
		T valorRemovido = lista[indice];
		
		//Desloca todos elementos posteriores ao índice uma posição a esquerda
		for(int i = indice; i < posicao; i++) {
			lista[i] = lista[i + 1];
		}
		lista[posicao--] = null;
		
		
		return valorRemovido;
	}

	@Override
	public boolean listaCheia() {
		if (posicao == lista.length - 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean listaVazia() {
		if (posicao == -1) {
			return true;
		}
		return false;
	}

	@Override
	public void imprimeLista() {
		
		if (listaVazia()) {
			System.out.println("Lista vazia. Não há elementos para impressão.");
			return;
		}
		
		for (int i = 0; i <= posicao; i++) {
			System.out.print(lista[i] + "\t");
		}
		System.out.println();

	}

}
