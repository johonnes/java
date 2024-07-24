package edu.dio.java.Sintaxe.TiposVariaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
        
        double salario = 1275.33;
        System.out.println(idade);
        System.out.println(ano);
        System.out.println(cep);
        System.out.println(cpf);
        System.out.println(salario);

        //variavel constante não pode ser alterado
        final float PI = 3.14F;
        System.out.println(PI);



}
}