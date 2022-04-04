
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {

        System.out.println("..........Creating ArrayList with default Constructor..........");

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Java");
        arrayList.add("C");
        arrayList.add("C++");
        arrayList.add(3, "Python");
        System.out.println("ArrayList() : " + arrayList);

        System.out.println("..........Creating ArrayList by passing Collection in Constructor..........");
        List<String> arrayListCollection = new ArrayList<String>(arrayList);
        System.out.println("ArrayList(Collection<? extends E> c) : " + arrayListCollection);

        System.out.println("..........Creating ArrayList by passing Capacity in Constructor..........");
        List<String> arrayListCapacity = new ArrayList<String>(arrayList);
        System.out.println("ArrayList(int initialCapacity) : " + arrayListCapacity);

        System.out.println("......... Using remove()..........");
        arrayList.remove(3);
        System.out.println(arrayList);

        System.out.println("..........Using clear().........");
        arrayListCapacity.clear();
        System.out.println(arrayListCapacity);

        System.out.println("..........Using contains().........");
        System.out.println("arrayList.contains(\"C++\") : " + arrayList.contains("C++") );

        System.out.println("..........Using get().........");
        System.out.println("arrayList.get(1) : " + arrayList.get(1));

        System.out.println("..........Using getIndex().........");
        System.out.println("arrayList.getIndex(\"Java\") : " + arrayList.indexOf("Java"));

        System.out.println("..........Using isEmpty().........");
        System.out.println("arrayList.getIndex(\"Java\") : " + arrayList.isEmpty());

        System.out.println("..........Using ensureCapacity()..........");
        arrayList.ensureCapacity(15);
        System.out.println("arrayList.ensureCapacity(15)");

        System.out.println("..........Using trimToSize()..........");
        arrayList.trimToSize();
        System.out.println("arrayList.trimToSize()");

        System.out.println("..........Using toArray()..........");
        Object[] programmingLanguageArray = arrayList.toArray();
        for ( Object i : programmingLanguageArray){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println(".........Printing ArrayList using Iterator()........");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}