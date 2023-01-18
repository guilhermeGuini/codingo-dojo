package br.com.guini.coddingdojo.challenge1;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContaTest {

    private Conta contaSemLimite = new Conta();
    private Conta contaComLimite = new Conta(BigDecimal.valueOf(1000), BigDecimal.valueOf(25000));

    @Test
    void nao_deve_permitir_sacar_valor_maior_que_saldo() {

    }

    @Test
    void testLimit() {
        assertNull(contaSemLimite.getLimite());
        assertTrue(contaComLimite.getLimite().compareTo(BigDecimal.valueOf(1000)) == 0);
    }
}
