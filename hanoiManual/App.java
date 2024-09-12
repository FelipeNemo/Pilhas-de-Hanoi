package hanoiManual;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        TorreManual torre1 = new TorreManual();
        TorreManual torre2 = new TorreManual();
        TorreManual torre3 = new TorreManual();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha a torre1, torre2 ou torre3 ou digite 4 para sair:");
            int escolhaPilha = scanner.nextInt();

            TorreManual pilhaAtual = null;

            switch (escolhaPilha) {
                case 1:
                    pilhaAtual = torre1;
                    break;
                case 2:
                    pilhaAtual = torre2;
                    break;
                case 3:
                    pilhaAtual = torre3;
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilha inválida. Tente novamente.");
                    continue;
            }

            System.out.println("\nEscolha uma operação para a Pilha " + escolhaPilha + ":");
            System.out.println("1 - Empilhar (push)");
            System.out.println("2 - Desempilhar (pop)");
            System.out.println("3 - Mostrar topo (top)");
            System.out.println("4 - Mostrar tamanho da pilha (size)");
            System.out.println("5 - Limpar a pilha (clear)");
            System.out.println("6 - Mostrar toda a pilha (print)");

            int escolhaOperacao = scanner.nextInt();

            switch (escolhaOperacao) {
                case 1:
                    System.out.print("Digite o valor para empilhar: ");
                    int valor = scanner.nextInt();
                    pilhaAtual.push(valor);
                    System.out.println("Empilhado: " + valor + " na Pilha " + escolhaPilha);
                    break;

                case 2:
                    if (!pilhaAtual.isEmpty()) {
                        int removido = pilhaAtual.pop();
                        System.out.println("Desempilhado: " + removido + " da Pilha " + escolhaPilha);
                    } else {
                        System.out.println("A Pilha " + escolhaPilha + " está vazia, não há nada para desempilhar.");
                    }
                    break;

                case 3:
                    if (!pilhaAtual.isEmpty()) {
                        System.out.println("Topo da Pilha " + escolhaPilha + ": " + pilhaAtual.top());
                    } else {
                        System.out.println("A Pilha " + escolhaPilha + " está vazia.");
                    }
                    break;

                case 4:
                    System.out.println("Tamanho da Pilha " + escolhaPilha + ": " + pilhaAtual.size());
                    break;

                case 5:
                    pilhaAtual.clear();
                    System.out.println("A Pilha " + escolhaPilha + " foi esvaziada.");
                    break;

                case 6:
                    pilhaAtual.printPilha();  // Exibe todos os elementos da pilha
                    break;

                default:
                    System.out.println("Operação inválida. Tente novamente.");
                    break;
            }
        }
    }
}
