package capgemini.desafio2.questao3;

public class TextoCriptografico {

    private String Texto;
    private int tamanhoTexto;
    private char[][] matrizTexto;

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String texto) {
        Texto = texto;
    }

    public int getTamanhoTexto() {
        return tamanhoTexto;
    }

    public void setTamanhoTexto(int tamanhoTexto) {
        this.tamanhoTexto = tamanhoTexto;
    }

    public char[][] getMatrizTexto() {
        return matrizTexto;
    }

    public void setMatrizTexto(char[][] matrizTexto) {
        this.matrizTexto = matrizTexto;
    }


    char[][] preencherMatrizTexto(int tamanhoTexto, int stqrTamanho, String textoSemEspaco){

        /*O metodo preencherMatrizTexto será reponsavel por pegar os caracteres
        * do texto recebido do usuario e fazer a criptografia,
        * levando em consideração os seguintes termos:
        * adicionar informações*/

        int posicaoCharecter = 0;
        char[][] matrizString = new char[stqrTamanho][stqrTamanho];
        //laço responsavel por quebrar a string e inserir dentro da matriz
        for(int linha = 0; linha < stqrTamanho; linha++) {
            for(int coluna = 0; coluna < stqrTamanho; coluna++) {
                matrizString[linha][coluna] = textoSemEspaco.charAt(posicaoCharecter);
                if(posicaoCharecter == tamanhoTexto-1) {
                    break;
                }
                posicaoCharecter++;
            }
        }
        return matrizString;
    }

    void imprimirTextoCriptografado(char[][] matrizString, int sqtrTamanho){
        //laço resosavel pela impressão da criptografia
        int contadorFrequencia = 0;
        for(int i = 0; i < sqtrTamanho; i++) {
            for(int linha = 0; linha < sqtrTamanho; linha++) {
                for(int coluna = 0; coluna < sqtrTamanho; coluna++) {
                    if(coluna == contadorFrequencia) {
                        System.out.print(matrizString[linha][coluna]);
                    }
                }
            }
            System.out.print(" ");
            contadorFrequencia++;
        }
    }
}
