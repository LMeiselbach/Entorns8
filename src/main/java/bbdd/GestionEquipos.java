package bbdd;

import java.util.ArrayList;
import java.util.List;

public class GestionEquipos {
    private List<Equipo> equipos;

    public GestionEquipos() {
        equipos = new ArrayList<>();
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
    public Equipo get(int posicion) {
        if (posicion >= 0 && posicion < equipos.size()) {
            return equipos.get(posicion);
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
    public Equipo getById(int id) {
        for (Equipo e : equipos) {
            if (e.getId() == id) return e;
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
 * @param equipo Descripción del parámetro equipo.
     */
    public boolean add(Equipo equipo) {
        if (getById(equipo.getId()) != null) return false;
        equipos.add(equipo);
        return true;
    }
    /**
     * Método replace.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * replace: Descripción general del método.
 * @param equipo Descripción del parámetro equipo.
     */
    public boolean replace(Equipo equipo) {
        for (int i = 0; i < equipos.size(); i++) {
            if (equipos.get(i).getId() == equipo.getId()) {
                equipos.set(i, equipo);
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
 * @param equipo Descripción del parámetro equipo.
     */
    public boolean remove(Equipo equipo) {
        return equipos.remove(equipo);
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
        return equipos.removeIf(e -> e.getId() == id);
    }
    /**
     * Método getTodos.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * getTodos: Descripción general del método.
     */
    public List<Equipo> getTodos() {
        return equipos;
    }
}
