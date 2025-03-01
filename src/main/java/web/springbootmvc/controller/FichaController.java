package web.springbootmvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import web.springbootmvc.model.Atividade;
import web.springbootmvc.model.Ficha;

@Controller
@RequestMapping("/fichas")
public class FichaController {

	private static final Logger logger = LoggerFactory.getLogger(FichaController.class);
	
	@GetMapping("/inserir")
	public String abrirCadastroFicha(Ficha ficha) {
		return "ficha/nova";
	}
	
	@PostMapping("/abririnseriratividade")
	public String abrirCadastroAtividade(Ficha ficha, Atividade atividade) {
		return "atividade/nova";
	}
	
	@PostMapping("/inseriratividade")
	public String inserirAtividade(Ficha ficha, Atividade atividade) {
		logger.info("Ficha recebida: {}", ficha);
		logger.info("Atividades da Ficha recebida: {}", ficha.getAtividades());
		logger.info("Atividade recebida: {}", atividade);
		ficha.adicionarAtividade(atividade);
		return "ficha/nova";
	}
	
}
