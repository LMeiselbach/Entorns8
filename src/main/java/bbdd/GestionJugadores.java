package bbdd;

import java.util.ArrayList;
import java.util.List;

public class GestionJugadores {
    private List<Jugador> jugadores;

    public GestionJugadores() {
        jugadores = new ArrayList<>();
    }

    // Obtener jugador por posición en la lista
    /**
     * Método get.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * get: Descripción general del método.
 * @param posicion Descripción del parámetro posicion.
     */
    public Jugador get(int posicion) {
        if (posicion >= 0 && posicion < jugadores.size()) {
            return jugadores.get(posicion);
        }
        return null;
    }

    // Obtener jugador por ID
    /**
     * Método getById.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * getById: Descripción general del método.
 * @param id Descripción del parámetro id.
     */
    public Jugador getById(int id) {
        for (Jugador j : jugadores) {
            if (j.getId() == id) return j;
        }
        return null;
    }

    // Añadir jugador (solo si el ID no existe ya)
    /**
     * Método add.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * add: Descripción general del método.
 * @param jugador Descripción del parámetro jugador.
     */
    public boolean add(Jugador jugador) {
        if (getById(jugador.getId()) != null) return false;
        jugadores.add(jugador);
        return true;
    }

    // Sustituir jugador por otro con el mismo ID
    /**
     * Método replace.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * replace: Descripción general del método.
 * @param jugador Descripción del parámetro jugador.
     */
    public boolean replace(Jugador jugador) {
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).getId() == jugador.getId()) {
                jugadores.set(i, jugador);
                return true;
            }
        }
        return false;
    }

    // Eliminar jugador por objeto
    /**
     * Método remove.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * remove: Descripción general del método.
 * @param jugador Descripción del parámetro jugador.
     */
    public boolean remove(Jugador jugador) {
        return jugadores.remove(jugador);
    }

    // Eliminar jugador por ID
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

    // Método auxiliar para ver la lista (opcional)
    /**
     * Método getTodos.
     * 
     * TODO: Describe lo que hace este método.
     */
    /**
     * getTodos: Descripción general del método.
     */
    public List<Jugador> getTodos() {
        return jugadores;
    }
}
