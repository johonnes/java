package edu.dio.Projeto.DesafiomodelandocomUML.iphone;

import edu.dio.Projeto.DesafiomodelandocomUML.aplicativo.AparelhoTelefonico;
import edu.dio.Projeto.DesafiomodelandocomUML.aplicativo.NavegadorInternet;
import edu.dio.Projeto.DesafiomodelandocomUML.aplicativo.ReprodutorMusical;

/**
 * Iphone
 */
public class Iphone implements ReprodutorMusical , AparelhoTelefonico,NavegadorInternet {

    
    public void tocar() {
        System.out.println("Tocando o reprodutor musical");
    }

    
    public void pausar() {
        System.out.println("Pausando o reprodutor musical");
    }

    
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica "+musica);
    }

    
    public void ligar(String numero) {
        System.out.println("ligando para o número "+ numero);
    }

   
    public void atender() {
        System.out.println("Atendendo ligação");
    }

   
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de voz");
    }

   
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina da internet "+url);
    }

   
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba");
    }


    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }    

    
}