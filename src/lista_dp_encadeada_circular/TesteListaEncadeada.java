package lista_dp_encadeada_circular;

public class TesteListaEncadeada {

	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		
		//Adicionando o elemento dentro da lista: 
//		lista.adicionaElementoInicio(new Conteudo ("Elemento1"));
//		lista.adicionaElementoInicio(new Conteudo ("Elemento2"));
//		lista.adicionaElementoInicio(new Conteudo ("Elemento3"));
//		lista.adicionaElementoInicio(new Conteudo ("Elemento4"));
//		lista.adicionaElementoInicio(new Conteudo ("Elemento5"));
//		lista.adicionaElementoInicio(new Conteudo ("Elemento6"));

		lista.adicionaElementoFinal(new Conteudo ("Ele1"));
		lista.adicionaElementoFinal(new Conteudo ("Ele2"));
		lista.adicionaElementoFinal(new Conteudo ("Ele0"));
		
		lista.imprimirElementos();
		
	}

}
