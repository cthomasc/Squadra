public class Persona {
    private String nome;
    private int annoNascita;
    private String sesso;
    private int nScarpe;

    public Persona (String nome, int annoNascita, String sesso, int nScarpe){
        this.nome = nome;
        this.annoNascita = annoNascita;
        this.sesso = sesso;
        this.nScarpe = nScarpe;
    }
    public Persona (Persona persona){
        this.nome = persona.nome;
        this.annoNascita = persona.annoNascita;
        this.sesso = persona.sesso;
    }
    public String getNome(){
        return this.nome;
    }
    public int getAnnoNascita(){
        return this.annoNascita;
    }
    public String getSesso(){
        return this.sesso;
    }
    public void setSesso(String newSesso){
        this.sesso = newSesso;
    }
    public int getnScarpe(){
        return this.nScarpe;
    }
    public Object clone(){
        return new Persona(this.nome,this.annoNascita,this.sesso,this.nScarpe);
    }
    public String toString(){
        String rit = "{";
        rit += "Nome: " + this.nome;
        rit+= "\nAnno di nascita: " + this.annoNascita;
        rit += "\nGenere: " + this.sesso;
        rit += "}";
        return rit;
    }

}
