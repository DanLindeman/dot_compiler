package dot.graph;

import java.util.ArrayList;

public class GraphNode
{
    private String value;
    private ArrayList<GraphNode> children;

    public GraphNode(String value)
    {
        System.out.println("Creating Node: " + value);
        this.value = value;
        this.children = new ArrayList<GraphNode>();
    }

    public void addChild(GraphNode child)
    {
        if (!children.contains(child))
        {
            this.children.add(child);
        }
    }

    public String toString() { return this.value; }

}
