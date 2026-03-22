package ejercicios;

import java.util.ArrayList;

public class Cajoneria<T> {
    private ArrayList<Caja<T>> cajas;
    private int tope;

    public Cajoneria(int tope) {
        this.tope = tope;
        this.cajas = new ArrayList<Caja<T>>();
    }

    public void addCaja(Caja<T> caja) {
        if (cajas.size() < tope) {
            cajas.add(caja);
        } else {
            throw new RuntimeException("No caben más cajas en la cajonería");
        }
    }

    public String search(T elemento) {
        for (int i = 0; i < cajas.size(); i++) {
            if (cajas.get(i).getObjeto().equals(elemento)) {
                return "Posición: " + (i + 1) + ", Color de caja: " + cajas.get(i).getColor();
            }
        }
        return "Elemento no encontrado";
    }

    public T delete(T elemento) {
        for (int i = 0; i < cajas.size(); i++) {
            if (cajas.get(i).getObjeto().equals(elemento)) {
                T eliminado = cajas.get(i).getObjeto();
                cajas.remove(i);
                return eliminado;
            }
        }
        return null;
    }

    public int contar(T elemento) {
        int contador = 0;
        for (Caja<T> caja : cajas) {
            if (caja.getObjeto().equals(elemento)) {
                contador++;
            }
        }
        return contador;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Posición | Color Caja | Objeto\n");

        for (int i = 0; i < cajas.size(); i++) {
            sb.append(i + 1)
              .append(" | ")
              .append(cajas.get(i).getColor())
              .append(" | ")
              .append(cajas.get(i).getObjeto())
              .append("\n");
        }

        return sb.toString();
    }
}