import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
CustomList<String> newList=new CustomList<>();
newList.addLast("Hello");
newList.addLast("World");
        Iterator<String> iter=newList.iterator();
        String tekst= iter.next();
        System.out.println(tekst);
        while(iter.hasNext())
        {
            tekst=iter.next();
            System.out.println(tekst);
        }
    }
}