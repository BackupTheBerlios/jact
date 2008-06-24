/* This file was generated by SableCC (http://www.sablecc.org/). */

package de.urszeidler.jact.model.applicationParser.node;

import java.util.*;
import de.urszeidler.jact.model.applicationParser.analysis.*;

public final class ACommaparalistParalist extends PParalist
{
    private PCommaparalist _commaparalist_;

    public ACommaparalistParalist()
    {
    }

    public ACommaparalistParalist(
        PCommaparalist _commaparalist_)
    {
        setCommaparalist(_commaparalist_);

    }
    public Object clone()
    {
        return new ACommaparalistParalist(
            (PCommaparalist) cloneNode(_commaparalist_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACommaparalistParalist(this);
    }

    public PCommaparalist getCommaparalist()
    {
        return _commaparalist_;
    }

    public void setCommaparalist(PCommaparalist node)
    {
        if(_commaparalist_ != null)
        {
            _commaparalist_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _commaparalist_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_commaparalist_);
    }

    void removeChild(Node child)
    {
        if(_commaparalist_ == child)
        {
            _commaparalist_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_commaparalist_ == oldChild)
        {
            setCommaparalist((PCommaparalist) newChild);
            return;
        }

    }
}
