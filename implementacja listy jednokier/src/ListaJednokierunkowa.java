public class ListaJednokierunkowa<T> {
    private Wezel<T> glowa;


    public ListaJednokierunkowa(){
        this.glowa=null;

    }

    public void dodajNaKoniec(T dane){
        Wezel<T> nowyWezel = new Wezel<>(dane);

        if(glowa == null){
            glowa = nowyWezel;
        }
        else {
            Wezel<T> ostani = znajdzOstatni();
            ostani.nastepny = nowyWezel;
        }
    }

    public void wyswietl() {
        Wezel<T> obecny = glowa;
        while (obecny != null) {
            System.out.println(obecny.dane + " ");
            obecny = obecny.nastepny;
        }

    }

    private Wezel<T> znajdzOstatni() {
        Wezel<T> obecny = glowa;
        while (obecny.nastepny != null) {
            obecny= obecny.nastepny;
        }
        return obecny;
    }
}
