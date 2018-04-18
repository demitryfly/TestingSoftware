package task2;

import java.util.*;
import java.util.concurrent.*;
import javafx.util.*;

public class Graph {
    private int edgesCount = 0;
    private Vector<Vector<Integer>> neighbors;
    private Vector<Boolean> marked;

    {
        this.neighbors = new Vector<>();
        this.marked = new Vector<>();
    }

    public Graph() {}

    public Graph(int vertexCount) {
        for (int i = 0; i < vertexCount; ++i) {
            marked.add(false);
            neighbors.add(new Vector<>());
        }
    }

    public boolean tryAddEdge(int a, int b) {
        int m = a > b ? a : b;
        while (neighbors.size() < m + 1) {
            marked.add(false);
            neighbors.add(new Vector<>());
        }

        edgesCount++;
        neighbors.get(a).add(b);
        neighbors.get(b).add(a);
        return true;
    }

    public Vector<Integer> bfs(Integer v) {
        if (0 == edgesCount)
            return null;
        Vector<Integer> result = new Vector<>();
        for (int i = 0; i < marked.size(); ++i) {
            result.add(-1);
            marked.set(i, false);
        }
        ArrayBlockingQueue<Pair<Integer, Integer>> queue = new ArrayBlockingQueue<>(edgesCount);
        queue.add(new Pair(v, 0));

        while (!queue.isEmpty()) {
            Pair<Integer, Integer> p_crnt = queue.remove();
            Integer key = p_crnt.getKey();
            Integer value = p_crnt.getValue();

            if (marked.get(key))
                continue;

            marked.set(key, true);
            result.set(key, value);

            for (int i = 0; i < neighbors.get(key).size(); ++i)
                queue.add(new Pair(neighbors.get(key).get(i), value + 1));
        }
        return result;
    }
}
