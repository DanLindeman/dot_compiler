/* This file was generated by SableCC (http://www.sablecc.org/). */

package dot.node;

import dot.analysis.*;

@SuppressWarnings("nls")
public final class TDigraph extends Token
{
    public TDigraph()
    {
        super.setText("digraph");
    }

    public TDigraph(int line, int pos)
    {
        super.setText("digraph");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDigraph(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDigraph(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TDigraph text.");
    }
}
