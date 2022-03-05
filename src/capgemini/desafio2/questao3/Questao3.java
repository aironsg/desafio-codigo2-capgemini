package capgemini.desafio2.questao3;

import javax.swing.JOptionPane;

public class Questao3 {
	
	public static void main(String[] args) {
		/*
		* Classe principal Questão3
		*/
		TextoCriptografico criptgrafia = new TextoCriptografico();
		criptgrafia.setTexto(JOptionPane.showInputDialog("Digite o texto para ser encriptado"));
		String textoSemEspaco = criptgrafia.getTexto().replace(" ", "");
		criptgrafia.setTamanhoTexto(textoSemEspaco.length());
		int sqtrtamanho = (int) Math.ceil(Math.sqrt(criptgrafia.getTamanhoTexto()));
		criptgrafia.setMatrizTexto(criptgrafia.preencherMatrizTexto(criptgrafia.getTamanhoTexto(), sqtrtamanho, textoSemEspaco));
		criptgrafia.imprimirTextoCriptografado(criptgrafia.getMatrizTexto(), sqtrtamanho);

		
	}
}


