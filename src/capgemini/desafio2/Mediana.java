package capgemini.desafio2;

import java.util.Collections;
import java.util.List;

public class Mediana {
	
	private List<Integer> numeros;
	

	public List<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(List<Integer> numeros) {
		this.numeros = numeros;
	}
	
	 int isListaImpar(List<Integer> numeros) {
		if (numeros.size() % 2 == 1) {
			Collections.sort(numeros);
			int mediana = (numeros.size() / 2);
			System.out.print("A mediana da Lista de numeros é = " + numeros.get(mediana));

			return mediana;
		}
		return 0;
		
	}
	
	 void isListapar(List<Integer> numeros) {
		if (numeros.size() % 2 == 0) {
			numeros.add(0);
			Collections.sort(numeros);
			int mediana = (numeros.size() / 2);
			System.out.print("A mediana da Lista de numeros é = " + numeros.get(mediana));
			
		}
	}
	
	

}
