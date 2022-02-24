import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
	    BPC1 bpc1 = new BPC1();
        BPC2 bpc2 = new BPC2();
        BPIS bpis = new BPIS();

        Scanner in = new Scanner(System.in);
        Scanner s = new Scanner(System.in);

        /* body za cviceni bpc1 + overeni max 20 bodu*/
        int x=0;
        while (x==0){
            System.out.println("Napis pocet bodu za cviceni (max. 20): ");
            int body = in.nextInt();
            if (body <= 20){
                x=1;
                bpc1.setBodyZaCviceni(body);
            }
        }

        x=0;
        /* body za zkousku bpc1 + overeni max 80 bodu*/
        while (x==0){
            System.out.println("Napis pocet bodu za zkousku (max. 80): ");
            int body = in.nextInt();
            if (body <= 80){
                x=1;
                bpc1.setBodyZaZkousku(body);
            }
        }

        x=0;
        /* body za projekt bpc2 + overeni max 30 bodu*/
        while (x==0){
            System.out.println("Napis pocet bodu za projekt (max. 30): ");
            int body = in.nextInt();
            if (body <= 30){
                x=1;
                bpc2.setBodyZaProjekt(body);
            }
        }

        x=0;
        /* body za pulsemestralni zkousku bpc2 + overeni max 20 bodu*/
        while (x==0){
            System.out.println("Napis pocet bodu za pulsemestralni zkousku (max. 20): ");
            int body = in.nextInt();
            if (body <= 20){
                x=1;
                bpc2.setBodyZaSZkousku(body);
            }
        }

        x=0;
        /* body za zaverecnou zkousku bpc2 + overeni max 50 bodu*/
        while (x==0){
            System.out.println("Napis pocet bodu za zaverecnou zkousku (max. 50): ");
            int body = in.nextInt();
            if (body <= 50){
                x=1;
                bpc2.setBodyZaZZkousku(body);
            }
        }

        System.out.println("Udelit zapocet z BPIS (Ano/Ne): ");
        String zapocet = s.nextLine();
        bpis.setZapocet(zapocet);


        if(bpc1.zapocetUdelen()){
            System.out.println("U predmetu " + bpc1.getNazev() + " byl udelen zapocet a bylo ziskano " + bpc1.getPocetbodu() + " bodu");
        }
        else {
            System.out.println("U predmetu " + bpc1.getNazev() + " nebyl udelen zapocet a bylo ziskano " + bpc1.getPocetbodu() + " bodu");
        }

        if(bpc2.zapocetUdelen()){
            System.out.println("U predmetu " + bpc2.getNazev() + " byl udelen zapocet a bylo ziskano " + bpc2.getPocetbodu() + " bodu");
        }
        else {
            System.out.println("U predmetu " + bpc2.getNazev() + " nebyl udelen zapocet a bylo ziskano " + bpc2.getPocetbodu() + " bodu");
        }

        if(bpis.zapocetUdelen()){
            System.out.println("U predmetu " + bpis.getNazev() + " byl udelen zapocet");
        }
        else {
            System.out.println("U predmetu " + bpis.getNazev() + " nebyl udelen zapocet");
        }

    }
}
