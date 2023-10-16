public class Calciatore extends Persona {
    private String ruolo;
    private int nMaglia;
    private int nGoal;

    public Calciatore (String ruolo, int nMaglia, int nGoal, //Attributi classe Calciatore
                       String nome, int annoNascita, String sesso){ //Attributi classe Persona.
        super(nome,annoNascita,sesso);
        this.ruolo = ruolo;
        this.nMaglia = nMaglia;
        this.nGoal = nGoal;
    }
    public String getRuolo(){
        return this.ruolo;
    }
    public int getnMaglia(){
        return this.nMaglia;
    }
    public int getnGoal(){
        return this.nGoal;
    }
    public void setRuolo(String newRuolo){
        this.ruolo = newRuolo;
    }
    public void setnGoal(int newNGoal){
        this.nGoal = newNGoal;
    }
    public Object clone(){
        //Cloniamo attributi della calsse Persona utilizzando metodo clone di Persona;
        //ATTENZIONE: Calciatore è anche una Persona (is a).
        Calciatore c1 = (Calciatore) super.clone();
        //Duplico/clono attributi di Calciatore.
        c1.ruolo = this.ruolo;
        c1.nMaglia = this.nMaglia;
        c1.nGoal = this.nGoal;
        return c1;
    }
    public String toString(){
        String rit = "";
        rit += super.toString();
        rit += "\nRuolo: " + this.ruolo;
        rit += "\nNumero maglia: " + this.nMaglia;
        rit += "\nNumero di goal: " + this.nGoal;
        rit += "}";
        return rit;
    }


}
