package lista_dp_encadeada_circular;

public class Node {
	private Conteudo conteudo;
	private Node anterior; 
	private Node proximo;
	
	public Node (Conteudo conteudo) {
		this.conteudo = conteudo;
		this.anterior = null; 
		this.proximo = null; 
	}

	public Conteudo getConteudo() {
		return conteudo;
	}

	public void setConteudo(Conteudo conteudo) {
		this.conteudo = conteudo;
	}

	public Node getAnterior() {
		return anterior;
	}

	public void setAnterior(Node anterior) {
		this.anterior = anterior;
	}

	public Node getProximo() {
		return proximo;
	}

	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}

	
}
