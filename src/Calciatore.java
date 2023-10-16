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


}
