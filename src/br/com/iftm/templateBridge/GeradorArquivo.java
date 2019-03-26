package br.com.iftm.templateBridge;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public abstract class GeradorArquivo {
	
	private Processador processador;
	
	public GeradorArquivo(Processador processador) {
		this.processador = processador;
	}

	public void gerarArquivo(String nome, Map<String, Object> propiedades) throws IOException {
		
		String conteudo = gerarConteudo(propiedades);
		byte[] bytes = processador.processaConteudo(conteudo.getBytes());
		FileOutputStream fileout = new FileOutputStream(nome);
		fileout.write(bytes);
		fileout.close();
	}
	
	protected abstract String gerarConteudo(Map<String, Object> propriedades);
 		
}
