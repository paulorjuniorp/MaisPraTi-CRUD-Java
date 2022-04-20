package com.paulorjuniorp;

import com.paulorjuniorp.model.Crud;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        String design = "#######################################\n";
        String cabecalho = design + "\t\tSistema de cadastro\n" + design;
        String continuar = "nao";

        String menu = cabecalho +
                    "1 - Cadastro\n" +
                    "2 - Listagem\n" +
                    "3 - Atualização\n" +
                    "4 - Exclusão\n" +
                    "5 - Sair\n" +
                    "\nEscolha sua opcao: ";

        Crud crud = new Crud();

        Scanner entrada = new Scanner(System.in);

         do {
            System.out.println(menu);
            int opcao = entrada.nextInt();

            switch (opcao) {

                case 1:
                    crud.create();
                    break;
                case 2:
                    crud.read();
                    break;
                case 3:
                    crud.update();
                    break;
                case 4:
                    crud.delete();
                    break;
                case 5:
                    continuar = "nao";
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

            if (opcao == 5){
                break;
            }

            System.out.println("Deseja continuar? sim|nao");
            continuar = entrada.next();
            entrada.nextLine();

        }while (continuar.equalsIgnoreCase("sim"));
    }
}
