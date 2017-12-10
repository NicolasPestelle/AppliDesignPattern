import java.util.ArrayList;

public class CommandantHumain extends Unite {

    public CommandantHumain(){
        this.nom = "Lieutenant";
        this.coutConstruction= 14;
        this.precisionAttaque = 5;
        this.esquiveDefense = 3;
        this.equipements = new ArrayList();
    }

    @Override
    public void equiper() {
        this.equipements.add("Epée longue");
        this.equipements.add("bouclier");
        System.out.println("Equipement d'un commandant humain (Epée longue, bouclier)");
    }
}
