enum DesignerType {

    INTERIOR,
    EXTERIOR,
    FASHION,
    WEB,
    GRAPHIC,
    INTERFACE,
    INDUSTRIAL,
    OTHER
}

public class Designer extends Person{

    DesignerType designerType;

    public Designer(int id, String name)
    {
        super(id,name);
    }

}
