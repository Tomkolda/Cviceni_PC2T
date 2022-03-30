public class Student_tech extends Student implements Tech{
    public Student_tech(String name, String surname, int year_born, String month, int day) {
        super(name, surname, year_born, month, day);
    }

    @Override
    public boolean isleap_year(){
        if (getYear_born() % 4 == 0){
            return true;
        }
        return false;
    }

}
