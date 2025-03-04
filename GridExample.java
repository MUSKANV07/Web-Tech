import java.awt.Button;
import java.awt.Frame;
class GridLayout{
    public static void main(String args[]){
        Frame f=new Frame("GridLayoutExample");
        Button b1=new Button("1");
        Button b2=new Button("2");
        Button b3=new Button("3");
        Button b4=new Button("4");
        GridLayout g=new GridLayout(2,2);
        f.setLayout(g);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.setSize(500,500);
        f.setVisible(true);
    }
}