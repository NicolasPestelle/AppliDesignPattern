public class Usine {
    //attribut contenant la fabrique
    private SimpleFabrique simpleFabrique;

    //selection de la fabrique a utiliser
    public Usine(){
        this.simpleFabrique = new SimpleFabrique();
    }

    public Unite formerUnite(TypeUnite type){
        Unite unite = this.simpleFabrique.creerUnite(type);
        unite.consommerRessource();
        unite.equiper();
        return unite;
    }
}
