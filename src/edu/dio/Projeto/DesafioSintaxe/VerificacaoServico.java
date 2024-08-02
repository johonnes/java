package edu.dio.Projeto.DesafioSintaxe;

import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();
        servico= "movel";
        
        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();
        entradaCliente="Alice,movel,fixa";
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        
        
        //Verifique se o serviço está na lista de serviços contratado
        for(String servic : partes){
            if(servic.equals(servico))
            contratado = true;
            }
         
         if(contratado==true){
          System.out.println(nomeCliente+" contratou o serviço "+servico);
         }
         else{
          System.out.println(nomeCliente+" não contratou o serviço "+servico);
         }
         scanner.close();
    }
    

    
}

        
        


