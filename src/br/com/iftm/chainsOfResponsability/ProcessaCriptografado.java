package br.com.iftm.chainsOfResponsability;

public class ProcessaCriptografado extends Processador{

	public ProcessaCriptografado(Processador proximoProcessador) {
		super(proximoProcessador);
	}
	
	public ProcessaCriptografado() {
		
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
