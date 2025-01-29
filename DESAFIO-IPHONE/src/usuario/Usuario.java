package usuario;

import funcionalidades.internet.NavegadorInternet;
import funcionalidades.musica.ReprodutorMusical;
import funcionalidades.telefone.AparelhoTelefonico;
import smartphone.Iphone;

public class Usuario {
    public static void main(String[] args) {
        
        Iphone iphone = new Iphone();

        NavegadorInternet navegador = iphone;
        ReprodutorMusical musica = iphone;
        AparelhoTelefonico telefone = iphone;

        navegador.adicionarNovaAba();
        musica.tocar();
        telefone.ligar("123456");

    }
}
