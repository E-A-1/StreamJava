import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        List<String> list=new ArrayList<>();
        list.add("test");
        list.forEach(li->{
            System.out.println(li);
        });
        
    }
}
