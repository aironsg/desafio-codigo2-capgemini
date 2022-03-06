package capgemini.desafio2.questao2.test;

import capgemini.desafio2.questao2.domain.ParesNumeros;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParesNumerosTest {

    @Test
    void preencheVetor() {
        ParesNumeros pares = new ParesNumeros();
        int tamanho = 4;
        int tamanhoVetorEsperado = 4;
        int tamanhoVetorSaida = pares.preencheVetor(tamanho).length;
        assertEquals(tamanhoVetorEsperado, tamanhoVetorSaida);
    }

    @Test
    void contadorPares() {
        ParesNumeros pares = new ParesNumeros();
        int vetorTest[] = {1,5,3,4,2};
        int diferencial = 2;
        int quantidadeParesSaida = pares.contadorPares(vetorTest, diferencial);
        int quantidadeParesEsperado = 3;
        assertEquals(quantidadeParesEsperado, quantidadeParesSaida);

    }
}