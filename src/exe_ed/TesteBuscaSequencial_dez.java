package exe_ed;

public class TesteBuscaSequencial_dez {
	
	public static void main(String[] args) {
		BuscaPalavrasArq func = new BuscaPalavrasArq ();
		
		//Criando vetor com 10 palavras: 
		String vetorDez[] = func.preencherVetor_dez();
		
		long initialTime = System.nanoTime(); 		//Declarando antes de chamar a funcao de busca
		//Fazendo teste de busca 10 palavras:
		String retorno = func.buscar("palavraChave", vetorDez);
		
		if (retorno != null) {
			System.out.println("Plavra encontrada");
		}else {
			System.out.println("Palavra nao encontrada");
		}
		
		long finalTime = System.nanoTime(); 		//Declarando depois de chamar a funcao de busca
		
		System.out.println(vetorDez.length);
		System.out.printf("TEMPO DE EXECULCAO (Vet 10): %tLms", (finalTime - initialTime)/1000);
		
	}
}
