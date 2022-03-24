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



	public static void main(String[] args) throws IOException, Vyjimky {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Databaze mojeDatabaze=new Databaze(1);

		String name;
		int year;
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
			System.out.println("5 .. vypis studentu");
			System.out.println("6 .. mazani studenta");
			System.out.println("8 .. ukonceni aplikace");
			volba=pouzeCelaCisla(sc);
			switch(volba)
			{
				case 1:
					System.out.println("Zadejte pocet studentu");
					mojeDatabaze=new Databaze(sc.nextInt());
					break;
				case 2:
					System.out.print("Zadejte jmeno studenta: ");
					sc.nextLine();
					name = sc.nextLine();
					System.out.print("Zadejte rok narozeni: ");
					year = pouzeCelaCisla(sc);
					prumer = 0;
					mojeDatabaze.setStudent(name,year,prumer);
					break;
				case 3:
					System.out.print("Zadejte jmeno studenta: ");
					sc.nextLine();
					name = sc.nextLine();
					System.out.print("Zadejte prumer znamek studenta: ");
					prumer = pouzeCelaneboDestinna(sc);

					try
					{
						mojeDatabaze.setPrumer(name, prumer);
					}
					catch (Exception e)
					{
						e.printStackTrace();
					}
					break;
				case 4:
					System.out.print("Zadejte jmeno studenta: ");
					sc.nextLine();
					name = sc.nextLine();

					try
					{
						System.out.println(mojeDatabaze.getStudent(name));
					}
					catch(Exception e)
					{
						System.out.println("Nebyl zadan prumer studenta");
					}
					break;
				case 5:
					mojeDatabaze.print();
					break;
				case 6:
					System.out.print("Zadejte jmeno studenta: ");
					sc.nextLine();
					name = sc.nextLine();
					mojeDatabaze.delStudent(name);
					break;
				case 8:
					run=false;
					break;
			}
			
		}
	}

}
