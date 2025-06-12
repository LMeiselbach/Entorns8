package bbdd;

public class EquipoPersistente {
    private int id;
    private String nombre;
    private String ciudad;

    public EquipoPersistente() {}

    public EquipoPersistente(int id, String nombre, String ciudad) {
        this.id = id;
        setNombre(nombre);
        setCiudad(ciudad);
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
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }
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
    public void setCiudad(String ciudad) {
        if (ciudad == null || ciudad.trim().isEmpty()) {
            throw new IllegalArgumentException("La ciudad no puede estar vacía.");
        }
        this.ciudad = ciudad;
    }

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
