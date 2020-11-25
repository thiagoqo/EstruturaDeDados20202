package br.edu.ifce.estruturadedados.lista;

public class TesteLista {

	public static void main(String[] args) {
		
		
		TADLista<String> lista = new Lista<String>(5);
		
		lista.insereValor("A", -1);
		lista.insereValor("A", 3);
		
		lista.removeValor(0);
		lista.imprimeLista();
		
		lista.insereValor("B", 0);
		lista.imprimeLista();
		
		lista.insereValor("A", 0);
		lista.imprimeLista();
		
		lista.insereValor("D", 2);
		lista.imprimeLista();
		
		lista.insereValor("C", 2);
		lista.imprimeLista();
		
		lista.insereValor("E", 4);
		lista.imprimeLista();
		
		lista.insereValor("F", 4);
		lista.imprimeLista();
		
		lista.removeValor(0);
		lista.imprimeLista();
		
		lista.removeValor(4);
		lista.imprimeLista();
		
		lista.removeValor(3);
		lista.imprimeLista();
		
		lista.removeValor(1);
		lista.imprimeLista();
		
		lista.removeValor(1);
		lista.imprimeLista();
		
		lista.removeValor(0);
		lista.imprimeLista();
		
		lista.removeValor(0);
		lista.imprimeLista();
		
		
		
	}

}
