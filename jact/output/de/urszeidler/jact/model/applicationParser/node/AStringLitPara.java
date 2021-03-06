/* This file was generated by SableCC (http://www.sablecc.org/). */

package de.urszeidler.jact.model.applicationParser.node;

import java.util.*;
import de.urszeidler.jact.model.applicationParser.analysis.*;

public final class AStringLitPara extends PPara
{
    private TStringLit _stringLit_;

    public AStringLitPara()
    {
    }

    public AStringLitPara(
        TStringLit _stringLit_)
    {
        setStringLit(_stringLit_);

    }
    public Object clone()
    {
        return new AStringLitPara(
            (TStringLit) cloneNode(_stringLit_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStringLitPara(this);
    }

    public TStringLit getStringLit()
    {
        return _stringLit_;
    }

    public void setStringLit(TStringLit node)
    {
        if(_stringLit_ != null)
        {
            _stringLit_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _stringLit_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_stringLit_);
    }

    void removeChild(Node child)
    {
        if(_stringLit_ == child)
        {
            _stringLit_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_stringLit_ == oldChild)
        {
            setStringLit((TStringLit) newChild);
            return;
        }

    }
}
