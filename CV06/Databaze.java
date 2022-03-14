import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Databaze {
	public Databaze(int pocetPrvku)
	{
		prvkyDatabaze=new Student[pocetPrvku];
		sc=new Scanner(System.in);
	}
	
	public void setStudent()
	{
		System.out.println("Zadejte jmeno studenta, rok narozeni");
		String jmeno=sc.next();
		int rok=sc.nextInt();
		prvkyDatabaze[posledniStudent++]=new Student(jmeno,rok);
	}
	
	public Student getStudent(int idx)
	{
		return prvkyDatabaze[idx];
	}
	
	public void setPrumer(int idx, float prumer) throws Vyjimky
	{
		prvkyDatabaze[idx].setStudijniPrumer(prumer);
	}
	
	private Scanner sc;
	private Student [] prvkyDatabaze;
	private int posledniStudent;


	public void print(){ // vypis do konzole v pozadovanem tvaru
		for (int i = 0; i < prvkyDatabaze.length; i++){
			try{
				System.out.println("Jmeno: "+prvkyDatabaze[i].getJmeno()+", rok narozeni: "+prvkyDatabaze[i].getRocnik()+", studijni prumer: "+prvkyDatabaze[i].getStudijniPrumer());
			} catch (Vyjimky vyjimky) { // Vyjimka nezadání prumeru
				System.out.println("Nastala vyjimka typu " + vyjimky.toString());
			}
			catch (NullPointerException e) // Vyjimka při zadání printu studenta jehož ID existuje ale ne data
			{
				System.out.println("Chyba typu: "+e);
				System.out.println("Student není indexován přidejte studenta: ");
			}
		}
	}
	public void zapis() throws IOException {   // zapis do souboru
		File zapis = new File("databaze.txt");
		FileWriter fw = null;
		try {
			fw = new FileWriter(zapis);
			for (int i = 0; i < prvkyDatabaze.length; i++){
				try{
					fw.write(prvkyDatabaze[i].getJmeno()+" "+prvkyDatabaze[i].getRocnik()+" "+prvkyDatabaze[i].getStudijniPrumer());
				}catch (Vyjimky vyjimky) { // Vyjimka nezadání prumeru
					System.out.println("Nastala vyjimka typu " + vyjimky.toString());
				}
				catch (NullPointerException e) // Vyjimka při zadání printu studenta jehož ID existuje ale ne data
				{
					System.out.println("Chyba typu: "+e);
					System.out.println("Student není indexován přidejte studenta: ");
				}

			}

		} catch (IOException e){
			System.out.println("Soubor " + zapis + "nelze otevřít");
			}
		finally {
			fw.close();
		}

	}
	public void cteni() throws IOException, Vyjimky {  // cteni ze souboru
		BufferedReader reader = new BufferedReader(new FileReader(
				"databaze.txt"));
		for (int i = 0; i < prvkyDatabaze.length; i++){
			String line = reader.readLine();
			if (line == null){
				break;
			}
			String[] parts = line.split(" ");
			String name = parts[0];
			int age = Integer.parseInt(parts[1]);
			float prumer = Float.parseFloat(parts[2]);
			prvkyDatabaze[i] = new Student(name, age);
			prvkyDatabaze[i].setStudijniPrumer(prumer);
		}
		reader.close();
	}

}