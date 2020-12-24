import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<Integer> list1= IntStream.rangeClosed(1,10).boxed().collect(Collectors.toList());
        List<Integer> listsub=list1.subList(1,4);
        System.out.println(list1);
        System.out.println(listsub);
        listsub.remove(1);
        System.out.println(list1);
        list1.add(0);
        try { listsub.forEach(System.out::println);
        } catch (Exception ex)
        { ex.printStackTrace();}
    }
}
