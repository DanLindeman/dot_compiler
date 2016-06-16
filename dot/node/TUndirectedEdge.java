/* This file was generated by SableCC (http://www.sablecc.org/). */

package dot.node;

import dot.analysis.*;

@SuppressWarnings("nls")
public final class TUndirectedEdge extends Token
{
    public TUndirectedEdge()
    {
        super.setText("--");
    }

    public TUndirectedEdge(int line, int pos)
    {
        super.setText("--");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TUndirectedEdge(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTUndirectedEdge(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TUndirectedEdge text.");
    }
}