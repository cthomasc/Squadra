public class Persona {
    private String nome;
    private int annoNascita;
    private String sesso;

    public Persona (String nome, int annoNascita, String sesso){
        this.nome = nome;
        this.annoNascita = annoNascita;
        this.sesso = sesso;
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
    public String toString(){
        String rit = "{";
        rit += "Nome: " + this.nome;
        rit+= "\nAnno di nascita: " + this.annoNascita;
        rit += "\nGenere: " + this.sesso;
        rit += "}";
        return rit;
    }

}
