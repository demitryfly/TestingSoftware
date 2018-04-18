package task2;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import java.util.Vector;

public class GraphTests {

    private void test(Vector<Integer> order, Vector<Integer> result) {
        assertTrue(order.size() <= result.size());
        for (int i = 0; i < order.size(); ++i) {
            assertTrue(order.get(i) == result.get(i));
            System.out.println(i + ": " + order.get(i));
        }
    }

    @Test
    public void bfs() {
        Vector<Integer> order = new Vector<>();
        order.add(0);
        order.add(1);
        order.add(1);
        order.add(1);
        order.add(2);
        order.add(2);
        order.add(2);
        order.add(3);
        order.add(3);

        Graph graph = new Graph();
        graph.tryAddEdge(0, 1);
        graph.tryAddEdge(0, 2);
        graph.tryAddEdge(0, 3);
        graph.tryAddEdge(2, 3);
        graph.tryAddEdge(3, 6);
        graph.tryAddEdge(3, 5);
        graph.tryAddEdge(2, 5);
        graph.tryAddEdge(2, 4);
        graph.tryAddEdge(1, 4);
        graph.tryAddEdge(4, 7);
        graph.tryAddEdge(5, 8);
        graph.tryAddEdge(7, 8);

        Vector<Integer> result = graph.bfs(0);
        test(order, result);
    }

    @Test
    public void bfs1() {
        Vector<Integer> order = new Vector<>();
        order.add(0);
        order.add(1);
        order.add(1);
        order.add(1);

        Graph graph = new Graph();
        graph.tryAddEdge(0, 1);
        graph.tryAddEdge(0, 2);
        graph.tryAddEdge(0, 3);

        Vector<Integer> result = graph.bfs(0);
        test(order, result);
    }

    @Test
    public void bfs2() {
        Vector<Integer> order = new Vector<>();
        order.add(0);
        order.add(1);
        order.add(2);
        order.add(3);
        order.add(4);

        Graph graph = new Graph();
        graph.tryAddEdge(0, 1);
        graph.tryAddEdge(1, 2);
        graph.tryAddEdge(2, 3);
        graph.tryAddEdge(3, 4);

        Vector<Integer> result = graph.bfs(0);
        test(order, result);
    }

    @Test
    public void bfs3() {
        Vector<Integer> order = new Vector<>();
        order.add(0);
        order.add(1);
        order.add(1);
        order.add(1);
        order.add(2);

        Graph graph = new Graph();
        graph.tryAddEdge(0, 1);
        graph.tryAddEdge(0, 2);
        graph.tryAddEdge(0, 3);
        graph.tryAddEdge(1, 4);

        Vector<Integer> result = graph.bfs(0);
        test(order, result);
    }

    @Test
    public void bfs4() {
        Graph graph = new Graph();

        Vector<Integer> result = graph.bfs(0);
        assertTrue(null == result);
    }
}
