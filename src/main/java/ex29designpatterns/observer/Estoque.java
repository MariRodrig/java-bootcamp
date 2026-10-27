package ex29designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private String nome;
    private int quantidade;

    public Estoque(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    private List<ObservadorEstoque> observadores = new ArrayList<>();

    public void adicionarObservador(ObservadorEstoque observador){
        observadores.add(observador);
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;

        for (ObservadorEstoque observadorEstoque : observadores){
            observadorEstoque.atualizar(quantidade);
        }
    }
}
