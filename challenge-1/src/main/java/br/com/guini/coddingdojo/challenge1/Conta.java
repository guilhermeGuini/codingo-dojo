package br.com.guini.coddingdojo.challenge1;

import java.math.BigDecimal;

public class Conta {

    private final BigDecimal limite;
    private BigDecimal saldo;

    public Conta(BigDecimal limite, BigDecimal saldo) {
        this.limite = limite;
        this.saldo = saldo;
    }

    public Conta(BigDecimal saldo) {
        this(null, saldo);
    }

    public Conta() {
        this(null, BigDecimal.valueOf(25.000));
    }

    public void saque(BigDecimal valor) {
        throw new UnsupportedOperationException();
    }

    public BigDecimal debita(BigDecimal valor) {
        throw new UnsupportedOperationException();
    }
}