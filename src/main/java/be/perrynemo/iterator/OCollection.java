package be.perrynemo.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class OCollection implements Iterable<String>{

    public String s1 = "salut";
    public String s2 = "bonjour";
    public String s3 = "Hello";

    @Override
    public Iterator<String> iterator() {
        return new be.perrynemo.iterator.Iterator(s1, s2 , s3);
    }
}
