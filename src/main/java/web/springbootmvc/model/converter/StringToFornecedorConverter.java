package web.springbootmvc.model.converter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import web.springbootmvc.model.Fornecedor;

@Component
public class StringToFornecedorConverter implements Converter<String, Fornecedor> {

	private static final Logger logger = LoggerFactory.getLogger(StringToFornecedorConverter.class);
	
	public StringToFornecedorConverter() {
		logger.trace(">>> Criando um StringToFornecedorConverter");
	}
	
	@Override
	public Fornecedor convert(@NonNull String from) {
		logger.trace(">>> Convertendo a String: {} em um Fornecedor", from);
		Fornecedor fornecedor = new Fornecedor(Long.parseLong(from));
		//Aqui o esquema seria ir buscar no BD o Fornecedor com esse código
		if (fornecedor.getCodigo() == 1L) {
			fornecedor.setNome("Fornecedor 1");
		} else if (fornecedor.getCodigo() == 2L) {
			fornecedor.setNome("Fornecedor 2");
		} else if (fornecedor.getCodigo() == 3L) {
			fornecedor.setNome("Fornecedor 3");
		} else if (fornecedor.getCodigo() == 4L) {
			fornecedor.setNome("Fornecedor 4");
		} else {
			fornecedor.setNome("Fornecedor 5");
		}
		return fornecedor;
	}
}

