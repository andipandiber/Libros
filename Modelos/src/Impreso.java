public class Impreso extends Libro {

    private String autor;
    private String titulo;
    private String ediccion;
    private double precio;

    public Impreso(String autor, String titulo, String ediccion, double precio) {
        this.autor = autor;
        this.titulo = titulo;
        this.ediccion = ediccion;
        this.precio = precio;
    }


    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return  " Autor: " + autor + '\'' +
                ", Titulo: " + titulo + '\'' +
                ", Precio =" + precio + '\'' +
                ", Precio Final =" + this.precioFinal() + "\n";
    }

    @Override
    public double precioFinal() {
        double precioImpreso = getPrecio()+calculaComision()+calculaEnvio();
        return precioImpreso;
    }

    @Override
    double calculaComision() {
        double comision=(getPrecio()*2)/100;
        return comision;
    }

    @Override
    double calculaEnvio() {
        return 20.00;
    }
}
