package edu.dio.java.Anatomiaclasse;
public class MinhaClasse {
public static void main(String[] args) {
    String primeiroNome = "Wallison Johonnes";
    String segundoNome ="dos Santos Pereira";
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println (nomeCompleto);
}

public static String nomeCompleto ( String primeiroNome, String segundoNome){
    return primeiroNome.concat(" ").concat(segundoNome);
}

}
