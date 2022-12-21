package clases;

public class Producto {

    private String Nombre;
    private int Precio;
    private String Marca;


    public Producto() {
    }

    public Producto(String nombre, int precio, String marca) {
        Nombre = nombre;
        Precio = precio;
        Marca = marca;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }
}
