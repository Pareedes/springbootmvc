package web.springbootmvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @GetMapping(value = { "/", "/index.html" })
    public String index() {
        logger.trace(">>>>>>>>>>>>>>>> Entrou em index");
        logger.trace(">>>>>>>>>>>>>>>> Encaminhando para a view index");
        return "index";
    }


	@PostMapping("/bemvindo")
	public String darBoasVindas(@RequestParam(name = "nome", defaultValue = "João Ninguém") String nome, Model model) {
		logger.trace(">>>>>>>>>>>>>>>> Entrou em darBoasVindas");
		logger.debug(">>>>>>>>>>>>>>>> Recebeu o nome {}", nome);
		model.addAttribute("nome", nome);
		logger.trace(">>>>>>>>>>>>>>>> Encaminhando para a view mensagemboasvindas");
		return "mensagemboasvindas";
	}

}
