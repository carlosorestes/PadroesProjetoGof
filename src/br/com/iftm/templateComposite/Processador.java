package br.com.iftm.templateComposite;

import java.io.IOException;

public interface Processador {
	
	public byte[] processaConteudo(byte[] bytes) throws IOException;

}
