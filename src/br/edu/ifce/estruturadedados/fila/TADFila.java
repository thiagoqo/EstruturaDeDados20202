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
	 * Opera��es principais
	 */
	public void insereFinal(Integer valor);
	public Integer removeInicio();
	
	/**
	 * Opera��es secund�rias
	 */
	public boolean filaCheia();
	public boolean filaVazia();
	
	public void imprimeFila();
	
	
	

}
