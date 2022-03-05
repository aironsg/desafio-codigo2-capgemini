package capgemini.desafio2.questao2;

import javax.swing.JOptionPane;

public class Questao2 {
	public static void main(String[] args) {
		/*
		* classe principal da Questão 2.
		*/

		ParesNumeros pares = new ParesNumeros();
		pares.setTamanhoVetor(Integer.parseInt(JOptionPane.showInputDialog("Informe o Tamanho do vetor")));
		pares.setDiferencialPares(Integer.parseInt(JOptionPane.showInputDialog("Informe o diferencial de pesquisa.")));
		pares.setNumeros(pares.preencheVetor(pares.getTamanhoVetor()));
		pares.contadorPares(pares.getNumeros(), pares.getDiferencialPares());

		
	}

}
