package smartphone;

import funcionalidades.internet.NavegadorInternet;
import funcionalidades.musica.ReprodutorMusical;
import funcionalidades.telefone.AparelhoTelefonico;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

    @Override
    public void exibirPagina(String url) {
        System.out.println("Abrindo a URL: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova Aba" );

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar a página" );
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Músca" );
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a Músca" );
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Tocando Músca escolhida: " + musica );
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero );
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação" );
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ligando para o Correio de Voz" );
    }

}