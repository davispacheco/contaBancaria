package com.lista13.contaBancaria.model.valoresConta;

public class ContaFactory {
    public CalculoConta getStatusConta(String status) {
        if(status.equalsIgnoreCase("deposito")) {
            return new CalculoContaDeposito();
        } else if(status.equalsIgnoreCase("saque")) {
            return new CalculoContaSaque();
        } else {
            return null;
        }
    }
}
