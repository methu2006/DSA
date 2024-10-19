import java.util.Collection;
import java.util.LinkedList;

public class CollectionPractical1 {

    public static void main(String[] args) {
        Collection<Integer> c = new LinkedList<>();

        c.add(05);
        c.add(10);
        c.add(25);
        c.add(80);
        c.add(100);

        System.out.println("Is it empty? " + c.isEmpty());

        System.out.println("Size is " + c.size());

        System.out.println("Does the collection contain 100 ? " + c.contains(100));

        c.remove(25);

        System.out.println("Elements after removal: " + c);
    }
}
