package bbdd;

public class Equipo {
    private int id;
    private String nombre;
    private String ciudad;

    public Equipo() {}

    public Equipo(int id, String nombre, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }
    /**
     * Método getId.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * getId: Descripción general del método.
     */
    public int getId() { return id; }
    /**
     * Método setId.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * setId: Descripción general del método.
 * @param id Descripción del parámetro id.
     */
    public void setId(int id) { this.id = id; }
    /**
     * Método getNombre.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * getNombre: Descripción general del método.
     */
    public String getNombre() { return nombre; }
    /**
     * Método setNombre.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * setNombre: Descripción general del método.
 * @param nombre Descripción del parámetro nombre.
     */
    public void setNombre(String nombre) { this.nombre = nombre; }
    /**
     * Método getCiudad.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * getCiudad: Descripción general del método.
     */
    public String getCiudad() { return ciudad; }
    /**
     * Método setCiudad.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * setCiudad: Descripción general del método.
 * @param ciudad Descripción del parámetro ciudad.
     */
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    @Override
    /**
     * Método toString.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * toString: Descripción general del método.
     */
    public String toString() {
        return id + ": " + nombre + " (" + ciudad + ")";
    }
}