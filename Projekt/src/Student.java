import java.util.ArrayList;

public abstract class Student {
    private String name;
    private String surname;
    private int year_born;
    private String month;
    private int day;
    private ArrayList<Integer> grades;

    public Student(String name, String surname, int year_born, String month, int day) {
        this.name = name;
        this.surname = surname;
        this.year_born = year_born;
        this.month = month;
        this.day = day;
        this.grades = new ArrayList<Integer>();
    }

    public void setGrades(int grades){
        if(grades>= 1 && grades<=5)
            this.grades.add(grades);
        else
            System.out.println("Grade must be from 1 to 5");
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear_born() {
        return year_born;
    }

    public void setYear_born(int year_born) {
        this.year_born = year_born;
    }

    public float study_average(){
        int x = 0;
        float study_avg;
        int j = 0;
        for (int i = 0; i < this.grades.size(); i++){
            x+=grades.get(i);
            j++;
        }
        study_avg = x/j;
        return study_avg;
    }


}
