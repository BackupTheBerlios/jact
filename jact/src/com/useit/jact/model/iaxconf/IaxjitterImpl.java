package com.useit.jact.model.iaxconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * IaxjitterImpl
 * </p>
 * Created : Mon Dec 12 20:32:44 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IaxjitterImpl.java,v 1.2 2005/12/25 18:09:54
 *          urs Exp $
 */
public class IaxjitterImpl extends Iaxjitter {

    /**
     * einfacher Konstruktor für Iaxjitter
     */
    public IaxjitterImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Iaxjitter
     */
    public IaxjitterImpl(Boolean ajitterbuffer, Boolean aforcejitterbuffer,
            Integer adropcount, Integer amaxjitterbuffer,
            Integer aresyncthreshold, Integer amaxjitterinterps,
            Integer amaxexcessbuffer, Integer aminexcessbuffer,
            Integer ajittershrinkrate) {
        super();

        this.jitterbuffer = ajitterbuffer;
        this.forcejitterbuffer = aforcejitterbuffer;
        this.dropcount = adropcount;
        this.maxjitterbuffer = amaxjitterbuffer;
        this.resyncthreshold = aresyncthreshold;
        this.maxjitterinterps = amaxjitterinterps;
        this.maxexcessbuffer = amaxexcessbuffer;
        this.minexcessbuffer = aminexcessbuffer;
        this.jittershrinkrate = ajittershrinkrate;
    }
}