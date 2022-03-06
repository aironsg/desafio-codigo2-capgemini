package capgemini.desafio2.questao1;

import capgemini.desafio2.questao1.domain.Mediana;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Questao1Application {

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
        int mediana = listaMediana.findMediana(listaMediana.getNumeros());
        System.out.println("Valor  da Mediana é = " + mediana);



    }


}
