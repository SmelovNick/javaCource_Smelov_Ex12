import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Person human = new Person("Алексеев Михаил Петрович", 18, 2004);
        Predicate<Person> isYoungEnough = person -> person.getAge() > 17 && person.getAge() < 40;
        Function<Person,Student> convertToStudent = person ->{

            if (isYoungEnough.test(human)){
                if(person.getBirthYear() < 1995) return new Student(person.getFullName(), person.getAge(), "01");
                else return new Student(person.getFullName(), person.getAge(), "02");
            }
            else return null;
        };
        Student newStudent = convertToStudent.apply(human);
        Consumer<Student> printer = System.out::println;
        printer.accept(newStudent);
    }

}
