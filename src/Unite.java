import java.util.ArrayList;

public abstract class Unite {
    protected String nom; //nom de l'unité
    protected int coutConstruction; //cout d'une unité
    protected int precisionAttaque; // précision d'une unité
    protected int esquiveDefense; //esquive d'une unité
    protected ArrayList equipements; //tableau des équipements

    //méthode qui consomme les ressources pour la création de l'unité
    public void consommerRessource(){
        System.out.println("Consomme "+this.coutConstruction+" ressources pour la création de l'unité");
    }

    //méthode abstraite pour pouvoir équiper l'unité
    public abstract void equiper();

    public String toString(){
        String str = "Nom : "+this.nom+"\n";
        str += "Coût de construction : "+this.coutConstruction+"\n";
        str += "Précision d'attaque : "+this.precisionAttaque+"\n";
        str += "Esquive en défense : "+this.esquiveDefense+"\n";
        str += "Equipements : ";
        for(int i=0; i<this.equipements.size(); i++)
        {
            str += this.equipements.get(i)+" ";
        }
        return str;
    }
}
