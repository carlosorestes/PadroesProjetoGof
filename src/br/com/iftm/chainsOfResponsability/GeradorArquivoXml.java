package br.com.iftm.chainsOfResponsability;
import java.util.Map;

public class GeradorArquivoXml extends GeradorArquivo {
	
	public GeradorArquivoXml(Processador processador) {
		super(processador);
	}

	@Override
	protected String gerarConteudo(Map<String, Object> propiedades) {
		//gera xml
		StringBuilder propFileBuilder = new StringBuilder();
		propFileBuilder.append("<properties>");
		for(String prop: propiedades.keySet()) {
			propFileBuilder.append("<"+prop+">"+propiedades.get(prop)+"</"+prop+">");
		}
		propFileBuilder.append("</propiedades>");
		return propFileBuilder.toString();
	}

}
