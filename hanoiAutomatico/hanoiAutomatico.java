
import java.util.Stack;

class hanoiAutomatico {
    public static void main(String[] args) {
        Stack<Integer> original = new Stack<>();
        Stack<Integer> dest = new Stack<>();
        Stack<Integer> aux = new Stack<>();

        original.push(4);
        original.push(3);
        original.push(2);
        original.push(1);

        torreDeHanoi(original.size(), original, dest, aux);
    }

    public static void torreDeHanoi(int n, Stack<Integer> original, Stack<Integer> dest, Stack<Integer> aux) {
        if (n > 0) {
            torreDeHanoi(n - 1, original, aux, dest);
            dest.push(original.pop()); // movendo o primeiro elemento da torre original para a dest
            System.out.println("--------");
            System.out.println("Original: " + original);
            System.out.println("Destino: " + dest);
            System.out.println("Aux: " + aux);
            torreDeHanoi(n - 1, aux, dest, original);
        }
    }
}
