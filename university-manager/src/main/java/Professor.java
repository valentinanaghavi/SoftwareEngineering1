public class Professor extends Person
{
    protected String persNr_;

    public Professor(String vorname, String nachname, String persNr)
    {
        super(vorname, nachname);
        this.persNr_ = persNr;
    }

    public void setPersNr(String persNr)
    {
        persNr_ = persNr;
    }

    public String getPersNr()
    {
        return persNr_;
    }

}