import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {


        Scanner read=new Scanner(System.in);
        Libro l1=new Impreso("Gabriel Garcia Marquez","Amor en Tiempos de Colera","10",12);
        Libro l2=new Digital("Julio Cortazar","Rayuela","9",14);
        Libro l3=new Impreso("Platon","El Banquete","20",20);
        Libro l4=new Digital("Maquiavelo","El Principe","11",15);

        Usuario u1=new Usuario(1,"0150384980","Juan Andres Bermeo","Sangurima");
        System.out.println("Ingrese un Credito");
        int cred=read.nextInt();
        u1.setCredito(cred);

        Compra n=u1.nuevaCompra(1);
        Credito c=n.crearCredito(u1.getCredito());
        System.out.println(c.actualizarCredito(n.total()));
        n.agregarImp((Impreso) l1);
        n.agregarImp((Impreso) l3);
        n.agregarDig((Digital) l2);
        n.agregarDig((Digital) l4);

        if (c.actualizarCredito(n.total()) == 0) {
            System.out.println("Ingrese un Credito");
            int cred1=read.nextInt();
            u1.setCredito(cred1);
            Credito c1=n.crearCredito(u1.getCredito());
            System.out.println("Cedula: "+u1.getCedula()+" Nombres: "+u1.getNombres()+" Credito: "+u1.getCredito()+"\n"+u1.getComprasList()+"\n");
            System.out.println("Total: "+n.total());
            System.out.println("Credito: "+c.actualizarCredito(n.total())+"\n");
        }else {
            System.out.println("Cedula: "+u1.getCedula()+" Nombres: "+u1.getNombres()+" Credito: "+u1.getCredito()+"\n"+u1.getComprasList()+"\n");
            System.out.println("Total: "+n.total());
            System.out.println("Credito: "+c.actualizarCredito(n.total())+"\n");
        }
        
    }
}
