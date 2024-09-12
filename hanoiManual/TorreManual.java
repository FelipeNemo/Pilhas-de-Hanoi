package hanoiManual;

public class TorreManual {
    private int[] pilha;
    private int nElementos;

    public TorreManual() {
        pilha = new int[100];
        nElementos = 0;
    }

    public boolean push(int elemento) {
        if (nElementos == pilha.length)
            return false;
        pilha[nElementos] = elemento;
        nElementos++;
        return true;
    }

    public int pop() {
        if (nElementos == 0)
            throw new RuntimeException("A pilha está vazia");
        nElementos--;
        return pilha[nElementos];
    }

    public int top() {
        if (nElementos > 0)
            return pilha[nElementos - 1];
        throw new RuntimeException("Não existem elementos na pilha");
    }

    public int size() {
        return nElementos;
    }

    public boolean isEmpty() {
        return (nElementos == 0);
    }

    public void clear() {
        nElementos = 0;
    }

    public void printPilha() {
        if (nElementos == 0) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.print("Elementos na pilha: ");
            for (int i = 0; i < nElementos; i++) {
                System.out.print(pilha[i] + " ");
            }
            
        }
    }
}
