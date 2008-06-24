package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * TestClientImpl
 * </p>
 * Created : Wed Jul 05 19:01:16 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: TestClientImpl.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class TestClientImpl extends TestClient{
	
	/**
	* einfacher Konstruktor für TestClient
	**/
	public TestClientImpl(){
		super();
	
	}
	/**
	* komplexer Konstruktor für TestClient
	**/
	public TestClientImpl( String atestid){
		super();
	
		this.testid = atestid;	
	}
}