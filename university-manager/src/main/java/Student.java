public class Student extends Person
{
    protected String mtrNr_;

    public Student(String vorname, String nachname, String mtrNr)
    {
        super(vorname, nachname);
        this.mtrNr_ = mtrNr;
    }
    
    public void setMtrNr(String mtrNr)
    {
        mtrNr_ = mtrNr;
    }

    public String getMtrNr()
    {
        return mtrNr_;
    }

}