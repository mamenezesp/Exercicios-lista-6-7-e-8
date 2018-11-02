
public class Teste {
	public static void main(String[] args) {

		NoticiarioAssina noticiario = new NoticiarioAssina();
		
		new Consumidor("Nathalia", noticiario);
		noticiario.notificaNoticia(" Nova celebridade do Brasil ", 28, 10, "Tópico: Fama");
		
		new Consumidor("João", noticiario);
		noticiario.notificaNoticia(" XX Cria um novo Hit ", 30, 10, "Tópico: Música");

	}
}
