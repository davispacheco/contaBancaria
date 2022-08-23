package com.lista13.contaBancaria.service;

import com.lista13.contaBancaria.model.ContasModel;
import com.lista13.contaBancaria.model.valoresConta.ContaFactory;
import com.lista13.contaBancaria.repository.ContasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ContasService {
    @Autowired
    private ContasRepository contasRepository;

    public List<ContasModel> buscarTodas() {
        return contasRepository.findAll();
    }

    public Optional<ContasModel> buscarPorId(Long codigo) {
        return contasRepository.findById(codigo);
    }

    public ContasModel cadastrar(ContasModel contasModel, ContaFactory contaFactory) {
        BigDecimal resultado = contaFactory.getStatusConta(contasModel.getTipoDeServico()).calcular(contasModel.getValorAtualDaConta(), contasModel.getValorFornecidoParaSaqueOuDeposito());
        contasModel.getCodigo();
        contasModel.getNumeroDeConta();
        contasModel.getAgencia();
        contasModel.getNomeDoUsuario();
        contasModel.getValorFornecidoParaSaqueOuDeposito();
        contasModel.getTipoDeServico();
        contasModel.setValorFinal(resultado);
        return contasRepository.save(contasModel);
    }

    public void deletar(Long codigo) {
        contasRepository.deleteById(codigo);
    }
}
