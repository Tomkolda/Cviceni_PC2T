import java.util.Scanner;


public class Main {

    public static int pouzeCelaCisla(Scanner sc)
    {
        int cislo = 0;
        try
        {
            cislo = sc.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("Nastala vyjimka typu "+e.toString());
            System.out.println("zadejte prosim cele cislo ");
            sc.nextLine();
            cislo = pouzeCelaCisla(sc);
        }
        return cislo;
    }

    public static float pouzeCelaneboDestinna(Scanner sc) // Try catch pro kontrolu celych cisel a desetinných
    {
        float cislo = 0;
        try
        {
            cislo = sc.nextFloat();
        }
        catch(Exception e) // Catch pro všechny exceptiony
        {
            System.out.println("Nastala vyjimka typu "+e.toString());
            System.out.println("zadejte prosim cele nebo desetinne cislo ");
            sc.nextLine();
            cislo = pouzeCelaneboDestinna(sc);
        }
        return cislo;
    }

    public static boolean realDate(Integer day, String month, Integer year, Scanner sc){
        String[] month31 = new String[]{"Leden", "Brezen", "Kveten", "Cerevnec", "Srpen", "Rijen", "Prosinec", "January", "March", "May", "July", "August", "October", "December"};
        String[] month30 = new String[]{"Duben", "Cerven", "Zari", "Listopad", "April", "June", "September", "November"};
        String[] month28 = new String[]{"Unor", "February"};
        for (String i : month31){
            if (month.equals(i)){
                if (day>=1 && day<=31){
                    return true;
                }
            }
        }

        for (String i : month30){
            if (month.equals(i)){
                if (day>=1 && day<=30){
                    return true;
                }
            }
        }

        for (String i : month28){
            if (month.equals(i)){
                if (day>=1 && day<=28){
                    return true;
                }
            }
        }

        System.out.println("Wrong form of date of birth");
        System.out.println("Type new date");
        System.out.println("Day of birth: ");
        day = pouzeCelaCisla(sc);
        sc.nextLine();
        System.out.println("Month of birth");
        month = sc.next();
        sc.nextLine();
        System.out.println("Year of birth");
        year = pouzeCelaCisla(sc);
        sc.nextLine();
        realDate(day, month, year, sc);
        return false;

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Databaze mojeDatabaze=new Databaze();

        String name;
        int year;
        int day;
        String month;
        String surname;
        int volba;
        int group;
        int ID;
        int grade;
        boolean run=true;
        while(run){
            System.out.println("Choose option:");
            System.out.println("1 .. create new database");
            System.out.println("2 .. create new student");
            System.out.println("3 .. add grade");
            System.out.println("4 .. kick student");
            System.out.println("5 .. info about student");
            System.out.println("6 .. sorted groups");
            System.out.println("7 .. run special function");
            System.out.println("8 .. study average of all students in groups");
            System.out.println("9 .. count students in groups");
            System.out.println("10 .. Save database to txt");
            System.out.println("11 .. Load database from txt");
            System.out.println("12 .. exit");
            volba=pouzeCelaCisla(sc);
            switch (volba){
                case 1:
                    mojeDatabaze = new Databaze();
                    break;
                case 2:
                    System.out.println("ID: ");
                    sc.nextLine();
                    ID = pouzeCelaCisla(sc);
                    sc.nextLine();
                    System.out.println("Day of birth: ");
                    day = pouzeCelaCisla(sc);
                    sc.nextLine();
                    System.out.println("Month of birth");
                    month = sc.next();
                    sc.nextLine();
                    System.out.println("Year of birth");
                    year = pouzeCelaCisla(sc);
                    sc.nextLine();
                    realDate(day, month, year, sc);
                    System.out.println("Name of student: ");
                    name = sc.next();
                    sc.nextLine();
                    System.out.println("Surname of student: ");
                    surname = sc.next();
                    System.out.println("Choose group(0. Techlogy, 1. Humanity, 2. Combination study)");
                    group = pouzeCelaCisla(sc);
                    mojeDatabaze.setStudent(ID, name, surname, year, month, day, group);
                    break;
                case 3:
                    System.out.println("Type ID of student: ");
                    ID = pouzeCelaCisla(sc);
                    System.out.println("Type grade: ");
                    grade = pouzeCelaCisla(sc);
                    mojeDatabaze.setGrade(ID, grade);
                    break;
                case 4:
                    System.out.println("Type ID of student: ");
                    ID = pouzeCelaCisla(sc);
                    mojeDatabaze.kick_student(ID);
                    break;
                case 5:
                    System.out.println("Type ID of student: ");
                    ID = pouzeCelaCisla(sc);
                    Student student = mojeDatabaze.getStudent(ID);
                    System.out.println("ID: " + ID + " Name: " + student.getName() + " " + student.getSurname() + " Date of birth: " + student.getDay() + "." + student.getMonth() +
                            "." + student.getYear_born() + student.study_average());
                    break;
                case 6:
                    mojeDatabaze.sortByValues();
                    break;
                case 7:
                    System.out.println("Type ID of student: ");
                    ID = pouzeCelaCisla(sc);
                    mojeDatabaze.special_function(ID);
                    break;
                case 8:
                    mojeDatabaze.studyAverageSubject();
                    break;
                case 9:
                    mojeDatabaze.numberOfStudents();
                    break;
                case 10:
                    mojeDatabaze.save();
                    break;
                case 11:
                    mojeDatabaze.load();
                    break;
                case 12:
                    run = false;
                    break;
            }

        }
    }
}
