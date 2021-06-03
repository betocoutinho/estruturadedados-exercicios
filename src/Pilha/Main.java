package Pilha;

import Fila.Contato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pilha<Tarefa> pilhaDeTarefas = new Pilha<Tarefa>();
        Scanner leitor = new Scanner(System.in);

        boolean status = true;
        do {
            System.out.println("Sistema de Tarefas");
            System.out.println();
            System.out.println("Informe o codigo: ");
            System.out.println("[1] para adicionar Tarefas");
            System.out.println("[2] para buscar tarefas");
            System.out.println("[0] para Sair");
            int entrada = leitor.nextInt();

            switch (entrada){
                case 1:
                    System.out.println("Informe a tarefa para adicionar a pilha");
                    String tarefa = leitor.next();



                    pilhaDeTarefas.push(new Tarefa(tarefa));
                    break;
                case 2:
                    System.out.println("------------------------------------------------");
                    System.out.println("Tarefa da pilha: ");
                    if (pilhaDeTarefas.isEmpty()){
                        System.out.println("A pilha está vazia");
                    }else {
                        System.out.println(pilhaDeTarefas.getTopo().getElemento().toString());
                        pilhaDeTarefas.pop();
                    }


                    System.out.println("------------------------------------------------");
                    break;
                default:
                    status = false;
            }


        }while (status);
    }
}
