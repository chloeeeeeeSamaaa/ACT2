import java.util.Scanner;

public class App {
    static class Student {
        String name;
        double grades;

        Student(String name, double grades) {
            this.name = name;
            this.grades = grades;
        }

        public String toString() {
            return name + " - " + grades;
        }

        public static void insertionSort(Student[] arr) {
            for (int i = 1; i < arr.length; i++) {
                Student key = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j].grades > key.grades) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
            }

        }

        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            System.out.println("How many students ? : ");
            int numStudent = sc.nextInt();
            sc.nextLine();
            Student[] student = new Student[numStudent];
            for(int i = 0; i < numStudent; i++){
                System.out.println("Enter student " + (i + 1) + ": ");

                System.out.println("Enter student " +(i + 1)+ " name : ");
                String name = sc.nextLine();

                System.out.println("Enter student grade " +(i + 1)+ " grade : ");
                double grades = sc.nextDouble();
                sc.nextLine();

                student[i] = new Student(name, grades);

            }
                insertionSort(student);
                System.out.println("Sorted Stundents Grade (Ascending)");
                for(Student s : student){
                    System.out.println(s);
                }
        }
    }
}