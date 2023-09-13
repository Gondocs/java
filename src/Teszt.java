
public class Teszt {

    
    public static void main (String[] args) {
        
        
        Kutya k1 = new Kutya("Bloki", 4 , "labrador");
        
        
        System.out.println(k1.getNev());
        k1.setNev("Mancs");
        System.out.println(k1.getNev());

        
        System.out.println(k1.getKor());
        // nem fogadja el, mert nincs az intervallumban.
        k1.setKor(-2);
        // ezt elfogadja
        k1.setKor(8);
        System.out.println(k1.getKor());

        
        System.out.println(k1.getFajta());
        k1.setFajta("Beagle");
        System.out.println(k1.getFajta());

        System.out.println(k1.toString());

        
        KeresoKutya k2 = new KeresoKutya("Rex", 10, "Nemet juhasz", 100);
        System.out.println(k2.toString());
        System.out.println("Keresesi hatekonysadga: " + k2.getKeresesiHatekonysag());
        
        

    }
}
