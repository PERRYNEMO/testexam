package be.perrynemo.iterator;

public class Iterator implements java.util.Iterator<String> {
    public String[] array;
    private int index;


    public Iterator(String... s){
        this.array= s;
        this.index = array.length-1;
    }
    @Override
    public boolean hasNext() {
        return index>=0;
    }

    @Override
    public String next() {
        return array[index--];
    }
}
