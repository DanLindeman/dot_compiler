/* This file was generated by SableCC (http://www.sablecc.org/). */

package dot.node;

import dot.analysis.*;

@SuppressWarnings("nls")
public final class TLBr extends Token
{
    public TLBr()
    {
        super.setText("[");
    }

    public TLBr(int line, int pos)
    {
        super.setText("[");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TLBr(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTLBr(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TLBr text.");
    }
}