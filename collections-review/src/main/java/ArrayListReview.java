import java.util.*;

public class ArrayListReview {

    /**
     * Create ArrayList and a class
     * Add Elements to ArrayList
     * <p>
     * Iteration on ArrayLists
     * 1. For loop with get(index)
     * 2. Iterator
     * - Forward Iteration
     * - Backwards Iteration
     * 3. For each Loop
     * 4. Lambda
     * <p>
     * Sorting Elements in List
     */
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Jose"));
        studentList.add(new Student(2, "Sayed"));
        studentList.add(new Student(3, "Nick"));
        studentList.add(new Student(4, "Ronnie"));
        System.out.println(studentList.toString());

        // 1. For loop with get(index)
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }

        //2. Iterator
        //Forward Iterator
        System.out.println("Printing with Iterator ........");
        Iterator iter = studentList.listIterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        //Backward Iterator
        System.out.println("Printing with Iterator Backwards........");
        while (((ListIterator<?>) iter).hasPrevious()) {
            System.out.println(((ListIterator<?>) iter).previous());
        }

        //3. for each loop
        System.out.println("Printing for each loop.............");
        for (Student student : studentList) System.out.println(student);

        System.out.println("Printing with Lambda.........");
        //4. Lambda
        studentList.forEach(student -> System.out.println(student));

        //Sorting Elements in List
        System.out.println("Printing with sorted List by comp............");
        Collections.sort(studentList, new sortByIdDesc());
        System.out.println(studentList);

        //Sort Elements by Name Desc
        Collections.sort(studentList, new sortByNameDesc());
        System.out.println(studentList);
    }

    static class sortByIdDesc implements Comparator<Student> {

        public int compare(Student o1, Student o2) {
            return o2.id - o1.id;
        }
    }

    static class sortByNameDesc implements Comparator<Student> {

        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }
}
