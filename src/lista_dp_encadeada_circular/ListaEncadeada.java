package lista_dp_encadeada_circular;

public class ListaEncadeada {
	private Node primeiro;
	private int length;
	
	//Contrutor da Lista Encadeada
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
		/*Vai pecorrer a lista ate encontrar o ultimo elemento,
		ou seja, pecorre ate que o aux.proximo seja igual ao inicio*/
		Node aux = primeiro; 
		
		if (!isEmpty()) {
			while (aux.getProximo() != primeiro) {
				aux = aux.getProximo();
			}
			return aux; //Retornando o ultimo elemento
		}
		return null; //Caso ainda estiver vazia, e o metodo for chamado
	}

	public void adicionarElemento (Conteudo conteudo) {
		//Metodo vai adicionar elemento ao final da lista encadeada
		Node node = new Node (conteudo); //Crinado um novo No
		if (isEmpty()) {
			//Primeiro caso: Quando a lista nao tenha nenhum elemento
			node.setProximo(node);
			node.setAnterior(node);
			this.primeiro = node; 
			this.length++; 
		}else {
			//Para os demais casos, que a lista ja tem elementos adicionados
			Node ultimo = buscarUltimoElemento(this.primeiro);
			ultimo.setProximo(node); //Ultimo elemento (Ultimo No), vai receber o novo No como proximo
			node.setAnterior(ultimo); 
			node.setProximo(primeiro);
			//Ao final, configura o (anterior) do primeiro elemento da lista, para receber o novo elemento adicionado
			//Que agora vai ser o novo "Ultimo elemento"
			this.primeiro.setAnterior(node);  
			this.length++;
		}
	}
	
	public void imprimirElementos () {
		//Vai listar todos os elementos da lista
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

