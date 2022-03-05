package capgemini.desafio2.questao3;

import javax.swing.JOptionPane;

public class Questao3 {
	
	public static void main(String[] args) {
		String texto = JOptionPane.showInputDialog("Digite o texto para ser encriptado");
		String textoSemEspaco = texto.replace(" ", "");
		int tamanho = textoSemEspaco.length();
		int raiz = (int) Math.ceil(Math.sqrt(tamanho));
		char[][] matrizString = new char[raiz][raiz];
		int cont = 0;
		//laço responsavel por quebrar a string e inserir dentro da matriz
		for(int linha = 0; linha < raiz; linha++) {
			for(int coluna = 0; coluna < raiz; coluna++) {
				matrizString[linha][coluna] = textoSemEspaco.charAt(cont);			
				if(cont == tamanho-1) {
					break;
				}
				cont++;
			}
		}

		
		//laço resosavel pela impressão da criptografia
		cont = 0;
		for(int i = 0; i < raiz; i++) {
			for(int linha = 0; linha < raiz; linha++) {
				for(int coluna = 0; coluna < raiz; coluna++) {
					if(coluna == cont) {
						System.out.print(matrizString[linha][coluna]);						
					}
				}
			}
			System.out.print(" ");
			cont++;
		}
		
	}
}


