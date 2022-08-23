package com.lista13.contaBancaria.model.valoresConta;

import java.math.BigDecimal;

public interface CalculoConta {
    public BigDecimal calcular(BigDecimal valorAtualDaConta, BigDecimal valorFornecidoParaSaqueOuDeposito);
}
