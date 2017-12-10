public class Main {
    public static void main(String[] args)
    {
        Usine usineOrc = new UsineOrc();
        Unite unite = usineOrc.creerUnite(TypeUnite.SOLDAT);
        System.out.println(unite);

        unite = usineOrc.creerUnite(TypeUnite.COMMANDANT);
        System.out.println(unite);
    }
}
