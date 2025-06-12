package bbdd;

public class Partido {
    private int id;
    private int equipoLocal;
    private int equipoVisitante;
    private String fecha;

    public Partido() {}

    public Partido(int id, int equipoLocal, int equipoVisitante, String fecha) {
        this.id = id;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.fecha = fecha;
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
     * Método getEquipoLocal.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * getEquipoLocal: Descripción general del método.
     */
    public int getEquipoLocal() { return equipoLocal; }
    /**
     * Método setEquipoLocal.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * setEquipoLocal: Descripción general del método.
 * @param equipoLocal Descripción del parámetro equipoLocal.
     */
    public void setEquipoLocal(int equipoLocal) { this.equipoLocal = equipoLocal; }
    /**
     * Método getEquipoVisitante.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * getEquipoVisitante: Descripción general del método.
     */
    public int getEquipoVisitante() { return equipoVisitante; }
    /**
     * Método setEquipoVisitante.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * setEquipoVisitante: Descripción general del método.
 * @param equipoVisitante Descripción del parámetro equipoVisitante.
     */
    public void setEquipoVisitante(int equipoVisitante) { this.equipoVisitante = equipoVisitante; }
    /**
     * Método getFecha.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * getFecha: Descripción general del método.
     */
    public String getFecha() { return fecha; }
    /**
     * Método setFecha.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * setFecha: Descripción general del método.
 * @param fecha Descripción del parámetro fecha.
     */
    public void setFecha(String fecha) { this.fecha = fecha; }

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
        return id + ": " + equipoLocal + " vs " + equipoVisitante + " en " + fecha;
    }
}