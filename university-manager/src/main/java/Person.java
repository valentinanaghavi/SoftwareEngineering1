public class Person 
{

    protected String vorname_;
    protected String nachname_;

    public Person(String vorname , String nachname)
    {
        this.vorname_ = vorname ;
        this.nachname_ = nachname ;
    }

    public void setVorname(String vorname)
    {
        vorname_ = vorname;
    }

    public void setNachname(String nachname)
    {
        nachname_ = nachname;
    }

    public String getVorname()
    {
        return vorname_;
    }

    public String getNachname()
    {
        return nachname_;
    }
}