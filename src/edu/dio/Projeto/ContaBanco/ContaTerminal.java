package edu.dio.Projeto.ContaBanco;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Por favor, digite o número da Conta !");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da Agência !");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite o seu nome !");
        String nomeCliente = scanner.next();
        
        System.out.println("Por favor, digite o saldo !");
        float saldo = scanner.nextFloat();

        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ numeroAgencia+", conta "+ numeroConta + " e seu saldo "+ saldo + " já está disponível para saque");


    }
}        