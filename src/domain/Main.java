
import com.siiit.domain.Somer;
import com.siiit.domain.Student;
import domain.Angajat;
import domain.Persoane;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //getPersoane();
        //getPersoaneArrayList();
        //getPersoaneLinkedList();
        //getPersoaneHashSet();
        //getPersoaneHashMap();
        getPersoaneComparable();
    }


    private static void getPersoane() {

        Persoane[] persons = new Persoane[3];
        persons[0] = new Somer ("Vasile", "32167537621", 29,"Vas");
        persons[1] = new Angajat ("Ionel", "1241243543", 32,"Ion");
        persons[2] = new Student ("Marcel", "312515251", 12,"Mar");


        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].getName());
        }
    }


    private static void getPersoaneArrayList() {

        System.out.println("~ArrayList~");

        List<Persoane> persoane = new ArrayList<>();

        persoane.add(new Somer("Ionel", "171531232", 30, "Ion"));
        persoane.add(new Angajat("Vasile", "181192382", 20, "Vas"));
        persoane.add(new Student("Marcel", "193929239", 19, "Mar"));


        for (int i = 0; i < persoane.size(); i++) {
            System.out.println(persoane.get(i).getName());
        }

        System.out.println("\n\n");
    }

    private static void getPersoaneLinkedList() {

        System.out.println("~LinkedList~");

        List<Persoane> persoane = new LinkedList<>();

        persoane.add(new Somer("Ionel", "171531232", 30, "Ion"));
        persoane.add(new Angajat("Vasile", "181192382", 20, "Vas"));
        persoane.add(new Student("Marcel", "193929239", 19, "Mar"));


        for (int i = 0; i < persoane.size(); i++) {
            System.out.print(persoane.get(i).getName());
            System.out.print(" , age: " + persoane.get(i).getAge() + "\n");
        }

        System.out.println("\n\n");
    }

    private static void getPersoaneHashSet() {
        System.out.println("~HashSet~");

        HashSet<Persoane> p12 = new HashSet<>();

        Persoane somer = new Somer("Ionel", "171531232", 30, "Ion");
        Persoane angajat = new Angajat("Vasile", "193929239", 30, "Vas");
        Persoane student = new Student("Marcel", "193929239", 30, "Mar");
        Persoane student1 = new Student("Marcel", "193929239", 30, "Mar");

        p12.add(somer);
        p12.add(angajat);
        p12.add(student);

        if(student1.equals(student)) {
            System.out.println("Persoanele sunt egale!");
        }


        for (Persoane p1 : p12) {
            System.out.println(p1.getName() + " , age:" + p1.getAge());
        }

        System.out.println("\n\n");

    }

    private static void getPersoaneHashMap(){
        System.out.println("~HashMap~");

        Map<String, Persoane> myPeople= new HashMap<>();

        Persoane somer = new Somer("Ionel", "171531232", 30, "Ion");
        Persoane angajat = new Angajat("Vasile", "193929239", 30, "Vas");
        Persoane student = new Student("Marcel", "193929239", 30, "Mar");


        myPeople.put("Ion", somer);

        myPeople.put("Vas", angajat);
        myPeople.put("Mar", student);

        // System.out.println(myPeople.get("Vas"));


        for(String key : myPeople.keySet()){
            System.out.println(myPeople.get(key));
        }

        System.out.println("\n");

        for(Persoane persoana : myPeople.values()){
            System.out.println(persoana);
        }
        System.out.println("\n");

        for(Map.Entry<String, Persoane> entry : myPeople.entrySet()){
            System.out.println(entry);
        }
    }


    private static void getPersoaneComparable() {
        System.out.println("~Comparable~");

        Set<Persoane> mySet = new TreeSet<>();

        Persoane somer = new Somer("Ionel", "171531232", 30, "Ion");
        Persoane angajat = new Angajat("Asile", "193929239", 30, "Vas");
        Persoane student = new Student("Marcel", "193929239", 30, "Mar");

        mySet.add(somer);
        mySet.add(angajat);
        mySet.add(student);

        for (Iterator<Persoane> iterator = mySet.iterator(); iterator.hasNext(); ) {
            Persoane p1 = iterator.next();

            System.out.println(p1.getName());


        }
    }

}
