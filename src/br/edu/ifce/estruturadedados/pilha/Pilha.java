package br.edu.ifce.estruturadedados.pilha;

/**
 * Implementa��o da pilha usando aloca��o est�tica de mem�ria
 * Considera-se o topo o �ndice 0 do vetor.
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
		//Realiza as valida��es
		if (pilhaCheia()) {
			System.out.println("Pilha Cheia. Elemento " + valor + " n�o inserido.");
			return;
		}
		
		//Desloca todos os elementos uma posi��o a direita
		for (int i = posicao; i >= 0; i--) {
			pilha[i + 1] = pilha[i];
		}
		
		pilha[0] = valor;
		posicao++;

	}

	@Override
	public Integer removeTopo() {
		//Realiza as valida��es
		if (pilhaVazia()) {
			System.out.println("Pilha Vazia. N�o h� elementos para remo��o.");
			return null;
		}
		
		int valorRemovido = pilha[0];
		
		//Desloca todos elementos uma posic�o a esquerda
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
		//Realiza valida��es
		if (pilhaVazia()) {
			System.out.println("Pilha Vazia. N�o h� elementos para impress�o.");
			return;
		}
		
		for (int i = 0; i <= posicao; i++) {
			System.out.print(pilha[i] + "\t");
		}
		System.out.println();

	}

}
