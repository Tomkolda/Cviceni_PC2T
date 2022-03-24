import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Databaze {
	public Databaze(int pocetPrvku)
	{
		prvkyDatabaze=new HashMap<>();
		sc=new Scanner(System.in);
	}
	
	public void setStudent(String name, int rok, float studijniPrumer)
	{
		prvkyDatabaze.put(name, new Student(studijniPrumer, rok));
	}
	
	public Boolean getStudent(String name)
	{
		if(prvkyDatabaze.containsKey(name)){
			System.out.println("Student: " + name + " Rok narozeni: " + prvkyDatabaze.get(name).getRocnik() + " Prumer: " + prvkyDatabaze.get(name).getRocnik());
			return true;
		}
		else {
			System.out.println("Student neexistuje");
			return false;
		}
	}
	
	public Boolean setPrumer(String jmeno, float prumer) throws Vyjimky
	{
		if (prvkyDatabaze.containsKey(jmeno)) {
			prvkyDatabaze.get(jmeno).setStudijniPrumer(prumer);
			return true;
		} else {
			System.out.print("Student neexistuje");
			return false;
		}
	}

	public void print(){ // vypis do konzole v pozadovanem tvaru
		System.out.println(prvkyDatabaze.keySet());
	}

	public void delStudent(String name) // mazani studenta podle jmena
	{
		prvkyDatabaze.remove(name);
	}
	
	private Scanner sc;
	private Map<String, Student> prvkyDatabaze;
	private int posledniStudent;

}