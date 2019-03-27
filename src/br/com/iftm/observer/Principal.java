package br.com.iftm.observer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Principal {

	public static void main(String args[]) throws IOException {
		Map<String, Object> mapa =  new HashMap<>();
		mapa.put("nome", "Malaquias");
		mapa.put("idade", 31);
		
		List<Processador> processadores = new ArrayList<Processador>();
		processadores.add(new ProcessaCriptografado());
		processadores.add(new ProcessaCompactado());
		
		List<Processador> processadores1 = new ArrayList<Processador>();
		processadores1.add(new ProcessaCompactado());
		processadores1.add(new ProcessaCriptografado());
		
		List<Processador> processadores2 = new ArrayList<Processador>();
		processadores1.add(new ProcessaCriptografado());
		processadores1.add(new ProcessaCompactado());
		
		GeradorArquivo gerador =  new GeradorArquivoPropiedades(new ProcessadorComposto(processadores));
		gerador.addObservador(new LogService());
		gerador.addObservador(new LogBO());
		gerador.gerarArquivo("pro1.zip", mapa);
		
		GeradorArquivo gerador1 = new GeradorArquivoXml(new ProcessadorComposto(processadores1));
		gerador1.gerarArquivo("xml1.txt", mapa);
		
		GeradorArquivo gerador2 = new GeradorArquivoPropiedades(new ProcessadorComposto(processadores2));
		gerador2.gerarArquivo("default.zip", mapa);
	}
}
