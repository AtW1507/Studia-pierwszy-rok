public class ListaDwukierunkowa<T>{
    private Wezel<T> glowa;
    private Wezel<T> ogon;

    public ListaDwukierunkowa() {
        this.glowa = null;
        this.ogon=null;
    }
    //metoda dodawania nowego węzła na koniec listy

    public void dodajNaKoniec(T dane) {
        Wezel<T> nowyWezel = new Wezel<>(dane);

        if(glowa == null) {
            glowa = nowyWezel;
            ogon = nowyWezel;
        } else {
            nowyWezel.poprzedni = ogon;
            ogon.naspepny = nowyWezel;
            ogon = nowyWezel;

        }
    }
    //Metoda do wyświetlania zawartości listy w przód
    public void wyswietlPrzod() {
        Wezel<T> obecny = glowa;
        while (obecny != null){
            System.out.println(obecny.dane + " ");
            obecny = obecny.naspepny;
        }
    }

    //Metoda do wyświelnenia zawartości listy z tyłu
    public void wyswietlTyl(){
        Wezel<T> obecny = ogon;
        while (obecny != null) {
            System.out.println(obecny.dane + " ");
            obecny = obecny.poprzedni;
        }
    }
}
