public class Wezel<T>{

    public T dane;
    public Wezel<T> naspepny;
    public Wezel<T> poprzedni;

    public Wezel(T dane) {
        this.dane = dane;
        this.naspepny = null;
        this.poprzedni = null;
    }
}
