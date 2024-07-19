package edu.dio.java.Operadores;

public class Ternario {
    public static void main(String[] args) {
        // classe Operadores.java
int a, b;

a = 6;
b = 6;

//EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
String resultado1 = "";
if(++a==b)
   resultado1 = "verdadeiro";
else
   resultado1 = "falso";

   System.out.println(resultado1);

//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
int resultado = (--a==b) ? 1 : 0 ;

System.out.println(resultado);
    }
}
