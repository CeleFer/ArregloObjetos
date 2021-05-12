package datos;

public class Trabajadores {

    private String nombre;
    private String apellido; 
    private double sueldo;

    //metodo constructor
    public Trabajadores(){
        this.nombre   = "";
        this.apellido = "";
    }

    // Metodos
    public String getNA(){
        return nombre+" \t "+apellido+" \t "+sueldo; 
    }

    public void setNA( String nombre, String apellido ){
        this.nombre   = nombre;
        this.apellido = apellido;
    }

    //Nombre
    public void setNombre(String nombre){
        this.nombre = nombre; 
    }

    public String getNombre(){
        return nombre;
    }
    
    //Apellido
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getApellido(){
        return apellido;
    }

    // Sueldo
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    public double getSueldo(){
        return sueldo;
    }

}
