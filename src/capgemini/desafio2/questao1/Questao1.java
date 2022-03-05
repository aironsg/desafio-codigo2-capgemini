package capgemini.desafio2.questao1;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Questao1 {

	public static void main(String[] args) {
		/*
		* Classe principal Questão1
		*/
		List<Integer> numeros = new ArrayList<>();
		Mediana listaMediana = new Mediana();
		boolean continua = true;
		while (continua) {
			listaMediana.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: ")));
			numeros.add(listaMediana.getNumero());
			listaMediana.setNumeros(numeros);
			int pergunta = JOptionPane.showConfirmDialog(null, "Deseja continua?");
			if (pergunta == 1) continua = false;
		}
		listaMediana.isListaImpar(listaMediana.getNumeros());
		listaMediana.isListapar(listaMediana.getNumeros());
	}


}
