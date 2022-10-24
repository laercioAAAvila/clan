package br.com.laercio.an.clan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.laercio.an.clan.exception.RecrutamentoException;
import br.com.laercio.an.clan.model.RecrutamentoModel;
import br.com.laercio.an.clan.service.RecrutamentoService;

@Controller
public class RecrutamentoController {
	
	@Autowired
	private RecrutamentoService recrutamentoService;
	
	@RequestMapping (method = RequestMethod.GET, value = "/recrutamento")
	public String recrutamento() {
		return "page/recrutamento";
	}
	
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/recrutamento/save")
	public String formulario(@ModelAttribute("recrutamentoModel") RecrutamentoModel recrutamentoModel) {
		try {
			recrutamentoService.saveRecrutamento(recrutamentoModel);
		} catch (RecrutamentoException e) {
			System.out.println(e);
			return "page/recrutamento";
		}
		
		return "page/recrutamento";
	}
}
