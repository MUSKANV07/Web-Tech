import java.util.ArrayList;
import java.util.Iterator;

class ArrayListExample
{
    public static void main(String args[]){
        ArrayList list = new ArrayList();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("1");
        list.add("Ram");
        list.add('D');
        list.add("1.0");
        list.add('A');
        Iterator it=list.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}