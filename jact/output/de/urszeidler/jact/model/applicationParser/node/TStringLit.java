/* This file was generated by SableCC (http://www.sablecc.org/). */

package de.urszeidler.jact.model.applicationParser.node;

import de.urszeidler.jact.model.applicationParser.analysis.*;

public final class TStringLit extends Token
{
    public TStringLit(String text)
    {
        setText(text);
    }

    public TStringLit(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TStringLit(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTStringLit(this);
    }
}
