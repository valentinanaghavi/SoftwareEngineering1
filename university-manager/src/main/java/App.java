public class App {

    public static void main(String[] args) 
    {
        Professor p1 = new Professor("Peter", "Petersson","111");
        Student p2 = new Student("Findus", "Findling","118354");

        System.out.println(p1.getVorname() + " "+ p1.getNachname() +  ", " + p1.getPersNr());
        System.out.println(p2.getVorname() + " "+ p2.getNachname() + ", " + p2.getMtrNr());

    }
}
