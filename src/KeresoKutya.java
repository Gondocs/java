// ÖRÖKLŐDÉS, az extends-et használjuk az öröklődéshez, a javaban egy öröklés van, nincs többszörös öröklődés
public class KeresoKutya extends Kutya {
    
    
    private int keresesiHatekonysag;
// konstruktor
    public KeresoKutya(String nev, int kor, String fajta, int keresesiHatekonysag) {
        
        // this.nev = nev; nem működik, mert az ősosztályban private
        
        // ez már igen, kiterjesztem az eredeti osztályt és felruházom új műveletekkel.
        super(nev, kor, fajta);
        this.keresesiHatekonysag = keresesiHatekonysag;
        
    }

    public int getKeresesiHatekonysag() {
        return keresesiHatekonysag;
    }
        
}
