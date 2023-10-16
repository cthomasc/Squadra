public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Thomas",2006,"Maschio");
        System.out.println(p.toString());
        p.getNome();
        p.getAnnoNascita();
        p.getSesso();
        p.setSesso("Trans");

        System.out.println("***********************");
        Persona p2 = (Persona) p.clone();
        System.out.println(p2.toString());
        System.out.println("***********************");

        Calciatore c = new Calciatore("Ala destra",7,12,"Thomas",2006,"Maschio");
        c.getRuolo();
        c.getnMaglia();
        c.getnGoal();
        c.setRuolo("Ala sinistra");
        c.setnGoal(15);
        System.out.println(c.toString());

    }
}