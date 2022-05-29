package pr2.org;

public class App{
    public static void main( String[] args ){
                Graph<Integer> g = new Graph<>();
                g.addVertex(1);
                g.addVertex(2);
                g.addVertex(3);
                g.addVertex(4);
                g.addVertex(5);

                g.addEdge(1, 2);
                g.addEdge(1, 5);
                g.addEdge(2, 3);
                g.addEdge(3, 4);
                g.addEdge(5, 4);
            System.out.println(g.toString());
    }
}
