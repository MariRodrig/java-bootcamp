package ex29designpatterns.decorator;

public class AcaiSimples implements Acai {
        public String getDescricao() {
            return "Açaí Simples";
        }

        @Override
        public double getPreco() {
            return 12.00;
        }
    }
