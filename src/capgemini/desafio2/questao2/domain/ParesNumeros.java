package capgemini.desafio2.questao2.domain;

import javax.swing.*;

public class ParesNumeros {

    private int tamanhoVetor;
    private int diferencialPares;
    private int[] numeros;

    public int getTamanhoVetor() {
        return tamanhoVetor;
    }

    public void setTamanhoVetor(int tamanhoVetor) {
        this.tamanhoVetor = tamanhoVetor;
    }

    public int getDiferencialPares() {
        return diferencialPares;
    }

    public void setDiferencialPares(int diferencialPares) {
        this.diferencialPares = diferencialPares;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public int[] preencheVetor(int tamanhoVetor){
        int[] numeros = new int[tamanhoVetor];
        for(int i = 0; i < numeros.length; i++) {
            //Laço responsavel por obter os valores do ususario e armazenar no vetor
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
            numeros[i] = numero;
        }
        return numeros;
    }

    public int contadorPares(int[] vetorNumeros, int diferencial){
        int contadorDePares = 0;
        for (Integer numero : vetorNumeros) {
            //laço responsavel por percorrer o vetor verificando os intervalos
            for (int posicao = 1; posicao < vetorNumeros.length; posicao++) {
                if ((numero + diferencial) == vetorNumeros[posicao]) {
                    contadorDePares++;
                }
            }
        }
        return contadorDePares;
    }
}
