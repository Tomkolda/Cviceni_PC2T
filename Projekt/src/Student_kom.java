public class Student_kom extends Student implements Hum, Tech{
    public Student_kom(String name, String surname, int year_born, String month, int day) {
        super(name, surname, year_born, month, day);
    }

    @Override
    public boolean isleap_year(){
        if (getYear_born() % 4 == 0){
            return true;
        }
        return false;
    }

    @Override
    public void jake_znameni() {
        String sign = "";
        if (this.getMonth().equals("Leden") || this.getMonth().equals("January")) {
            if (this.getDay() < 21)
                sign = "Kozoroh";
            else
                sign = "Vodnar";
        }
        else if (this.getMonth().equals("Unor") || this.getMonth().equals("February")) {
            if (this.getDay() < 21)
                sign = "Vodnar";
            else
                sign = "Ryby";
        }
        else if(this.getMonth().equals("Brezen") || this.getMonth().equals("March")) {
            if (this.getDay() < 21)
                sign = "Ryby";
            else
                sign = "Beran";
        }
        else if (this.getMonth().equals("Duben") || this.getMonth().equals("April")) {
            if (this.getDay() < 21)
                sign = "Beran";
            else
                sign = "Byk";
        }
        else if (this.getMonth().equals("Kveten") || this.getMonth().equals("May")) {
            if (this.getDay() < 22)
                sign = "Byk";
            else
                sign = "Blizenci";
        }
        else if(this.getMonth().equals("Cerven") || this.getMonth().equals("June")) {
            if (this.getDay() < 22)
                sign = "Blizenci";
            else
                sign = "Rak";
        }
        else if (this.getMonth().equals("Cervenec") || this.getMonth().equals("July")) {
            if (this.getDay() < 23)
                sign = "Rak";
            else
                sign = "Lev";
        }
        else if(this.getMonth().equals("Srpen") || this.getMonth().equals("August")) {
            if (this.getDay() < 23)
                sign = "Lev";
            else
                sign = "Panna";
        }
        else if (this.getMonth().equals("Zari") || this.getMonth().equals("September")) {
            if (this.getDay() < 23)
                sign = "Panna";
            else
                sign = "Vahy";
        }
        else if (this.getMonth().equals("Rijen") || this.getMonth().equals("October")) {
            if (this.getDay() < 24)
                sign = "Vahy";
            else
                sign = "Stir";
        }
        else if (this.getMonth().equals("Listopad") || this.getMonth().equals("November")) {
            if (this.getDay() < 23)
                sign = "Stir";
            else
                sign = "Strelec";
        }
        else if (this.getMonth().equals("Prosinec") || this.getMonth().equals("December")) {
            if (this.getDay() < 22)
                sign = "Strelec";
            else
                sign ="Kozoroh";
        }
        System.out.println("Moje znameni je: " + sign);
    }

}
