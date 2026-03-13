enum CodingLanguage{
    JAVA,
    C,
    PYTHON,
    PHP,
    JAVASCRIPT,
    PASCAL,
    HASKELL
}

public class Programmer extends Person{

    CodingLanguage prefferedCodingLanguage;

    public Programmer(int id, String name)
    {
        super(id,name);
    }

}