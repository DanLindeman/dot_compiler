/* This file was generated by SableCC (http://www.sablecc.org/). */

package dot.node;

import dot.analysis.*;

@SuppressWarnings("nls")
public final class Start extends Node
{
    private PCreateSingleNode _pCreateSingleNode_;
    private EOF _eof_;

    public Start()
    {
        // Empty body
    }

    public Start(
        @SuppressWarnings("hiding") PCreateSingleNode _pCreateSingleNode_,
        @SuppressWarnings("hiding") EOF _eof_)
    {
        setPCreateSingleNode(_pCreateSingleNode_);
        setEOF(_eof_);
    }

    @Override
    public Object clone()
    {
        return new Start(
            cloneNode(this._pCreateSingleNode_),
            cloneNode(this._eof_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseStart(this);
    }

    public PCreateSingleNode getPCreateSingleNode()
    {
        return this._pCreateSingleNode_;
    }

    public void setPCreateSingleNode(PCreateSingleNode node)
    {
        if(this._pCreateSingleNode_ != null)
        {
            this._pCreateSingleNode_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pCreateSingleNode_ = node;
    }

    public EOF getEOF()
    {
        return this._eof_;
    }

    public void setEOF(EOF node)
    {
        if(this._eof_ != null)
        {
            this._eof_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._eof_ = node;
    }

    @Override
    void removeChild(Node child)
    {
        if(this._pCreateSingleNode_ == child)
        {
            this._pCreateSingleNode_ = null;
            return;
        }

        if(this._eof_ == child)
        {
            this._eof_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(Node oldChild, Node newChild)
    {
        if(this._pCreateSingleNode_ == oldChild)
        {
            setPCreateSingleNode((PCreateSingleNode) newChild);
            return;
        }

        if(this._eof_ == oldChild)
        {
            setEOF((EOF) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    public String toString()
    {
        return "" +
            toString(this._pCreateSingleNode_) +
            toString(this._eof_);
    }
}
