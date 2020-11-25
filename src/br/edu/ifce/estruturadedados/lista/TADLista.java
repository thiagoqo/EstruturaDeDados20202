package br.edu.ifce.estruturadedados.lista;

/**
 * Tipo Abstrato de Dados (TAD) da Lista
 * 
 * @author Thiago Queiroz (thiago.queiroz@ifce.edu.br)
 *
 */
public interface TADLista <T> {

	//M�todos principais
	public void insereValor(T valor, int indice);
	public T removeValor(int indice);
	
	//M�todos Secund�rios
	public boolean listaCheia();
	public boolean listaVazia();
	
	public void imprimeLista();
	
}
