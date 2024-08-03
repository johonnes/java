package edu.dio.java.POO.PilaresPOO.multifuncional.equipamentos.multifuncional;

import edu.dio.java.POO.PilaresPOO.multifuncional.equipamentos.copiadora.Copiadora;
import edu.dio.java.POO.PilaresPOO.multifuncional.equipamentos.digitalizadora.Digitalizadora;
import edu.dio.java.POO.PilaresPOO.multifuncional.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora,Digitalizadora,Impressora {

    public void copiar() {
        System.out.println("Copiando via equipamento Multifuncional");
        
    }

    public void digitalizar() {
        System.out.println("Digitalizando via equipamento Multifuncional");

    }

    public void imprimir() {
        System.out.println("Imprimindo via equipamento Multifuncional");

    }
    
}
