package br.com.msInserirTransacoes.controller;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.msInserirTransacoes.entity.TransacaoEntity;
import br.com.msInserirTransacoes.service.TransacaoService;
import br.com.msInserirTransacoes.wrapper.TransacoesWrapper;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {
	
	@Autowired
	private TransacaoService transacaoService;
	
	@ApiOperation(value="API para o cadastro de Transações do tipo Débito e Crédito")
	@PostMapping(value = "/cadastrar")	
	public ResponseEntity<TransacoesWrapper> cadastra (@RequestBody TransacoesWrapper transacao, @NotNull @ApiParam(value = "", required = true, allowableValues = "debito, credito") @Valid @RequestParam(value = "tipo", required = true) String tipo){
		return transacaoService.salvar(transacao, tipo);
	}

}
