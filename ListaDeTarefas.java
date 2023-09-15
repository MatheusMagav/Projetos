/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication19;

import java.util.ArrayList;
import java.util.Scanner;
public class
    
public class ListaDeTarefas {
    private final ArrayList<String> tarefas;

    public ListaDeTarefas() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String tarefa) {
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    public void exibirTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("A lista de tarefas está vazia.");
        } else {
            System.out.println("Lista de Tarefas:");
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + ". " + tarefas.get(i));
            }
        }
    }

    public void marcarTarefaConcluida(int indice) {
        if (indice >= 1 && indice <= tarefas.size()) {
            String tarefaConcluida = tarefas.get(indice - 1);
            tarefas.remove(indice - 1);
            System.out.println("Tarefa \"" + tarefaConcluida + "\" marcada como concluída.");
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void excluirTarefa(int indice) {
        if (indice >= 1 && indice <= tarefas.size()) {
            String tarefaRemovida = tarefas.get(indice - 1);
            tarefas.remove(indice - 1);
            System.out.println("Tarefa \"" + tarefaRemovida + "\" removida com sucesso.");
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public static void main(String[] args) {
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Exibir Tarefas");
            System.out.println("3. Marcar Tarefa como Concluída");
            System.out.println("4. Excluir Tarefa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite a tarefa: ");
                    String tarefa = scanner.nextLine();
                    listaDeTarefas.adicionarTarefa(tarefa);
                    break;
                case 2:
                    listaDeTarefas.exibirTarefas();
                    break;
                case 3:
                    System.out.print("Digite o índice da tarefa a ser marcada como concluída: ");
                    int indiceConcluida = scanner.nextInt();
                    listaDeTarefas.marcarTarefaConcluida(indiceConcluida);
                    break;
                case 4:
                    System.out.print("Digite o índice da tarefa a ser excluída: ");
                    int indiceExclusao = scanner.nextInt();
                    listaDeTarefas.excluirTarefa(indiceExclusao);
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
