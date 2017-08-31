package Yonda.dakota;

public class Stado implements IWoter{

    //Гну - 1 000 000 000
    //Доркас - 800 000 000
    //Дама - 1 500 000 000

   private Gnu StadoGnu;
   private Dorkas StadoDorkas;
   private Dama StadoDama;

    public Stado() {
        StadoGnu = new Gnu();
        StadoDama = new Dama();
        StadoDorkas = new Dorkas();
    }

    public Gnu getStadoGnu() {
        return StadoGnu;
    }

    public Dorkas getStadoDorkas() {
        return StadoDorkas;
    }

    public Dama getStadoDama() {
        return StadoDama;
    }

    @Override
    public long Havka(long vOazis, long Havka) {
        return vOazis - Havka;
    }
}
