package Teste;

public class ListaED {
	
	//Classe No aninhada
	private static class No {
		public No ante;
		public int data;
		public No prox;
		
		//Construtor do nó
		public No(int val) {
			ante = null;
			data = val;
			prox = null;
		}
	}
	
	private No inicio;
	
	public ListaED(int item) {
		inicio = new No(item);
		inicio.ante = inicio;
		inicio.prox = inicio;
	}
	
	public boolean busca(int item) {
		for(No nodo = inicio; nodo != null; nodo = nodo.prox)
			if(item == nodo.data)
				return true;
		return false;
	}
	
	public void insereInicio (int item) {
		No novoNo = new No(item); 
		
		novoNo.prox = inicio; 
		novoNo.ante = inicio.ante;
		inicio.ante.prox = novoNo;
		inicio.ante = novoNo;
		
		inicio = novoNo;
		
	}
	
	public void insereFinal (int item) {
		No novoNo = new No(item); 
		
		inicio.ante.prox = novoNo; 
		novoNo.ante = inicio.ante; 
		novoNo.prox = inicio;
		
		inicio.ante = novoNo;
		
	}
	
	public boolean busca1 (int item) {
        No nodo = inicio;
        do {
            if(item == nodo.data)
                return true;
            nodo = nodo.prox;
        }while(nodo != inicio);

        return false;
    }
	
	public void imprimirElementos () {
		//Vai listar todos os elementos da lista
		No aux = inicio; 
		
		if (inicio != null) {
			do {
				System.out.println(aux.data);
				aux = aux.ante;
			}
			while (aux != inicio);
		}else {
			System.out.println("Lista esta vazia");
		}
	}

//	public String exibeLista() {
//		String str = "Lista encadeada: " + inicio.data;
//		for(No nodo = inicio.prox; nodo != inicio; nodo = nodo.prox)
//			str += " " + nodo.data;
//		return str + "\n";
//	}

	
}
