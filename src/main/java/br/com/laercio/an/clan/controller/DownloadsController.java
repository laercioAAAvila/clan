package br.com.laercio.an.clan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DownloadsController {
	
	@RequestMapping (method = RequestMethod.GET, value = "/downloads")
	public String downloads() {
		return "page/downloads";
	}
}
