package com.lista13.contaBancaria.repository;

import com.lista13.contaBancaria.model.ContasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContasRepository extends JpaRepository<ContasModel, Long> {
}
