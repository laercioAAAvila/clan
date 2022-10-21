package br.com.laercio.an.clan.service;

import org.springframework.stereotype.Service;

import br.com.laercio.an.clan.model.RecrutamentoModel;

@Service
public interface RecrutamentoService {
	void saveRecrutamento(RecrutamentoModel recrutamentoModel);
}
