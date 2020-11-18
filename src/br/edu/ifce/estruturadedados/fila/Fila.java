package br.edu.ifce.estruturadedados.fila;

public class Fila implements TADFila {

	
	private Integer[] fila;
	private int posicao;
	
	
	
	public Fila(int tamanho) {
		fila = new Integer[tamanho];
		posicao = -1;
		
	}
	
 	
	
	public void insereFinal(Integer valor) {
		//Realiza validações
		if (filaCheia()) {
			System.out.println("Fila Cheia. Elemento " + valor + " não inserido.");
			return;
		} 
		
		fila[++posicao] = valor;

	}

	public Integer removeInicio() {
		//Realiza as validações
		if(filaVazia()) {
			System.out.println("Fila Vazia. Elemento não removido.");
			return null;
		}
		
		int elementoRemovido = fila[0];
		
		for (int i = 0; i < posicao; i++) {
			fila[i] = fila[i + 1];
		}
		
		fila[posicao--] = null;
		
		return elementoRemovido;
	}

	public boolean filaCheia() {
		if (posicao == fila.length - 1) {
			return true;
		}
		return false;
	}

	public boolean filaVazia() {
		return posicao == -1 ? true : false; 
	}

	public void imprimeFila() {
		//Realiza validações
		if (filaVazia()) {
			System.out.println("Fila Vazia. Não há elementos para impressão.");
			return;
		}
		
		for (int i = 0; i <= posicao; i++) {
			System.out.print(fila[i] + "\t");
		}
		
		System.out.println();
		

	}

}
