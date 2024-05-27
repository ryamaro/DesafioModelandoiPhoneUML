import model.Iphone;

public class App {
    public static void main(String[] args) throws Exception {

        Iphone celular = new Iphone();

        celular.selecionarMusica("The box");
        celular.tocar();
        celular.pausar();

        celular.ligar("99999-9999");
        celular.atender();
        celular.iniciarCorreioVoz();
        
        celular.exibirPagina("https://Google.com");
        celular.adicionarNovaAba();
        celular.atualizarPagina();
    }
}
