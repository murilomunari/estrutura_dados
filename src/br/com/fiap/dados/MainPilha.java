package br.com.fiap.dados;

import java.util.Stack;

public class MainPilha {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("Pagina 1");
        stack.push("Pagina 2");
        System.out.println(stack.pop());
    }
}
