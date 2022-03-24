public class Vyjimky extends java.lang.Exception
{
    public Vyjimky()
    {
        super("Nebyl zadan prumer");
    }
    public Vyjimky(double prumer)
    {
        super("Prumer nebyl zadan v intervalu 1 az 5. Zadali jste: " + prumer);
    }
}