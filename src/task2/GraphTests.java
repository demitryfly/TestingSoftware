package task2;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Vector;

public class GraphTests {

    @Test
    public void bfs() {
        int n = 10, m = 20;

        Vector<HashSet<Integer>> sets = new Vector<HashSet<Integer>>();
        for (int i = 0; i < n; ++i)
            sets.add(new HashSet<>());
        sets.get(0).add(0);

        sets.get(1).add(1);
        sets.get(1).add(2);
        sets.get(1).add(3);

        sets.get(2).add(4);
        sets.get(2).add(5);
        sets.get(2).add(6);

        sets.get(2).add(7);
        sets.get(2).add(8);

        Graph graph = new Graph(n, m);
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
        int k = 0;
        for (int i = 0; i < result.size(); ++i) {
            if (sets.get(k).isEmpty())
                k++;

            assertTrue(sets.get(k).contains(result.get(i)));
            sets.get(k).remove(result.get(i));

            System.out.println(result.get(i));
        }
    }

}
