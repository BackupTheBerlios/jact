/* This file was generated by SableCC (http://www.sablecc.org/). */

package de.urszeidler.jact.model.applicationParser.node;

import java.util.*;
import de.urszeidler.jact.model.applicationParser.analysis.*;

public final class ACommaparalist extends PCommaparalist
{
    private TComma _comma_;
    private final LinkedList _spara_ = new TypedLinkedList(new Spara_Cast());

    public ACommaparalist()
    {
    }

    public ACommaparalist(
        TComma _comma_,
        List _spara_)
    {
        setComma(_comma_);

        {
            this._spara_.clear();
            this._spara_.addAll(_spara_);
        }

    }
    public Object clone()
    {
        return new ACommaparalist(
            (TComma) cloneNode(_comma_),
            cloneList(_spara_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACommaparalist(this);
    }

    public TComma getComma()
    {
        return _comma_;
    }

    public void setComma(TComma node)
    {
        if(_comma_ != null)
        {
            _comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _comma_ = node;
    }

    public LinkedList getSpara()
    {
        return _spara_;
    }

    public void setSpara(List list)
    {
        _spara_.clear();
        _spara_.addAll(list);
    }

    public String toString()
    {
        return ""
            + toString(_comma_)
            + toString(_spara_);
    }

    void removeChild(Node child)
    {
        if(_comma_ == child)
        {
            _comma_ = null;
            return;
        }

        if(_spara_.remove(child))
        {
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        for(ListIterator i = _spara_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set(newChild);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

    }

    private class Spara_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PSpara node = (PSpara) o;

            if((node.parent() != null) &&
                (node.parent() != ACommaparalist.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != ACommaparalist.this))
            {
                node.parent(ACommaparalist.this);
            }

            return node;
        }
    }
}