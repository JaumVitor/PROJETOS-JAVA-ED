package lista_dp_encadeada_circular;

public class Node {
	public Conteudo conteudo;
	public Node anterior;  //Antercessor do meu elemento
	public Node proximo;	//Posterior do meu elemento
	
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
