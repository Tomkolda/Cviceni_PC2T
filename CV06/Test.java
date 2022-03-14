import java.io.IOException;
import java.util.Scanner;


public class Test {

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

	public static int vIndexu(Scanner sc, Databaze mojeDatabaze){
		int index = 0;
		try {
			index = sc.nextInt();
			mojeDatabaze.getStudent(index);
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Chyba: "+ e.toString());
			System.out.println("Zadany index neni v rozsahu seznamu. Zadej novy index studenta: ");
			sc.nextLine();
			index = vIndexu(sc, mojeDatabaze);
		}
		catch (NullPointerException e)
		{
			System.out.println("Chyba: "+ e.toString());
			System.out.println("Na tomto indexu neni vytvoreny student. Zadej index vytvoreneho studenta: ");
			sc.nextLine();
			index = vIndexu(sc, mojeDatabaze);
		}
		return index;
	}

	public static void normalPrumer(Scanner sc, Databaze mojeDatabaze){
		int index = 0;
		float prum = 0;
		try{
			index = vIndexu(sc, mojeDatabaze);
			prum = pouzeCelaneboDestinna(sc);
			mojeDatabaze.setPrumer(index, prum);
		}
		catch (Exception e){
			System.out.println("Nastala chyba: " + e.toString());
			sc.nextLine();
			normalPrumer(sc, mojeDatabaze);
		}

	}


	public static void main(String[] args) throws IOException, Vyjimky {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Databaze mojeDatabaze=new Databaze(1);
		int idx;
		float prumer;
		int volba;
		boolean run=true;
		while(run)
		{
			System.out.println("Vyberte pozadovanou cinnost:");
			System.out.println("1 .. vytvoreni nove databaze");
			System.out.println("2 .. vlozeni noveho studenta");
			System.out.println("3 .. nastaveni prumeru studenta");
			System.out.println("4 .. vypis informace o studentovi");
			System.out.println("5 .. vypis databaze");
			System.out.println("6 .. zapis do souboru");
			System.out.println("7 .. cteni ze souboru");
			System.out.println("8 .. ukonceni aplikace");
			volba=pouzeCelaCisla(sc);
			switch(volba)
			{
				case 1:
					System.out.println("Zadejte pocet studentu");
					mojeDatabaze=new Databaze(sc.nextInt());
					break;
				case 2:
					mojeDatabaze.setStudent();
					break;
				case 3:
					System.out.println("Zadejte index a prumer studenta");
					normalPrumer(sc,mojeDatabaze);
					break;
				case 4:
					System.out.println("Zadejte index studenta");
					idx=vIndexu(sc,mojeDatabaze);
					Student info=mojeDatabaze.getStudent(idx);
					try { // Try Catch pro print
						System.out.println("Jmeno: " + info.getJmeno() + " rok narozeni: " + info.getRocnik() + " prumer: " + info.getStudijniPrumer());
					} catch (Vyjimky vyjimky) { // Vyjimka nezadání prumeru
						System.out.println("Nastala vyjimka typu " + vyjimky.toString());
					}
					catch (NullPointerException e) // Vyjimka při zadání printu studenta jehož ID existuje ale ne data
					{
						System.out.println("Chyba typu: "+e);
						System.out.println("Student není indexován přidejte studenta: ");
					}
					break;
				case 5:
					mojeDatabaze.print();
					break;
				case 6:
					mojeDatabaze.zapis();
					break;
				case 7:
					mojeDatabaze.cteni();
					break;
				case 8:
					run=false;
					break;
			}
			
		}
	}

}
