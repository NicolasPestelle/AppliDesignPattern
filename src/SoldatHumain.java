import java.util.ArrayList;

public class SoldatHumain extends Unite{

    public SoldatHumain(){
        this.nom="Fantassin";
        this.coutConstruction =5;
        this.precisionAttaque = 1;
        this.esquiveDefense = 2;
        this.equipements = new ArrayList();
    }

    @Override
    public void equiper() {
        this.equipements.add("Epée courte");
        this.equipements.add("bouclier");
        System.out.println("Equipement d'un soldat humain (Epée courte, bouclier)");

    }
}
