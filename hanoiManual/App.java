package hanoiManual;

public class App {
    public static void main(String[] args) {
        TorreManual mp = new TorreManual();

        

        





        for (int i = 0; i < 10; i++) {
            mp.push(i);
            System.out.println("Inserindo o valor " + i + " na pilha");
        }

        System.out.println("\n-=-=-=-==-=-=-=-\n");

        while (!mp.isEmpty()) {
            System.out.println("Removendo o valor " + mp.pop() + " da pilha");
        }
    }
}
