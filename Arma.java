package personaggio;

/*** Author Kae ***/
public class Arma {
    private String Nome;
            Dado   Danno;
    private int    Critico;
    private int    Moltiplicatore;
    private int    Portata;
    private int    Costo;

    // -------------------- //

    public Arma (String nome, Dado danno, int critico, int moltiplicatore, int portata, int costo) {
        this.Nome           = nome;
        this.Danno          = danno;
        this.Critico        = critico;
        this.Moltiplicatore = moltiplicatore;
        this.Portata        = portata;
        this.Costo          = costo;
    }

    public Arma (Arma arma) {
        this.Danno          = arma.Danno;
        this.Critico        = arma.Critico;
        this.Moltiplicatore = arma.Moltiplicatore;
        this.Portata        = arma.Portata;
        this.Costo          = arma.Costo;
        this.Nome           = arma.Nome;
    }

    // PROPRIETÀ PUBBLICHE
    public String getNomeArma() {
        return Nome;
    }
    
    public void setNomeArma(String nome) {
        this.Nome = nome;
    }

    public Dado getDanno() {
        return Danno;
    }
    
    public void setDanno(Dado danno) {
        this.Danno = danno;
    }

    public int getCritico() {
        return Critico;
    }
    
    public void setCritico(int critico) {
        this.Critico = critico;
    }

    public int getMoltiplicatore() {
        return Moltiplicatore;
    }
    
    public void setMoltiplicatore(int moltiplicatore) {
        this.Moltiplicatore = moltiplicatore;
    }

    public int getPortata() {
        return Portata;
    }
    
    public void setPortata(int portata) {
        this.Portata = portata;
    }

    public int getCosto() {
        return Costo;
    }
    
    public void setCosto(int costo) {
        this.Costo = costo;
    }

    // -------------------

    public String ProfiloArma () {
        String r= Nome+": Danno "+Danno.getTipo()+"-"+Critico+"x"+Moltiplicatore+", portata: "+Portata+", prezzo: "+Costo;
        return r;
    }
    
    // Gestione danni
    public int Danni () {
        return Danno.roll();
    }
    
    public int DanniCritici () {
        int danni=0, volte;
        for (volte=0; volte < Moltiplicatore; volte++) {
            danni += Danno.roll();
        }
        return danni;
    }
    public int Dannominimo (int danno) {
        if (danno>1)
            return danno;
        else
            return 1;
    }

    // MAIN
    public static void main(String[] args) {
        // Set dei Dadi
        Dado d4  = new Dado(4);
        Dado d6  = new Dado(6);
        Dado d8  = new Dado(8);
        Dado d10 = new Dado(10);
        Dado d12 = new Dado(12);
        Dado d20 = new Dado(20);
            
        // armeria
        Arma Spada    = new Arma ("Spada",d6, 19, 2, 1, 20);
        Arma Martello = new Arma ("Martello",d8, 20, 3, 1, 30);
        Arma Pistola  = new Arma ("Pistola",d10, 18, 4, 45, 100);
        
        System.out.println(Spada.ProfiloArma());
        System.out.println(Martello.ProfiloArma());
        System.out.println(Pistola.ProfiloArma());
        
        System.out.println(Pistola.Danni());
        System.out.println(Pistola.DanniCritici());
    }
}