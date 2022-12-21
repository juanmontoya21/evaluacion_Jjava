package clases;

import java.util.Scanner;

public class Biblioteca {

    private String nombreLibro;
    private String codigo;
    private int numeroDePaginas;
    private int numeroDeEjemplares;
    private String autor;

    public Biblioteca() {
    }

    public Biblioteca(String nombreLibro, String codigo, int numeroDePaginas, int numeroDeEjemplares, String autor) {
        this.nombreLibro = nombreLibro;
        this.codigo = codigo;
        this.numeroDePaginas = numeroDePaginas;
        this.numeroDeEjemplares = numeroDeEjemplares;
        this.autor = autor;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getNumeroDeEjemplares() {
        return numeroDeEjemplares;
    }

    public void setNumeroDeEjemplares(int numeroDeEjemplares) {
        this.numeroDeEjemplares = numeroDeEjemplares;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int ingresar(){

        Scanner leaTeclado=new Scanner(System.in);

        System.out.println("Ingrese nombre del libro: ");
        this.nombreLibro=leaTeclado.nextLine();

        System.out.println("ingresar codigo del libro: ");
        this.codigo=leaTeclado.nextLine();

        System.out.println("ingrese el numero de paginas: ");
        this.numeroDePaginas=leaTeclado.nextInt();

        System.out.println("ingrese el nombre del autor: ");
        this.autor=leaTeclado.next();

        System.out.println("ingrese numero de ejemplares: ");
        this.numeroDeEjemplares=leaTeclado.nextInt();

        return 0;
    }

    public int consultar(){
        System.out.println("nombre del libro es: "+ getNombreLibro());
        System.out.println("el codigo es: "+ getCodigo());
        System.out.println("el numero de paginas es "+ getNumeroDePaginas());
        System.out.println("el nombre del autor es: "+ getAutor());
        System.out.println("el numero de ejemplares es: "+ getNumeroDeEjemplares());

        return 0;
    }

    public int modifica(){
        int observador1=100;
        Scanner entradaTecclado=new Scanner(System.in);
        System.out.println("desea cambiar el numero de ejemplares del libro?");
        System.out.println("6. si");
        System.out.println("7. no");
        System.out.println("8. salir");
        while(observador1!=8){
            System.out.println("digite una opcion: ");
            observador1=entradaTecclado.nextInt();
            if(observador1==6){
                System.out.println("ingrese la nueva cantidad de ejemplares: ");
                setNumeroDeEjemplares(entradaTecclado.nextInt());
                System.out.println("la nueva cantidad de ejemplar es: "+ getNumeroDeEjemplares());
            } else if (observador1==7) {
                System.out.println("nombre del libro es: "+ getNombreLibro());
                System.out.println("el codigo es: "+ getCodigo());
                System.out.println("el numero de paginas es "+ getNumeroDePaginas());
                System.out.println("el nombre del autor es: "+ getAutor());
                System.out.println("el numero de ejemplares es: "+ getNumeroDeEjemplares());
            } else if (observador1==8) {
                System.out.println("salio");
                break;
            }else {
                System.out.println("la opcion digitada es incorrecta");
            }
        }
        return 0;
    }
}
