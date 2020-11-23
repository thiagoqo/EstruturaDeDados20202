package br.edu.ifce.estruturadedados.pilha;


public interface TADPilha {

	/**
	 * Opera��es principais
	 */
	public void adicionaTopo(Integer valor);
	public Integer removeTopo();
	
	/**
	 * Opera��es secund�rias
	 */
	public boolean pilhaCheia();
	public boolean pilhaVazia();
	
	public void imprimePilha();
	
}
