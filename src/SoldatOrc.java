import java.util.ArrayList;

public class SoldatOrc extends Unite {

    public SoldatOrc(){
        this.nom = "Orc";
        this.coutConstruction = 5;
        this.precisionAttaque = 1;
        this.esquiveDefense = 2;
        this.equipements = new ArrayList();
    }

    @Override
    public void equiper() {
        this.equipements.add("Epée orc");
        this.equipements.add("peau dur");

        System.out.println("Equipement d'un orc (Epée, peau dur)");
    }
}
