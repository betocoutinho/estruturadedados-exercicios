package Fila;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fila<Contato> filaDeContatos = new Fila<Contato>();
        Scanner leitor = new Scanner(System.in);

        boolean status = true;
        do {
            System.out.println("Sistema de Gestão de Contatos");
            System.out.println();
            System.out.println("Informe o codigo: ");
            System.out.println("[1] para adicionar contatos");
            System.out.println("[2] para buscar contato");
            System.out.println("[0] para Sair");


            int entrada = leitor.nextInt();

            switch (entrada){
                case 1:
                    System.out.println("Informe o nome do contato: ");
                    String nome = leitor.next();


                    System.out.println("Informe o numero do Contato");
                    String telefone = leitor.next();

                    filaDeContatos.inserirElemento(new Contato(nome, telefone));
                    break;
                case 2:
                    System.out.println("------------------------------------------------");
                    System.out.println("Primeiro Elemento da FIla: ");
                    if (filaDeContatos.estaVazia()){
                        System.out.println("A fila esta Vazia!!!!");
                    }else {
                        System.out.println(filaDeContatos.getInicio().getElemento().toString());
                        filaDeContatos.removerElemento();
                    }

                    System.out.println("------------------------------------------------");
                    break;
                default:
                    status = false;
            }


        }while (status);




    }
}
