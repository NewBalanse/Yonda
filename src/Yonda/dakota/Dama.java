package Yonda.dakota;

public class Dama {
    private int WaterInTheDay = 5;

    public void setCount(long count) {
        Count = count;
    }

    public long getCount() {

        return Count;
    }

    private long Count = 1500000000l;

    public int getWaterInTheDay() {
        return WaterInTheDay;
    }

}
