package com.paulo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulo.models.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
