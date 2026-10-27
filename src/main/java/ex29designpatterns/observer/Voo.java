package ex29designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Voo {

    private String nome;
    private String status;

    public Voo(String nome, String status) {
        this.nome = nome;
        this.status = status;
    }

    private List<ObservadorVoo> observadores = new ArrayList<>();

    public void adicionarObservador(ObservadorVoo observador) {
        observadores.add(observador);
    }

    public void mudarStatus(String status) {
        this.status = status;

        for (ObservadorVoo observadorVoo : observadores){
            observadorVoo.atualizar(status);
        }

    }
}
