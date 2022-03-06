package capgemini.desafio2.questao2;

import capgemini.desafio2.questao2.domain.ParesNumeros;

import javax.swing.JOptionPane;

public class Questao2Application {
	public static void main(String[] args) {
		/*
		* classe principal da Questão 2.
		*/

		ParesNumeros pares = new ParesNumeros();
		pares.setTamanhoVetor(Integer.parseInt(JOptionPane.showInputDialog("Informe o Tamanho do vetor")));
		pares.setDiferencialPares(Integer.parseInt(JOptionPane.showInputDialog("Informe o diferencial de pesquisa.")));
		pares.setNumeros(pares.preencheVetor(pares.getTamanhoVetor()));
		int totalPares = pares.contadorPares(pares.getNumeros(), pares.getDiferencialPares());
		System.out.println("A quantidade de Pares = " + totalPares);

		
	}

}
