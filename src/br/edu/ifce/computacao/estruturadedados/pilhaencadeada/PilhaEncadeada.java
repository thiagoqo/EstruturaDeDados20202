package br.edu.ifce.computacao.estruturadedados.pilhaencadeada;

public class PilhaEncadeada<T> implements TADPilha<T> {

	private No<T> cabeca;  //no topo
	private int tamanho;
	
	public PilhaEncadeada() {
		cabeca = null;
		tamanho = 0;	
	}
	
	@Override
	public void insereTopo(T valor) {
		
		No<T> novoNo = new No<T>(valor, null);
		
		if (tamanho == 0) {
			cabeca = novoNo;
		} else {
			novoNo.setProximo(cabeca);
			cabeca = novoNo;
		}
		tamanho++;
		
	}
	@Override
	public T removeTopo() {
		
		// Realiza valida��es
		if(pilhaVazia()) {
			System.out.println("Pilha Vazia. N�o h� elementos para remo��o");
			return null;
		}
		
		No<T> noRemovido = cabeca;
		cabeca = cabeca.getProximo();
		noRemovido.setProximo(null);
		
		tamanho--;
		
		return noRemovido.getValor();
	}
	@Override
	public boolean pilhaVazia() {
		if (cabeca == null) {
			return true;
		}
		return false;
	}
	@Override
	public void imprimePilha() {
		
		//Realiza valida��es
		if(pilhaVazia()) {
			System.out.println("Pilha Vazia. N�o h� elementos para impress�o");
			return;
		}
		
		No<T> auxiliar = cabeca;
		
		while(auxiliar != null) {
			System.out.print(" => " + auxiliar.getValor());
			auxiliar = auxiliar.getProximo();
		}
		System.out.println();
		
	}
	
	
	
}
