package br.com.laercio.an.clan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RecrutamentoController {
	
	@RequestMapping (method = RequestMethod.GET, value = "/recrutamento")
	public String recrutamento() {
		return "page/recrutamento";
	}
}
