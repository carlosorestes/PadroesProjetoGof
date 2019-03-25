package br.com.iftm.templateMethod;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String args[]) throws IOException {
		Map<String, Object> mapa =  new HashMap<>();
		mapa.put("nome", "Malaquias");
		mapa.put("idade", 31);
		
		GeradorArquivo gerador =  new GeradorArquivoPropiedadesCriptografado();
		gerador.gerarArquivo("Cripto.txt", mapa);
		
		GeradorArquivo gerador1 = new GeradorArquivoXmlCompactado();
		gerador1.gerarArquivo("XML.zip", mapa);
		
		GeradorArquivo gerador2 = new GeradorPropriedadesDefault();
		gerador2.gerarArquivo("Default.txt", mapa);
	}
}
