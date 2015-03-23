package personaggio;
import static java.lang.Math.*;

/*** Author Kae ***/

public class MASTER {
    private String Nome;

    // ------------- //
    
    public MASTER (String nome) {
        this.Nome = nome;
    }

    // -------------------

    // tira 4d6 e scarta il più basso
    public int ValoreProfilo () {
        int risultato, a, b, c, d, x, y, z;
        a = (int)(Math.random() * 6) + 1;
        b = (int)(Math.random() * 6) + 1;
        c = (int)(Math.random() * 6) + 1;
        d = (int)(Math.random() * 6) + 1;
        
        // il più piccolo tra i dadi
        z=min(min(a,b),min(c,d));
        
        risultato=a+b+c+d-z;
        return risultato;
    }
    // assegna valori casuali ad un profilo
    public Profilo RandomizzaProfilo (Profilo profilo) {
        profilo.setForza(ValoreProfilo ());
        profilo.setDestrezza(ValoreProfilo ());
        profilo.setCostituzione(ValoreProfilo ());
        profilo.setIntelligenza(ValoreProfilo ());
        profilo.setSaggezza(ValoreProfilo ());
        profilo.setCarisma(ValoreProfilo ());
        
        return profilo;
    }

    public String StampaScheda (Personaggio personaggio) {
        return personaggio.StampaScheda();
    }

    //crea un nuovo personaggio base dai con gli stessi valori iniziali del primo
    public Personaggio ClonaPersonaggio (Personaggio personaggio) {
        return new Personaggio ("clone di "+personaggio.getNome(), personaggio.getClasse(), personaggio.getLivello(), personaggio.getProfilo());
    }

    public static void main(String[] args) {
        MASTER Kae = new MASTER ("Kae");

        // Set dei Dadi
        Dado d4  = new Dado(4);
        Dado d6  = new Dado(6);
        Dado d8  = new Dado(8);
        Dado d10 = new Dado(10);
        Dado d12 = new Dado(12);
        Dado d20 = new Dado(20);

        // Classi
        Classe class1 = new Classe ("Guerriero", "V", d10, "A", "B", "B");

        // Profili
        Profilo Pro1 = new Profilo (15, 13, 12, 10, 9, 8);
        Profilo Pro2 = new Profilo (13, 15, 10, 9, 12, 8);

        // Armature
        Armatura Leggera = new Armatura ("Leggera", 2, 4, 1);
        Armatura Media   = new Armatura ("Media", 4, 3, 2);
        Armatura Pesante = new Armatura ("Pesante", 8, 0, 4);

        //Armi
        Arma Spada    = new Arma ("Spada",d6, 19, 2, 1, 20);
        Arma Martello = new Arma ("Martello",d8, 20, 3, 1, 30);
        Arma Pistola  = new Arma ("Pistola",d10, 18, 4, 45, 100);

        // PERSONAGGI
        Personaggio PNG1  = new Personaggio ("PNG1", class1, 4, Pro1);
        Personaggio PNG1b = null;

        System.out.println(PNG1.StampaScheda());
        PNG1b = Kae.ClonaPersonaggio(PNG1);
        System.out.println(PNG1b.StampaScheda());
    }
}