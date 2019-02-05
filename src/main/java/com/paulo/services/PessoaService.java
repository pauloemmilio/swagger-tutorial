package com.paulo.services;

import java.util.List;

import com.paulo.models.Pessoa;

public interface PessoaService {
	
	List<Pessoa> listar() ;

	Pessoa salvar(Pessoa pessoa);

}
