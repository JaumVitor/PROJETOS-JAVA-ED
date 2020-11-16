package lista_dp_encadeada_circular;

public class ListaEncadeada {
	private Node primeiro;
	private int length;
	
	public ListaEncadeada() {
		this.primeiro = null; 
		this.length = 0; 
	} 
	
	public boolean isEmpty () {
		//Verifica se a lista esta vazia 
		if (primeiro == null ) {
			return true; 
		}
		return false;
	}
	
	public Node buscarUltimoElemento (Node primeiro) {
		Node aux = primeiro; 
		
		if (!isEmpty()) {
			while (aux.getProximo() != primeiro) {
				aux = aux.getProximo();
			}
			return aux;
		}
		return null;
	}

	public void adicionarElemento (Conteudo conteudo) {
		Node node = new Node (conteudo); 
		if (isEmpty()) {
			node.setProximo(node);
			node.setAnterior(node);
			this.primeiro = node; 
			this.length++; 
		}else {
			Node ultimo = buscarUltimoElemento(this.primeiro);
			ultimo.setProximo(node);
			node.setAnterior(ultimo);
			node.setProximo(primeiro);
			this.primeiro.setAnterior(node);
			this.length++;
		}
	}
	
	public void imprimirElementos () {
		Node aux = this.primeiro; 
		
		if (!isEmpty()) {
			do {
				System.out.println(aux.getConteudo().getNome());
				aux = aux.getProximo();
			}
			while (aux != this.primeiro);
		}else {
			System.out.println("Lista esta vazia");
		}
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
}

