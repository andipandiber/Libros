public class Digital extends Libro {

    private String autor;
    private String titulo;
    private String ediccion;
    private double precio;

    public Digital(String autor, String titulo, String ediccion, double precio) {
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
        //return String.valueOf(this.precioFinal());
        return  " Autor='" + autor + '\'' +
                ", Titulo='" + titulo + '\'' +
                ", Precio ='" + precio + '\'' +
                ", Precio Final=" + this.precioFinal() + "\n";
    }


    @Override
    public double precioFinal() {
        double precioDigital= getPrecio()+calculaComision()+calculaEnvio();
        return precioDigital;
    }

    @Override
    double calculaComision() {
        return 1;
    }

    @Override
    double calculaEnvio() {
        return 0;
    }
}
