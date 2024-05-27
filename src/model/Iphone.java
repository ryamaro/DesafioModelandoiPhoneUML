package model;

public class Iphone implements IAparelhoTelefonico, INavegadorInternet, IReprodutorMusical {

    @Override
    public void atender() {
        System.out.println("Atendendo telefone!");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Inciando correio de Voz!");

    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba!");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina!");

    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo " + url);

    }

    @Override
    public void pausar() {
        System.out.println("Pausando");

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica: " + musica);

    }

    @Override
    public void tocar() {
        System.out.println("Tocando");

    }

}
