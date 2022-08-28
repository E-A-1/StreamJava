import java.util.stream.Stream;

public class StreamSources {
    



public static Stream<String> stringNumbersStream(){
    return Stream.of("one","two","three","four","five");
}
public static Stream<Integer> intNumberStreams(){
    return Stream.of(1,2,5,4,8,2);
}
public static Stream<User> userStream(){
    return Stream.of(new User("Ea",5),new User("Ea", 23));
}
}
