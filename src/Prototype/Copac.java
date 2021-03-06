package Prototype;

public class Copac {
    public String tipCoroana;
    public float inaltime;
    public String culoare;
    public String familie;
    public Locatie locatiePlantare;

    public void planteaza(Locatie locatiePlantare){
        this.locatiePlantare.x = locatiePlantare.x;
        this.locatiePlantare.y = locatiePlantare.y;
    }

    public Copac(String tipCoroana, float inaltime, String culoare, String familie, Locatie locatiePlantare) {
        this.tipCoroana = tipCoroana;
        this.inaltime = inaltime;
        this.culoare = culoare;
        this.familie = familie;
        this.locatiePlantare = locatiePlantare;
    }

    public Copac clone(){
        Copac clone = new Copac(this.tipCoroana, this.inaltime, this.culoare, this.familie, new Locatie(this.locatiePlantare.x, this.locatiePlantare.y));
        return clone;
    }

    @Override
    public String toString() {
        return "Copac{" +
                "tipCoroana='" + tipCoroana + '\'' +
                ", inaltime=" + inaltime +
                ", culoare='" + culoare + '\'' +
                ", familie='" + familie + '\'' +
                ", locatiePlantare=" + locatiePlantare +
                '}';
    }
}
