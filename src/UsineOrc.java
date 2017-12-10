public class UsineOrc extends Usine {
    public Unite creerUnite(TypeUnite type){
        Unite unite = null;
        switch (type){
            case SOLDAT:unite = new SoldatHumain();break;
            case COMMANDANT:unite = new CommandantHumain();break;
        }
        return unite;
    }
}
