package Teste;

public class ListaExec {

	public static void main(String[] args) {
		ListaED Lista = new ListaED(0);
		
//		Lista.insereInicio2(2);
//		Lista.insereInicio2(1);
//		Lista.insereInicio2(0);
//		Lista.insereInicio2(-1);
		
		Lista.insereInicio(1);
		Lista.insereFinal(0);
		Lista.insereFinal(5);
		
		Lista.imprimirElementos();
		
		System.out.println(Lista.exibeLista());
		
	}

}
