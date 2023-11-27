import java.util.Scanner;

public class Tecnologia extends Producto{

    private String Fabricante;
    private int vidaUtil;

    public Tecnologia(String nombre, double precio, String codigo, int cantidad, String marca, String fabricante, int vidaUtil) {
        super(nombre, precio, codigo, cantidad, marca);
        Fabricante = fabricante;
        this.vidaUtil = vidaUtil;
    }

    public Tecnologia(){

    }

    @Override
    public void ingresarProducto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto: ");
        this.nombre=sc.next();
        System.out.println("Ingrese el precio del producto: ");
        this.precio=sc.nextDouble();
        System.out.println("Ingrese marca del producto");
        this.marca=sc.next();
        System.out.println("Ingrese el nombre del fabricante: ");
        this.Fabricante=sc.next();
        System.out.println("Ingrese la vida util del producto en años: ");
        this.vidaUtil=sc.nextInt();
    }

    public double intervaloMantenimiento(){
        double intervalo = vidaUtil/1.5;
        return intervalo;
    }

    @Override
    public String toString(){
        return "La tecnologia "+this.nombre+ "del fabricante "+this.Fabricante+" es de marca "+this.marca+
                ". Cuesta "+this.precio+ " y el mantenimiento de acuerdo a su vida util es "+intervaloMantenimiento();
    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String fabricante) {
        Fabricante = fabricante;
    }

    public int getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(int vidaUtil) {
        this.vidaUtil = vidaUtil;
    }
}