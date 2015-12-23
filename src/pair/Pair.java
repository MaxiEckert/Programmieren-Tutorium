package pair;

public class Pair<T extends Comparable<T>, S extends Comparable<S>> implements Comparable<Pair<T, S>> {
    
    private T first;
    private S second;
    
    
    
    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }
    
    /**
     * Returns the second element.
     * 
     * @return the second element.
     */
    public S getSecond() {
        return second;
    }
    
    public void setFirst(T first) {
        this.first = first;
    }
    public void setSecond(S second) {
        this.second = second;
    }



    @Override
    public int compareTo(Pair<T, S> pair) {
        if (this.first.compareTo(pair.getFirst()) == 0) {
            return this.second.compareTo(pair.getSecond());
        } else {
            return this.first.compareTo(pair.getFirst());
        }
    }
    
    
}
