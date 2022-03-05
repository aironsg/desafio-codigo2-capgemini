package capgemini.desafio2;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Questao1 {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		Mediana ListaMediada = new Mediana();
		boolean continua = true;
		while (continua == true) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));
			numeros.add(numero);
			int pergunta = JOptionPane.showConfirmDialog(null, "Deseja continua?");
			if (pergunta == 1) {
				continua = false;
			}
		}

		ListaMediada.isListaImpar(numeros);
		ListaMediada.isListapar(numeros);
		
		

	}
	/*
	static void isListaImpar(List<Integer> numeros) {
		if (numeros.size() % 2 == 1) {
			Collections.sort(numeros);
			int mediana = (numeros.size() / 2);
			System.out.print("A mediana da Lista de numeros é = " + numeros.get(mediana));

		}
	}
	
	static void isListapar(List<Integer> numeros) {
		if (numeros.size() % 2 == 0) {
			numeros.add(0);
			Collections.sort(numeros);
			int mediana = (numeros.size() / 2);
			System.out.print("A mediana da Lista de numeros é = " + numeros.get(mediana));
			
		}
	}
	*/
	
	

}
