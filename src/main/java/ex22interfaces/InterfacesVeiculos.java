package ex22interfaces;

import java.util.ArrayList;

public class InterfacesVeiculos {
    public static void main(String[] args) {


        ArrayList<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro());
        veiculos.add(new Moto());

        for (Veiculo veiculo : veiculos) {
            veiculo.ligar();
            veiculo.acelerar();
        }

    }
}
