package capgemini.desafio2.questao1.test;

import capgemini.desafio2.questao1.domain.Mediana;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianaTest {

    @Test
    void testFindMedianaValueImpar() {
        List<Integer> numeros = Arrays.asList(3, 5, 4, 9, 2);
        Mediana medianaTest = new Mediana();
        int saida = medianaTest.findMediana(numeros);
        int saidaEsperada = 4;
        assertEquals(saidaEsperada, saida);


    }
}