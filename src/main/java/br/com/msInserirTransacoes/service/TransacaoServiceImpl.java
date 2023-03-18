package br.com.msInserirTransacoes.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.msInserirTransacoes.entity.TransacaoEntity;
import br.com.msInserirTransacoes.repository.TransacaoRepository;
import br.com.msInserirTransacoes.util.TipoEnum;
import br.com.msInserirTransacoes.wrapper.TransacoesWrapper;

@Service
public class TransacaoServiceImpl implements TransacaoService {
	
	private static final String DEBITO = TipoEnum.DEBITO.toString();
	private static final String CREDITO = TipoEnum.CREDITO.toString();
	

	@Autowired
	private TransacaoRepository transacaoRepository;
	
	@Override
	public ResponseEntity<TransacoesWrapper> salvar (TransacoesWrapper transacao, String tipo) {
		
		TransacaoEntity transacaoEntity = new TransacaoEntity();

		if (tipo.equalsIgnoreCase(CREDITO)) {

			transacaoEntity.setTipo(CREDITO);

		} else if (tipo.equalsIgnoreCase(DEBITO)) {

			transacaoEntity.setTipo(DEBITO);
		}
		
		transacaoEntity.setValor(transacao.getValor());
		transacaoEntity.setData(new Date());
		transacaoEntity = transacaoRepository.save(transacaoEntity);
		return new ResponseEntity<TransacoesWrapper>(transacao, HttpStatus.OK);
	}

}
