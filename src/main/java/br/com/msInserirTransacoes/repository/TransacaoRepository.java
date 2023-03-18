package br.com.msInserirTransacoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.msInserirTransacoes.entity.TransacaoEntity;

public interface TransacaoRepository extends JpaRepository<TransacaoEntity, Long>{

}
