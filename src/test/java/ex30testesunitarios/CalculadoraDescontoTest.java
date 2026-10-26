package ex30testesunitarios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//  Teste 1 — Cliente comum: verificar com assertEquals() se uma compra de R$ 50,00 retorna R$ 50,00.
//  Teste 2 — Cliente VIP: verificar com assertEquals() se uma compra de R$ 200,00 retorna R$ 180,00.
//  Teste 3 — Valor inválido: verificar com assertThrows() se uma compra de R$ -10,00 lança IllegalArgumentException.

class CalculadoraDescontoTest {

    private CalculadoraDesconto calculadoraDesconto;

    @BeforeEach
    void setUp() {
        calculadoraDesconto = new CalculadoraDesconto();
    }

    @Test
    void deveRetornarValorSemDescontoParaClienteComum() {

        double resultado = calculadoraDesconto.aplicarDesconto(50, false);
        assertEquals(50, resultado);
    }

    @Test
    void deveAplicarDescontoParaClienteVip() {

        double resultado = calculadoraDesconto.aplicarDesconto(200, true);
        assertEquals(180, resultado);
    }

    @Test
    void deveLancarExcecaoQuandoValorForNegativo() {

        assertThrows(IllegalArgumentException.class, () -> calculadoraDesconto.aplicarDesconto(-10.0, true));

    }
}