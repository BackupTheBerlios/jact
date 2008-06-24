

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IDeadAGI<br>
 * [E|Dead]AGI(command|args): Executes an Asterisk Gateway Interface compliant program on a channel. AGI allows Asterisk to launch external programs written in any language to control a telephony channel, play audio, read DTMF digits, etc. by communicating with the AGI protocol on stdin and stdout. Returns -1 on hangup (except for DeadAGI) or if application requested  hangup, or 0 on non-hangup exit.  Using 'EAGI' provides enhanced AGI, with incoming audio available out of bandon file descriptor 3  Use the CLI command 'show agi' to list available agi commands
 * </p>
 * Created : Wed Jul 05 18:53:55 CEST 2006
 * 
 * @behavior.elementname DeadAGI
 * @author urs
 * @version $Revision: 1.1 $, $Id: IDeadAGI.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  interface  IDeadAGI {
public static final String MODELNAME = "DeadAGI";	
 
// ------   1-1 aggregates
	//test
	//---------  getter und setter

}