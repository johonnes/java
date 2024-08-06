package edu.dio.java.Colecao.list.OperacoesBasicas.ListaTarefas;

public class Usuario {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println(" O número de total de elementos na lista é: "+listaTarefas.obterNumeroTotalTarefas());

        System.out.println(" Adicionando tarefas");
        listaTarefas.adicionarTarefa("Tarefa  1");
        listaTarefas.adicionarTarefa("Tarefa  2");
        listaTarefas.adicionarTarefa("Tarefa  3");
        System.out.println(" O número de total de elementos na lista é: "+listaTarefas.obterNumeroTotalTarefas());


        System.out.println(" removendo tarefas");
        listaTarefas.removerTarefa("Tarefa  3");
        System.out.println(" O número de total de elementos na lista é: "+listaTarefas.obterNumeroTotalTarefas());


        System.out.println(" obter tarefas");
        listaTarefas.obterDescricoesTarefas();
    }

    
}
