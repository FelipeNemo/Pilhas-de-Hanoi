

import Main.manualHanoi;

/**
 * App
 */
public class Main {

    public static void main(String[] args) {
        manualHanoi mp = new manualHanoi();
        for(int i=0; i<10; i++){
            mp.push(i);
            System.out.println("Inserindo o valor "+i+" na pilha");
        }

     System.out.println("\n-=-=-=-==-=-=-=-\n");
     while (!mp.isEmpty()) {
       System.out.println("Removendo o valor "+ mp.pop()+" da pilha");
    }

        System.out.println("\n-=-=-=-==-=-=-=-\n"); 
         mp.top(); {
            System.out.println(" O valor do topo da pilha é: "+ mp.top());
        } 
    }
}