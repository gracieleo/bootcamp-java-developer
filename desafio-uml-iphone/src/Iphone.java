
public class Iphone implements ReprodutorMusical, AparelhoTelefônico, NavegadorInternet {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();

		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica();

		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioVoz();

		iphone.exibirPagina();
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();  
	}

	//SOBRESCRITA DOS MÉTODOS
	public void tocar(){
		System.out.println("TOCANDO MUSICA");
	}

	public void pausar(){
		System.out.println("PAUSANDO MUSICA");
	}

	public void selecionarMusica(){
		System.out.println("MUSICA SELECIONADA");
	}

	public void ligar(){
		System.out.println("LIGANDO");
	}

	public void atender(){
		System.out.println("ATENDENDO TELEFONE");
	}

	public void iniciarCorreioVoz(){
		System.out.println("INICIANDO CORREIO DE VOZ");
	}

	public void exibirPagina(){
		System.out.println("EXIBINDO PAGINA WEB");
	}

	public void adicionarNovaAba(){
		System.out.println("ADICIONANDO NOVA ABA");
	}

	public void atualizarPagina(){
		System.out.println("ATUALIZANDO PAGINA WEB");
	}


}


