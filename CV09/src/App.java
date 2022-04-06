public class App {

    public static void main(String[] args) {
        char[] p = {'a','b','c','d'};

        Employee e1 = new Employee("Tomas","Tomas@mail.com",p);
        Employee e2 = new Employee("Petr","Petr@mail.com",p);
        Employee e3 = new Employee("David","David@mail.com",p);
        Employee e4 = new Employee("Martin","Martin@mail.com",p);
        Employee e5 = new Employee("Honza","Honza@mail.com",p);
        Manager m1 = new Manager("Jakub","Jakub@email.com",p);
        Secretarian s1 = new Secretarian("Hana","Hana@email.com",p);
        Secretarian s2 = new Secretarian("Lucie","Lucie@email.com",p);

        m1.addRelation(s2);
        m1.addEmployee(e1);
        m1.addEmployee(e2);
        m1.addEmployee(e3);
        m1.addEmployee(e4);
        m1.addEmployee(e5);

        m1.listEmployees();
        m1.listRelation();

        byte age = 4;

        Cat cat = new Cat(age); // Popsány jsou pouze kočky v každé variantě - je to všude stejné
        Dog dog = new Dog(age);
        Pig pig = new Pig(age);
        Cow cow = new Cow(age);
        Goat goat = new Goat(age);

        cat.sound();
        dog.sound();
        pig.sound();
        cow.sound();
        goat.sound();

        CatImpl catI = new CatImpl(age);
        DogImpl dogI = new DogImpl(age);
        PigImpl pigI = new PigImpl(age);
        CowImpl cowI = new CowImpl(age);
        GoatImpl goatI = new GoatImpl(age);

        catI.sound();
        catI.toFile();
        dogI.sound();
        dogI.toFile();
        pigI.sound();
        dogI.toFile();
        cowI.sound();
        cowI.toFile();
        goatI.sound();
        goatI.toFile();
    }
}
