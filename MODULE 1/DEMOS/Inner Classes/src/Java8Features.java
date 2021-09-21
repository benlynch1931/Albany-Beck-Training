import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class Java8Features {

    public static void main(String[] args) {

        List <String> names = new ArrayList<>();

        names.add("Ben");
        names.add("Will");
        names.add("Noor");
        names.add("Kishore");

        // Display names using enhanced for-loop

        for(String name : names) {
            System.out.println(name);
        }

        // Display names using Java 8

        names.forEach(name -> System.out.println(name));

        // Extract Anonymous Inner Class type from the above Lambda Expression

        // Consumer is a functional interface defined in java.util.function package
//        names.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String name) {
//                System.out.println(name);
//            }
//        });



        for(String name : names) {
            if(name.startsWith("B")) {
                System.out.println(name);
            }
        }

        // Declarative Code for above:

        names.stream()
                .filter(name -> name.startsWith("B"))
                .forEach(name -> System.out.println(name));

        // Extract Anonymous Inner Class from above

//        names.stream()
//                .filter(new Predicate<String>() {
//                    @Override
//                    public boolean test(String name) {
//                        return name.startsWith("B");
//                    }
//                })
//                .forEach(new Consumer<String>() {
//                    @Override
//                    public void accept(String name) {
//                        System.out.println(name);
//                    }
//                });

//        Stream<String> strNames = names.stream();
//        Stream<String> str2Names = strNames.filter(name -> name.startsWith("B"));
//        str2Names.forEach(name -> System.out.println(name));

    }

}
