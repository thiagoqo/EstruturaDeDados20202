package br.edu.ifce.estruturadedados.pilha;


public interface TADPilha {

	/**
	 * Operações principais
	 */
	public void adicionaTopo(Integer valor);
	public Integer removeTopo();
	
	/**
	 * Operações secundárias
	 */
	public boolean pilhaCheia();
	public boolean pilhaVazia();
	
	public void imprimePilha();
	
}
