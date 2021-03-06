/* This file was generated by SableCC (http://www.sablecc.org/). */

package de.urszeidler.jact.model.applicationParser.node;

import java.util.*;
import de.urszeidler.jact.model.applicationParser.analysis.*;

public final class ASpara extends PSpara
{
    private PPara _para_;
    private TSep _sep_;

    public ASpara()
    {
    }

    public ASpara(
        PPara _para_,
        TSep _sep_)
    {
        setPara(_para_);

        setSep(_sep_);

    }
    public Object clone()
    {
        return new ASpara(
            (PPara) cloneNode(_para_),
            (TSep) cloneNode(_sep_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASpara(this);
    }

    public PPara getPara()
    {
        return _para_;
    }

    public void setPara(PPara node)
    {
        if(_para_ != null)
        {
            _para_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _para_ = node;
    }

    public TSep getSep()
    {
        return _sep_;
    }

    public void setSep(TSep node)
    {
        if(_sep_ != null)
        {
            _sep_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _sep_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_para_)
            + toString(_sep_);
    }

    void removeChild(Node child)
    {
        if(_para_ == child)
        {
            _para_ = null;
            return;
        }

        if(_sep_ == child)
        {
            _sep_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_para_ == oldChild)
        {
            setPara((PPara) newChild);
            return;
        }

        if(_sep_ == oldChild)
        {
            setSep((TSep) newChild);
            return;
        }

    }
}
