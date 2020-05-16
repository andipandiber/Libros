import java.util.ArrayList;
import java.util.List;

public class Compra {

    private int Id;
    private List impresoList;
    private List digitalList;
    private List creditoList;

    public Compra(int id) {
        this.Id=id;
        this.digitalList=new ArrayList<Digital>();
        this.impresoList=new ArrayList<Impreso>();
        this.creditoList=new ArrayList<Credito>();
    }

    public int getId() {
        return Id;
    }

    public Credito crearCredito(int i){
     Credito c=new Credito(i);
     this.getCreditoList().add(c);
        return c;
    }

    public double totalDigital(){
        double preTotal=0.00;
        for (int i = 0; i < this.getDigitalList().size() ; i++) {
            Digital dig= (Digital) this.getDigitalList().get(i);
            preTotal += dig.precioFinal();
        }
        return preTotal;
    }

    public double totalImpreso(){
        double preTotal=0.00;
        for (int i = 0; i < this.getImpresoList().size() ; i++) {
            Impreso dig= (Impreso) this.getImpresoList().get(i);
            preTotal += dig.precioFinal();
        }
        return preTotal;
    }

    public double total(){
        return totalDigital()+totalImpreso();
    }

    public void agregarImp(Impreso i){
        this.getImpresoList().add(i);
    }

    public void agregarDig(Digital d){
        this.getDigitalList().add(d);
    }

    public List getImpresoList() {
        return impresoList;
    }

    public void setImpresoList(List impresoList) {
        this.impresoList = impresoList;
    }

    public List getDigitalList() {
        return digitalList;
    }

    public void setDigitalList(List digitalList) {
        this.digitalList = digitalList;
    }

    public List getCreditoList() {
        return creditoList;
    }

    public void setCreditoList(List creditoList) {
        this.creditoList = creditoList;
    }

    @Override
    public String toString() {
        return "Compra \n" +
                "Id=" + Id +
                "\n Libros Impresos " + impresoList +
                "\n Libros Digitales " + digitalList +
                "Creditos "+creditoList
                ;
    }
}
