public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Thomas",2006,"Maschio");
        System.out.println(p.toString());
        p.getNome();
        p.getAnnoNascita();
        p.getSesso();
        p.setSesso("Trans");
        p.clone();
    }
}