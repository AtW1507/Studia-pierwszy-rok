import java.util.Stack;

public class SortowanieStosu {
    //Metoda sortująca stos od najmniejszego od największego
    public static void sortujStos(Stack<Integer> stos) {
        Stack<Integer> stosPomocniczy = new Stack<>();

        while (!stos.isEmpty()){
            int temp = stos.pop();

            while (!stosPomocniczy.isEmpty() && temp > stosPomocniczy.peek()) {
                stos.push(stosPomocniczy.pop());
            }

            stosPomocniczy.push(temp);
        }

        //Przenosimy posortowany element z stosu pomocniczego do stosu orginalnego.
        while (!stosPomocniczy.isEmpty()){
            stos.push(stosPomocniczy.pop());
        }
    }

}
