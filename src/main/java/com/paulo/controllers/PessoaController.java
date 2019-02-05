package com.paulo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paulo.models.Pessoa;
import com.paulo.services.PessoaService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

	@Autowired
	private PessoaService pessoaService;
	
	@ApiOperation(value="Recebe os dados de uma pessoa, realiza o cadastro e retorna a informação")
	@PostMapping
	public Pessoa cadastrar(@RequestBody Pessoa pessoa) {
		return pessoaService.salvar(pessoa);
	}
	
	@ApiOperation(value="Retorna a lista de pessoas presentes no banco de dados")
	@GetMapping
	public List<Pessoa> listar(){
		return pessoaService.listar();
	}
}
