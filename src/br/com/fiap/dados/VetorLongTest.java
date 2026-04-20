package br.com.fiap.dados;

public class VetorLongTest {

    // Tempo de execução 4673 ms
    private static final int TAMANHO = 100000;

    public static void main(String[] args) {
        long[] array = new long[TAMANHO];

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j< TAMANHO; j++) {
                array[i] += j;
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Tempo de execução " + (endTime -startTime) + " ms");
    }

    // teste usando apenas o array puro
}
