public class Visitante {
    private String nombre;
    private String apellido;
    private int numeroDeIdentidad;

    public Visitante(String nombre, String apellido, int numeroDeIdentidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDeIdentidad = numeroDeIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroDeIdentidad() {
        return numeroDeIdentidad;
    }

    public void setNumeroDeIdentidad(int numeroDeIdentidad) {
        this.numeroDeIdentidad = numeroDeIdentidad;
    }
}