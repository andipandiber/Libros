import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private int id;
    private String cedula;
    private String nombres;
    private int credito;
    private String direccion;
    private List<Compra> comprasList;

    public Usuario() {
    }

    public Usuario(int id, String cedula, String nombres, String direccion) {
        this.id = id;
        this.cedula = cedula;
        this.nombres = nombres;
        this.credito = credito;
        this.direccion = direccion;
        this.comprasList=new ArrayList<Compra>();
    }

    public Compra nuevaCompra(int identi){
        Compra c=new Compra(identi);
        this.getComprasList().add(c);
        return c;
    }

    public List<Compra> getComprasList() {
        return comprasList;
    }

    public void setComprasList(List<Compra> comprasList) {
        this.comprasList = comprasList;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}
