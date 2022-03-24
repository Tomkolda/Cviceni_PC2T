
public class Student {
	public Student(float studijniPrumer, int rocnik)
	{
		this.studijniPrumer=studijniPrumer;
		this.rocnik=rocnik;
	}
	
	public int getRocnik()
	{
		return rocnik;
	}
	
	public float getStudijniPrumer() throws Vyjimky{
		if (this.studijniPrumer == 0)
			throw new Vyjimky();
		else
			return studijniPrumer;
	}

	public void setStudijniPrumer(float studijniPrumer) throws Vyjimky {
		if (studijniPrumer >= 1 && studijniPrumer <= 5)
			this.studijniPrumer = studijniPrumer;
		else
			throw new Vyjimky(studijniPrumer);
	}

	private int rocnik;
	private float studijniPrumer;


}