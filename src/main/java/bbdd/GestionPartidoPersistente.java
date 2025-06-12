package bbdd;

import java.util.ArrayList;
import java.util.List;

public class GestionPartidoPersistente {
    private List<PartidoPersistente> partidos = new ArrayList<>();
    /**
     * Método add.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * add: Descripción general del método.
 * @param p Descripción del parámetro p.
     */
    public boolean add(PartidoPersistente p) {
        if (getById(p.getId()) != null) return false;
        partidos.add(p);
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
    public PartidoPersistente getById(int id) {
        for (PartidoPersistente p : partidos) {
            if (p.getId() == id) return p;
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
    public boolean replace(PartidoPersistente nuevo) {
        for (int i = 0; i < partidos.size(); i++) {
            if (partidos.get(i).getId() == nuevo.getId()) {
                partidos.set(i, nuevo);
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
        return partidos.removeIf(p -> p.getId() == id);
    }
}
