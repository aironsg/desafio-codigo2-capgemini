package capgemini.desafio2.questao1.domain;

import java.util.Collections;
import java.util.List;

public class Mediana {

	private int numero;
	private List<Integer> numeros;

	public Mediana(){

	}
	public Mediana(List<Integer> numeros) {
		this.numeros = numeros;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public List<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(List<Integer> numeros) {
		this.numeros = numeros;
	}

	public int findMediana(List<Integer> numeros) {
		Collections.sort(numeros);
		int posicaoMediana = (numeros.size() / 2);
		return  numeros.get(posicaoMediana);

	}
	

	
	

}
