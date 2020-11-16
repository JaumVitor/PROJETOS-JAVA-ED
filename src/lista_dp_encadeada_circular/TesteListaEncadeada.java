package lista_dp_encadeada_circular;

public class TesteListaEncadeada {

	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		
		//Adicionando o elemento dentro da lista: 
		lista.adicionarElemento(new Conteudo ("Elemento1"));
		lista.adicionarElemento(new Conteudo ("Elemento2"));
		lista.adicionarElemento(new Conteudo ("Elemento3"));
		lista.adicionarElemento(new Conteudo ("Elemento4"));
		lista.adicionarElemento(new Conteudo ("Elemento5"));
		lista.adicionarElemento(new Conteudo ("Elemento6"));
		
		lista.imprimirElementos();
		
	}

}
