package bbdd;

import java.util.ArrayList;
import java.util.List;

public class GestionPartidos {
    private List<Partido> partidos;

    public GestionPartidos() {
        partidos = new ArrayList<>();
    }
    /**
     * Método get.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * get: Descripción general del método.
 * @param posicion Descripción del parámetro posicion.
     */
    public Partido get(int posicion) {
        if (posicion >= 0 && posicion < partidos.size()) {
            return partidos.get(posicion);
        }
        return null;
    }
    /**
     * Método getById.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * getById: Descripción general del método.
 * @param id Descripción del parámetro id.
     */
    public Partido getById(int id) {
        for (Partido p : partidos) {
            if (p.getId() == id) return p;
        }
        return null;
    }
    /**
     * Método add.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * add: Descripción general del método.
 * @param partido Descripción del parámetro partido.
     */
    public boolean add(Partido partido) {
        if (getById(partido.getId()) != null) return false;
        partidos.add(partido);
        return true;
    }
    /**
     * Método replace.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * replace: Descripción general del método.
 * @param partido Descripción del parámetro partido.
     */
    public boolean replace(Partido partido) {
        for (int i = 0; i < partidos.size(); i++) {
            if (partidos.get(i).getId() == partido.getId()) {
                partidos.set(i, partido);
                return true;
            }
        }
        return false;
    }
    /**
     * Método remove.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * remove: Descripción general del método.
 * @param partido Descripción del parámetro partido.
     */
    public boolean remove(Partido partido) {
        return partidos.remove(partido);
    }
    /**
     * Método remove.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * remove: Descripción general del método.
 * @param id Descripción del parámetro id.
     */
    public boolean remove(int id) {
        return partidos.removeIf(p -> p.getId() == id);
    }
    /**
     * Método getTodos.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * getTodos: Descripción general del método.
     */
    public List<Partido> getTodos() {
        return partidos;
    }
}
