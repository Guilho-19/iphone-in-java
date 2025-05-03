package iphone;

public class Main {
	public static void main(String[] args) {
		Main iphone = new Main();
		
		//Funcionalidade músical
		iphone.selectMusic("Eyes Without a Face");
		iphone.playMusic();
		iphone.pauseMusic();
		
		//Funcionalidade telefonica
		iphone.call("(11) 98543-5435");
		iphone.answer();
		iphone.startBoxMessages();
		
		//Funcionalidade internet
		iphone.showPage("www.google.com");
		iphone.refreshPage();
		iphone.openNewTab();
		
	}
	
	//Reprodução musical no Iphone
	public void playMusic() {
		System.out.println("A música começou a tocar no Iphone");
	}
	public void pauseMusic() {
		System.out.println("A música está pausada no Iphone");
	}
	public void selectMusic(String music) {
		System.out.println("A música selecionada no Iphone foi " + music);
	}
	
	//Sistema de ligação no Iphone
	public void answer() {
		System.out.println("Atendendo a ligação no Iphone");
	}
	public void startBoxMessages() {
		System.out.println("Iniciando correio de voz");
	}
	public void call(String number) {
		System.out.println("Ligando para " + number);
	}
	
	//Navegação na internet no Iphone
	public void refreshPage() {
		System.out.println("A página foi atualizada com sucesso");
	}
	public void openNewTab() {
		System.out.println("Uma nova aba foi aberta no navegador de internet");
	}
	public void showPage(String url) {
		System.out.println("Exibindo a página contida no url: " + url);
	}
	
}
