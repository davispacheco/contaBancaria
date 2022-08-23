package com.lista13.contaBancaria.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "conta")
public class ContasModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(length = 6, nullable = false)
    private String numeroDeConta;
    @Column(length = 4, nullable = false)
    private String agencia;
    @Column(length = 20, nullable = false)
    private String nomeDoUsuario;
    @Column(length = 10, nullable = false)
    private BigDecimal valorAtualDaConta;
    @Column(length = 10, nullable = false)
    private BigDecimal valorFornecidoParaSaqueOuDeposito;
    @Column(length = 20, nullable = false)
    private String tipoDeServico;
    @Column(length = 10)
    private BigDecimal valorFinal;

}
