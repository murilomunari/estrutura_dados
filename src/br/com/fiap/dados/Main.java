package br.com.fiap.dados;

public class Main {
    public static void main(String[] args) {

        try {
            Vetor nomes = new Vetor(5);
            nomes.add("Murilo");
            nomes.add("Laisa");
            nomes.add("Carlos");
            nomes.add("Gustavo");
            nomes.add("Joao");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
