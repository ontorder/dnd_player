package personaggio;

/*** Author Kae ***/
public class Armatura {
    private String Nome;
    private int    ValoreArmatura;
    private int    MaxDestrzza;
    private int    Penalita;
    
    // ------------------------ //
    
    public Armatura (String nome, int valore, int maxd, int pen) {
        this.Nome           = nome;
        this.ValoreArmatura = valore;
        this.MaxDestrzza    = maxd;
        this.Penalita       = pen;
    }
    
    // -------------------
    
    // PROPRIETÃ€ PUBBLICHE
    public String getNomeArmatura() {
        return Nome;
    }
    public void setNomeArmatura(String nome) {
        this.Nome = nome;
    }

    public int getValoreArmatura() {
        return ValoreArmatura;
    }
    public void setValoreArmatura(int valore) {
        this.ValoreArmatura = valore;
    }

    public int getMaxDestrzza() {
        return MaxDestrzza;
    }
    public void setMaxDestrzza(int maxd) {
        this.MaxDestrzza = maxd;
    }

    public int getPenalita() {
        return Penalita;
    }
    public void setPenalita(int pen) {
        this.Penalita = pen;
    }
    
    // -------------------------

    public String ProfiloArmatura () {
        return Nome+": Bonus +"+ValoreArmatura+" - Bonus DES massima +"+MaxDestrzza+" - Penalità di Armatura alla Prova -"+Penalita;
    }

    // MAIN
    public static void main(String[] args) {
        Armatura Leggera = new Armatura ("Leggera", 2, 4, 1);
        Armatura Media   = new Armatura ("Media", 4, 3, 2);
        Armatura Pesante = new Armatura ("Pesante", 8, 0, 4);
        
        System.out.println(Leggera.ProfiloArmatura());
        System.out.println(Media.ProfiloArmatura());
        System.out.println(Pesante.ProfiloArmatura());
        
        System.out.println(Pesante.getValoreArmatura());
    }
}