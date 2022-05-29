package pr2.org;

import java.lang.NullPointerException;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
//import java.util.stream.Collectors;

public class Graph<V>{
        private Map<V, Set<V>> adjacencyList = new HashMap<>();

        //private final int infinito = 2147483647;

        /**
         * Añade el vértice v al grafo.
         * @ param v vértice a añadir.
         * @ return true si no estaba anteriormente y false en caso contrario.
         */

        public boolean addVertex(V v){
                if(adjacencyList.containsKey(v)){ return false;
                }else
                        adjacencyList.put(v, new HashSet<V>());
                        return true;
        }

        /**
         * Añade un arco entre los vértices ` v1` y ` v2` al grafo. En
         * caso de que no exista alguno de los vé rtices, lo añade
         * también.
         * @ param v1 el origen del arco.
         * @ param v2 el destino del arco.
         * @ return ` true` si no existí a el arco y ` false` en caso contrario.
         */
	
        public boolean addEdge(V v1, V v2){
                if(!adjacencyList.get(v1).contains(v2) && !adjacencyList.get(v2).contains(v1)){
                        adjacencyList.get(v1).add(v2);
                        adjacencyList.get(v2).add(v1);
                        return true;
                }else return false;
        }

        public Set<V> obtainAdjacents(V v) throws Exception{
                return adjacencyList.get(v);
        }

        public boolean containsVertex(V v){
                return adjacencyList.keySet().contains(v);
        }

        /**
         * Método toString() 
         * @ return una cadena de caracteres con la lista de adyacencia.
         */

        @Override
        public String toString(){
                StringBuilder mensaje = new StringBuilder();
                for(V v: adjacencyList.keySet()){
                        mensaje.append(v.toString() + ": ");
                        for(V conect: adjacencyList.get(v)){
                                mensaje.append(conect.toString() + " ");
                        }
                }
                return mensaje.toString();
        }

        /**
         * Obtiene, en caso de que exista, el camino má s corto entre
         * ` v1` y ` v2`. En caso contrario, devuelve ` null`.
         * @ param v1 el vé rtice origen.
         * @ param v2 el vé rtice destino.
         * @ return lista con la secuencia de vé rtices del camino má s corto
         * entre ` v1` y ` v2`
         */

	public List<V> shortestPath(V v1, V v2) throws Exception {
                int[][] distancia = new int[2][adjacencyList.size()];

                //empezamos con v1 metido en el conjunto debido a que es el inicial
                Set<V> conjunto = new HashSet<>(Arrays.asList(v1));

                //Inicializamos el array de distancia

                for (int j = 0; j < adjacencyList.size(); j++) {
                        distancia[0][j] = 0;//infinito;
                        distancia[1][j] = 1;
                }

                //Bien inicializado
                /*for(int i = 0; i<2; i++){
                        for(int j = 0; j<adjacencyList.size(); j++){
                                if(j == adjacencyList.size()-1){
                                        System.out.println(distancia[i][j]);
                                }else System.out.print(distancia[i][j] + " ");
                        }
                }*/
/*
                int menor = infinito;
                int contador = 0;
                V puntero = v1;
                List<V> lista = new ArrayList<V>(obtainAdjacents(puntero));
                //bucle for
                while(!puntero.equals(v2)) {
                        for (int i = 0; i < lista.size(); i++) {
                                System.out.println(lista.get(i));
                                if (!conjunto.contains(lista.get(i))) {
                                        //System.out.println("entra");
                                        conjunto.add(lista.get(i));
                                        puntero = lista.get(i);
                                        contador++;
                                        for (int j = 0; j <= adjacencyList.size(); j++) {
                                                if (lista.get(i).equals(Integer.valueOf(j))) {
                                                        //System.out.println(lista.get(i));
                                                        distancia[0][j - 1] += contador;//1;
                                                }
                                        }
                                }

                                lista = new ArrayList<V>(obtainAdjacents(puntero));
                                for (int k = 0; k < 2; k++) {
                                        for (int j = 0; j < adjacencyList.size(); j++) {
                                                if (j == adjacencyList.size() - 1) {
                                                        System.out.println(distancia[k][j]);
                                                } else System.out.print(distancia[k][j] + " ");
                                        }
                                }
                                System.out.println("puntero: " + puntero);
                        }
                }
                System.out.println("contador: " + contador);

                return null; // Esto código hay que modificarlo.
        }
}*/
