package br.edu.ifce.estruturadedados.fila;

/**
 * TAD (Tipo Abstrato de Dados) Fila
 * 
 * @author thiagoqueiroz
 * 
 * @since 18/11/2020
 * 
 * @version 1.0
 *
 */
public interface TADFila {
	
	/**
	 * Operações principais
	 */
	public void insereFinal(Integer valor);
	public Integer removeInicio();
	
	/**
	 * Operações secundárias
	 */
	public boolean filaCheia();
	public boolean filaVazia();
	
	public void imprimeFila();
	
	
	

}
