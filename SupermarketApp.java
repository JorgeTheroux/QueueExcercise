package QueueExcercise;

import java.util.LinkedList;

public class SupermarketApp {

    public static void main(String[] args) {

        LinkedList<Producto> lista = new LinkedList<>();
        agregarProductos(lista);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Producto " + (i+1) + " cantidad " + lista.get(i).getCantidad() + " precio "
            + lista.get(i).getPrecio() + " total " + lista.get(i).total());

        }


    }

    public static int generarAleatoriamente(int numeroUno, int numeroDos) {
        int numeroAleatorio = (int) (numeroUno + Math.random()*numeroDos);

        return numeroAleatorio;
    }

    public static LinkedList<Producto> agregarProductos(LinkedList<Producto> listagenerica){
        for (int i = 1; i <= generarAleatoriamente(1, 8); i++) {
            Producto producto =  new Producto(generarAleatoriamente(1,100),
                    generarAleatoriamente(1,100));
            listagenerica.push(producto);
        }
        return listagenerica;
    }


}