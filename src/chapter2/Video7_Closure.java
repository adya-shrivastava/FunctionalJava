package chapter2;

public class Video7_Closure {
    public static void main(String[] args) {
        NoArgFunction<NoArgFunction<String>> createGreeter = () -> {
            String name = "Adya";
            return () -> "Hello " + name;
        };

        NoArgFunction<String> greeter = createGreeter.apply();
        System.out.println(greeter.apply());
//        System.out.println(name);
    }
}
