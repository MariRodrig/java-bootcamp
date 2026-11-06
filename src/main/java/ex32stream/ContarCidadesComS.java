package ex32stream;

import java.util.List;

// Crie uma lista de cidades e utilize stream() e filter() para selecionar apenas as que começam com a letra "S".
// Use count() para contar quantas cidades passaram pelo filtro e imprima o resultado.

public class ContarCidadesComS {
    public static void main(String[] args) {

        List<String> cidades = List.of("Salvador", "Juiz de Fora", "Rio de Janeiro", "São Paulo");

        long quantidade = cidades.stream()
                .filter(cidade -> cidade.startsWith("S"))
                .count();

        System.out.println("Quantidade de cidades que começam com S: " + quantidade);
    }
}
