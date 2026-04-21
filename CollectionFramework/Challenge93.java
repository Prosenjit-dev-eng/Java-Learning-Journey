
import java.util.PriorityQueue;

public class Challenge93 {
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(new java.util.Comparator<Student>(){
            @Override
            public int compare(Student s, Student t){
                return s.getGrade() - t.getGrade();
            }
        });

        pq.offer(new Student("Prashant",'B'));
        pq.offer(new Student("Pra",'C'));
        pq.offer(new Student("Pr",'D'));
        pq.offer(new Student("shant",'A'));
        System.out.printf("Queue is: %s", pq);

    }
    private static class Student{
        private final String name;
        private final char grade;
        public Student(String name, char grade){
            this.name = name;
            this.grade = grade;
        }

        public String getName(){
            return name;
        }
        public char getGrade(){
            return  grade;
        } 
        @Override
        public String toString(){
            final StringBuilder sb = new StringBuilder("Student{");
            sb.append("name=").append(name).append('\n');
            sb.append(", grade=").append(grade);
            sb.append('}');
            return sb.toString();

        }
    }
}
