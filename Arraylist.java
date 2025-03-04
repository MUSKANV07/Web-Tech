import java.util.ArrayList;
import java.util.Iterator;

class ArrayListExample
{
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("Kiwi");
        list.add("Ram");
        list.add("Bam");
        list.add("Orange");
        list.add("Yeontan");
        Iterator it=list.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}