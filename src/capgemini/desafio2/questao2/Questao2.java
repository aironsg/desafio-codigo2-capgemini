package capgemini.desafio2.questao2;

import javax.swing.JOptionPane;

public class Questao2 {
	public static void main(String[] args) {
		
		int tamanhoVetor = Integer.parseInt(JOptionPane.showInputDialog("Informe o Tamanho do vetor"));
		Integer[] vetorNumero = new Integer[tamanhoVetor];
		int diferencial = Integer.parseInt(JOptionPane.showInputDialog("Informe o diferencial de pesquisa."));
		int contadorDePares = 0;
		
		
		for(int i = 0; i < vetorNumero.length; i++) {
			//Laço responsavel por obter os valores do ususario e armazenar no vetor
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
			vetorNumero[i] = numero;
		}

		for (Integer integer : vetorNumero) {
			//laço responsavel por percorrer o vetor verificando os intervalos
			for (int j = 1; j < vetorNumero.length; j++) {
				if ((integer + diferencial) == vetorNumero[j]) {
					contadorDePares++;
				}
			}
		}
		
		System.out.println("Quantidade de pares : " + contadorDePares);
		
	}

}
