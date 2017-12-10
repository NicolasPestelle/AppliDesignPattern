import java.util.ArrayList;

public class CommandantOrc extends Unite {

    public CommandantOrc(){
        this.nom = "Orc";
        this.coutConstruction = 16;
        this.precisionAttaque = 7;
        this.esquiveDefense = 2;
        this.equipements = new ArrayList();
    }

    @Override
    public void equiper() {
        this.equipements.add("Epée longue orc");
        this.equipements.add("Ignore la douleur");
        System.out.println("Equipement d'un commandant orc (Epée longue orc, Ignore la douleur");
    }
}
