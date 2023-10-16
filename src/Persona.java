public class Persona {
    private String nome;
    private int annoNascita;
    private String sesso;

    public Persona (String nome, int annoNascita, String sesso){
        this.nome = nome;
        this.annoNascita = annoNascita;
        this.sesso = sesso;
    }
    public String toString(){
        String rit = "";
        rit += "Nome: " + this.nome;
        rit+= "\nAnno di nascita: " + this.annoNascita;
        rit += "\nGenere: " + this.sesso;
        return rit;
    }

}
