package br.com.msInserirTransacoes.service;

import org.springframework.http.ResponseEntity;

//import br.com.msInserirTransacoes.entity.TransacaoEntity;
import br.com.msInserirTransacoes.wrapper.TransacoesWrapper;

public interface TransacaoService {

	ResponseEntity<TransacoesWrapper> salvar(TransacoesWrapper transacao, String tipo);

}
