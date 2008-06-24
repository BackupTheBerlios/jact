package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * Timing_ParametersImpl
 * </p>
 * Created : Thu Dec 29 12:25:36 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Timing_ParametersImpl.java,v 1.4 2005/12/29
 *          19:14:05 urs Exp $
 */
public class Timing_ParametersImpl extends Timing_Parameters {

    /**
     * einfacher Konstruktor für Timing_Parameters
     */
    public Timing_ParametersImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Timing_Parameters
     */
    public Timing_ParametersImpl(Integer aprewink, Integer apreflash,
            Integer awink, Integer arxwink, Integer arxflash, Integer aflash,
            Integer astart, Integer adebounce) {
        super();

        this.prewink = aprewink;
        this.preflash = apreflash;
        this.wink = awink;
        this.rxwink = arxwink;
        this.rxflash = arxflash;
        this.flash = aflash;
        this.start = astart;
        this.debounce = adebounce;
    }
}