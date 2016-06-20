import dot.analysis.DepthFirstAdapter;
import dot.node.ACreateGraph;

import java.util.ArrayList;

public class DotEvaluator extends DepthFirstAdapter
{
	private ArrayList<String> nodes = new ArrayList<String>();

	public void outACreateGraph(ACreateGraph node)
	{
		System.out.println("Whoa");
		defaultOut(node);
	}
}
