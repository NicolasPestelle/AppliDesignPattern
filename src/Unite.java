import java.util.ArrayList;

public abstract class Unite {
    protected String nom; //nom de l'unité
    protected int coutConstruction; //cout d'une unité
    protected int precisionAttaque; // précision d'une unité
    protected int esquiveDefense; //esquive d'une unité
    protected ArrayList equipements; //tableau des équipements

    //méthode qui consomme les ressources pour la création de l'unité
    public void consommerRessource(){
        System.out.println("consomme "+this.coutConstruction+"ressources pour la création de l'unité");
    }

    //méthode abstraite pour pouvoir équiper l'unité
    public abstract void equiper();

    public String toString(){
        StringBuilder str = new StringBuilder("Nom : " + this.nom + " \n\r");
        str.append("Coût de construction : ").append(this.coutConstruction).append(" \n\r");
        str.append("Précision d'attaque : ").append(this.precisionAttaque).append(" \n\r");
        str.append("Esquive : ").append(this.esquiveDefense).append(" \n\r");
        str.append("Equipement : ");
        for (Object equipement : this.equipements) {
            str.append(equipement).append(" ");
        }
        return str.toString();
    }
}
