package br.com.iftm.chainsOfResponsability;

import java.io.IOException;

public class ProcessaDefault extends Processador {
	
	public ProcessaDefault(Processador proximoProcessador) {
		super(proximoProcessador);
	}
	
	public ProcessaDefault() {
		
	}

	@Override
	protected  byte[] processaConteudo(byte[] conteudo) throws IOException {
		return conteudo;
	}
}
