import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExcercise {
  public static void main(String[] args) {
    System.out.println("Welcome to streams practice coding ::: STREAMS (Functional Programming)");


//Print all the numbers in the int Number stream
StreamSources.intNumberStreams().forEach(e->System.out.println(e));

StreamSources.intNumberStreams().forEach(System.out::println);

//Print numbers that greater than 5

StreamSources.intNumberStreams().filter(number->number<5).forEach(e->System.out.println(e));

//Print the second and third number that greater than 5

StreamSources.intNumberStreams().filter(number->number>5).skip(1).limit(2).forEach(number->System.out.println(number));


//Print the first number that greater that 5 if nothing is found print -1;
Integer integerValue=StreamSources.intNumberStreams().filter(number->number>5).findFirst().orElse(-1);
System.out.println("the first number found is :::: "+integerValue);

//Print the first name of all the users in the user stream.
StreamSources.userStream().forEach(user->System.out.println(user.getName()));
StreamSources.userStream().map(user->user.getName()).forEach(userName->System.out.println(userName));

//Print the first names in userStream for users that have the ids from the number stream
// flat map is one which weuse to map to streams .
StreamSources.intNumberStreams().flatMap(id->StreamSources.userStream().filter(user->user.getAge()==id)).map(user->user.getName()).forEach(e->System.out.println(e));
//alternative approach

StreamSources.userStream().filter(u->StreamSources.intNumberStreams().anyMatch(i->i==u.getAge())).forEach(System.out::println);
}  
}
