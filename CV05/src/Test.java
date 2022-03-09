public class Test {

    public static void main(String[] args) {
	    Zbozi[] zbozi = new Zbozi[4];

        zbozi[0]= new Potravina("Rohlik",1.5,1);
        zbozi[1]= new Naradi("Kleste",278.0,24);
        zbozi[2]= new Potravina("Chleba",20.8,6);
        zbozi[3]= new Potravina("Jablko",51.0,20);

        for (int i = 0; i < 4; i++){
            if(zbozi[i] instanceof Potravina){
                System.out.println(zbozi[i].getNazev()+", cena: "+zbozi[i].getCena()+", travanlivost: "+((Potravina) zbozi[i]).getTrvanlivost()+" "+((Potravina) zbozi[i]).getJednotka());
            }
            else {
                System.out.println(zbozi[i].getNazev()+", cena: "+zbozi[i].getCena()+", zaruka: "+((Naradi) zbozi[i]).getZaruka()+" "+((Naradi) zbozi[i]).getJednotka());
            }
        }
    }
}
