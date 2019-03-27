package br.com.iftm.observer;

public class LogBO implements Observador {

	@Override
	public void novoArquivoGerado(String nomeArquivo, String conteudo) {
		LogDao logDao = new LogDao();
		Log log = new Log("Arquivo", nomeArquivo, conteudo);
		try {
			logDao.salvarLog(log);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
