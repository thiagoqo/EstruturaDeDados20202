package br.edu.ifce.computacao.estruturadedados.filaencadeada;

public class Fila<T> implements TADFila<T>{
	
	private No<T> cabeca;
	private int tamanho;
	
	@Override
	public void insereFinal(T valor) {
		
		No<T> novoNo = new No<T>(valor, null);
		
		if(filaVazia()) {
			cabeca = novoNo;
		} else {
			No<T> auxiliar = cabeca;
			//navegar at� o �ltimo n�
			while (auxiliar.getProximo() != null) {
				auxiliar = auxiliar.getProximo();
			}
			auxiliar.setProximo(novoNo);
		}
		tamanho++;
	}
	@Override
	public T removeInicio() {
		//Realiza valida��es
		if (filaVazia()) {
			System.out.println("N�o h� elementos para remo��o");
			return null;
		}
		
		No<T> noRemovido = cabeca;
		cabeca = cabeca.getProximo();
		noRemovido.setProximo(null);
		
		tamanho--;
		
		return noRemovido.getValor();
	}
	@Override
	public boolean filaVazia() {
		if(cabeca == null) {
			return true;
		}
		return false;
	}
	@Override
	public void imprimeFila() {
		
		if (filaVazia()) {
			System.out.println("Fila Vazia. N�o h� elementos para impress�o.");
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
