/*******************************************************************************
 * Copyright (c) 2005 Urs Zeidler
 * This program is free software, distributed under the terms of 
 * the GNU General Public License Version 2. See the LICENSE file 
 * at the top of the source tree.
 * 
 *
 * Contributors:
 *     Urs Zeidler
 *******************************************************************************/
package com.useit.jact.model.misdnconf;

import com.useit.jact.model.types.PbxContext;

/**
 * <p>
 * MisdnconfImpl
 * </p>
 * Created : Thu Aug 18 16:13:12 CEST 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnconfImpl.java,v 1.7 2005/12/25 18:09:58
 *          urs Exp $
 */
public class MisdnconfImpl extends Misdnconf {

    /**
     * einfacher Konstruktor für Misdnconf
     */
    public MisdnconfImpl() {
        super();
        fMisdnSections.setSectionname("default");
    }

    /**
     * komplexer Konstruktor für Misdnconf
     */
    public MisdnconfImpl(Integer adebug, String atracefile,
            Boolean atrace_calls, String atrace_dir, Boolean abridging,
            Boolean astop_tone_after_first_digit, Boolean aappend_digits2exten,
            Boolean al1_info_ok, Boolean aclear_l3, Boolean adynamic_crypt,
            String acrypt_prefix, String afileid, PbxContext acontext) {
        super();
        fMisdnSections.setSectionname("default");

        this.debug = adebug;
        this.tracefile = atracefile;
        this.trace_calls = atrace_calls;
        this.trace_dir = atrace_dir;
        this.bridging = abridging;
        this.stop_tone_after_first_digit = astop_tone_after_first_digit;
        this.append_digits2exten = aappend_digits2exten;
        this.l1_info_ok = al1_info_ok;
        this.clear_l3 = aclear_l3;
        this.dynamic_crypt = adynamic_crypt;
        this.crypt_prefix = acrypt_prefix;
        this.fileid = afileid;
        this.context = acontext;
    }

}
