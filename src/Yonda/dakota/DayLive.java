package Yonda.dakota;

import java.util.Random;

public class DayLive {
    private Calahari calahari;
    private int countDay;
    private Random rn;
    // 1 000 000 000л воды
    private int Rain = 1000000000;
    public DayLive() {
        calahari = new Calahari();
        countDay =0;
        rn = new Random();
    }

   public int DayOfLiveInCalahari(){
        while (calahari.getOasis().getvOazis() > 0){
            MainWoterAll();
        }

        return countDay;
    }

    private void GnuHavka(){
        if(calahari.getOasis().getvOazis() >= calahari.getStado().getStadoGnu().getWoterInTheDay() * calahari.getStado().getStadoGnu().getCount()) {
            calahari.getOasis().setvOazis(calahari.getStado().Havka(calahari.getOasis().getvOazis(),
                    (calahari.getStado().getStadoGnu().getWoterInTheDay() * calahari.getStado().getStadoGnu().getCount())));
            System.out.println("Gnu havka " + calahari.getOasis().getvOazis());
        }
        else{
            long CountLive = calahari.getOasis().getvOazis() / calahari.getStado().getStadoGnu().getWoterInTheDay();
            calahari.getOasis().setvOazis(calahari.getStado().Havka(calahari.getOasis().getvOazis(),
                    (calahari.getStado().getStadoGnu().getWoterInTheDay() * CountLive)));
            calahari.getStado().getStadoGnu().setCount(CountLive);
        }
    }
    private void DorkasHavka(){
        if(calahari.getOasis().getvOazis() >= calahari.getStado().getStadoDorkas().getWaterInTheDay() * calahari.getStado().getStadoDorkas().getCount()) {
            calahari.getOasis().setvOazis(calahari.getStado().Havka(calahari.getOasis().getvOazis(),
                    (calahari.getStado().getStadoDorkas().getWaterInTheDay() * calahari.getStado().getStadoDorkas().getCount())));
            System.out.println("Dorkas Havka " + calahari.getOasis().getvOazis());
        }
        else{
            long CountLive = calahari.getOasis().getvOazis() / calahari.getStado().getStadoDorkas().getWaterInTheDay();
            calahari.getOasis().setvOazis(calahari.getStado().Havka(calahari.getOasis().getvOazis(),
                    (calahari.getStado().getStadoDorkas().getWaterInTheDay() * CountLive)));
            calahari.getStado().getStadoDorkas().setCount(CountLive);
        }
    }
    private void DamaHAvka(){
        if(calahari.getOasis().getvOazis() >= (calahari.getStado().getStadoDama().getWaterInTheDay()* calahari.getStado().getStadoDama().getCount())) {
            calahari.getOasis().setvOazis(calahari.getStado().Havka(calahari.getOasis().getvOazis(),
                    (calahari.getStado().getStadoDama().getWaterInTheDay() * calahari.getStado().getStadoDama().getCount())));

        }else{
            long CountLive = calahari.getOasis().getvOazis() / calahari.getStado().getStadoDama().getWaterInTheDay();
            calahari.getOasis().setvOazis(calahari.getStado().Havka(calahari.getOasis().getvOazis(),
                    (calahari.getStado().getStadoDama().getWaterInTheDay() * CountLive)));
            calahari.getStado().getStadoDama().setCount(CountLive);
        }
        System.out.println("Dama count: " + calahari.getStado().getStadoDama().getCount());
    }

    private void MainWoterAll(){
        if(PlusInOazis()) {
            calahari.getOasis().setvOazis(calahari.getOasis().getvOazis() + Rain);
            System.out.println("No pain no Rain!  " + calahari.getOasis().getvOazis());
        }

        GnuHavka();
        DorkasHavka();
        DamaHAvka();

        countDay++;
        System.out.println("Day : " + countDay);
    }

    private boolean PlusInOazis(){
        if(rn.nextInt(100/11) == 0)
            return true;
        return false;
    }
}
