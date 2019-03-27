package br.com.iftm.chainsOfResponsability;

import java.io.IOException;

public interface Processador {
	
	public byte[] processaConteudo(byte[] bytes) throws IOException;

}
