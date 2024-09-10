package web.springbootmvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import web.springbootmvc.model.ClasseQualquer;

@Controller
public class SpringBootMVCController {

	private static final Logger logger = LoggerFactory.getLogger(SpringBootMVCController.class);

	@GetMapping("/retornarview")
	public String retornarView() {
		logger.trace(">>>>>>>>>>>>>>>> Entrou em retornarView");
		logger.trace(">>>>>>>>>>>>>>>> Encaminhando para a view viewretornada");
		return "viewretornada";
	}

	@PostMapping("/objetoqualquer")
	public String metodoObjetoQualquer(ClasseQualquer objetoQualquer, Model model) {
		logger.trace(">>>>>>>>>>>>>>>> Entrou em metodoObjetoQualquer");
		logger.debug(">>>>>>>>>>>>>>>> Recebeu o objetoQualquer {}", objetoQualquer);
		model.addAttribute("objeto", objetoQualquer);
		logger.trace(">>>>>>>>>>>>>>>> Encaminhando para a view mostrarobjetoqualquer");
		return "mostrarobjetoqualquer";
	}
}
