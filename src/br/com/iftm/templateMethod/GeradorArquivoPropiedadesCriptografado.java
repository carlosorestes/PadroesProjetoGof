package br.com.iftm.templateMethod;
import java.util.Map;

public class GeradorArquivoPropiedadesCriptografado extends GeradorArquivo {
	
	@Override
	protected String gerarConteudo(Map<String, Object> propiedades) {
		// gera properties
		StringBuilder propFileBuilder = new StringBuilder();
		for (String prop : propiedades.keySet()) {
			propFileBuilder.append(prop + "=" + propiedades.get(prop) + "\n");
		}
		return propFileBuilder.toString();

	}
	
	@Override
	protected byte[] processaConteudo(byte[] bytes) {
		byte[] newBytes = new byte[bytes.length];
		for(int i = 0;i < bytes.length;i++) {
			newBytes[i] = (byte)((bytes[i]+10) % Byte.MAX_VALUE);
		}
		return newBytes;
	}
}
