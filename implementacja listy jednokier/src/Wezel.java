public class Wezel<T> {
    public T dane;
    public Wezel<T> nastepny;


    public Wezel(T dane){
        this.dane = dane;
        this.nastepny=null;
    }
}
