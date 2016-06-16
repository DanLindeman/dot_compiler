/* This file was generated by SableCC (http://www.sablecc.org/). */

package dot.node;

import dot.analysis.*;

@SuppressWarnings("nls")
public final class TRCb extends Token
{
    public TRCb()
    {
        super.setText("}");
    }

    public TRCb(int line, int pos)
    {
        super.setText("}");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TRCb(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTRCb(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TRCb text.");
    }
}