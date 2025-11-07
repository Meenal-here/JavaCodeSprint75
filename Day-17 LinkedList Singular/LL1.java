//using collection framework
import java.util.LinkedList;
public class LL1{
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.addFirst("Hello");
        list.addFirst("World");
        list.addLast("Java");
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        System.out.println("Size of the list: " + list.size());
    }
}