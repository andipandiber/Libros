import java.util.Scanner;

public class Credito {

    private int credito;

    public Credito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }

    public double actualizarCredito(double credito){
        double debito=this.getCredito()-credito;

        if (debito <= 0.00) {
             return 0.00;
        }else{
            return debito;
        }
    }

    @Override
    public String toString() {
        return "Credito{" +
                "credito=" + credito +
                '}';
    }
}
