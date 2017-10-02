package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrade() {
        return this.grades;
    }

    public void addGrade(Integer grade) {
        this.grades.add(grade);
    }

    public int getAverage() {
        int total = 0;
        for (int grade : this.grades) {
            total += grade;
        }

        return total / this.grades.size();
    }

    public void recordAttendance(String date, String value) {
        this.attendance.put(date, value);
    }

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();
//        HashMap<String, String> attendance =new HashMap<>();
        Input input = new Input();

        Student carlo = new Student("Carlo");
        carlo.addGrade(100);
        carlo.addGrade(50);
        carlo.addGrade(100);
        students.put("bolimbo", carlo);


        Student ted = new Student("Ted");
        ted.addGrade(80);
        ted.addGrade(50);
        ted.addGrade(90);
        students.put("ted", ted);

        Student siena = new Student("Siena");
        siena.addGrade(100);
        siena.addGrade(100);
        siena.addGrade(100);
        siena.recordAttendance("01/20/2018","P");
        siena.recordAttendance("01/21/2018","P");
        students.put("siena",siena);

        Student jessica = new Student("Jessica");
        jessica.addGrade(100);
        jessica.addGrade(50);
        jessica.addGrade(80);
        jessica.recordAttendance("09/20/17","A");
        students.put("jessica",jessica);

        do {


            System.out.println("Welcome!\n" + "Here are the user names of our students:");


            for (String names : students.keySet()) {
                System.out.println(names);
            }

            String userInput = input.getString("What Student would you like to see more on?");



            if ((students.get(userInput) != null)) {
                System.out.println("name: " +
                        students.get(userInput).getName() +
                        " - " +
                        "Average grade: " +
                        students.get(userInput).getAverage() +
                        " - current grades: " +
                        students.get(userInput).getGrade() +
                        " - Attendance: " +
                        students.get(userInput).attendance);

        }
            else {
                System.out.println("Nothing about that user");
            }
        } while (input.yesNo());
        System.out.println("Goodbye....");
        }
    }



