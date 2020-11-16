package exe_ed;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BuscaPalavrasArq {
	
	//Metodo estatico, para facilitar a chamada em outra classe:
	
	public String[] preencherVetor_mil() {
		//<> Metodo busca elementos registrados no arquivo, que tem 1000 palavras 
		Path caminho = Paths.get("D:/Repositorio Git/EAD_ED/src/exe_ed/AnimaisMil.txt");
		byte texto[] = null;  //Vetor que vai armazenar a leitura feita do arquivo
		
		try {
			texto = Files.readAllBytes(caminho);
		} catch (Exception exc) {
			System.err.println("Erro: Arquivo não encontrado!");
		}
		
		String leitura = new String(texto); //Transformando o vetor do tipo byte para String
		
		return leitura.split(";"); //Retornando os elementos do arquivo em um vetor 
	}
	
	public String[] preencherVetor_dez () {
		//<> Metodo busca elementos registrados no arquivo, que tem 10 palavras 
		Path caminho = Paths.get("D:/Repositorio Git/EAD_ED/src/exe_ed/AnimaisDez.txt");
		byte texto[] = null;  //Vetor que vai armazenar a leitura feita do arquivo
		
		try {
			texto = Files.readAllBytes(caminho);
		} catch (Exception exc) {
			System.err.println("Erro: Arquivo não encontrado!");
		}
		
		String leitura = new String(texto); //Transformando o vetor do tipo byte para String
		
		return leitura.split(";"); //Retornando os elementos do arquivo em um vetor 
	}
	
	public String buscar (String palavra, String vetor []) {
		for (int i=0; i<vetor.length; i++) {
			if (vetor[i].equalsIgnoreCase(palavra)) {
				return vetor[i];
			}
		}
		return null; 
	}
}
