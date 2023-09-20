// ÖRÖKLŐDÉS, az extends-et használjuk az öröklődéshez, a javaban egy öröklés van, nincs többszörös öröklődés
public class KeresoKutya extends Kutya {
    
    
    private int keresesiHatekonysag;
// konstruktor
    public KeresoKutya(String nev, int kor, String fajta, int keresesiHatekonysag) {
        
        // this.nev = nev; nem működik, mert az ősosztályban private
        
        // ez már igen, kiterjesztem az eredeti osztályt és felruházom új műveletekkel.
        // super = eredeti latinul
        super(nev, kor, fajta);
        this.keresesiHatekonysag = keresesiHatekonysag;
        
    }

    public int getKeresesiHatekonysag() {
        return keresesiHatekonysag;
    }

    // superrel elérem az ősműveletet, majd kiegészítem.
    public String toString() {
        return super.toString()
                + "\n Keresesi hatekonysaga: " + keresesiHatekonysag + "%";
    }
    
    
        // HÁZI:: a keresőkutyát származtassuk tovább, legyen az új neve: árvízkeresőkutya, legyen egy int max vízmélység.
}
