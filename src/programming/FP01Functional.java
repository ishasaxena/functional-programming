package programming;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        /*printAllNumbersInListFunctional(numbers);

        printEvenNumbersInListFunctional(numbers);

        printOddNumbersInListFunctional(numbers);*/

/*        numbers.stream()
                .forEach(n -> System.out.println(n * n));*/
        /*numbers.stream()
                .filter(n -> n % 2 == 1)
                .forEach(n -> System.out.println(n * n * n));*/

        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure",
                "Docker", "Kubernetes");

        courses
                .forEach(course -> System.out.println(course + " " + course.length()));

        /*printAllCourses(courses);

        printCoursesContainingString(courses);

        printCoursesWhoseLengthIsAtleast4(courses);*/
    }

    private static void printCoursesWhoseLengthIsAtleast4(List<String> courses) {
        courses.stream()
                .filter(str -> str.length() >= 4)
                .forEach(System.out :: println);
    }

    private static void printCoursesContainingString(List<String> courses) {
        courses.stream()
                .filter(str -> str.contains("Spring"))
                .forEach(System.out :: println);
    }

    private static void printAllNumbersInListFunctional(List<Integer> integers) {
        //[12, 9, 13, 4, 6, 2, 4, 12, 15]
        //we want to convert this list into stream of elements
        //What to do?
        integers.forEach(FP01Functional :: print);
        integers.forEach(System.out::println);
        // :: syntax for method reference
    }

    private static void print(int n) {
        System.out.println(n);
    }

    private static void printEvenNumbersInListFunctional(List<Integer> integers) {
        integers.stream()
                .filter(n -> n % 2 == 0) //lambda expression
                .forEach(System.out :: println);
    }

    private static void printOddNumbersInListFunctional(List<Integer> integers) {
        integers.stream()
                .filter(n -> n % 2 != 0) //lambda expression
                .forEach(System.out :: println);
    }

    private static void printAllCourses(List<String> courses) {
        courses.forEach(System.out :: println);
    }


}
