import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>(); 
        list.add("min ku ");
        list.add("Vijay");  
        list.add("Ravi");  
        list.add("Ajay");  
        // traversion list through interator

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
