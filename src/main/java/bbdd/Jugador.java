package bbdd;

public class Jugador {
    private int id;
    private String nombre;
    private int edad;
    private int equipoId;

    /**
 * Método toString.
 */
public Jugador() {}

    public Jugador(int id, String nombre, int edad, int equipoId) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.equipoId = equipoId;
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
     * Método getEdad.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * getEdad: Descripción general del método.
     */
    public int getEdad() { return edad; }
    /**
     * Método setEdad.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * setEdad: Descripción general del método.
 * @param edad Descripción del parámetro edad.
     */
    public void setEdad(int edad) { this.edad = edad; }
    /**
     * Método getEquipoId.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * getEquipoId: Descripción general del método.
     */
    public int getEquipoId() { return equipoId; }
    /**
     * Método setEquipoId.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * setEquipoId: Descripción general del método.
 * @param equipoId Descripción del parámetro equipoId.
     */
    public void setEquipoId(int equipoId) { this.equipoId = equipoId; }

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
        return id + ": " + nombre + " (" + edad + " años, equipo: " + equipoId + ")";
    }
}