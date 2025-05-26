package bloque5_6.Punto_deVenta;
import java.io.Serializable;
import java.util.Random;
public class Producto implements Serializable{
    private String cve_prod, descripcion;
    private int inventario;
    private float costo, precio_vta;
    static Random random = new Random();

    public Producto(String descripcion, int inventario, float costo, float precio_vta){
        this.cve_prod = String.valueOf(random.nextInt(100000-999999));
        this.descripcion = descripcion;
        this.inventario = inventario;
        this.costo = costo;
        this.precio_vta = precio_vta;
    }

    public String getCve_prod() {
        return cve_prod;
    }

}
