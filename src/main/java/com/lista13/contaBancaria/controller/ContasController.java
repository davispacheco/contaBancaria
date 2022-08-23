package com.lista13.contaBancaria.controller;

import com.lista13.contaBancaria.model.ContasModel;
import com.lista13.contaBancaria.model.valoresConta.ContaFactory;
import com.lista13.contaBancaria.service.ContasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContasController {

    @Autowired
    private ContasService contasService;

    @GetMapping(path = "/contas")
    public ResponseEntity<List<ContasModel>> buscarTodasContas() {
        return ResponseEntity.ok(contasService.buscarTodas());
    }

    @GetMapping(path = "/contas/{codigo}")
    public ResponseEntity<Optional<ContasModel>> buscarContaPorId(@PathVariable Long codigo) {
        return ResponseEntity.ok(contasService.buscarPorId(codigo));
    }

    @PostMapping(path = "/contas")
    public ResponseEntity<ContasModel> cadastrarConta(@RequestBody ContasModel contasModel, ContaFactory contaFactory) {
        ContasModel novaConta = contasService.cadastrar(contasModel, contaFactory);
        return new ResponseEntity<>(novaConta, HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/contas/{codigo}")
    public void deletarConta(@PathVariable Long codigo) {
contasService.deletar(codigo);
    }
}
