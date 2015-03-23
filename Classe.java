package personaggio;

/*** Author Kae ***/
public class Classe {
    String Nome;
    //saves --- V 1; M 2/3?; L 1/2
    String ModAttacco;
    Dado   DadoVita;
    //saves --- B 1/3; A 2+1/2
    String Tempra;
    String Riflessi;
    String Volonta;
    
    public Classe (String nome, String bab, Dado dv, String tempra, String riflessi, String volonta) {
        this.Nome       = nome;
        this.ModAttacco = bab;
        this.DadoVita   = dv;
        this.Tempra     = tempra;
        this.Riflessi   = riflessi;
        this.Volonta    = volonta;
    }

    // PROPRIETÀ PUBBLICHE
    public String getNomeClasse() {
        return Nome;
    }
    public void setNomeClasse(String nome) {
        this.Nome = nome;
    }

    public String getModAttacco() {
        return ModAttacco;
    }
    public int getModAttacco(int livello) {
        int BAB;
        if (ModAttacco == "V") BAB = livello; // bonus di attacco
        else if (ModAttacco == "M"){
            if (livello < 5)BAB= livello-1;
            else if (livello >4 && livello <9 )  BAB= livello-2;
            else if (livello >8 && livello <13 ) BAB= livello-3;
            else if (livello >12 && livello <17 )BAB= livello-4;
            else  BAB= livello-5;
        }else
            BAB= livello/2;
        return BAB;
    }
    public void setModAttacco(String bab) {
        this.ModAttacco = bab;
    }

    public Dado getDadoVita() {
        return DadoVita;
    }
    public void setDadoVita(Dado dv) {
        this.DadoVita = dv;
    }

    public String getTempra() {
        return Tempra;
    }
    public int getTempra(int livello) {
        int tempra;
        if (Tempra != "A")
            tempra= livello/3; // tempra
        else
            tempra= 2+(livello/2);
        return tempra;
    }
    public void setTempra(String t) {
        this.Tempra = t;
    }

    public String getRiflessi() {
        return Riflessi;
    }
    public int getRiflessi(int livello) {
        int riflessi;
        if (Riflessi != "A")
            riflessi= livello/3; // riflessi
        else
            riflessi= 2+(livello/2);
        return riflessi;
    }
    public void setRiflessi(String r) {
        this.Riflessi = r;
    }

    public String getVolonta() {
        return Volonta;
    }
    public int getVolonta(int livello) {
        int volonta;
        if (Volonta != "A")
            volonta = livello/3; // volontà
        else
            volonta= 2+(livello/2);
        return volonta;
    }
    public void setVolonta(String v) {
        this.Volonta = v;
    }

    public String StampaClasse () {
        int livello, tempra, riflessi, volonta, BAB;
        String s="Classe: "+Nome+" Dado Vita "+DadoVita.getTipo()+"\n";
        
        for (livello = 1; livello < 21; livello++) {
            BAB = getModAttacco(livello);
            if (Tempra != "A") {tempra= livello/3;} // tempra
            else {tempra= 2+(livello/2);}
            if (Riflessi != "A") {riflessi= livello/3;} // riflessi
            else {riflessi= 2+(livello/2);}
            if (Volonta != "A") {volonta = livello/3;} // volontà
            else {volonta = 2+(livello/2);}
            s = s+"BAB "+BAB+" - T-> "+tempra+" R-> "+riflessi+" V-> "+volonta+"\n";
        }
        return s;
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

        Classe class1 = new Classe ("Guerriero", "V", d10, "A", "B", "B");
        Classe class2 = new Classe ("Barbaro", "V", d12, "A", "B", "B");
        Classe class3 = new Classe ("Mago", "L", d6, "B", "B", "A");
        Classe class4 = new Classe ("Ladro", "M", d6, "B", "A", "B");
        
        System.out.println(class1.StampaClasse());
        System.out.println(class2.StampaClasse());
        System.out.println(class3.StampaClasse());
        System.out.println(class4.StampaClasse());
    }
}