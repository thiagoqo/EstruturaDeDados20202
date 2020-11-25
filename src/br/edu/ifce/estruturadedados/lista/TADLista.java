package br.edu.ifce.estruturadedados.lista;

/**
 * Tipo Abstrato de Dados (TAD) da Lista
 * 
 * @author Thiago Queiroz (thiago.queiroz@ifce.edu.br)
 *
 */
public interface TADLista <T> {

	//Métodos principais
	public void insereValor(T valor, int indice);
	public T removeValor(int indice);
	
	//Métodos Secundários
	public boolean listaCheia();
	public boolean listaVazia();
	
	public void imprimeLista();
	
}
