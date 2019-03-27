package br.com.iftm.chainsOfResponsability;
import java.util.Map;

public class GeradorArquivoPropiedades extends GeradorArquivo {
	
	public GeradorArquivoPropiedades(Processador processador) {
		super(processador);
	}
	
	@Override
	protected String gerarConteudo(Map<String, Object> propiedades) {
		// gera properties
		StringBuilder propFileBuilder = new StringBuilder();
		for (String prop : propiedades.keySet()) {
			propFileBuilder.append(prop + "=" + propiedades.get(prop) + "\n");
		}
		return propFileBuilder.toString();

	}
}
