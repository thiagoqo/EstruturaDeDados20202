package br.edu.ifce.estruturadedados.pilha;

/**
 * Implementação da pilha usando alocação estática de memória
 * Considera-se o topo o índice 0 do vetor.
 * 
 * @author Thiago Queiroz (thiago.queiroz@ifce.edu.br)
 *
 */
public class Pilha implements TADPilha {
	
	private Integer[] pilha;
	private int posicao;
	
	public Pilha(int tamanho) {
		pilha = new Integer[tamanho];
		posicao = -1;
	}

	@Override
	public void adicionaTopo(Integer valor) {
		//Realiza as validações
		if (pilhaCheia()) {
			System.out.println("Pilha Cheia. Elemento " + valor + " não inserido.");
			return;
		}
		
		//Desloca todos os elementos uma posição a direita
		for (int i = posicao; i >= 0; i--) {
			pilha[i + 1] = pilha[i];
		}
		
		pilha[0] = valor;
		posicao++;

	}

	@Override
	public Integer removeTopo() {
		//Realiza as validações
		if (pilhaVazia()) {
			System.out.println("Pilha Vazia. Não há elementos para remoção.");
			return null;
		}
		
		int valorRemovido = pilha[0];
		
		//Desloca todos elementos uma posicão a esquerda
		for (int i = 0; i < posicao; i++) {
			pilha[i] = pilha[i + 1];
		}
		pilha[posicao--] = null;
		
		return valorRemovido;
	}

	@Override
	public boolean pilhaCheia() {
		if (posicao == pilha.length - 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean pilhaVazia() {
		if (posicao == -1) {
			return true;
		}
		return false;
	}

	@Override
	public void imprimePilha() {
		//Realiza validações
		if (pilhaVazia()) {
			System.out.println("Pilha Vazia. Não há elementos para impressão.");
			return;
		}
		
		for (int i = 0; i <= posicao; i++) {
			System.out.print(pilha[i] + "\t");
		}
		System.out.println();

	}

}
