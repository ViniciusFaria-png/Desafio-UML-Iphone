package iphone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	@Override
	public void tocar() {
		System.out.println("Reproduzir musica");
	}
	@Override
	
	public void pausar() {
		System.out.println("Pausar musica");
	}
	@Override
	public void selecionarMusica() {
		System.out.println("Selecionar Musica");
	}
	@Override
	public void ligar() {
		System.out.println("Ligar para um contato");
	}
	@Override
	public void atender() {
		System.out.println("Atender Ligacao");
	}
	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciar reproducao do Correiro de Voz");
	}
	@Override
	public void exibirPagina() {
		System.out.println("Exibir pagina do browser");
	}
	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionar nova pagina no browser");
	}
	@Override
	public void atualizarPagina() {
		System.out.println("Atualizar pagina do browser");
	}
}
