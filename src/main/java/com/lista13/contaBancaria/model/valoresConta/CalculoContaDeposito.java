package com.lista13.contaBancaria.model.valoresConta;

import java.math.BigDecimal;

public class CalculoContaDeposito implements CalculoConta {
    @Override
    public BigDecimal calcular(BigDecimal valorAtualDaConta, BigDecimal valorFornecidoParaSaqueOuDeposito) {
        BigDecimal resultado = valorAtualDaConta.add(valorFornecidoParaSaqueOuDeposito);
        return resultado;
    }
}
