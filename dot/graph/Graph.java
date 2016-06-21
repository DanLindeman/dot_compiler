package dot.graph;

import java.util.ArrayList;

public class Graph
{
    private ArrayList<GraphNode> knownNodes = new ArrayList<GraphNode>();
    private String name;

    public Graph(String name)
    {
        this.name = name;
    }

    public void add_node(GraphNode node)
    {
        if (!knownNodes.contains(node))
        {
            this.knownNodes.add(node);
        }
    }

    public void add_parent_child(GraphNode parent, GraphNode child)
    {
        add_node(parent);
        add_node(child);
        parent.addChild(child);
    }

    public String toString()
    {
        String output = "";
        if (this.knownNodes.size() > 0)
        {
            output = this.knownNodes.get(0).toString();
            for (int i = 0; i < this.knownNodes.size(); i++) {
                output = output + "," + this.knownNodes.get(i).toString();
            }
        }
        return output;
    }

}
