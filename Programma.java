public class Programma {
    public static void main(String[] args) {
        Auto panda = new Auto("Fiat Panda");
        Auto ferrari = new Auto("Enzo Ferrari");
        Auto bugatti = new Auto("Bugatti Veiron");

        System.out.println(panda.toString()); 
        System.out.println(ferrari.toString());
        System.out.println(bugatti.toString());
        System.out.println("Il numero totale delle auto è: " + Auto.getNumeroTotaleAuto());

        System.out.println("EUR" + "USD");
    }
}
