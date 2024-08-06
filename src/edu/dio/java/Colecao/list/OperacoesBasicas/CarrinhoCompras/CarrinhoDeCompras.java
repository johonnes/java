package edu.dio.java.Colecao.list.OperacoesBasicas.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;


public class CarrinhoDeCompras {
    private List<Item> itemList;

   

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome,preco, quantidade));
    }

    public void reremoverItem(String nome){
        List<Item> itenspararemover = new ArrayList<>();
        for(Item i : itemList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itenspararemover.add(i);
            }
        }
        itemList.removeAll(itenspararemover);
    }

    public double calcularValorTotal(){
        double valorTotal=0d;
        for(Item i: itemList){
            double valoritem=i.getPreco()*i.getQuantidade();
            valorTotal += valoritem;   
        } 
        return valorTotal;   
    }

    public void exibirItens(){
        if(itemList.isEmpty()){
            System.out.println("Lista Vazia");  
        }
        else{
            System.out.println(this.itemList);
        }
        
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
        "itens=" + itemList +
        '}';
    }

      public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.exibirItens();

        System.out.println(" Adicionando Itens");
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);
        carrinhoDeCompras.exibirItens();

        System.out.println(" removendo Itens");
        carrinhoDeCompras.reremoverItem("Caderno");
        carrinhoDeCompras.exibirItens();

        System.out.println("Valor total dos itens");
        System.out.println("O valor total dos itens do carrinho de compras é de R$"+carrinhoDeCompras.calcularValorTotal());
        
    }

    
}

    

