package br.com.laercio.an.clan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.laercio.an.clan.model.RecrutamentoModel;
import br.com.laercio.an.clan.repository.RecrutamentoRepository;

@Service
public class RecrutamentoServiceImpl implements RecrutamentoService{

	@Autowired
	private RecrutamentoRepository recrutamentoRepository;
	
	@Override
	public void saveRecrutamento(RecrutamentoModel model) {
		this.recrutamentoRepository.save(model);
		
	}
}
