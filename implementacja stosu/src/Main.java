public class Main {
    public static void main(String[] args) {

        Stos stos = new Stos();

        stos.push(10);
        stos.push(1);
        stos.push(13);
        stos.push(100);

        System.out.println("Rozmiar stosu to: " + stos.rozmiar());
        System.out.println("Pierwszy element stosu: " + stos.peek());
        System.out.println("Usuwam element stosu.");
        stos.pop();
        System.out.println("Rozmiar stosu po usunięciu elementu: " + stos.rozmiar());
        System.out.println("Pierwszy element stosu: " + stos.peek());
        stos.sort();
        System.out.println(stos.peek());

    }
}