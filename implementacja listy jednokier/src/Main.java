public class Main {
    public static void main(String[] args) {

        ListaJednokierunkowa<Integer> lista = new ListaJednokierunkowa<>();

        lista.dodajNaKoniec(2);
        lista.dodajNaKoniec(3);
        lista.dodajNaKoniec(4);

        lista.wyswietl();
    }
}