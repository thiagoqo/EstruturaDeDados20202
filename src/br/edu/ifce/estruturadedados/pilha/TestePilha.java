package br.edu.ifce.estruturadedados.pilha;

public class TestePilha {

	public static void main(String[] args) {
		
		TADPilha pilha = new Pilha(5);
		
		pilha.removeTopo();
		pilha.imprimePilha();
		
		pilha.adicionaTopo(10);
		pilha.imprimePilha();
		
		pilha.adicionaTopo(12);
		pilha.imprimePilha();
		
		pilha.adicionaTopo(14);
		pilha.imprimePilha();
		
		pilha.adicionaTopo(16);
		pilha.imprimePilha();
		
		pilha.adicionaTopo(18);
		pilha.imprimePilha();
		
		pilha.adicionaTopo(20);
		pilha.imprimePilha();
		
		pilha.removeTopo();
		pilha.imprimePilha();
		
		pilha.removeTopo();
		pilha.imprimePilha();
		
		pilha.removeTopo();
		pilha.imprimePilha();
		
		pilha.removeTopo();
		pilha.imprimePilha();
		
		pilha.removeTopo();
		pilha.imprimePilha();
		
		pilha.removeTopo();
		pilha.imprimePilha();
	}
}
