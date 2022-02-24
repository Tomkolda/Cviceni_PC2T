import java.util.Scanner;

public class DatabseOperation {

    public static void main(String[] args) {
	    Database[] database = new Database[3];
        Scanner in = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        Scanner d = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Write name of worker: ");
            String name = s.nextLine();
            System.out.println("Write year of born of worker:");
            int year = in.nextInt();
            database[i] = new Database(name, year);
        }

        System.out.println("Write max work: ");
        double max = d.nextDouble();
        Database.setMax_work(max);
        int f = 0;
        while(f == 0){
            System.out.println("Write index");
            int index = in.nextInt();
            System.out.println("Write new work");
            double new_wor = d.nextDouble();
            if (database[index].new_work(new_wor)){
                System.out.println(database[index].getName() + " " + database[index].getYear_born() + " " + database[index].getWork());
            }
            else {
                System.out.println(database[index].getName() + " " + database[index].getYear_born() + " was reached the maximum of work " + database[index].getWork());

            }
            System.out.println("For end write 1, for continue wirte 0: ");
            f = in.nextInt();

        }

    }
}
