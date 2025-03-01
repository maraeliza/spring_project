package web.springbootmvc.controller;

import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import web.springbootmvc.model.ClasseQualquer;

@Controller
public class SpringBootMVCController {

  private static final Logger logger = LoggerFactory.getLogger(
    SpringBootMVCController.class
  );

  @GetMapping("/vairetornarview")
  public String retornarView() {
    logger.trace(">>>>>> Entrou no método retornarView");
    logger.trace(
      ">>>>>> Estou encaminhando para a view o arquivo viewretornada"
    );
    return "viewretornada";
  }

  @PostMapping("/bemvindo")
  public String mensagemBoasVindas(String nome, String idade, Model model) {
    logger.trace(">>>> Entrando no metodo de mensagemBoasVindas");
    logger.info(">>>> VALOR COLETADO: \n NOME = {}", nome);

    Random random = new Random();
    int numeroAleatorio = random.nextInt(100);

    model.addAttribute("nome", nome);
    model.addAttribute("idade", idade);
    model.addAttribute("random", numeroAleatorio);
    return "mensagemboasvindas";
  }
  

  @PostMapping("/objetoqualquer")
  public String metodoObjetoQualquer(ClasseQualquer objeto) {
    
    logger.trace(">>>>>> Entrou no metodo metodoObjetoQualquer");
    logger.info(">>>>>>> Recebeu {}", objeto);
    logger.trace(">>>>>> renderizando a view");
    return "mostrarobjetoqualquer";
  }
}
