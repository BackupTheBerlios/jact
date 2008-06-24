package com.useit.jact.model.zaptelconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * ZaptelspanImpl
 * </p>
 * Created : Sun Dec 25 18:59:43 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZaptelspanImpl.java,v 1.4 2005/12/29 19:14:07
 *          urs Exp $
 */
public class ZaptelspanImpl extends Zaptelspan {

    /**
     * einfacher Konstruktor für Zaptelspan
     */
    public ZaptelspanImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Zaptelspan
     */
    public ZaptelspanImpl(Integer aspan_num, Integer atiming, Integer albo,
            String aframing, String acoding, String ayellow) {
        super();

        this.span_num = aspan_num;
        this.timing = atiming;
        this.lbo = albo;
        this.framing = aframing;
        this.coding = acoding;
        this.yellow = ayellow;
    }
}