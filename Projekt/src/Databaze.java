import java.util.*;

public class Databaze {
    private Map<Integer, Student> prvkyDatabaze;

    public Databaze() {
        prvkyDatabaze = new HashMap<>();
    }

    public void setStudent(Integer ID, String name, String surname, int year_born, String month, int day, Integer group) {
        if (group == 0) {
            prvkyDatabaze.put(ID, new Student_tech(name, surname, year_born, month, day));
        } else if (group == 1) {
            prvkyDatabaze.put(ID, new Student_hum(name, surname, year_born, month, day));
        } else {
            prvkyDatabaze.put(ID, new Student_kom(name, surname, year_born, month, day));
        }
    }

    public void setGrade(Integer ID, Integer grade) {
        if (prvkyDatabaze.containsKey(ID)) {
            prvkyDatabaze.get(ID).setGrades(grade);
        } else {
            System.out.print("Student neexistuje");
        }
    }

    public void kick_student(Integer ID) {
        prvkyDatabaze.remove(ID);
    }

    public Student getStudent(Integer ID) {
        if (prvkyDatabaze.containsKey(ID)) {
            return prvkyDatabaze.get(ID);
        } else {
            System.out.println("Student neexistuje");
            return null;
        }
    }

    public void special_function(Integer ID) {
        if (prvkyDatabaze.containsKey(ID)) {
            if (prvkyDatabaze.get(ID) instanceof Student_tech) {
                ((Student_tech) prvkyDatabaze.get(ID)).isleap_year();
            } else if (prvkyDatabaze.get(ID) instanceof Student_hum) {
                ((Student_hum) prvkyDatabaze.get(ID)).jake_znameni();
            } else if (prvkyDatabaze.get(ID) instanceof Student_kom) {
                ((Student_kom) prvkyDatabaze.get(ID)).isleap_year();
                ((Student_kom) prvkyDatabaze.get(ID)).jake_znameni();
            }
        } else {
            System.out.print("Student neexistuje");
        }
    }

    public void sortByValues() {
        ArrayList<Student> student_hum = new ArrayList<>();
        ArrayList<Student> student_kom = new ArrayList<>();
        ArrayList<Student> student_tech = new ArrayList<>();
        for (Student i : prvkyDatabaze.values()) {
            if (i instanceof Student_kom) {
                student_kom.add(i);
            } else if (i instanceof Student_hum) {
                student_hum.add(i);
            } else if (i instanceof Student_tech){
                student_tech.add(i);
            }
        }
        Collections.sort(student_hum, Comparator.comparing(Student::getSurname));
        Collections.sort(student_kom, Comparator.comparing(Student::getSurname));
        Collections.sort(student_tech, Comparator.comparing(Student::getSurname));

        System.out.println("Students of Humanity");
        for (Student i : student_hum){
            System.out.println("Jmeno: " + i.getName() + "Prijmeni: " + i.getSurname() + "Datum narozeni: " + i.getDay() + "." +
                    i.getMonth() + "." + i.getYear_born() + "Studijni prumer: " + i.study_average());
        }

        System.out.println("Students of Technology");
        for (Student i : student_tech){
            System.out.println("Jmeno: " + i.getName() + "Prijmeni: " + i.getSurname() + "Datum narozeni: " + i.getDay() + "." +
                    i.getMonth() + "." + i.getYear_born() + "Studijni prumer: " + i.study_average());
        }

        System.out.println("Students of combination study");
        for (Student i : student_kom){
            System.out.println("Jmeno: " + i.getName() + "Prijmeni: " + i.getSurname() + "Datum narozeni: " + i.getDay() + "." +
                    i.getMonth() + "." + i.getYear_born() + "Studijni prumer: " + i.study_average());
        }

    }

    public void studyAverageSubject(){
        int studyAverageHum = 0;
        int studyAverageTech = 0;
        ArrayList<Student> student_hum = new ArrayList<>();
        ArrayList<Student> student_tech = new ArrayList<>();
        for (Student i : prvkyDatabaze.values()) {
            if (i instanceof Student_hum) {
                student_hum.add(i);
            } else if (i instanceof Student_tech){
                student_tech.add(i);
            }
        }
        for (Student i : student_hum){
            studyAverageHum += i.study_average();
        }
        studyAverageHum = studyAverageHum / student_hum.size();

        for (Student i : student_tech){
            studyAverageTech += i.study_average();
        }
        studyAverageTech = studyAverageTech / student_tech.size();

        System.out.println("Study average of all students from humanity is: " + studyAverageHum);
        System.out.println("Study average of all students from technology is: " + studyAverageTech);
    }

    public void numberOfStudents(){
        ArrayList<Student> student_hum = new ArrayList<>();
        ArrayList<Student> student_kom = new ArrayList<>();
        ArrayList<Student> student_tech = new ArrayList<>();
        for (Student i : prvkyDatabaze.values()) {
            if (i instanceof Student_kom) {
                student_kom.add(i);
            } else if (i instanceof Student_hum) {
                student_hum.add(i);
            } else if (i instanceof Student_tech){
                student_tech.add(i);
            }
        }

        System.out.println("Count of Students from humanity is: " + student_hum.size());
        System.out.println("Count of Students from technology is: " + student_tech.size());
        System.out.println("Count of Students from combination study is: " + student_kom.size());
    }

    public void save(){

    }

    public void load(){

    }
}
