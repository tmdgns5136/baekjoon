import java.util.*;
public class BJ10814 {
        static class Person{
        int age;
        String name;
        Person(int age, String name){
            this.age = age;
            this.name = name;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Person> arr = new ArrayList<>();
        for(int i = 0; i<N; i++){
            int age = sc.nextInt();
            String name = sc.next();
            arr.add(new Person(age, name));
        }

       arr.sort(Comparator.comparing(p -> p.age));

       for(Person p : arr){
        System.out.println(p.age + " " + p.name);
       }

        sc.close();
    }
}
