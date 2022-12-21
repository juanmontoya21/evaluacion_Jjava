package clases;

public class Empleado {

    private String identificacion;
    private String nombre;
    private int salario;
    private int numeroVentasMensuales;
    private int valorComision;
    private double deducciones;


    public Empleado() {
    }

    public Empleado(String identificacion, String nombre, int salario, int numeroVentasMensuales, int valorComision, double deducciones) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.salario = salario;
        this.numeroVentasMensuales = numeroVentasMensuales;
        this.valorComision = valorComision;
        this.deducciones = deducciones;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getNumeroVentasMensuales() {
        return numeroVentasMensuales;
    }

    public void setNumeroVentasMensuales(int numeroVentasMensuales) {
        this.numeroVentasMensuales = numeroVentasMensuales;
    }

    public int getValorComision() {
        return valorComision;
    }

    public void setValorComision(int valorComision) {
        this.valorComision = valorComision;
    }

    public double getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(double deducciones) {
        this.deducciones = deducciones;
    }

    public double calcularSalario(){

        int salarioVentas= this.numeroVentasMensuales* this.valorComision;
        int salarioTotal= salarioVentas + this.salario;
        double salarioDeducido= salarioTotal * this.deducciones;
        double salarioNeto = salarioTotal-salarioDeducido;

        return salarioNeto;
    }







}
