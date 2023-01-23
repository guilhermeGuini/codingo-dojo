package br.com.guini.coddingdojo.challenge1;

import java.math.BigDecimal;

enum TipoAjuste {
    CREDITO,
    DEBITO
}

public class EstabelecimentoComercial {

    private BigDecimal totalVendasAReceber;
    private BigDecimal totalDeAjustes;
    private BigDecimal descontoAlelo = BigDecimal.ZERO;

    public EstabelecimentoComercial(BigDecimal totalVendasAReceber, BigDecimal totalDeAjustes) {
        this.totalVendasAReceber = totalVendasAReceber;
        this.totalDeAjustes = totalDeAjustes;
    }

    public EstabelecimentoComercial() {
        this(BigDecimal.valueOf(1500), BigDecimal.ZERO);
    }

    public void realizaVenda(BigDecimal valorVenda) {
        throw new UnsupportedOperationException();
    }

    public void realizaAjuste(TipoAjuste tipoAjuste, BigDecimal valorAjuste) {
        throw new UnsupportedOperationException();
    }

    public BigDecimal getTotalVendasAReceber() {
        throw new UnsupportedOperationException();
    }

    public BigDecimal getDescontoAlelo() {
        return descontoAlelo;
    }

    public boolean isDebitBalance() {
        throw new UnsupportedOperationException();
    }
}
