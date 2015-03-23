package personaggio;

/*** Author Kae ***/
public class Profilo {
    // caratteristiche
    public int Forza;
    public int Destrezza;
    public int Costituzione;
    public int Intelligenza;
    public int Saggezza;
    public int Carisma;
    
    // ----------------- //
    
    public Profilo (int Forza, int Destrezza, int Costituzione, int Intelligenza, int Saggezza, int Carisma) {
        this.Forza        = Forza;
        this.Destrezza    = Destrezza;
        this.Costituzione = Costituzione;
        this.Intelligenza = Intelligenza;
        this.Saggezza     = Saggezza;
        this.Carisma      = Carisma;
    }
    
    // costruttore di copia
    public Profilo (Profilo profilo) {
        this.Forza        = profilo.Forza;
        this.Destrezza    = profilo.Destrezza;
        this.Costituzione = profilo.Costituzione;
        this.Intelligenza = profilo.Intelligenza;
        this.Saggezza     = profilo.Saggezza;
        this.Carisma      = profilo.Carisma;
    }
     
    // PROPRIETÀ PUBBLICHE
    public int getForza() {
        return Forza;
    }
    public void setForza(int forza) {
        this.Forza = forza;
    }
    public void addForza(int bonus) {
        this.Forza = Forza+bonus;
    }
    
    public int getDestrezza() {
        return Destrezza;
    }
    public void setDestrezza(int destrezza) {
        this.Destrezza = destrezza;
    }
    public void addDestrezza(int bonus) {
        this.Destrezza = (Destrezza+bonus);
    }

    public int getCostituzione() {
        return Costituzione;
    }
    public void setCostituzione(int costituzione) {
        this.Costituzione = costituzione;
    }
    public void addCostituzione(int bonus) {
        this.Costituzione = (Costituzione+bonus);
    }

    public int getIntelligenza() {
        return Intelligenza;
    }
    public void setIntelligenza(int intelligenza) {
        this.Intelligenza = intelligenza;
    }
    public void addIntelligenza(int bonus) {
        this.Intelligenza = Intelligenza+bonus;
    }

    public int getSaggezza() {
        return Saggezza;
    }
    public void setSaggezza(int saggezza) {
        this.Saggezza = saggezza;
    }
    public void addSaggezza(int bonus) {
        this.Saggezza = Saggezza+bonus;
    }

    public int getCarisma() {
        return Carisma;
    }
    public void setCarisma(int carisma) {
        this.Carisma = carisma;
    }
    public void addCarisma(int bonus) {
        this.Carisma = Carisma+bonus;
    }
     
    public int Bonus (int x) {
        int bonus;
        if (x>9)
            bonus=(x-10)/2;
        else
            bonus=(x-11)/2;
        return bonus;
    }

    // la scheda del personaggio
    public String StampaProfilo () {
        String r
            = "------------\n"
            + "| FOR "+Forza+" "+Bonus(Forza)+" |\n"
            + "| DES "+Destrezza+" "+Bonus (Destrezza)+" |\n"
            + "| COS "+Costituzione+" "+Bonus (Costituzione)+" |\n"
            + "| INT "+Intelligenza+" "+Bonus (Intelligenza)+" |\n"
            + "| SAG "+Saggezza+" "+Bonus (Saggezza)+" |\n"
            + "| CAR "+Carisma+" "+Bonus (Carisma)+" |\n"
            + "------------"
        ;
        return r;
    }
        
    public static void main(String[] args) {
        Profilo PNG1       = new Profilo (15, 13, 12, 10, 9, 8);
        Profilo Paralitico = new Profilo (10, 9, 8, 7, 6, 5);
        System.out.println(PNG1.StampaProfilo());
        System.out.println(Paralitico.StampaProfilo());
        Paralitico.addForza(4);
        System.out.println(Paralitico.StampaProfilo());
    }
}