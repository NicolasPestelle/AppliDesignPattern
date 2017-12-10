public abstract class Usine {

    public Unite formerUnite(TypeUnite type){
        Unite unite = this.creerUnite(type);
        unite.consommerRessource();
        unite.equiper();
        return unite;
    }

    public abstract Unite creerUnite(TypeUnite type);
}
