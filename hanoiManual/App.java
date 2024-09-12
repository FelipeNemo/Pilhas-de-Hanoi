package hanoiManual;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        TorreManual origem = new TorreManual();
        TorreManual destino = new TorreManual();
        TorreManual auxiliar = new TorreManual();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha a pilha para operar (1 para Origem, 2 para Destino, 3 para Auxiliar) ou digite 4 para sair:");
            int escolhaPilha = scanner.nextInt();

            TorreManual pilhaAtual = null;

            switch (escolhaPilha) {
                case 1:
                    pilhaAtual = origem;
                    break;
                case 2:
                    pilhaAtual = destino;
                    break;
                case 3:
                    pilhaAtual = auxiliar;
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilha inválida. Tente novamente.");
                    continue;
            }

            System.out.println("\nEscolha uma operação para a pilha selecionada:");
            System.out.println("1 - Empilhar (push)");
            System.out.println("2 - Desempilhar (pop)");
            System.out.println("3 - Mostrar topo (top)");
            System.out.println("4 - Mostrar tamanho da pilha (size)");
            System.out.println("5 - Limpar a pilha (clear)");
            System.out.println("6 - Mostrar toda a pilha (print)");
            System.out.println("7 - Transferir elemento para outra pilha");

            int escolhaOperacao = scanner.nextInt();

            switch (escolhaOperacao) {
                case 1:
                    System.out.print("Digite o valor para empilhar: ");
                    int valor = scanner.nextInt();
                    pilhaAtual.push(valor);
                    System.out.println("Empilhado: " + valor + " na pilha selecionada");
                    break;

                case 2:
                    if (!pilhaAtual.isEmpty()) {
                        int removido = pilhaAtual.pop();
                        System.out.println("Desempilhado: " + removido + " da pilha selecionada");
                    } else {
                        System.out.println("A pilha selecionada está vazia, não há nada para desempilhar.");
                    }
                    break;

                case 3:
                    if (!pilhaAtual.isEmpty()) {
                        System.out.println("Topo da pilha selecionada: " + pilhaAtual.top());
                    } else {
                        System.out.println("A pilha selecionada está vazia.");
                    }
                    break;

                case 4:
                    System.out.println("Tamanho da pilha selecionada: " + pilhaAtual.size());
                    break;

                case 5:
                    pilhaAtual.clear();
                    System.out.println("A pilha selecionada foi esvaziada.");
                    break;

                case 6:
                    pilhaAtual.printPilha();  // Exibe todos os elementos da pilha
                    break;

                case 7:
                    // Transferir elemento de uma pilha para outra
                    System.out.print("Digite o número da pilha de origem (1 para Origem, 2 para Destino, 3 para Auxiliar): ");
                    int origemNum = scanner.nextInt();
                    TorreManual pilhaOrigem = getPilha(origemNum, origem, destino, auxiliar);

                    if (pilhaOrigem != null && !pilhaOrigem.isEmpty()) {
                        int elemento = pilhaOrigem.pop();  // Remove o elemento da pilha de origem

                        System.out.print("Digite o número da pilha de destino (1 para Origem, 2 para Destino, 3 para Auxiliar): ");
                        int destinoNum = scanner.nextInt();
                        TorreManual pilhaDestino = getPilha(destinoNum, origem, destino, auxiliar);

                        if (pilhaDestino != null) {
                            pilhaDestino.push(elemento);  // Adiciona o elemento à pilha de destino
                            System.out.println("Elemento " + elemento + " transferido da Pilha " + origemNum + " para a Pilha " + destinoNum);
                        } else {
                            System.out.println("Pilha de destino inválida.");
                        }
                    } else {
                        System.out.println("A Pilha de origem está vazia ou é inválida.");
                    }
                    break;

                default:
                    System.out.println("Operação inválida. Tente novamente.");
                    break;
            }
        }
    }

    private static TorreManual getPilha(int numero, TorreManual origem, TorreManual destino, TorreManual auxiliar) {
        switch (numero) {
            case 1:
                return origem;
            case 2:
                return destino;
            case 3:
                return auxiliar;
            default:
                return null;
        }
    }
}
