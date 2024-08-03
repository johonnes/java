package edu.dio.java.POO.PilaresPOO.exemploveiculo;

public class Carro extends veiculo {
    public void ligar(){
        conferirCambio();
        conferirCombustivel();
        System.out.println("CARRO LIGADO");

    }
    private void conferirCombustivel(){
        System.out.println("Conferindo combustível");

    }
    private void conferirCambio(){
        System.out.println("Conferindo cambio");

    }
}
