package capgemini.desafio2.questao1;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Questao1 {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		Mediana ListaMediana = new Mediana();
		boolean continua = true;
		while (continua) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));
			numeros.add(numero);
			int pergunta = JOptionPane.showConfirmDialog(null, "Deseja continua?");
			if (pergunta == 1) continua = false;
		}
		ListaMediana.isListaImpar(numeros);
		ListaMediana.isListapar(numeros);

	}


}
