package web.springbootmvc.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import web.springbootmvc.model.Caracteristica;
import web.springbootmvc.model.Fornecedor;
import web.springbootmvc.model.Produto;
import web.springbootmvc.model.Tipo;

@Controller
public class ProdutoController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProdutoController.class);

	//Simula uma consulta a um BD buscando todos Fornecedores
	private List<Fornecedor> buscarFornecedores() {
		List<Fornecedor> fornecedores = new ArrayList<>();
		fornecedores.add(new Fornecedor(1L, "Fornecedor 1"));
		fornecedores.add(new Fornecedor(2L, "Fornecedor 2"));
		fornecedores.add(new Fornecedor(3L, "Fornecedor 3"));
		fornecedores.add(new Fornecedor(4L, "Fornecedor 4"));
		fornecedores.add(new Fornecedor(5L, "Fornecedor 5"));
		return fornecedores;
	}
	
	@GetMapping("/produto/novo")
	public String abrirCadastroProduto(Produto produto, Model model) {
		logger.trace(">>>>>>>>>>>>>>>> Entrou em abrirCadastroProduto");
		
		List<Caracteristica> todasCaracteristicas = Arrays.asList(Caracteristica.values());
		model.addAttribute("todasCaracteristicas", todasCaracteristicas);
		
		List<Tipo> todosTipos = Arrays.asList(Tipo.values());
		model.addAttribute("todosTipos", todosTipos);
		
		List<Fornecedor> fornecedores = buscarFornecedores();
		model.addAttribute("fornecedores", fornecedores);
				
		logger.trace(">>>>>>>>>>>>>>>> Encaminhando para a view produto/cadastrarproduto");
		return "produto/cadastrarproduto";
	}

	@PostMapping("/produto/novo")
	public String cadastrarProduto(Produto produto, Model model) {
		logger.trace(">>>>>>>>>>>>>>>> Entrou em cadastrarProduto");
		logger.info("Produto recebido para cadastrar: {}", produto);
			
		List<Caracteristica> todasCaracteristicas = Arrays.asList(Caracteristica.values());
		model.addAttribute("todasCaracteristicas", todasCaracteristicas);
		
		List<Tipo> todosTipos = Arrays.asList(Tipo.values());
		model.addAttribute("todosTipos", todosTipos);
		
		List<Fornecedor> fornecedores = buscarFornecedores();
		model.addAttribute("fornecedores", fornecedores);

		logger.trace(">>>>>>>>>>>>>>>> Encaminhando para a view produto/mostrarproduto");
		return "produto/mostrarproduto";
	}
}

