package com.paulo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paulo.models.Pessoa;
import com.paulo.repository.PessoaRepository;
import com.paulo.services.PessoaService;

@Service
public class PessoaServiceImpl implements PessoaService{

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Override
	public List<Pessoa> listar() {
		return pessoaRepository.findAll();
	}

	@Override
	public Pessoa salvar(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}

	@Override
	public Optional<Pessoa> buscarPorId(Long id) {
		return pessoaRepository.findById(id);
	}

}
