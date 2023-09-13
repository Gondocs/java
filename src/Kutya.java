public class Kutya {
    
    private String nev;
    private int kor;
    private String fajta;

    
    // Kutya konstruktor (Neve csak ugyanaz lehet, mint a classnak)
    public Kutya(String nev, int kor, String fajta) {
        this.nev = nev;
        this.kor = kor;
        this.fajta = fajta;
    }

    // getter
    public int getKor() {
        return kor;
    }
    // setter, a kutya korát beállítja a megadott értékre, ha megfelel a feltételnek
    public void setKor(int kor) {
        if (kor > 0 && kor < 15) {
            this.kor = kor;
        } 
        else {
            System.err.println(" SetKor, intervallumon kivuli ertek: " + kor + "\n Az ertek keruljon a [0, 15] intervallumba.");
        }

    }
    
    // név getter
    public String getNev() {
        return nev;
    }
    // név setter
    public void setNev(String nev) {
        this.nev = nev;
    }
    
    // fajta getter
    public String getFajta() {
        return fajta;
    }

    // fajta setter
    public void setFajta(String fajta) {
        this.fajta = fajta;
    }
    
    // toString a kiíráshoz
    public String toString() {
        return "Kutya neve: " + this.nev + "\n"
                + " eletkora: " + this.kor + "\n"
                + " fajtaja: " + this.fajta;
    }
    
}
