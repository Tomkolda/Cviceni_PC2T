
public class Student {
	public Student(String jmeno, int rocnik)
	{
		this.jmeno=jmeno;
		this.rocnik=rocnik;
	}
	
	public String getJmeno()
	{
		return jmeno;
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

	private String jmeno;
	private int rocnik;
	private float studijniPrumer;


}