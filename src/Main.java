public class Main {
    public static void main(String[] args)
    {
        Usine usine = new Usine();
        Unite unite = usine.formerUnite(TypeUnite.SOLDAT);
        System.out.println(unite);
    }
}
