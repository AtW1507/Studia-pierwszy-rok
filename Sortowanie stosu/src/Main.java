import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stos = new Stack<>();
        stos.push(10);
        stos.push(1);
        stos.push(12);
        stos.push(20);
        stos.push(100);
        stos.push(9);
        stos.push(3);
        stos.push(7);

        System.out.println("Stos przed sortowaniem: " + stos);

        SortowanieStosu.sortujStos(stos);

        System.out.println("Stos po sortowaniu: " + stos);

    }
}