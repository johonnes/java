package edu.dio.java.Sintaxe.Metodos;

public class UsuarioSmartTv {
    public static void main(String[] args) {
        
    
    SmartTv smartTv= new  SmartTv();

    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.aumentarVolume();
    System.out.println("Volume atual " + smartTv.volume);
    
    System.out.println("Canal atual " + smartTv.canal); 

    smartTv.mudarCanal(18);

    System.out.println("Canal atual " + smartTv.canal);

    System.out.println("TV ligada? " + smartTv.ligada);
    
    System.out.println("Volume atual " + smartTv.volume);

    smartTv.ligar();
        System.out.println("Novo Status:TV ligada? " + smartTv.ligada);
    
    smartTv.desligar();
        System.out.println("Novo Status:TV ligada? " + smartTv.ligada);

    smartTv.aumentarVolume();
        System.out.println("Novo Status:volume atual " + smartTv.volume);    

    smartTv.diminuirVolume();
        System.out.println("Novo Status:volume atual " + smartTv.volume);  
    }
}
