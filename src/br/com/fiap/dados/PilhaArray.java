package br.com.fiap.dados;

public class PilhaArray {

    private int[] dados;

    private int topo;

    public PilhaArray(int capacidade) {
        dados = new int[capacidade];
        topo = -1;
    }

    public void push(int valor) {
        if (topo == dados.length -1) {
            throw new RuntimeException("overflow");
        }

        dados[++topo] = valor;
    }

    public int pop() {
        if (topo == -1) {
            throw new RuntimeException("underflow");
        }
        return dados[topo--];
    }

    public int peak() {
        return dados[topo];
    }
}
