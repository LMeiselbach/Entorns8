package bbdd;

import java.util.ArrayList;
import java.util.List;

public class GestionEquipoPersistente {
    private List<EquipoPersistente> equipos = new ArrayList<>();
    /**
     * Método add.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * add: Descripción general del método.
 * @param e Descripción del parámetro e.
     */
    public boolean add(EquipoPersistente e) {
        if (getById(e.getId()) != null) return false;
        equipos.add(e);
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
    public EquipoPersistente getById(int id) {
        return equipos.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
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
    public boolean replace(EquipoPersistente nuevo) {
        for (int i = 0; i < equipos.size(); i++) {
            if (equipos.get(i).getId() == nuevo.getId()) {
                equipos.set(i, nuevo);
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
        return equipos.removeIf(e -> e.getId() == id);
    }
}
