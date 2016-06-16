/* This file was generated by SableCC (http://www.sablecc.org/). */

package dot.analysis;

import java.util.*;
import dot.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACreateSingleNode(ACreateSingleNode node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACreatePcNodes(ACreatePcNodes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEquals(TEquals node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSemicolon(TSemicolon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTColon(TColon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLCb(TLCb node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRCb(TRCb node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLBr(TLBr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRBr(TRBr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTQuote(TQuote node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDirectedEdge(TDirectedEdge node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTUndirectedEdge(TUndirectedEdge node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStrict(TStrict node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDigraph(TDigraph node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSubgraph(TSubgraph node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTGraph(TGraph node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNode(TNode node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEdge(TEdge node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComment(TComment node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEol(TEol node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumber(TNumber node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}