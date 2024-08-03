package edu.dio.java.POO.PilaresPOO.exemploveiculo;

public abstract class veiculo {
    private String chassi;

    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public abstract void ligar();
}
