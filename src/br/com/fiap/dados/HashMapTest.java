package br.com.fiap.dados;

import java.util.HashMap;

public class HashMapTest {
    // rodou em Tempo de execução 5 ms
    private static final int TAMANHO = 100000;

    public static void main(String[] args) {

        HashMap<Integer, Produto> mapa = new HashMap<Integer, Produto>(); // para declarar o hashMap tem que colocar entre <> uma chave e um objeto

        for (int i = 0; i <= TAMANHO; i++) {
            mapa.put(i, new Produto(i, "Produto"+ i, (double) (i*20)));
        }

        long startTime = System.currentTimeMillis();
        int codigoASerEncontrado = TAMANHO;

        for (int qtd = 0; qtd < TAMANHO; qtd++) {
            Produto p = mapa.get(qtd);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Tempo de execução " + (endTime -startTime) + " ms");
        //usar o hashMap deixa o codigo mais performatico
    }
}
