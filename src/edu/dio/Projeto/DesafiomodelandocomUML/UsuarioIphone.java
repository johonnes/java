package edu.dio.Projeto.DesafiomodelandocomUML;

import edu.dio.Projeto.DesafiomodelandocomUML.iphone.Iphone;

public class UsuarioIphone {
    public static void main(String[] args) {
        Iphone ip = new Iphone();
        
        System.out.println("reprodutor musical");
        ip.tocar();
        ip.pausar();
        ip.selecionarMusica("hino nacional");

        System.out.println("Aparelho Telefônico");
        ip.ligar("9999-9999");
        ip.atender();
        ip.iniciarCorreioVoz();

        System.out.println("Navegador de Internet");
        ip.exibirPagina("https://web.dio.me");
        ip.adicionarNovaAba();
        ip.atualizarPagina();

        
    }
}
