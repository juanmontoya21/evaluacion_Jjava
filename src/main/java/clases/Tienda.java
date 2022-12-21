package clases;

import java.util.Scanner;

public class Tienda {

    private int cantidad;
    private final double IVA=0.19;

    public Tienda() {
    }

    public Tienda(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getIVA() {
        return IVA;
    }

    public double calcularProducto(){

        Producto producto =new Producto();

        Scanner entradaPorTeclado= new Scanner(System.in);

        System.out.println("Ingrese el nombre del producto: ");
        String nombre= entradaPorTeclado.nextLine();
        producto.setNombre(nombre);

        System.out.println("Ingrese la marca del producto: ");
        String marca= entradaPorTeclado.nextLine();
        producto.setMarca(marca);

        System.out.println("Ingrese la cantidad: ");
        int cantidad=entradaPorTeclado.nextInt();
        this.cantidad=cantidad;


        System.out.println("Ingrese el precio del producto: ");
        int precio= entradaPorTeclado.nextInt();
        producto.setPrecio(precio);

        double valorInicial= producto.getPrecio()*this.cantidad;
        double valorIVA= valorInicial*this.IVA;
        double valorNeto= valorInicial+valorIVA;

        return valorNeto;
    }
}
