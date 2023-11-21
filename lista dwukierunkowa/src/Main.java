public class Main {
    public static void main(String[] args) {

        ListaDwukierunkowa<String> lista = new ListaDwukierunkowa<>();

        lista.dodajNaKoniec("Anna");
        lista.dodajNaKoniec("Jan");
        lista.dodajNaKoniec("Marian");

        System.out.println("Wyświetlam liste od przodu: ");
        lista.wyswietlPrzod();

        System.out.println("Wyświetlam liste od tyłu: ");
        lista.wyswietlTyl();
    }
}