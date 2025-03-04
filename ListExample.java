import java.awt.Frame;
import java.awt.List;
class ListExample{
    public static void main(String args[]){
        Frame f=new Frame("Programming Language List");
        f.setLayout(null);
        List l=new List();
        l.add("C");
        l.add("C++");
        l.add("Java");
        l.add("PHP");
        l.add("Python");
        l.add(".NET");
        l.setBounds(50,50,200,100);
        f.add(l);
        f.setSize(500,500);
        f.setVisible(true);
    }
}