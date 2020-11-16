package exe_ed;

public class TesteBuscaSequencial_mil {

	public static void main(String[] args) {
		BuscaPalavrasArq func = new BuscaPalavrasArq ();
		
		//Criando vetor com 1000 palavras: 
		String vetorMil[] = func.preencherVetor_mil();
		
		long initialTime = System.nanoTime(); 		//Declarando antes de chamar a funcao de busca
		//Fazendo teste de busca 1000 palavras:
		String retorno = func.buscar("palavraChave", vetorMil);
		
		if (retorno != null) {
			System.out.println("Plavra encontrada");
		}else {
			System.out.println("Palavra nao encontrada");
		}
		
		long finalTime = System.nanoTime(); 		//Declarando depois de chamar a funcao de busca
		
		System.out.println(vetorMil.length);
		System.out.printf("TEMPO DE EXECULCAO (Vet 1000): %tLms", (finalTime - initialTime) / 1000);
		
	}
	//stpop watch
}