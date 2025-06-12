package bbdd;

import java.util.ArrayList;
import java.util.List;

public class GestionJugadorPersistente {
    private List<JugadorPersistente> jugadores;

    public GestionJugadorPersistente() {
        jugadores = new ArrayList<>();
    }
    /**
     * Método add.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * add: Descripción general del método.
 * @param j Descripción del parámetro j.
     */
    public boolean add(JugadorPersistente j) {
        if (getById(j.getId()) != null) return false;
        jugadores.add(j);
        return true;
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
    public JugadorPersistente getById(int id) {
        for (JugadorPersistente j : jugadores) {
            if (j.getId() == id) return j;
        }
        return null;
    }
    /**
     * Método replace.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * replace: Descripción general del método.
 * @param nuevo Descripción del parámetro nuevo.
     */
    public boolean replace(JugadorPersistente nuevo) {
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).getId() == nuevo.getId()) {
                jugadores.set(i, nuevo);
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
 * @param id Descripción del parámetro id.
     */
    public boolean remove(int id) {
        return jugadores.removeIf(j -> j.getId() == id);
    }
    /**
     * Método getAll.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * getAll: Descripción general del método.
     */
    public List<JugadorPersistente> getAll() {
        return jugadores;
    }
}
