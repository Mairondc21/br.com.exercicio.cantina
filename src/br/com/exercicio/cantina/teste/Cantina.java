package br.com.exercicio.cantina.teste;

import br.com.exercicio.cantina.modelo.*;

public class Cantina {
    public static void main(String[] args) {

        Pedido p1 = new Pedido();

        p1.setMassa("bacon", 25.0);

        System.out.println(p1);

    }
}
