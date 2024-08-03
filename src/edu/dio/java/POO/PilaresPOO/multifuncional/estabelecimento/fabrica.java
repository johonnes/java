package edu.dio.java.POO.PilaresPOO.multifuncional.estabelecimento;

import edu.dio.java.POO.PilaresPOO.multifuncional.equipamentos.copiadora.Copiadora;
import edu.dio.java.POO.PilaresPOO.multifuncional.equipamentos.digitalizadora.Digitalizadora;
import edu.dio.java.POO.PilaresPOO.multifuncional.equipamentos.impressora.Deskjet;
import edu.dio.java.POO.PilaresPOO.multifuncional.equipamentos.impressora.Impressora;
import edu.dio.java.POO.PilaresPOO.multifuncional.equipamentos.multifuncional.EquipamentoMultifuncional;

public class fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
    
}
