package br.com.iftm.observer;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class GeradorArquivo {
	
	private Processador processador;
	
	private List<Observador> observadores;
	
	public GeradorArquivo(Processador processador) {
		this.processador = processador;
		this.observadores = new ArrayList<Observador>();
	}

	public void gerarArquivo(String nome, Map<String, Object> propiedades) throws IOException {
		
		String conteudo = gerarConteudo(propiedades);
		byte[] bytes = processador.processaConteudo(conteudo.getBytes());
		FileOutputStream fileout = new FileOutputStream(nome);
		fileout.write(bytes);
		fileout.close();
		notificar(nome, conteudo);
	} 
	
	public void notificar(String nomeArquivo, String conteudo) {
		for(Observador observador: observadores) {
			observador.novoArquivoGerado(nomeArquivo, conteudo);
		}
	}
	
	public void addObservador(Observador observador) {
		this.observadores.add(observador);
	}
	
	protected abstract String gerarConteudo(Map<String, Object> propriedades);
 		
}
