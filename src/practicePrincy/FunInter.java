package practicePrincy;

@FunctionalInterface
public interface FunInter {
    void getMethod();
}

class UserInterface implements FunInter {

    @Override
    public void getMethod() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMethod'");
    }

}

class UserMain {
    public static void main(String[] args) {
        System.out.println("array length is " + args.length);
        for (String arg : args) {
            System.out.println("the args are " + arg);

        }
        FunInter funInter = () -> System.out.println("called functional interface");
        funInter.getMethod();
    }
}