
public class Teste {
	public static void main(String[] args) {

		NoticiarioAssina noticiario = new NoticiarioAssina();
		
		new Consumidor("Nathalia", noticiario);
		noticiario.notificaNoticia(" Nova celebridade do Brasil ", 28, 10, "T�pico: Fama");
		
		new Consumidor("Jo�o", noticiario);
		noticiario.notificaNoticia(" XX Cria um novo Hit ", 30, 10, "T�pico: M�sica");

	}
}
