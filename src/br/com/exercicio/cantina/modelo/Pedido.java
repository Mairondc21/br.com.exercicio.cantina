package br.com.exercicio.cantina.modelo;

import br.com.exercicio.cantina.modelo.Cliente;
import br.com.exercicio.cantina.modelo.Ingrediente;
import br.com.exercicio.cantina.modelo.Massa;

import java.util.ArrayList;

public class Pedido {

    private Massa massa = new Massa();
    private Cliente cliente = new Cliente();

    ArrayList<Ingrediente> ingrediente = new ArrayList<>();


    public void calculoPedido(double valor){
        this.massa.setValor(valor);
    }

    public Massa getMassa() {
        return massa;
    }

    public void setMassa(String tipo, double valor) {
        this.massa.setTipo(tipo);
        this.massa.setValor(valor);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


}
