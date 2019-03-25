package br.com.iftm.templateMethod;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public abstract class GeradorArquivo {

	public void gerarArquivo(String nome, Map<String, Object> propiedades) throws IOException {
		
		String conteudo = gerarConteudo(propiedades);
		byte[] bytes = processaConteudo(conteudo.getBytes());
		FileOutputStream fileout = new FileOutputStream(nome);
		fileout.write(bytes);
		fileout.close();
	}
	
	protected abstract String gerarConteudo(Map<String, Object> propriedades);
	
	protected  byte[] processaConteudo(byte[] conteudo) throws IOException{
		return conteudo;
	}
 		
}
