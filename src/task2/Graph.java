package task2;

import java.util.*;
import java.util.concurrent.*;

public class Graph {
    private final int vertexMaxCount, edgesMaxCount;
    private int edgesCount = 0;
    private Vector<Vector<Integer>> neighbors;
    private Vector<Boolean> marked;

    {
        this.neighbors = new Vector<>();
        this.marked = new Vector<>();
    }

    public Graph(int vertexMaxCount, int edgesMaxCount) {
        this.vertexMaxCount = vertexMaxCount;
        this.edgesMaxCount = edgesMaxCount;

        for (int i = 0; i < vertexMaxCount; ++i) {
            marked.add(false);
            neighbors.add(new Vector<>());
        }
    }

    public boolean tryAddEdge(int a, int b) {
        if (edgesCount >= edgesMaxCount)
            return false;

        edgesCount++;
        neighbors.get(a).add(b);
        neighbors.get(b).add(a);
        return true;
    }

    public Vector<Integer> bfs(Integer v) {
        Vector<Integer> res = new Vector<>();
        for (int i = 0; i < marked.size(); ++i)
            marked.set(i, false);

        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(edgesCount);
        queue.add(v);

        while(!queue.isEmpty()) {
            Integer crnt = queue.remove();

            if (marked.get(crnt))
                continue;
            marked.set(crnt, true);

            for (int i = 0; i < neighbors.get(crnt).size(); ++i)
                queue.add(neighbors.get(crnt).get(i));

            res.add(crnt);
        }
        return res;
    }
}
