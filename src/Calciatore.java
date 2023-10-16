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
