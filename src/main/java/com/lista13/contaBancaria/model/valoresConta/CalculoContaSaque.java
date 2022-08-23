package com.lista13.contaBancaria.model.valoresConta;

import java.math.BigDecimal;

public class CalculoContaSaque implements CalculoConta {
    @Override
    public BigDecimal calcular(BigDecimal valorAtualDaConta, BigDecimal valorFornecidoParaSaqueOuDeposito) {
        BigDecimal resultado = valorAtualDaConta.subtract(valorFornecidoParaSaqueOuDeposito);
        return resultado;
    }
}
