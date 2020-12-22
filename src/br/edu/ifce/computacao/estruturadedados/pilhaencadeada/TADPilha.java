package br.edu.ifce.computacao.estruturadedados.pilhaencadeada;

/**
 * TAD (Tipo Abstrato de Dados) referente a Pilha
 * 
 * @author Thiago Queiroz (thiago.queiroz@ifce.edu.br)
 *
 * @since 12/08/2020
 */
public interface TADPilha<T> {

	/**
	 * Opera��es principais
	 */
	public void insereTopo(T valor);
	public T removeTopo();
	
	/**
	 * Opera��es secund�rias
	 */
	public boolean pilhaVazia();
	public void imprimePilha();
	
}
