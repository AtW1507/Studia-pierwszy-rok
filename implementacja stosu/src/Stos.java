import java.util.ArrayDeque;


public class Stos {

    private ArrayDeque<Integer> lista = new ArrayDeque<>();

    //Metoda dodwania elementu na stos
    public void push(Integer element){
        lista.addFirst(element);
    }
    //Metoda usuwania elemntu ze stosu
    public Integer pop(){
        if (czyPusty()) {
            throw new IllegalStateException("Stos jest pusty.");
        }
        return lista.removeFirst();
    }

    
    public boolean czyPusty() {
        return lista.isEmpty();
    }

    //Metoda sprawdzania rozmiaru stosu.
    public int rozmiar(){
        return lista.size();
    }

    //Metoda wyświetlania elementu stosu bez jego usuwania.
    public int peek(){
        if (czyPusty()){
            throw new IllegalStateException("Stos jest pusty.");
        }
        return lista.getFirst();
    }


}
