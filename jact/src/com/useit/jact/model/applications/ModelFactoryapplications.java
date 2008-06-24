/*
 * (c) urs zeidler
 */
package com.useit.jact.model.applications;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

import org.apache.log4j.Logger;

import com.useit.app.framework.model.dataModel.CompositeModelFactory;
import com.useit.app.framework.model.dataModel.IModelFactory;

import de.urszeidler.jact.model.applicationParser.analysis.Analysis;
import de.urszeidler.jact.model.applicationParser.node.ACommaparalist;
import de.urszeidler.jact.model.applicationParser.node.ACommaparalistParalist;
import de.urszeidler.jact.model.applicationParser.node.ACpara;
import de.urszeidler.jact.model.applicationParser.node.ACparaSpara;
import de.urszeidler.jact.model.applicationParser.node.ACurrparalist;
import de.urszeidler.jact.model.applicationParser.node.ACurrparalistParalist;
import de.urszeidler.jact.model.applicationParser.node.AEmptyParalist;
import de.urszeidler.jact.model.applicationParser.node.ANumberPara;
import de.urszeidler.jact.model.applicationParser.node.APara;
import de.urszeidler.jact.model.applicationParser.node.AParaSpara;
import de.urszeidler.jact.model.applicationParser.node.ASpara;
import de.urszeidler.jact.model.applicationParser.node.AStringLitPara;
import de.urszeidler.jact.model.applicationParser.node.AUrlPara;
import de.urszeidler.jact.model.applicationParser.node.EOF;
import de.urszeidler.jact.model.applicationParser.node.Node;
import de.urszeidler.jact.model.applicationParser.node.PParalist;
import de.urszeidler.jact.model.applicationParser.node.Start;
import de.urszeidler.jact.model.applicationParser.node.TBlank;
import de.urszeidler.jact.model.applicationParser.node.TComma;
import de.urszeidler.jact.model.applicationParser.node.TIdentifier;
import de.urszeidler.jact.model.applicationParser.node.TLOp;
import de.urszeidler.jact.model.applicationParser.node.TLPar;
import de.urszeidler.jact.model.applicationParser.node.TNumber;
import de.urszeidler.jact.model.applicationParser.node.TROp;
import de.urszeidler.jact.model.applicationParser.node.TRPar;
import de.urszeidler.jact.model.applicationParser.node.TSep;
import de.urszeidler.jact.model.applicationParser.node.TStringLit;
import de.urszeidler.jact.model.applicationParser.node.TStsep;
import de.urszeidler.jact.model.applicationParser.node.TUrl;

/** 
 * <p> 
 * ModelFactoryapplications
 * </p> 
 * Created : 22.05.2006 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: ModelFactoryapplications.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $ 
 */
public abstract class ModelFactoryapplications extends CompositeModelFactory implements Analysis{
       /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger
            .getLogger(ModelFactoryapplications.class);
   
   public static final String MODELNAME="applications";
	public static final String CHANISAVAIL=IChanIsAvail.MODELNAME;
	public static final String MACRO=IMacro.MODELNAME;
	public static final String SETCIDNUM=ISetCIDNum.MODELNAME;
	public static final String AGENTCALLBACKLOGIN=IAgentCallbackLogin.MODELNAME;
	public static final String CHANGEMONITOR=IChangeMonitor.MODELNAME;
	public static final String IAX2PROVISION=IIAX2Provision.MODELNAME;
	public static final String USEREVENT=IUserEvent.MODELNAME;
	public static final String MP3PLAYER=IMP3Player.MODELNAME;
	public static final String TRANSFER=ITransfer.MODELNAME;
	public static final String DIGITTIMEOUT=IDigitTimeout.MODELNAME;
	public static final String EVAL=IEval.MODELNAME;
	public static final String SETGROUP=ISetGroup.MODELNAME;
	public static final String GETGROUPCOUNT=IGetGroupCount.MODELNAME;
	public static final String STOPPLAYTONES=IStopPlaytones.MODELNAME;
	public static final String LOOKUPCIDNAME=ILookupCIDName.MODELNAME;
	public static final String APPENDCDRUSERFIELD=IAppendCDRUserField.MODELNAME;
	public static final String PAUSEQUEUEMEMBER=IPauseQueueMember.MODELNAME;
	public static final String DEADAGI=IDeadAGI.MODELNAME;
	public static final String PARKEDCALL=IParkedCall.MODELNAME;
	public static final String SETCALLERPRES=ISetCallerPres.MODELNAME;
	public static final String MD5_CHECKSUM_APPLICATION=IMD5_checksum_application.MODELNAME;
	public static final String SENDIMAGE=ISendImage.MODELNAME;
	public static final String LOOKUPBLACKLIST=ILookupBlacklist.MODELNAME;
	public static final String DIAL=IDial.MODELNAME;
	public static final String DBPUT=IDBput.MODELNAME;
	public static final String EXECIFTIME=IExecIfTime.MODELNAME;
	public static final String SETACCOUNT=ISetAccount.MODELNAME;
	public static final String SIPGETHEADER=ISIPGetHeader.MODELNAME;
	public static final String VERBOSE=IVerbose.MODELNAME;
	public static final String STOPMUSICONHOLD=IStopMusicOnHold.MODELNAME;
	public static final String WAITFORSILENCE=IWaitForSilence.MODELNAME;
	public static final String SMS=ISMS.MODELNAME;
	public static final String MUSICONHOLD=IMusicOnHold.MODELNAME;
	public static final String BUSY=IBusy.MODELNAME;
	public static final String GOTOIFTIME=IGotoIfTime.MODELNAME;
	public static final String CONGESTION=ICongestion.MODELNAME;
	public static final String DIRECTORY=IDirectory.MODELNAME;
	public static final String AGENTMONITOROUTGOING=IAgentMonitorOutgoing.MODELNAME;
	public static final String MATH=IMath.MODELNAME;
	public static final String SAYUNIXTIME=ISayUnixTime.MODELNAME;
	public static final String SETGLOBALVAR=ISetGlobalVar.MODELNAME;
	public static final String WAITEXTEN=IWaitExten.MODELNAME;
	public static final String PREFIX=IPrefix.MODELNAME;
	public static final String TRYSYSTEM=ITrySystem.MODELNAME;
	public static final String REMOVEQUEUEMEMBER=IRemoveQueueMember.MODELNAME;
	public static final String REALTIME=IRealTime.MODELNAME;
	public static final String ICES=IICES.MODELNAME;
	public static final String AGI=IAGI.MODELNAME;
	public static final String ENDWHILE=IEndWhile.MODELNAME;
	public static final String GETCPEID=IGetCPEID.MODELNAME;
	public static final String VMAUTHENTICATE=IVMAuthenticate.MODELNAME;
	public static final String SETCDRUSERFIELD=ISetCDRUserField.MODELNAME;
	public static final String DISA=IDISA.MODELNAME;
	public static final String SENDURL=ISendURL.MODELNAME;
	public static final String TESTCLIENT=ITestClient.MODELNAME;
	public static final String DUNDILOOKUP=IDUNDiLookup.MODELNAME;
	public static final String PARK=IPark.MODELNAME;
	public static final String STARTMUSICONHOLD=IStartMusicOnHold.MODELNAME;
	public static final String ADDQUEUEMEMBER=IAddQueueMember.MODELNAME;
	public static final String PARKANDANNOUNCE=IParkAndAnnounce.MODELNAME;
	public static final String MACROEXIT=IMacroExit.MODELNAME;
	public static final String SUBSTRING=ISubString.MODELNAME;
	public static final String SAYNUMBER=ISayNumber.MODELNAME;
	public static final String BACKGROUND=IBackground.MODELNAME;
	public static final String NBSCAT=INBScat.MODELNAME;
	public static final String HASNEWVOICEMAIL=IHasNewVoicemail.MODELNAME;
	public static final String SYSTEM=ISystem.MODELNAME;
	public static final String GOTOIF=IGotoIf.MODELNAME;
	public static final String SETRDNIS=ISetRDNIS.MODELNAME;
	public static final String EXECIF=IExecIF.MODELNAME;
	public static final String MEETMEADMIN=IMeetMeAdmin.MODELNAME;
	public static final String SETMUSICONHOLD=ISetMusicOnHold.MODELNAME;
	public static final String VOICEMAIL=IVoiceMail.MODELNAME;
	public static final String WAITFORRING=IWaitForRing.MODELNAME;
	public static final String PLAYTONES=IPlaytones.MODELNAME;
	public static final String SAYCOUNTPL=ISayCountPL.MODELNAME;
	public static final String STOPMONITOR=IStopMonitor.MODELNAME;
	public static final String GETGROUPMATCHCOUNT=IGetGroupMatchCount.MODELNAME;
	public static final String WAIT=IWait.MODELNAME;
	public static final String ZAPATELLER=IZapateller.MODELNAME;
	public static final String EXEC=IExec.MODELNAME;
	public static final String SENDTEXT=ISendText.MODELNAME;
	public static final String ZAPBARGE=IZapBarge.MODELNAME;
	public static final String SUFFIX=ISuffix.MODELNAME;
	public static final String DATETIME=IDateTime.MODELNAME;
	public static final String MD5CHECK=IMD5Check.MODELNAME;
	public static final String GOTO=IGoto.MODELNAME;
	public static final String DUMPCHAN=IDumpChan.MODELNAME;
	public static final String MONITOR=IMonitor.MODELNAME;
	public static final String DBDELTREE=IDBdeltree.MODELNAME;
	public static final String CHECKGROUP=ICheckGroup.MODELNAME;
	public static final String NOOP=INoOp.MODELNAME;
	public static final String RESETCDR=IResetCDR.MODELNAME;
	public static final String REALTIMEUPDATE=IRealTimeUpdate.MODELNAME;
	public static final String CONTROLPLAYBACK=IControlPlayback.MODELNAME;
	public static final String FESTIVAL=IFestival.MODELNAME;
	public static final String FORKCDR=IForkCDR.MODELNAME;
	public static final String PROGRESS=IProgress.MODELNAME;
	public static final String BACKGROUNDDETECT=IBackgroundDetect.MODELNAME;
	public static final String HANGUP=IHangup.MODELNAME;
	public static final String MEETMECOUNT=IMeetMeCount.MODELNAME;
	public static final String READFILE=IReadFile.MODELNAME;
	public static final String ADSIPROG=IADSIProg.MODELNAME;
	public static final String ZAPSCAN=IZapScan.MODELNAME;
	public static final String ZAPRAS=IZapRAS.MODELNAME;
	public static final String TESTSERVER=ITestServer.MODELNAME;
	public static final String SAYDIGITS=ISayDigits.MODELNAME;
	public static final String TXTCIDNAME=ITXTCIDName.MODELNAME;
	public static final String SOFTHANGUP=ISoftHangup.MODELNAME;
	public static final String SETLANGUAGE=ISetLanguage.MODELNAME;
	public static final String PRIVACYMANAGER=IPrivacyManager.MODELNAME;
	public static final String ECHO=IEcho.MODELNAME;
	public static final String SETCALLERID=ISetCallerID.MODELNAME;
	public static final String STRIPMSD=IStripMSD.MODELNAME;
	public static final String SETAMAFLAGS=ISetAMAFlags.MODELNAME;
	public static final String IMPORTVAR=IImportVar.MODELNAME;
	public static final String WAITMUSICONHOLD=IWaitMusicOnHold.MODELNAME;
	public static final String QUEUE=IQueue.MODELNAME;
	public static final String RECORD=IRecord.MODELNAME;
	public static final String STRIPLSD=IStripLSD.MODELNAME;
	public static final String HASVOICEMAIL=IHasVoicemail.MODELNAME;
	public static final String ABSOLUTETIMEOUT=IAbsoluteTimeout.MODELNAME;
	public static final String SIPADDHEADER=ISIPAddHeader.MODELNAME;
	public static final String EAGI=IEAGI.MODELNAME;
	public static final String AUTHENTICATE=IAuthenticate.MODELNAME;
	public static final String UNPAUSEQUEUEMEMBER=IUnpauseQueueMember.MODELNAME;
	public static final String MACROIF=IMacroIf.MODELNAME;
	public static final String ENUMLOOKUP=IEnumLookup.MODELNAME;
	public static final String SIPDTMFMODE=ISIPDtmfMode.MODELNAME;
	public static final String SETCIDNAME=ISetCIDName.MODELNAME;
	public static final String CUT=ICut.MODELNAME;
	public static final String ANSWER=IAnswer.MODELNAME;
	public static final String SAYPHONETIC=ISayPhonetic.MODELNAME;
	public static final String NOCDR=INoCDR.MODELNAME;
	public static final String AGENTLOGIN=IAgentLogin.MODELNAME;
	public static final String WHILE=IWhile.MODELNAME;
	public static final String MAILBOXEXISTS=IMailboxExists.MODELNAME;
	public static final String MEETME=IMeetMe.MODELNAME;
	public static final String DBGET=IDBget.MODELNAME;
	public static final String RINGING=IRinging.MODELNAME;
	public static final String RETRYDIAL=IRetryDial.MODELNAME;
	public static final String FLASH=IFlash.MODELNAME;
	public static final String SAYALPHA=ISayAlpha.MODELNAME;
	public static final String VOICEMAILMAIN=IVoiceMailMain.MODELNAME;
	public static final String PLAYBACK=IPlayback.MODELNAME;
	public static final String DBDEL=IDBdel.MODELNAME;
	public static final String RESPONSETIMEOUT=IResponseTimeout.MODELNAME;
	public static final String SENDDTMF=ISendDTMF.MODELNAME;
	public static final String ALARMRECEIVER=IAlarmReceiver.MODELNAME;
	public static final String READ=IRead.MODELNAME;
	public static final String SETVAR=ISetVar.MODELNAME;
	public static final String MILLIWATT=IMilliwatt.MODELNAME;
	public static final String RANDOM=IRandom.MODELNAME;
	protected List<Object> paraList = new ArrayList<Object>();
	
	protected Object theApp;
	private Hashtable in;
    private Hashtable out;
	
	
    public Object createModelElement(String modelName) {
        if(CHANISAVAIL.equalsIgnoreCase(modelName))
            return  createModelElement_ChanIsAvail();
            //return new ChanIsAvailImpl();
         if(MACRO.equalsIgnoreCase(modelName))
            return  createModelElement_Macro();
            //return new MacroImpl();
         if(SETCIDNUM.equalsIgnoreCase(modelName))
            return  createModelElement_SetCIDNum();
            //return new SetCIDNumImpl();
         if(AGENTCALLBACKLOGIN.equalsIgnoreCase(modelName))
            return  createModelElement_AgentCallbackLogin();
            //return new AgentCallbackLoginImpl();
         if(CHANGEMONITOR.equalsIgnoreCase(modelName))
            return  createModelElement_ChangeMonitor();
            //return new ChangeMonitorImpl();
         if(IAX2PROVISION.equalsIgnoreCase(modelName))
            return  createModelElement_IAX2Provision();
            //return new IAX2ProvisionImpl();
         if(USEREVENT.equalsIgnoreCase(modelName))
            return  createModelElement_UserEvent();
            //return new UserEventImpl();
         if(MP3PLAYER.equalsIgnoreCase(modelName))
            return  createModelElement_MP3Player();
            //return new MP3PlayerImpl();
         if(TRANSFER.equalsIgnoreCase(modelName))
            return  createModelElement_Transfer();
            //return new TransferImpl();
         if(DIGITTIMEOUT.equalsIgnoreCase(modelName))
            return  createModelElement_DigitTimeout();
            //return new DigitTimeoutImpl();
         if(EVAL.equalsIgnoreCase(modelName))
            return  createModelElement_Eval();
            //return new EvalImpl();
         if(SETGROUP.equalsIgnoreCase(modelName))
            return  createModelElement_SetGroup();
            //return new SetGroupImpl();
         if(GETGROUPCOUNT.equalsIgnoreCase(modelName))
            return  createModelElement_GetGroupCount();
            //return new GetGroupCountImpl();
         if(STOPPLAYTONES.equalsIgnoreCase(modelName))
            return  createModelElement_StopPlaytones();
            //return new StopPlaytonesImpl();
         if(LOOKUPCIDNAME.equalsIgnoreCase(modelName))
            return  createModelElement_LookupCIDName();
            //return new LookupCIDNameImpl();
         if(APPENDCDRUSERFIELD.equalsIgnoreCase(modelName))
            return  createModelElement_AppendCDRUserField();
            //return new AppendCDRUserFieldImpl();
         if(PAUSEQUEUEMEMBER.equalsIgnoreCase(modelName))
            return  createModelElement_PauseQueueMember();
            //return new PauseQueueMemberImpl();
         if(DEADAGI.equalsIgnoreCase(modelName))
            return  createModelElement_DeadAGI();
            //return new DeadAGIImpl();
         if(PARKEDCALL.equalsIgnoreCase(modelName))
            return  createModelElement_ParkedCall();
            //return new ParkedCallImpl();
         if(SETCALLERPRES.equalsIgnoreCase(modelName))
            return  createModelElement_SetCallerPres();
            //return new SetCallerPresImpl();
         if(MD5_CHECKSUM_APPLICATION.equalsIgnoreCase(modelName))
            return  createModelElement_MD5_checksum_application();
            //return new MD5_checksum_applicationImpl();
         if(SENDIMAGE.equalsIgnoreCase(modelName))
            return  createModelElement_SendImage();
            //return new SendImageImpl();
         if(LOOKUPBLACKLIST.equalsIgnoreCase(modelName))
            return  createModelElement_LookupBlacklist();
            //return new LookupBlacklistImpl();
         if(DIAL.equalsIgnoreCase(modelName))
            return  createModelElement_Dial();
            //return new DialImpl();
         if(DBPUT.equalsIgnoreCase(modelName))
            return  createModelElement_DBput();
            //return new DBputImpl();
         if(EXECIFTIME.equalsIgnoreCase(modelName))
            return  createModelElement_ExecIfTime();
            //return new ExecIfTimeImpl();
         if(SETACCOUNT.equalsIgnoreCase(modelName))
            return  createModelElement_SetAccount();
            //return new SetAccountImpl();
         if(SIPGETHEADER.equalsIgnoreCase(modelName))
            return  createModelElement_SIPGetHeader();
            //return new SIPGetHeaderImpl();
         if(VERBOSE.equalsIgnoreCase(modelName))
            return  createModelElement_Verbose();
            //return new VerboseImpl();
         if(STOPMUSICONHOLD.equalsIgnoreCase(modelName))
            return  createModelElement_StopMusicOnHold();
            //return new StopMusicOnHoldImpl();
         if(WAITFORSILENCE.equalsIgnoreCase(modelName))
            return  createModelElement_WaitForSilence();
            //return new WaitForSilenceImpl();
         if(SMS.equalsIgnoreCase(modelName))
            return  createModelElement_SMS();
            //return new SMSImpl();
         if(MUSICONHOLD.equalsIgnoreCase(modelName))
            return  createModelElement_MusicOnHold();
            //return new MusicOnHoldImpl();
         if(BUSY.equalsIgnoreCase(modelName))
            return  createModelElement_Busy();
            //return new BusyImpl();
         if(GOTOIFTIME.equalsIgnoreCase(modelName))
            return  createModelElement_GotoIfTime();
            //return new GotoIfTimeImpl();
         if(CONGESTION.equalsIgnoreCase(modelName))
            return  createModelElement_Congestion();
            //return new CongestionImpl();
         if(DIRECTORY.equalsIgnoreCase(modelName))
            return  createModelElement_Directory();
            //return new DirectoryImpl();
         if(AGENTMONITOROUTGOING.equalsIgnoreCase(modelName))
            return  createModelElement_AgentMonitorOutgoing();
            //return new AgentMonitorOutgoingImpl();
         if(MATH.equalsIgnoreCase(modelName))
            return  createModelElement_Math();
            //return new MathImpl();
         if(SAYUNIXTIME.equalsIgnoreCase(modelName))
            return  createModelElement_SayUnixTime();
            //return new SayUnixTimeImpl();
         if(SETGLOBALVAR.equalsIgnoreCase(modelName))
            return  createModelElement_SetGlobalVar();
            //return new SetGlobalVarImpl();
         if(WAITEXTEN.equalsIgnoreCase(modelName))
            return  createModelElement_WaitExten();
            //return new WaitExtenImpl();
         if(PREFIX.equalsIgnoreCase(modelName))
            return  createModelElement_Prefix();
            //return new PrefixImpl();
         if(TRYSYSTEM.equalsIgnoreCase(modelName))
            return  createModelElement_TrySystem();
            //return new TrySystemImpl();
         if(REMOVEQUEUEMEMBER.equalsIgnoreCase(modelName))
            return  createModelElement_RemoveQueueMember();
            //return new RemoveQueueMemberImpl();
         if(REALTIME.equalsIgnoreCase(modelName))
            return  createModelElement_RealTime();
            //return new RealTimeImpl();
         if(ICES.equalsIgnoreCase(modelName))
            return  createModelElement_ICES();
            //return new ICESImpl();
         if(AGI.equalsIgnoreCase(modelName))
            return  createModelElement_AGI();
            //return new AGIImpl();
         if(ENDWHILE.equalsIgnoreCase(modelName))
            return  createModelElement_EndWhile();
            //return new EndWhileImpl();
         if(GETCPEID.equalsIgnoreCase(modelName))
            return  createModelElement_GetCPEID();
            //return new GetCPEIDImpl();
         if(VMAUTHENTICATE.equalsIgnoreCase(modelName))
            return  createModelElement_VMAuthenticate();
            //return new VMAuthenticateImpl();
         if(SETCDRUSERFIELD.equalsIgnoreCase(modelName))
            return  createModelElement_SetCDRUserField();
            //return new SetCDRUserFieldImpl();
         if(DISA.equalsIgnoreCase(modelName))
            return  createModelElement_DISA();
            //return new DISAImpl();
         if(SENDURL.equalsIgnoreCase(modelName))
            return  createModelElement_SendURL();
            //return new SendURLImpl();
         if(TESTCLIENT.equalsIgnoreCase(modelName))
            return  createModelElement_TestClient();
            //return new TestClientImpl();
         if(DUNDILOOKUP.equalsIgnoreCase(modelName))
            return  createModelElement_DUNDiLookup();
            //return new DUNDiLookupImpl();
         if(PARK.equalsIgnoreCase(modelName))
            return  createModelElement_Park();
            //return new ParkImpl();
         if(STARTMUSICONHOLD.equalsIgnoreCase(modelName))
            return  createModelElement_StartMusicOnHold();
            //return new StartMusicOnHoldImpl();
         if(ADDQUEUEMEMBER.equalsIgnoreCase(modelName))
            return  createModelElement_AddQueueMember();
            //return new AddQueueMemberImpl();
         if(PARKANDANNOUNCE.equalsIgnoreCase(modelName))
            return  createModelElement_ParkAndAnnounce();
            //return new ParkAndAnnounceImpl();
         if(MACROEXIT.equalsIgnoreCase(modelName))
            return  createModelElement_MacroExit();
            //return new MacroExitImpl();
         if(SUBSTRING.equalsIgnoreCase(modelName))
            return  createModelElement_SubString();
            //return new SubStringImpl();
         if(SAYNUMBER.equalsIgnoreCase(modelName))
            return  createModelElement_SayNumber();
            //return new SayNumberImpl();
         if(BACKGROUND.equalsIgnoreCase(modelName))
            return  createModelElement_Background();
            //return new BackgroundImpl();
         if(NBSCAT.equalsIgnoreCase(modelName))
            return  createModelElement_NBScat();
            //return new NBScatImpl();
         if(HASNEWVOICEMAIL.equalsIgnoreCase(modelName))
            return  createModelElement_HasNewVoicemail();
            //return new HasNewVoicemailImpl();
         if(SYSTEM.equalsIgnoreCase(modelName))
            return  createModelElement_System();
            //return new SystemImpl();
         if(GOTOIF.equalsIgnoreCase(modelName))
            return  createModelElement_GotoIf();
            //return new GotoIfImpl();
         if(SETRDNIS.equalsIgnoreCase(modelName))
            return  createModelElement_SetRDNIS();
            //return new SetRDNISImpl();
         if(EXECIF.equalsIgnoreCase(modelName))
            return  createModelElement_ExecIF();
            //return new ExecIFImpl();
         if(MEETMEADMIN.equalsIgnoreCase(modelName))
            return  createModelElement_MeetMeAdmin();
            //return new MeetMeAdminImpl();
         if(SETMUSICONHOLD.equalsIgnoreCase(modelName))
            return  createModelElement_SetMusicOnHold();
            //return new SetMusicOnHoldImpl();
         if(VOICEMAIL.equalsIgnoreCase(modelName))
            return  createModelElement_VoiceMail();
            //return new VoiceMailImpl();
         if(WAITFORRING.equalsIgnoreCase(modelName))
            return  createModelElement_WaitForRing();
            //return new WaitForRingImpl();
         if(PLAYTONES.equalsIgnoreCase(modelName))
            return  createModelElement_Playtones();
            //return new PlaytonesImpl();
         if(SAYCOUNTPL.equalsIgnoreCase(modelName))
            return  createModelElement_SayCountPL();
            //return new SayCountPLImpl();
         if(STOPMONITOR.equalsIgnoreCase(modelName))
            return  createModelElement_StopMonitor();
            //return new StopMonitorImpl();
         if(GETGROUPMATCHCOUNT.equalsIgnoreCase(modelName))
            return  createModelElement_GetGroupMatchCount();
            //return new GetGroupMatchCountImpl();
         if(WAIT.equalsIgnoreCase(modelName))
            return  createModelElement_Wait();
            //return new WaitImpl();
         if(ZAPATELLER.equalsIgnoreCase(modelName))
            return  createModelElement_Zapateller();
            //return new ZapatellerImpl();
         if(EXEC.equalsIgnoreCase(modelName))
            return  createModelElement_Exec();
            //return new ExecImpl();
         if(SENDTEXT.equalsIgnoreCase(modelName))
            return  createModelElement_SendText();
            //return new SendTextImpl();
         if(ZAPBARGE.equalsIgnoreCase(modelName))
            return  createModelElement_ZapBarge();
            //return new ZapBargeImpl();
         if(SUFFIX.equalsIgnoreCase(modelName))
            return  createModelElement_Suffix();
            //return new SuffixImpl();
         if(DATETIME.equalsIgnoreCase(modelName))
            return  createModelElement_DateTime();
            //return new DateTimeImpl();
         if(MD5CHECK.equalsIgnoreCase(modelName))
            return  createModelElement_MD5Check();
            //return new MD5CheckImpl();
         if(GOTO.equalsIgnoreCase(modelName))
            return  createModelElement_Goto();
            //return new GotoImpl();
         if(DUMPCHAN.equalsIgnoreCase(modelName))
            return  createModelElement_DumpChan();
            //return new DumpChanImpl();
         if(MONITOR.equalsIgnoreCase(modelName))
            return  createModelElement_Monitor();
            //return new MonitorImpl();
         if(DBDELTREE.equalsIgnoreCase(modelName))
            return  createModelElement_DBdeltree();
            //return new DBdeltreeImpl();
         if(CHECKGROUP.equalsIgnoreCase(modelName))
            return  createModelElement_CheckGroup();
            //return new CheckGroupImpl();
         if(NOOP.equalsIgnoreCase(modelName))
            return  createModelElement_NoOp();
            //return new NoOpImpl();
         if(RESETCDR.equalsIgnoreCase(modelName))
            return  createModelElement_ResetCDR();
            //return new ResetCDRImpl();
         if(REALTIMEUPDATE.equalsIgnoreCase(modelName))
            return  createModelElement_RealTimeUpdate();
            //return new RealTimeUpdateImpl();
         if(CONTROLPLAYBACK.equalsIgnoreCase(modelName))
            return  createModelElement_ControlPlayback();
            //return new ControlPlaybackImpl();
         if(FESTIVAL.equalsIgnoreCase(modelName))
            return  createModelElement_Festival();
            //return new FestivalImpl();
         if(FORKCDR.equalsIgnoreCase(modelName))
            return  createModelElement_ForkCDR();
            //return new ForkCDRImpl();
         if(PROGRESS.equalsIgnoreCase(modelName))
            return  createModelElement_Progress();
            //return new ProgressImpl();
         if(BACKGROUNDDETECT.equalsIgnoreCase(modelName))
            return  createModelElement_BackgroundDetect();
            //return new BackgroundDetectImpl();
         if(HANGUP.equalsIgnoreCase(modelName))
            return  createModelElement_Hangup();
            //return new HangupImpl();
         if(MEETMECOUNT.equalsIgnoreCase(modelName))
            return  createModelElement_MeetMeCount();
            //return new MeetMeCountImpl();
         if(READFILE.equalsIgnoreCase(modelName))
            return  createModelElement_ReadFile();
            //return new ReadFileImpl();
         if(ADSIPROG.equalsIgnoreCase(modelName))
            return  createModelElement_ADSIProg();
            //return new ADSIProgImpl();
         if(ZAPSCAN.equalsIgnoreCase(modelName))
            return  createModelElement_ZapScan();
            //return new ZapScanImpl();
         if(ZAPRAS.equalsIgnoreCase(modelName))
            return  createModelElement_ZapRAS();
            //return new ZapRASImpl();
         if(TESTSERVER.equalsIgnoreCase(modelName))
            return  createModelElement_TestServer();
            //return new TestServerImpl();
         if(SAYDIGITS.equalsIgnoreCase(modelName))
            return  createModelElement_SayDigits();
            //return new SayDigitsImpl();
         if(TXTCIDNAME.equalsIgnoreCase(modelName))
            return  createModelElement_TXTCIDName();
            //return new TXTCIDNameImpl();
         if(SOFTHANGUP.equalsIgnoreCase(modelName))
            return  createModelElement_SoftHangup();
            //return new SoftHangupImpl();
         if(SETLANGUAGE.equalsIgnoreCase(modelName))
            return  createModelElement_SetLanguage();
            //return new SetLanguageImpl();
         if(PRIVACYMANAGER.equalsIgnoreCase(modelName))
            return  createModelElement_PrivacyManager();
            //return new PrivacyManagerImpl();
         if(ECHO.equalsIgnoreCase(modelName))
            return  createModelElement_Echo();
            //return new EchoImpl();
         if(SETCALLERID.equalsIgnoreCase(modelName))
            return  createModelElement_SetCallerID();
            //return new SetCallerIDImpl();
         if(STRIPMSD.equalsIgnoreCase(modelName))
            return  createModelElement_StripMSD();
            //return new StripMSDImpl();
         if(SETAMAFLAGS.equalsIgnoreCase(modelName))
            return  createModelElement_SetAMAFlags();
            //return new SetAMAFlagsImpl();
         if(IMPORTVAR.equalsIgnoreCase(modelName))
            return  createModelElement_ImportVar();
            //return new ImportVarImpl();
         if(WAITMUSICONHOLD.equalsIgnoreCase(modelName))
            return  createModelElement_WaitMusicOnHold();
            //return new WaitMusicOnHoldImpl();
         if(QUEUE.equalsIgnoreCase(modelName))
            return  createModelElement_Queue();
            //return new QueueImpl();
         if(RECORD.equalsIgnoreCase(modelName))
            return  createModelElement_Record();
            //return new RecordImpl();
         if(STRIPLSD.equalsIgnoreCase(modelName))
            return  createModelElement_StripLSD();
            //return new StripLSDImpl();
         if(HASVOICEMAIL.equalsIgnoreCase(modelName))
            return  createModelElement_HasVoicemail();
            //return new HasVoicemailImpl();
         if(ABSOLUTETIMEOUT.equalsIgnoreCase(modelName))
            return  createModelElement_AbsoluteTimeout();
            //return new AbsoluteTimeoutImpl();
         if(SIPADDHEADER.equalsIgnoreCase(modelName))
            return  createModelElement_SIPAddHeader();
            //return new SIPAddHeaderImpl();
         if(EAGI.equalsIgnoreCase(modelName))
            return  createModelElement_EAGI();
            //return new EAGIImpl();
         if(AUTHENTICATE.equalsIgnoreCase(modelName))
            return  createModelElement_Authenticate();
            //return new AuthenticateImpl();
         if(UNPAUSEQUEUEMEMBER.equalsIgnoreCase(modelName))
            return  createModelElement_UnpauseQueueMember();
            //return new UnpauseQueueMemberImpl();
         if(MACROIF.equalsIgnoreCase(modelName))
            return  createModelElement_MacroIf();
            //return new MacroIfImpl();
         if(ENUMLOOKUP.equalsIgnoreCase(modelName))
            return  createModelElement_EnumLookup();
            //return new EnumLookupImpl();
         if(SIPDTMFMODE.equalsIgnoreCase(modelName))
            return  createModelElement_SIPDtmfMode();
            //return new SIPDtmfModeImpl();
         if(SETCIDNAME.equalsIgnoreCase(modelName))
            return  createModelElement_SetCIDName();
            //return new SetCIDNameImpl();
         if(CUT.equalsIgnoreCase(modelName))
            return  createModelElement_Cut();
            //return new CutImpl();
         if(ANSWER.equalsIgnoreCase(modelName))
            return  createModelElement_Answer();
            //return new AnswerImpl();
         if(SAYPHONETIC.equalsIgnoreCase(modelName))
            return  createModelElement_SayPhonetic();
            //return new SayPhoneticImpl();
         if(NOCDR.equalsIgnoreCase(modelName))
            return  createModelElement_NoCDR();
            //return new NoCDRImpl();
         if(AGENTLOGIN.equalsIgnoreCase(modelName))
            return  createModelElement_AgentLogin();
            //return new AgentLoginImpl();
         if(WHILE.equalsIgnoreCase(modelName))
            return  createModelElement_While();
            //return new WhileImpl();
         if(MAILBOXEXISTS.equalsIgnoreCase(modelName))
            return  createModelElement_MailboxExists();
            //return new MailboxExistsImpl();
         if(MEETME.equalsIgnoreCase(modelName))
            return  createModelElement_MeetMe();
            //return new MeetMeImpl();
         if(DBGET.equalsIgnoreCase(modelName))
            return  createModelElement_DBget();
            //return new DBgetImpl();
         if(RINGING.equalsIgnoreCase(modelName))
            return  createModelElement_Ringing();
            //return new RingingImpl();
         if(RETRYDIAL.equalsIgnoreCase(modelName))
            return  createModelElement_RetryDial();
            //return new RetryDialImpl();
         if(FLASH.equalsIgnoreCase(modelName))
            return  createModelElement_Flash();
            //return new FlashImpl();
         if(SAYALPHA.equalsIgnoreCase(modelName))
            return  createModelElement_SayAlpha();
            //return new SayAlphaImpl();
         if(VOICEMAILMAIN.equalsIgnoreCase(modelName))
            return  createModelElement_VoiceMailMain();
            //return new VoiceMailMainImpl();
         if(PLAYBACK.equalsIgnoreCase(modelName))
            return  createModelElement_Playback();
            //return new PlaybackImpl();
         if(DBDEL.equalsIgnoreCase(modelName))
            return  createModelElement_DBdel();
            //return new DBdelImpl();
         if(RESPONSETIMEOUT.equalsIgnoreCase(modelName))
            return  createModelElement_ResponseTimeout();
            //return new ResponseTimeoutImpl();
         if(SENDDTMF.equalsIgnoreCase(modelName))
            return  createModelElement_SendDTMF();
            //return new SendDTMFImpl();
         if(ALARMRECEIVER.equalsIgnoreCase(modelName))
            return  createModelElement_AlarmReceiver();
            //return new AlarmReceiverImpl();
         if(READ.equalsIgnoreCase(modelName))
            return  createModelElement_Read();
            //return new ReadImpl();
         if(SETVAR.equalsIgnoreCase(modelName))
            return  createModelElement_SetVar();
            //return new SetVarImpl();
         if(MILLIWATT.equalsIgnoreCase(modelName))
            return  createModelElement_Milliwatt();
            //return new MilliwattImpl();
         if(RANDOM.equalsIgnoreCase(modelName))
            return  createModelElement_Random();
            //return new RandomImpl();
         if(MODELNAME.concat(".").concat(CHANISAVAIL).equalsIgnoreCase(modelName))
            return  createModelElement_ChanIsAvail();
         if(MODELNAME.concat(".").concat(MACRO).equalsIgnoreCase(modelName))
            return  createModelElement_Macro();
         if(MODELNAME.concat(".").concat(SETCIDNUM).equalsIgnoreCase(modelName))
            return  createModelElement_SetCIDNum();
         if(MODELNAME.concat(".").concat(AGENTCALLBACKLOGIN).equalsIgnoreCase(modelName))
            return  createModelElement_AgentCallbackLogin();
         if(MODELNAME.concat(".").concat(CHANGEMONITOR).equalsIgnoreCase(modelName))
            return  createModelElement_ChangeMonitor();
         if(MODELNAME.concat(".").concat(IAX2PROVISION).equalsIgnoreCase(modelName))
            return  createModelElement_IAX2Provision();
         if(MODELNAME.concat(".").concat(USEREVENT).equalsIgnoreCase(modelName))
            return  createModelElement_UserEvent();
         if(MODELNAME.concat(".").concat(MP3PLAYER).equalsIgnoreCase(modelName))
            return  createModelElement_MP3Player();
         if(MODELNAME.concat(".").concat(TRANSFER).equalsIgnoreCase(modelName))
            return  createModelElement_Transfer();
         if(MODELNAME.concat(".").concat(DIGITTIMEOUT).equalsIgnoreCase(modelName))
            return  createModelElement_DigitTimeout();
         if(MODELNAME.concat(".").concat(EVAL).equalsIgnoreCase(modelName))
            return  createModelElement_Eval();
         if(MODELNAME.concat(".").concat(SETGROUP).equalsIgnoreCase(modelName))
            return  createModelElement_SetGroup();
         if(MODELNAME.concat(".").concat(GETGROUPCOUNT).equalsIgnoreCase(modelName))
            return  createModelElement_GetGroupCount();
         if(MODELNAME.concat(".").concat(STOPPLAYTONES).equalsIgnoreCase(modelName))
            return  createModelElement_StopPlaytones();
         if(MODELNAME.concat(".").concat(LOOKUPCIDNAME).equalsIgnoreCase(modelName))
            return  createModelElement_LookupCIDName();
         if(MODELNAME.concat(".").concat(APPENDCDRUSERFIELD).equalsIgnoreCase(modelName))
            return  createModelElement_AppendCDRUserField();
         if(MODELNAME.concat(".").concat(PAUSEQUEUEMEMBER).equalsIgnoreCase(modelName))
            return  createModelElement_PauseQueueMember();
         if(MODELNAME.concat(".").concat(DEADAGI).equalsIgnoreCase(modelName))
            return  createModelElement_DeadAGI();
         if(MODELNAME.concat(".").concat(PARKEDCALL).equalsIgnoreCase(modelName))
            return  createModelElement_ParkedCall();
         if(MODELNAME.concat(".").concat(SETCALLERPRES).equalsIgnoreCase(modelName))
            return  createModelElement_SetCallerPres();
         if(MODELNAME.concat(".").concat(MD5_CHECKSUM_APPLICATION).equalsIgnoreCase(modelName))
            return  createModelElement_MD5_checksum_application();
         if(MODELNAME.concat(".").concat(SENDIMAGE).equalsIgnoreCase(modelName))
            return  createModelElement_SendImage();
         if(MODELNAME.concat(".").concat(LOOKUPBLACKLIST).equalsIgnoreCase(modelName))
            return  createModelElement_LookupBlacklist();
         if(MODELNAME.concat(".").concat(DIAL).equalsIgnoreCase(modelName))
            return  createModelElement_Dial();
         if(MODELNAME.concat(".").concat(DBPUT).equalsIgnoreCase(modelName))
            return  createModelElement_DBput();
         if(MODELNAME.concat(".").concat(EXECIFTIME).equalsIgnoreCase(modelName))
            return  createModelElement_ExecIfTime();
         if(MODELNAME.concat(".").concat(SETACCOUNT).equalsIgnoreCase(modelName))
            return  createModelElement_SetAccount();
         if(MODELNAME.concat(".").concat(SIPGETHEADER).equalsIgnoreCase(modelName))
            return  createModelElement_SIPGetHeader();
         if(MODELNAME.concat(".").concat(VERBOSE).equalsIgnoreCase(modelName))
            return  createModelElement_Verbose();
         if(MODELNAME.concat(".").concat(STOPMUSICONHOLD).equalsIgnoreCase(modelName))
            return  createModelElement_StopMusicOnHold();
         if(MODELNAME.concat(".").concat(WAITFORSILENCE).equalsIgnoreCase(modelName))
            return  createModelElement_WaitForSilence();
         if(MODELNAME.concat(".").concat(SMS).equalsIgnoreCase(modelName))
            return  createModelElement_SMS();
         if(MODELNAME.concat(".").concat(MUSICONHOLD).equalsIgnoreCase(modelName))
            return  createModelElement_MusicOnHold();
         if(MODELNAME.concat(".").concat(BUSY).equalsIgnoreCase(modelName))
            return  createModelElement_Busy();
         if(MODELNAME.concat(".").concat(GOTOIFTIME).equalsIgnoreCase(modelName))
            return  createModelElement_GotoIfTime();
         if(MODELNAME.concat(".").concat(CONGESTION).equalsIgnoreCase(modelName))
            return  createModelElement_Congestion();
         if(MODELNAME.concat(".").concat(DIRECTORY).equalsIgnoreCase(modelName))
            return  createModelElement_Directory();
         if(MODELNAME.concat(".").concat(AGENTMONITOROUTGOING).equalsIgnoreCase(modelName))
            return  createModelElement_AgentMonitorOutgoing();
         if(MODELNAME.concat(".").concat(MATH).equalsIgnoreCase(modelName))
            return  createModelElement_Math();
         if(MODELNAME.concat(".").concat(SAYUNIXTIME).equalsIgnoreCase(modelName))
            return  createModelElement_SayUnixTime();
         if(MODELNAME.concat(".").concat(SETGLOBALVAR).equalsIgnoreCase(modelName))
            return  createModelElement_SetGlobalVar();
         if(MODELNAME.concat(".").concat(WAITEXTEN).equalsIgnoreCase(modelName))
            return  createModelElement_WaitExten();
         if(MODELNAME.concat(".").concat(PREFIX).equalsIgnoreCase(modelName))
            return  createModelElement_Prefix();
         if(MODELNAME.concat(".").concat(TRYSYSTEM).equalsIgnoreCase(modelName))
            return  createModelElement_TrySystem();
         if(MODELNAME.concat(".").concat(REMOVEQUEUEMEMBER).equalsIgnoreCase(modelName))
            return  createModelElement_RemoveQueueMember();
         if(MODELNAME.concat(".").concat(REALTIME).equalsIgnoreCase(modelName))
            return  createModelElement_RealTime();
         if(MODELNAME.concat(".").concat(ICES).equalsIgnoreCase(modelName))
            return  createModelElement_ICES();
         if(MODELNAME.concat(".").concat(AGI).equalsIgnoreCase(modelName))
            return  createModelElement_AGI();
         if(MODELNAME.concat(".").concat(ENDWHILE).equalsIgnoreCase(modelName))
            return  createModelElement_EndWhile();
         if(MODELNAME.concat(".").concat(GETCPEID).equalsIgnoreCase(modelName))
            return  createModelElement_GetCPEID();
         if(MODELNAME.concat(".").concat(VMAUTHENTICATE).equalsIgnoreCase(modelName))
            return  createModelElement_VMAuthenticate();
         if(MODELNAME.concat(".").concat(SETCDRUSERFIELD).equalsIgnoreCase(modelName))
            return  createModelElement_SetCDRUserField();
         if(MODELNAME.concat(".").concat(DISA).equalsIgnoreCase(modelName))
            return  createModelElement_DISA();
         if(MODELNAME.concat(".").concat(SENDURL).equalsIgnoreCase(modelName))
            return  createModelElement_SendURL();
         if(MODELNAME.concat(".").concat(TESTCLIENT).equalsIgnoreCase(modelName))
            return  createModelElement_TestClient();
         if(MODELNAME.concat(".").concat(DUNDILOOKUP).equalsIgnoreCase(modelName))
            return  createModelElement_DUNDiLookup();
         if(MODELNAME.concat(".").concat(PARK).equalsIgnoreCase(modelName))
            return  createModelElement_Park();
         if(MODELNAME.concat(".").concat(STARTMUSICONHOLD).equalsIgnoreCase(modelName))
            return  createModelElement_StartMusicOnHold();
         if(MODELNAME.concat(".").concat(ADDQUEUEMEMBER).equalsIgnoreCase(modelName))
            return  createModelElement_AddQueueMember();
         if(MODELNAME.concat(".").concat(PARKANDANNOUNCE).equalsIgnoreCase(modelName))
            return  createModelElement_ParkAndAnnounce();
         if(MODELNAME.concat(".").concat(MACROEXIT).equalsIgnoreCase(modelName))
            return  createModelElement_MacroExit();
         if(MODELNAME.concat(".").concat(SUBSTRING).equalsIgnoreCase(modelName))
            return  createModelElement_SubString();
         if(MODELNAME.concat(".").concat(SAYNUMBER).equalsIgnoreCase(modelName))
            return  createModelElement_SayNumber();
         if(MODELNAME.concat(".").concat(BACKGROUND).equalsIgnoreCase(modelName))
            return  createModelElement_Background();
         if(MODELNAME.concat(".").concat(NBSCAT).equalsIgnoreCase(modelName))
            return  createModelElement_NBScat();
         if(MODELNAME.concat(".").concat(HASNEWVOICEMAIL).equalsIgnoreCase(modelName))
            return  createModelElement_HasNewVoicemail();
         if(MODELNAME.concat(".").concat(SYSTEM).equalsIgnoreCase(modelName))
            return  createModelElement_System();
         if(MODELNAME.concat(".").concat(GOTOIF).equalsIgnoreCase(modelName))
            return  createModelElement_GotoIf();
         if(MODELNAME.concat(".").concat(SETRDNIS).equalsIgnoreCase(modelName))
            return  createModelElement_SetRDNIS();
         if(MODELNAME.concat(".").concat(EXECIF).equalsIgnoreCase(modelName))
            return  createModelElement_ExecIF();
         if(MODELNAME.concat(".").concat(MEETMEADMIN).equalsIgnoreCase(modelName))
            return  createModelElement_MeetMeAdmin();
         if(MODELNAME.concat(".").concat(SETMUSICONHOLD).equalsIgnoreCase(modelName))
            return  createModelElement_SetMusicOnHold();
         if(MODELNAME.concat(".").concat(VOICEMAIL).equalsIgnoreCase(modelName))
            return  createModelElement_VoiceMail();
         if(MODELNAME.concat(".").concat(WAITFORRING).equalsIgnoreCase(modelName))
            return  createModelElement_WaitForRing();
         if(MODELNAME.concat(".").concat(PLAYTONES).equalsIgnoreCase(modelName))
            return  createModelElement_Playtones();
         if(MODELNAME.concat(".").concat(SAYCOUNTPL).equalsIgnoreCase(modelName))
            return  createModelElement_SayCountPL();
         if(MODELNAME.concat(".").concat(STOPMONITOR).equalsIgnoreCase(modelName))
            return  createModelElement_StopMonitor();
         if(MODELNAME.concat(".").concat(GETGROUPMATCHCOUNT).equalsIgnoreCase(modelName))
            return  createModelElement_GetGroupMatchCount();
         if(MODELNAME.concat(".").concat(WAIT).equalsIgnoreCase(modelName))
            return  createModelElement_Wait();
         if(MODELNAME.concat(".").concat(ZAPATELLER).equalsIgnoreCase(modelName))
            return  createModelElement_Zapateller();
         if(MODELNAME.concat(".").concat(EXEC).equalsIgnoreCase(modelName))
            return  createModelElement_Exec();
         if(MODELNAME.concat(".").concat(SENDTEXT).equalsIgnoreCase(modelName))
            return  createModelElement_SendText();
         if(MODELNAME.concat(".").concat(ZAPBARGE).equalsIgnoreCase(modelName))
            return  createModelElement_ZapBarge();
         if(MODELNAME.concat(".").concat(SUFFIX).equalsIgnoreCase(modelName))
            return  createModelElement_Suffix();
         if(MODELNAME.concat(".").concat(DATETIME).equalsIgnoreCase(modelName))
            return  createModelElement_DateTime();
         if(MODELNAME.concat(".").concat(MD5CHECK).equalsIgnoreCase(modelName))
            return  createModelElement_MD5Check();
         if(MODELNAME.concat(".").concat(GOTO).equalsIgnoreCase(modelName))
            return  createModelElement_Goto();
         if(MODELNAME.concat(".").concat(DUMPCHAN).equalsIgnoreCase(modelName))
            return  createModelElement_DumpChan();
         if(MODELNAME.concat(".").concat(MONITOR).equalsIgnoreCase(modelName))
            return  createModelElement_Monitor();
         if(MODELNAME.concat(".").concat(DBDELTREE).equalsIgnoreCase(modelName))
            return  createModelElement_DBdeltree();
         if(MODELNAME.concat(".").concat(CHECKGROUP).equalsIgnoreCase(modelName))
            return  createModelElement_CheckGroup();
         if(MODELNAME.concat(".").concat(NOOP).equalsIgnoreCase(modelName))
            return  createModelElement_NoOp();
         if(MODELNAME.concat(".").concat(RESETCDR).equalsIgnoreCase(modelName))
            return  createModelElement_ResetCDR();
         if(MODELNAME.concat(".").concat(REALTIMEUPDATE).equalsIgnoreCase(modelName))
            return  createModelElement_RealTimeUpdate();
         if(MODELNAME.concat(".").concat(CONTROLPLAYBACK).equalsIgnoreCase(modelName))
            return  createModelElement_ControlPlayback();
         if(MODELNAME.concat(".").concat(FESTIVAL).equalsIgnoreCase(modelName))
            return  createModelElement_Festival();
         if(MODELNAME.concat(".").concat(FORKCDR).equalsIgnoreCase(modelName))
            return  createModelElement_ForkCDR();
         if(MODELNAME.concat(".").concat(PROGRESS).equalsIgnoreCase(modelName))
            return  createModelElement_Progress();
         if(MODELNAME.concat(".").concat(BACKGROUNDDETECT).equalsIgnoreCase(modelName))
            return  createModelElement_BackgroundDetect();
         if(MODELNAME.concat(".").concat(HANGUP).equalsIgnoreCase(modelName))
            return  createModelElement_Hangup();
         if(MODELNAME.concat(".").concat(MEETMECOUNT).equalsIgnoreCase(modelName))
            return  createModelElement_MeetMeCount();
         if(MODELNAME.concat(".").concat(READFILE).equalsIgnoreCase(modelName))
            return  createModelElement_ReadFile();
         if(MODELNAME.concat(".").concat(ADSIPROG).equalsIgnoreCase(modelName))
            return  createModelElement_ADSIProg();
         if(MODELNAME.concat(".").concat(ZAPSCAN).equalsIgnoreCase(modelName))
            return  createModelElement_ZapScan();
         if(MODELNAME.concat(".").concat(ZAPRAS).equalsIgnoreCase(modelName))
            return  createModelElement_ZapRAS();
         if(MODELNAME.concat(".").concat(TESTSERVER).equalsIgnoreCase(modelName))
            return  createModelElement_TestServer();
         if(MODELNAME.concat(".").concat(SAYDIGITS).equalsIgnoreCase(modelName))
            return  createModelElement_SayDigits();
         if(MODELNAME.concat(".").concat(TXTCIDNAME).equalsIgnoreCase(modelName))
            return  createModelElement_TXTCIDName();
         if(MODELNAME.concat(".").concat(SOFTHANGUP).equalsIgnoreCase(modelName))
            return  createModelElement_SoftHangup();
         if(MODELNAME.concat(".").concat(SETLANGUAGE).equalsIgnoreCase(modelName))
            return  createModelElement_SetLanguage();
         if(MODELNAME.concat(".").concat(PRIVACYMANAGER).equalsIgnoreCase(modelName))
            return  createModelElement_PrivacyManager();
         if(MODELNAME.concat(".").concat(ECHO).equalsIgnoreCase(modelName))
            return  createModelElement_Echo();
         if(MODELNAME.concat(".").concat(SETCALLERID).equalsIgnoreCase(modelName))
            return  createModelElement_SetCallerID();
         if(MODELNAME.concat(".").concat(STRIPMSD).equalsIgnoreCase(modelName))
            return  createModelElement_StripMSD();
         if(MODELNAME.concat(".").concat(SETAMAFLAGS).equalsIgnoreCase(modelName))
            return  createModelElement_SetAMAFlags();
         if(MODELNAME.concat(".").concat(IMPORTVAR).equalsIgnoreCase(modelName))
            return  createModelElement_ImportVar();
         if(MODELNAME.concat(".").concat(WAITMUSICONHOLD).equalsIgnoreCase(modelName))
            return  createModelElement_WaitMusicOnHold();
         if(MODELNAME.concat(".").concat(QUEUE).equalsIgnoreCase(modelName))
            return  createModelElement_Queue();
         if(MODELNAME.concat(".").concat(RECORD).equalsIgnoreCase(modelName))
            return  createModelElement_Record();
         if(MODELNAME.concat(".").concat(STRIPLSD).equalsIgnoreCase(modelName))
            return  createModelElement_StripLSD();
         if(MODELNAME.concat(".").concat(HASVOICEMAIL).equalsIgnoreCase(modelName))
            return  createModelElement_HasVoicemail();
         if(MODELNAME.concat(".").concat(ABSOLUTETIMEOUT).equalsIgnoreCase(modelName))
            return  createModelElement_AbsoluteTimeout();
         if(MODELNAME.concat(".").concat(SIPADDHEADER).equalsIgnoreCase(modelName))
            return  createModelElement_SIPAddHeader();
         if(MODELNAME.concat(".").concat(EAGI).equalsIgnoreCase(modelName))
            return  createModelElement_EAGI();
         if(MODELNAME.concat(".").concat(AUTHENTICATE).equalsIgnoreCase(modelName))
            return  createModelElement_Authenticate();
         if(MODELNAME.concat(".").concat(UNPAUSEQUEUEMEMBER).equalsIgnoreCase(modelName))
            return  createModelElement_UnpauseQueueMember();
         if(MODELNAME.concat(".").concat(MACROIF).equalsIgnoreCase(modelName))
            return  createModelElement_MacroIf();
         if(MODELNAME.concat(".").concat(ENUMLOOKUP).equalsIgnoreCase(modelName))
            return  createModelElement_EnumLookup();
         if(MODELNAME.concat(".").concat(SIPDTMFMODE).equalsIgnoreCase(modelName))
            return  createModelElement_SIPDtmfMode();
         if(MODELNAME.concat(".").concat(SETCIDNAME).equalsIgnoreCase(modelName))
            return  createModelElement_SetCIDName();
         if(MODELNAME.concat(".").concat(CUT).equalsIgnoreCase(modelName))
            return  createModelElement_Cut();
         if(MODELNAME.concat(".").concat(ANSWER).equalsIgnoreCase(modelName))
            return  createModelElement_Answer();
         if(MODELNAME.concat(".").concat(SAYPHONETIC).equalsIgnoreCase(modelName))
            return  createModelElement_SayPhonetic();
         if(MODELNAME.concat(".").concat(NOCDR).equalsIgnoreCase(modelName))
            return  createModelElement_NoCDR();
         if(MODELNAME.concat(".").concat(AGENTLOGIN).equalsIgnoreCase(modelName))
            return  createModelElement_AgentLogin();
         if(MODELNAME.concat(".").concat(WHILE).equalsIgnoreCase(modelName))
            return  createModelElement_While();
         if(MODELNAME.concat(".").concat(MAILBOXEXISTS).equalsIgnoreCase(modelName))
            return  createModelElement_MailboxExists();
         if(MODELNAME.concat(".").concat(MEETME).equalsIgnoreCase(modelName))
            return  createModelElement_MeetMe();
         if(MODELNAME.concat(".").concat(DBGET).equalsIgnoreCase(modelName))
            return  createModelElement_DBget();
         if(MODELNAME.concat(".").concat(RINGING).equalsIgnoreCase(modelName))
            return  createModelElement_Ringing();
         if(MODELNAME.concat(".").concat(RETRYDIAL).equalsIgnoreCase(modelName))
            return  createModelElement_RetryDial();
         if(MODELNAME.concat(".").concat(FLASH).equalsIgnoreCase(modelName))
            return  createModelElement_Flash();
         if(MODELNAME.concat(".").concat(SAYALPHA).equalsIgnoreCase(modelName))
            return  createModelElement_SayAlpha();
         if(MODELNAME.concat(".").concat(VOICEMAILMAIN).equalsIgnoreCase(modelName))
            return  createModelElement_VoiceMailMain();
         if(MODELNAME.concat(".").concat(PLAYBACK).equalsIgnoreCase(modelName))
            return  createModelElement_Playback();
         if(MODELNAME.concat(".").concat(DBDEL).equalsIgnoreCase(modelName))
            return  createModelElement_DBdel();
         if(MODELNAME.concat(".").concat(RESPONSETIMEOUT).equalsIgnoreCase(modelName))
            return  createModelElement_ResponseTimeout();
         if(MODELNAME.concat(".").concat(SENDDTMF).equalsIgnoreCase(modelName))
            return  createModelElement_SendDTMF();
         if(MODELNAME.concat(".").concat(ALARMRECEIVER).equalsIgnoreCase(modelName))
            return  createModelElement_AlarmReceiver();
         if(MODELNAME.concat(".").concat(READ).equalsIgnoreCase(modelName))
            return  createModelElement_Read();
         if(MODELNAME.concat(".").concat(SETVAR).equalsIgnoreCase(modelName))
            return  createModelElement_SetVar();
         if(MODELNAME.concat(".").concat(MILLIWATT).equalsIgnoreCase(modelName))
            return  createModelElement_Milliwatt();
         if(MODELNAME.concat(".").concat(RANDOM).equalsIgnoreCase(modelName))
            return  createModelElement_Random();
         return super.createModelElement(modelName);
    }

    public Object createModelElement(Class modelClass) {
        if(IChanIsAvail.class.isAssignableFrom(modelClass))
            return  createModelElement_ChanIsAvail();
        if(IMacro.class.isAssignableFrom(modelClass))
            return  createModelElement_Macro();
        if(ISetCIDNum.class.isAssignableFrom(modelClass))
            return  createModelElement_SetCIDNum();
        if(IAgentCallbackLogin.class.isAssignableFrom(modelClass))
            return  createModelElement_AgentCallbackLogin();
        if(IChangeMonitor.class.isAssignableFrom(modelClass))
            return  createModelElement_ChangeMonitor();
        if(IIAX2Provision.class.isAssignableFrom(modelClass))
            return  createModelElement_IAX2Provision();
        if(IUserEvent.class.isAssignableFrom(modelClass))
            return  createModelElement_UserEvent();
        if(IMP3Player.class.isAssignableFrom(modelClass))
            return  createModelElement_MP3Player();
        if(ITransfer.class.isAssignableFrom(modelClass))
            return  createModelElement_Transfer();
        if(IDigitTimeout.class.isAssignableFrom(modelClass))
            return  createModelElement_DigitTimeout();
        if(IEval.class.isAssignableFrom(modelClass))
            return  createModelElement_Eval();
        if(ISetGroup.class.isAssignableFrom(modelClass))
            return  createModelElement_SetGroup();
        if(IGetGroupCount.class.isAssignableFrom(modelClass))
            return  createModelElement_GetGroupCount();
        if(IStopPlaytones.class.isAssignableFrom(modelClass))
            return  createModelElement_StopPlaytones();
        if(ILookupCIDName.class.isAssignableFrom(modelClass))
            return  createModelElement_LookupCIDName();
        if(IAppendCDRUserField.class.isAssignableFrom(modelClass))
            return  createModelElement_AppendCDRUserField();
        if(IPauseQueueMember.class.isAssignableFrom(modelClass))
            return  createModelElement_PauseQueueMember();
        if(IDeadAGI.class.isAssignableFrom(modelClass))
            return  createModelElement_DeadAGI();
        if(IParkedCall.class.isAssignableFrom(modelClass))
            return  createModelElement_ParkedCall();
        if(ISetCallerPres.class.isAssignableFrom(modelClass))
            return  createModelElement_SetCallerPres();
        if(IMD5_checksum_application.class.isAssignableFrom(modelClass))
            return  createModelElement_MD5_checksum_application();
        if(ISendImage.class.isAssignableFrom(modelClass))
            return  createModelElement_SendImage();
        if(ILookupBlacklist.class.isAssignableFrom(modelClass))
            return  createModelElement_LookupBlacklist();
        if(IDial.class.isAssignableFrom(modelClass))
            return  createModelElement_Dial();
        if(IDBput.class.isAssignableFrom(modelClass))
            return  createModelElement_DBput();
        if(IExecIfTime.class.isAssignableFrom(modelClass))
            return  createModelElement_ExecIfTime();
        if(ISetAccount.class.isAssignableFrom(modelClass))
            return  createModelElement_SetAccount();
        if(ISIPGetHeader.class.isAssignableFrom(modelClass))
            return  createModelElement_SIPGetHeader();
        if(IVerbose.class.isAssignableFrom(modelClass))
            return  createModelElement_Verbose();
        if(IStopMusicOnHold.class.isAssignableFrom(modelClass))
            return  createModelElement_StopMusicOnHold();
        if(IWaitForSilence.class.isAssignableFrom(modelClass))
            return  createModelElement_WaitForSilence();
        if(ISMS.class.isAssignableFrom(modelClass))
            return  createModelElement_SMS();
        if(IMusicOnHold.class.isAssignableFrom(modelClass))
            return  createModelElement_MusicOnHold();
        if(IBusy.class.isAssignableFrom(modelClass))
            return  createModelElement_Busy();
        if(IGotoIfTime.class.isAssignableFrom(modelClass))
            return  createModelElement_GotoIfTime();
        if(ICongestion.class.isAssignableFrom(modelClass))
            return  createModelElement_Congestion();
        if(IDirectory.class.isAssignableFrom(modelClass))
            return  createModelElement_Directory();
        if(IAgentMonitorOutgoing.class.isAssignableFrom(modelClass))
            return  createModelElement_AgentMonitorOutgoing();
        if(IMath.class.isAssignableFrom(modelClass))
            return  createModelElement_Math();
        if(ISayUnixTime.class.isAssignableFrom(modelClass))
            return  createModelElement_SayUnixTime();
        if(ISetGlobalVar.class.isAssignableFrom(modelClass))
            return  createModelElement_SetGlobalVar();
        if(IWaitExten.class.isAssignableFrom(modelClass))
            return  createModelElement_WaitExten();
        if(IPrefix.class.isAssignableFrom(modelClass))
            return  createModelElement_Prefix();
        if(ITrySystem.class.isAssignableFrom(modelClass))
            return  createModelElement_TrySystem();
        if(IRemoveQueueMember.class.isAssignableFrom(modelClass))
            return  createModelElement_RemoveQueueMember();
        if(IRealTime.class.isAssignableFrom(modelClass))
            return  createModelElement_RealTime();
        if(IICES.class.isAssignableFrom(modelClass))
            return  createModelElement_ICES();
        if(IAGI.class.isAssignableFrom(modelClass))
            return  createModelElement_AGI();
        if(IEndWhile.class.isAssignableFrom(modelClass))
            return  createModelElement_EndWhile();
        if(IGetCPEID.class.isAssignableFrom(modelClass))
            return  createModelElement_GetCPEID();
        if(IVMAuthenticate.class.isAssignableFrom(modelClass))
            return  createModelElement_VMAuthenticate();
        if(ISetCDRUserField.class.isAssignableFrom(modelClass))
            return  createModelElement_SetCDRUserField();
        if(IDISA.class.isAssignableFrom(modelClass))
            return  createModelElement_DISA();
        if(ISendURL.class.isAssignableFrom(modelClass))
            return  createModelElement_SendURL();
        if(ITestClient.class.isAssignableFrom(modelClass))
            return  createModelElement_TestClient();
        if(IDUNDiLookup.class.isAssignableFrom(modelClass))
            return  createModelElement_DUNDiLookup();
        if(IPark.class.isAssignableFrom(modelClass))
            return  createModelElement_Park();
        if(IStartMusicOnHold.class.isAssignableFrom(modelClass))
            return  createModelElement_StartMusicOnHold();
        if(IAddQueueMember.class.isAssignableFrom(modelClass))
            return  createModelElement_AddQueueMember();
        if(IParkAndAnnounce.class.isAssignableFrom(modelClass))
            return  createModelElement_ParkAndAnnounce();
        if(IMacroExit.class.isAssignableFrom(modelClass))
            return  createModelElement_MacroExit();
        if(ISubString.class.isAssignableFrom(modelClass))
            return  createModelElement_SubString();
        if(ISayNumber.class.isAssignableFrom(modelClass))
            return  createModelElement_SayNumber();
        if(IBackground.class.isAssignableFrom(modelClass))
            return  createModelElement_Background();
        if(INBScat.class.isAssignableFrom(modelClass))
            return  createModelElement_NBScat();
        if(IHasNewVoicemail.class.isAssignableFrom(modelClass))
            return  createModelElement_HasNewVoicemail();
        if(ISystem.class.isAssignableFrom(modelClass))
            return  createModelElement_System();
        if(IGotoIf.class.isAssignableFrom(modelClass))
            return  createModelElement_GotoIf();
        if(ISetRDNIS.class.isAssignableFrom(modelClass))
            return  createModelElement_SetRDNIS();
        if(IExecIF.class.isAssignableFrom(modelClass))
            return  createModelElement_ExecIF();
        if(IMeetMeAdmin.class.isAssignableFrom(modelClass))
            return  createModelElement_MeetMeAdmin();
        if(ISetMusicOnHold.class.isAssignableFrom(modelClass))
            return  createModelElement_SetMusicOnHold();
        if(IVoiceMail.class.isAssignableFrom(modelClass))
            return  createModelElement_VoiceMail();
        if(IWaitForRing.class.isAssignableFrom(modelClass))
            return  createModelElement_WaitForRing();
        if(IPlaytones.class.isAssignableFrom(modelClass))
            return  createModelElement_Playtones();
        if(ISayCountPL.class.isAssignableFrom(modelClass))
            return  createModelElement_SayCountPL();
        if(IStopMonitor.class.isAssignableFrom(modelClass))
            return  createModelElement_StopMonitor();
        if(IGetGroupMatchCount.class.isAssignableFrom(modelClass))
            return  createModelElement_GetGroupMatchCount();
        if(IWait.class.isAssignableFrom(modelClass))
            return  createModelElement_Wait();
        if(IZapateller.class.isAssignableFrom(modelClass))
            return  createModelElement_Zapateller();
        if(IExec.class.isAssignableFrom(modelClass))
            return  createModelElement_Exec();
        if(ISendText.class.isAssignableFrom(modelClass))
            return  createModelElement_SendText();
        if(IZapBarge.class.isAssignableFrom(modelClass))
            return  createModelElement_ZapBarge();
        if(ISuffix.class.isAssignableFrom(modelClass))
            return  createModelElement_Suffix();
        if(IDateTime.class.isAssignableFrom(modelClass))
            return  createModelElement_DateTime();
        if(IMD5Check.class.isAssignableFrom(modelClass))
            return  createModelElement_MD5Check();
        if(IGoto.class.isAssignableFrom(modelClass))
            return  createModelElement_Goto();
        if(IDumpChan.class.isAssignableFrom(modelClass))
            return  createModelElement_DumpChan();
        if(IMonitor.class.isAssignableFrom(modelClass))
            return  createModelElement_Monitor();
        if(IDBdeltree.class.isAssignableFrom(modelClass))
            return  createModelElement_DBdeltree();
        if(ICheckGroup.class.isAssignableFrom(modelClass))
            return  createModelElement_CheckGroup();
        if(INoOp.class.isAssignableFrom(modelClass))
            return  createModelElement_NoOp();
        if(IResetCDR.class.isAssignableFrom(modelClass))
            return  createModelElement_ResetCDR();
        if(IRealTimeUpdate.class.isAssignableFrom(modelClass))
            return  createModelElement_RealTimeUpdate();
        if(IControlPlayback.class.isAssignableFrom(modelClass))
            return  createModelElement_ControlPlayback();
        if(IFestival.class.isAssignableFrom(modelClass))
            return  createModelElement_Festival();
        if(IForkCDR.class.isAssignableFrom(modelClass))
            return  createModelElement_ForkCDR();
        if(IProgress.class.isAssignableFrom(modelClass))
            return  createModelElement_Progress();
        if(IBackgroundDetect.class.isAssignableFrom(modelClass))
            return  createModelElement_BackgroundDetect();
        if(IHangup.class.isAssignableFrom(modelClass))
            return  createModelElement_Hangup();
        if(IMeetMeCount.class.isAssignableFrom(modelClass))
            return  createModelElement_MeetMeCount();
        if(IReadFile.class.isAssignableFrom(modelClass))
            return  createModelElement_ReadFile();
        if(IADSIProg.class.isAssignableFrom(modelClass))
            return  createModelElement_ADSIProg();
        if(IZapScan.class.isAssignableFrom(modelClass))
            return  createModelElement_ZapScan();
        if(IZapRAS.class.isAssignableFrom(modelClass))
            return  createModelElement_ZapRAS();
        if(ITestServer.class.isAssignableFrom(modelClass))
            return  createModelElement_TestServer();
        if(ISayDigits.class.isAssignableFrom(modelClass))
            return  createModelElement_SayDigits();
        if(ITXTCIDName.class.isAssignableFrom(modelClass))
            return  createModelElement_TXTCIDName();
        if(ISoftHangup.class.isAssignableFrom(modelClass))
            return  createModelElement_SoftHangup();
        if(ISetLanguage.class.isAssignableFrom(modelClass))
            return  createModelElement_SetLanguage();
        if(IPrivacyManager.class.isAssignableFrom(modelClass))
            return  createModelElement_PrivacyManager();
        if(IEcho.class.isAssignableFrom(modelClass))
            return  createModelElement_Echo();
        if(ISetCallerID.class.isAssignableFrom(modelClass))
            return  createModelElement_SetCallerID();
        if(IStripMSD.class.isAssignableFrom(modelClass))
            return  createModelElement_StripMSD();
        if(ISetAMAFlags.class.isAssignableFrom(modelClass))
            return  createModelElement_SetAMAFlags();
        if(IImportVar.class.isAssignableFrom(modelClass))
            return  createModelElement_ImportVar();
        if(IWaitMusicOnHold.class.isAssignableFrom(modelClass))
            return  createModelElement_WaitMusicOnHold();
        if(IQueue.class.isAssignableFrom(modelClass))
            return  createModelElement_Queue();
        if(IRecord.class.isAssignableFrom(modelClass))
            return  createModelElement_Record();
        if(IStripLSD.class.isAssignableFrom(modelClass))
            return  createModelElement_StripLSD();
        if(IHasVoicemail.class.isAssignableFrom(modelClass))
            return  createModelElement_HasVoicemail();
        if(IAbsoluteTimeout.class.isAssignableFrom(modelClass))
            return  createModelElement_AbsoluteTimeout();
        if(ISIPAddHeader.class.isAssignableFrom(modelClass))
            return  createModelElement_SIPAddHeader();
        if(IEAGI.class.isAssignableFrom(modelClass))
            return  createModelElement_EAGI();
        if(IAuthenticate.class.isAssignableFrom(modelClass))
            return  createModelElement_Authenticate();
        if(IUnpauseQueueMember.class.isAssignableFrom(modelClass))
            return  createModelElement_UnpauseQueueMember();
        if(IMacroIf.class.isAssignableFrom(modelClass))
            return  createModelElement_MacroIf();
        if(IEnumLookup.class.isAssignableFrom(modelClass))
            return  createModelElement_EnumLookup();
        if(ISIPDtmfMode.class.isAssignableFrom(modelClass))
            return  createModelElement_SIPDtmfMode();
        if(ISetCIDName.class.isAssignableFrom(modelClass))
            return  createModelElement_SetCIDName();
        if(ICut.class.isAssignableFrom(modelClass))
            return  createModelElement_Cut();
        if(IAnswer.class.isAssignableFrom(modelClass))
            return  createModelElement_Answer();
        if(ISayPhonetic.class.isAssignableFrom(modelClass))
            return  createModelElement_SayPhonetic();
        if(INoCDR.class.isAssignableFrom(modelClass))
            return  createModelElement_NoCDR();
        if(IAgentLogin.class.isAssignableFrom(modelClass))
            return  createModelElement_AgentLogin();
        if(IWhile.class.isAssignableFrom(modelClass))
            return  createModelElement_While();
        if(IMailboxExists.class.isAssignableFrom(modelClass))
            return  createModelElement_MailboxExists();
        if(IMeetMe.class.isAssignableFrom(modelClass))
            return  createModelElement_MeetMe();
        if(IDBget.class.isAssignableFrom(modelClass))
            return  createModelElement_DBget();
        if(IRinging.class.isAssignableFrom(modelClass))
            return  createModelElement_Ringing();
        if(IRetryDial.class.isAssignableFrom(modelClass))
            return  createModelElement_RetryDial();
        if(IFlash.class.isAssignableFrom(modelClass))
            return  createModelElement_Flash();
        if(ISayAlpha.class.isAssignableFrom(modelClass))
            return  createModelElement_SayAlpha();
        if(IVoiceMailMain.class.isAssignableFrom(modelClass))
            return  createModelElement_VoiceMailMain();
        if(IPlayback.class.isAssignableFrom(modelClass))
            return  createModelElement_Playback();
        if(IDBdel.class.isAssignableFrom(modelClass))
            return  createModelElement_DBdel();
        if(IResponseTimeout.class.isAssignableFrom(modelClass))
            return  createModelElement_ResponseTimeout();
        if(ISendDTMF.class.isAssignableFrom(modelClass))
            return  createModelElement_SendDTMF();
        if(IAlarmReceiver.class.isAssignableFrom(modelClass))
            return  createModelElement_AlarmReceiver();
        if(IRead.class.isAssignableFrom(modelClass))
            return  createModelElement_Read();
        if(ISetVar.class.isAssignableFrom(modelClass))
            return  createModelElement_SetVar();
        if(IMilliwatt.class.isAssignableFrom(modelClass))
            return  createModelElement_Milliwatt();
        if(IRandom.class.isAssignableFrom(modelClass))
            return  createModelElement_Random();
        return super.createModelElement(modelClass);
    }

	public abstract Object createAppFromString(String app);

    public Object createModelElement(Object model) {
        // TODO Automatisch erstellter Methoden-Stub
        return super.createModelElement(model);
    }

    public Object createTypeFromString(String typeName, String value) {
		return super.createTypeFromString(typeName, value);
    }

    public Object createTypeFromString(Class type, String value) {
        return super.createTypeFromString(type, value);
    }

    public String typeToString(Object obj) {
        return super.typeToString(obj);
    }
    
   public Object getIn(Node node){
        if(in == null)
        {
            return null;
        }

        return in.get(node);
    }

    public void setIn(Node node, Object in){
        if(this.in == null)
        {
            this.in = new Hashtable(1);
        }

        if(in != null)
        {
            this.in.put(node, in);
        }
        else
        {
            this.in.remove(node);
        }
    }

    public Object getOut(Node node){
        if(out == null)
        {
            return null;
        }

        return out.get(node);
    }

    public void setOut(Node node, Object out){
        if(this.out == null)
        {
            this.out = new Hashtable(1);
        }

        if(out != null)
        {
            this.out.put(node, out);
        }
        else
        {
            this.out.remove(node);
        }
    }

    public void defaultIn(Node node){
    }

    public void defaultOut(Node node){
    }

    public void caseStart(Start node){
        inStart(node);
        node.getPApp().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

   public void inStart(Start node){
        defaultIn(node);
    }

    public void outStart(Start node){
        defaultOut(node);
    }

    protected void setParas(List typedList, Object theApp) {
        if(theApp instanceof  IChanIsAvail)
            setParas_ChanIsAvail(typedList,(IChanIsAvail)theApp);
		else
        if(theApp instanceof  IMacro)
            setParas_Macro(typedList,(IMacro)theApp);
		else
        if(theApp instanceof  ISetCIDNum)
            setParas_SetCIDNum(typedList,(ISetCIDNum)theApp);
		else
        if(theApp instanceof  IAgentCallbackLogin)
            setParas_AgentCallbackLogin(typedList,(IAgentCallbackLogin)theApp);
		else
        if(theApp instanceof  IChangeMonitor)
            setParas_ChangeMonitor(typedList,(IChangeMonitor)theApp);
		else
        if(theApp instanceof  IIAX2Provision)
            setParas_IAX2Provision(typedList,(IIAX2Provision)theApp);
		else
        if(theApp instanceof  IUserEvent)
            setParas_UserEvent(typedList,(IUserEvent)theApp);
		else
        if(theApp instanceof  IMP3Player)
            setParas_MP3Player(typedList,(IMP3Player)theApp);
		else
        if(theApp instanceof  ITransfer)
            setParas_Transfer(typedList,(ITransfer)theApp);
		else
        if(theApp instanceof  IDigitTimeout)
            setParas_DigitTimeout(typedList,(IDigitTimeout)theApp);
		else
        if(theApp instanceof  IEval)
            setParas_Eval(typedList,(IEval)theApp);
		else
        if(theApp instanceof  ISetGroup)
            setParas_SetGroup(typedList,(ISetGroup)theApp);
		else
        if(theApp instanceof  IGetGroupCount)
            setParas_GetGroupCount(typedList,(IGetGroupCount)theApp);
		else
        if(theApp instanceof  IStopPlaytones)
            setParas_StopPlaytones(typedList,(IStopPlaytones)theApp);
		else
        if(theApp instanceof  ILookupCIDName)
            setParas_LookupCIDName(typedList,(ILookupCIDName)theApp);
		else
        if(theApp instanceof  IAppendCDRUserField)
            setParas_AppendCDRUserField(typedList,(IAppendCDRUserField)theApp);
		else
        if(theApp instanceof  IPauseQueueMember)
            setParas_PauseQueueMember(typedList,(IPauseQueueMember)theApp);
		else
        if(theApp instanceof  IDeadAGI)
            setParas_DeadAGI(typedList,(IDeadAGI)theApp);
		else
        if(theApp instanceof  IParkedCall)
            setParas_ParkedCall(typedList,(IParkedCall)theApp);
		else
        if(theApp instanceof  ISetCallerPres)
            setParas_SetCallerPres(typedList,(ISetCallerPres)theApp);
		else
        if(theApp instanceof  IMD5_checksum_application)
            setParas_MD5_checksum_application(typedList,(IMD5_checksum_application)theApp);
		else
        if(theApp instanceof  ISendImage)
            setParas_SendImage(typedList,(ISendImage)theApp);
		else
        if(theApp instanceof  ILookupBlacklist)
            setParas_LookupBlacklist(typedList,(ILookupBlacklist)theApp);
		else
        if(theApp instanceof  IDial)
            setParas_Dial(typedList,(IDial)theApp);
		else
        if(theApp instanceof  IDBput)
            setParas_DBput(typedList,(IDBput)theApp);
		else
        if(theApp instanceof  IExecIfTime)
            setParas_ExecIfTime(typedList,(IExecIfTime)theApp);
		else
        if(theApp instanceof  ISetAccount)
            setParas_SetAccount(typedList,(ISetAccount)theApp);
		else
        if(theApp instanceof  ISIPGetHeader)
            setParas_SIPGetHeader(typedList,(ISIPGetHeader)theApp);
		else
        if(theApp instanceof  IVerbose)
            setParas_Verbose(typedList,(IVerbose)theApp);
		else
        if(theApp instanceof  IStopMusicOnHold)
            setParas_StopMusicOnHold(typedList,(IStopMusicOnHold)theApp);
		else
        if(theApp instanceof  IWaitForSilence)
            setParas_WaitForSilence(typedList,(IWaitForSilence)theApp);
		else
        if(theApp instanceof  ISMS)
            setParas_SMS(typedList,(ISMS)theApp);
		else
        if(theApp instanceof  IMusicOnHold)
            setParas_MusicOnHold(typedList,(IMusicOnHold)theApp);
		else
        if(theApp instanceof  IBusy)
            setParas_Busy(typedList,(IBusy)theApp);
		else
        if(theApp instanceof  IGotoIfTime)
            setParas_GotoIfTime(typedList,(IGotoIfTime)theApp);
		else
        if(theApp instanceof  ICongestion)
            setParas_Congestion(typedList,(ICongestion)theApp);
		else
        if(theApp instanceof  IDirectory)
            setParas_Directory(typedList,(IDirectory)theApp);
		else
        if(theApp instanceof  IAgentMonitorOutgoing)
            setParas_AgentMonitorOutgoing(typedList,(IAgentMonitorOutgoing)theApp);
		else
        if(theApp instanceof  IMath)
            setParas_Math(typedList,(IMath)theApp);
		else
        if(theApp instanceof  ISayUnixTime)
            setParas_SayUnixTime(typedList,(ISayUnixTime)theApp);
		else
        if(theApp instanceof  ISetGlobalVar)
            setParas_SetGlobalVar(typedList,(ISetGlobalVar)theApp);
		else
        if(theApp instanceof  IWaitExten)
            setParas_WaitExten(typedList,(IWaitExten)theApp);
		else
        if(theApp instanceof  IPrefix)
            setParas_Prefix(typedList,(IPrefix)theApp);
		else
        if(theApp instanceof  ITrySystem)
            setParas_TrySystem(typedList,(ITrySystem)theApp);
		else
        if(theApp instanceof  IRemoveQueueMember)
            setParas_RemoveQueueMember(typedList,(IRemoveQueueMember)theApp);
		else
        if(theApp instanceof  IRealTime)
            setParas_RealTime(typedList,(IRealTime)theApp);
		else
        if(theApp instanceof  IICES)
            setParas_ICES(typedList,(IICES)theApp);
		else
        if(theApp instanceof  IAGI)
            setParas_AGI(typedList,(IAGI)theApp);
		else
        if(theApp instanceof  IEndWhile)
            setParas_EndWhile(typedList,(IEndWhile)theApp);
		else
        if(theApp instanceof  IGetCPEID)
            setParas_GetCPEID(typedList,(IGetCPEID)theApp);
		else
        if(theApp instanceof  IVMAuthenticate)
            setParas_VMAuthenticate(typedList,(IVMAuthenticate)theApp);
		else
        if(theApp instanceof  ISetCDRUserField)
            setParas_SetCDRUserField(typedList,(ISetCDRUserField)theApp);
		else
        if(theApp instanceof  IDISA)
            setParas_DISA(typedList,(IDISA)theApp);
		else
        if(theApp instanceof  ISendURL)
            setParas_SendURL(typedList,(ISendURL)theApp);
		else
        if(theApp instanceof  ITestClient)
            setParas_TestClient(typedList,(ITestClient)theApp);
		else
        if(theApp instanceof  IDUNDiLookup)
            setParas_DUNDiLookup(typedList,(IDUNDiLookup)theApp);
		else
        if(theApp instanceof  IPark)
            setParas_Park(typedList,(IPark)theApp);
		else
        if(theApp instanceof  IStartMusicOnHold)
            setParas_StartMusicOnHold(typedList,(IStartMusicOnHold)theApp);
		else
        if(theApp instanceof  IAddQueueMember)
            setParas_AddQueueMember(typedList,(IAddQueueMember)theApp);
		else
        if(theApp instanceof  IParkAndAnnounce)
            setParas_ParkAndAnnounce(typedList,(IParkAndAnnounce)theApp);
		else
        if(theApp instanceof  IMacroExit)
            setParas_MacroExit(typedList,(IMacroExit)theApp);
		else
        if(theApp instanceof  ISubString)
            setParas_SubString(typedList,(ISubString)theApp);
		else
        if(theApp instanceof  ISayNumber)
            setParas_SayNumber(typedList,(ISayNumber)theApp);
		else
        if(theApp instanceof  IBackground)
            setParas_Background(typedList,(IBackground)theApp);
		else
        if(theApp instanceof  INBScat)
            setParas_NBScat(typedList,(INBScat)theApp);
		else
        if(theApp instanceof  IHasNewVoicemail)
            setParas_HasNewVoicemail(typedList,(IHasNewVoicemail)theApp);
		else
        if(theApp instanceof  ISystem)
            setParas_System(typedList,(ISystem)theApp);
		else
        if(theApp instanceof  IGotoIf)
            setParas_GotoIf(typedList,(IGotoIf)theApp);
		else
        if(theApp instanceof  ISetRDNIS)
            setParas_SetRDNIS(typedList,(ISetRDNIS)theApp);
		else
        if(theApp instanceof  IExecIF)
            setParas_ExecIF(typedList,(IExecIF)theApp);
		else
        if(theApp instanceof  IMeetMeAdmin)
            setParas_MeetMeAdmin(typedList,(IMeetMeAdmin)theApp);
		else
        if(theApp instanceof  ISetMusicOnHold)
            setParas_SetMusicOnHold(typedList,(ISetMusicOnHold)theApp);
		else
        if(theApp instanceof  IVoiceMail)
            setParas_VoiceMail(typedList,(IVoiceMail)theApp);
		else
        if(theApp instanceof  IWaitForRing)
            setParas_WaitForRing(typedList,(IWaitForRing)theApp);
		else
        if(theApp instanceof  IPlaytones)
            setParas_Playtones(typedList,(IPlaytones)theApp);
		else
        if(theApp instanceof  ISayCountPL)
            setParas_SayCountPL(typedList,(ISayCountPL)theApp);
		else
        if(theApp instanceof  IStopMonitor)
            setParas_StopMonitor(typedList,(IStopMonitor)theApp);
		else
        if(theApp instanceof  IGetGroupMatchCount)
            setParas_GetGroupMatchCount(typedList,(IGetGroupMatchCount)theApp);
		else
        if(theApp instanceof  IWait)
            setParas_Wait(typedList,(IWait)theApp);
		else
        if(theApp instanceof  IZapateller)
            setParas_Zapateller(typedList,(IZapateller)theApp);
		else
        if(theApp instanceof  IExec)
            setParas_Exec(typedList,(IExec)theApp);
		else
        if(theApp instanceof  ISendText)
            setParas_SendText(typedList,(ISendText)theApp);
		else
        if(theApp instanceof  IZapBarge)
            setParas_ZapBarge(typedList,(IZapBarge)theApp);
		else
        if(theApp instanceof  ISuffix)
            setParas_Suffix(typedList,(ISuffix)theApp);
		else
        if(theApp instanceof  IDateTime)
            setParas_DateTime(typedList,(IDateTime)theApp);
		else
        if(theApp instanceof  IMD5Check)
            setParas_MD5Check(typedList,(IMD5Check)theApp);
		else
        if(theApp instanceof  IGoto)
            setParas_Goto(typedList,(IGoto)theApp);
		else
        if(theApp instanceof  IDumpChan)
            setParas_DumpChan(typedList,(IDumpChan)theApp);
		else
        if(theApp instanceof  IMonitor)
            setParas_Monitor(typedList,(IMonitor)theApp);
		else
        if(theApp instanceof  IDBdeltree)
            setParas_DBdeltree(typedList,(IDBdeltree)theApp);
		else
        if(theApp instanceof  ICheckGroup)
            setParas_CheckGroup(typedList,(ICheckGroup)theApp);
		else
        if(theApp instanceof  INoOp)
            setParas_NoOp(typedList,(INoOp)theApp);
		else
        if(theApp instanceof  IResetCDR)
            setParas_ResetCDR(typedList,(IResetCDR)theApp);
		else
        if(theApp instanceof  IRealTimeUpdate)
            setParas_RealTimeUpdate(typedList,(IRealTimeUpdate)theApp);
		else
        if(theApp instanceof  IControlPlayback)
            setParas_ControlPlayback(typedList,(IControlPlayback)theApp);
		else
        if(theApp instanceof  IFestival)
            setParas_Festival(typedList,(IFestival)theApp);
		else
        if(theApp instanceof  IForkCDR)
            setParas_ForkCDR(typedList,(IForkCDR)theApp);
		else
        if(theApp instanceof  IProgress)
            setParas_Progress(typedList,(IProgress)theApp);
		else
        if(theApp instanceof  IBackgroundDetect)
            setParas_BackgroundDetect(typedList,(IBackgroundDetect)theApp);
		else
        if(theApp instanceof  IHangup)
            setParas_Hangup(typedList,(IHangup)theApp);
		else
        if(theApp instanceof  IMeetMeCount)
            setParas_MeetMeCount(typedList,(IMeetMeCount)theApp);
		else
        if(theApp instanceof  IReadFile)
            setParas_ReadFile(typedList,(IReadFile)theApp);
		else
        if(theApp instanceof  IADSIProg)
            setParas_ADSIProg(typedList,(IADSIProg)theApp);
		else
        if(theApp instanceof  IZapScan)
            setParas_ZapScan(typedList,(IZapScan)theApp);
		else
        if(theApp instanceof  IZapRAS)
            setParas_ZapRAS(typedList,(IZapRAS)theApp);
		else
        if(theApp instanceof  ITestServer)
            setParas_TestServer(typedList,(ITestServer)theApp);
		else
        if(theApp instanceof  ISayDigits)
            setParas_SayDigits(typedList,(ISayDigits)theApp);
		else
        if(theApp instanceof  ITXTCIDName)
            setParas_TXTCIDName(typedList,(ITXTCIDName)theApp);
		else
        if(theApp instanceof  ISoftHangup)
            setParas_SoftHangup(typedList,(ISoftHangup)theApp);
		else
        if(theApp instanceof  ISetLanguage)
            setParas_SetLanguage(typedList,(ISetLanguage)theApp);
		else
        if(theApp instanceof  IPrivacyManager)
            setParas_PrivacyManager(typedList,(IPrivacyManager)theApp);
		else
        if(theApp instanceof  IEcho)
            setParas_Echo(typedList,(IEcho)theApp);
		else
        if(theApp instanceof  ISetCallerID)
            setParas_SetCallerID(typedList,(ISetCallerID)theApp);
		else
        if(theApp instanceof  IStripMSD)
            setParas_StripMSD(typedList,(IStripMSD)theApp);
		else
        if(theApp instanceof  ISetAMAFlags)
            setParas_SetAMAFlags(typedList,(ISetAMAFlags)theApp);
		else
        if(theApp instanceof  IImportVar)
            setParas_ImportVar(typedList,(IImportVar)theApp);
		else
        if(theApp instanceof  IWaitMusicOnHold)
            setParas_WaitMusicOnHold(typedList,(IWaitMusicOnHold)theApp);
		else
        if(theApp instanceof  IQueue)
            setParas_Queue(typedList,(IQueue)theApp);
		else
        if(theApp instanceof  IRecord)
            setParas_Record(typedList,(IRecord)theApp);
		else
        if(theApp instanceof  IStripLSD)
            setParas_StripLSD(typedList,(IStripLSD)theApp);
		else
        if(theApp instanceof  IHasVoicemail)
            setParas_HasVoicemail(typedList,(IHasVoicemail)theApp);
		else
        if(theApp instanceof  IAbsoluteTimeout)
            setParas_AbsoluteTimeout(typedList,(IAbsoluteTimeout)theApp);
		else
        if(theApp instanceof  ISIPAddHeader)
            setParas_SIPAddHeader(typedList,(ISIPAddHeader)theApp);
		else
        if(theApp instanceof  IEAGI)
            setParas_EAGI(typedList,(IEAGI)theApp);
		else
        if(theApp instanceof  IAuthenticate)
            setParas_Authenticate(typedList,(IAuthenticate)theApp);
		else
        if(theApp instanceof  IUnpauseQueueMember)
            setParas_UnpauseQueueMember(typedList,(IUnpauseQueueMember)theApp);
		else
        if(theApp instanceof  IMacroIf)
            setParas_MacroIf(typedList,(IMacroIf)theApp);
		else
        if(theApp instanceof  IEnumLookup)
            setParas_EnumLookup(typedList,(IEnumLookup)theApp);
		else
        if(theApp instanceof  ISIPDtmfMode)
            setParas_SIPDtmfMode(typedList,(ISIPDtmfMode)theApp);
		else
        if(theApp instanceof  ISetCIDName)
            setParas_SetCIDName(typedList,(ISetCIDName)theApp);
		else
        if(theApp instanceof  ICut)
            setParas_Cut(typedList,(ICut)theApp);
		else
        if(theApp instanceof  IAnswer)
            setParas_Answer(typedList,(IAnswer)theApp);
		else
        if(theApp instanceof  ISayPhonetic)
            setParas_SayPhonetic(typedList,(ISayPhonetic)theApp);
		else
        if(theApp instanceof  INoCDR)
            setParas_NoCDR(typedList,(INoCDR)theApp);
		else
        if(theApp instanceof  IAgentLogin)
            setParas_AgentLogin(typedList,(IAgentLogin)theApp);
		else
        if(theApp instanceof  IWhile)
            setParas_While(typedList,(IWhile)theApp);
		else
        if(theApp instanceof  IMailboxExists)
            setParas_MailboxExists(typedList,(IMailboxExists)theApp);
		else
        if(theApp instanceof  IMeetMe)
            setParas_MeetMe(typedList,(IMeetMe)theApp);
		else
        if(theApp instanceof  IDBget)
            setParas_DBget(typedList,(IDBget)theApp);
		else
        if(theApp instanceof  IRinging)
            setParas_Ringing(typedList,(IRinging)theApp);
		else
        if(theApp instanceof  IRetryDial)
            setParas_RetryDial(typedList,(IRetryDial)theApp);
		else
        if(theApp instanceof  IFlash)
            setParas_Flash(typedList,(IFlash)theApp);
		else
        if(theApp instanceof  ISayAlpha)
            setParas_SayAlpha(typedList,(ISayAlpha)theApp);
		else
        if(theApp instanceof  IVoiceMailMain)
            setParas_VoiceMailMain(typedList,(IVoiceMailMain)theApp);
		else
        if(theApp instanceof  IPlayback)
            setParas_Playback(typedList,(IPlayback)theApp);
		else
        if(theApp instanceof  IDBdel)
            setParas_DBdel(typedList,(IDBdel)theApp);
		else
        if(theApp instanceof  IResponseTimeout)
            setParas_ResponseTimeout(typedList,(IResponseTimeout)theApp);
		else
        if(theApp instanceof  ISendDTMF)
            setParas_SendDTMF(typedList,(ISendDTMF)theApp);
		else
        if(theApp instanceof  IAlarmReceiver)
            setParas_AlarmReceiver(typedList,(IAlarmReceiver)theApp);
		else
        if(theApp instanceof  IRead)
            setParas_Read(typedList,(IRead)theApp);
		else
        if(theApp instanceof  ISetVar)
            setParas_SetVar(typedList,(ISetVar)theApp);
		else
        if(theApp instanceof  IMilliwatt)
            setParas_Milliwatt(typedList,(IMilliwatt)theApp);
		else
        if(theApp instanceof  IRandom)
            setParas_Random(typedList,(IRandom)theApp);
		else
	if(true);
    }


// public  void caseAChanisavailAppApp(AChanisavailAppApp node) {
//        PChanisavailApp app_ = node.getChanisavailApp();
//        if (app_ instanceof AChanisavailApp) {
//            AChanisavailApp app = (AChanisavailApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            ChanIsAvail mapp = (ChanIsAvail) createModelElement_ChanIsAvail();
// 
// 			setParas_Chanisavail(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AChanisavailApp)

//}
	
 protected void setParas_ChanIsAvail (List typedList,IChanIsAvail anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, ChanIsAvail) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==6){
		anApp.setFormatstr(typedList.get(0).toString());
		anApp.setTechnology(typedList.get(1).toString());
		anApp.setResource(typedList.get(2).toString());
		anApp.setTechnology2(typedList.get(3).toString());
		anApp.setResource2(typedList.get(4).toString());
		anApp.setOption(typedList.get(5).toString());
	}
 }	

// public  void caseAChanisavailApp(AChanisavailApp node) {
            //return new ChanisavailImpl();
//}
// public  void caseTChanisavail(TChanisavail node) {
            //return new ChanisavailImpl();
//}
// public  void caseAMacroAppApp(AMacroAppApp node) {
//        PMacroApp app_ = node.getMacroApp();
//        if (app_ instanceof AMacroApp) {
//            AMacroApp app = (AMacroApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Macro mapp = (Macro) createModelElement_Macro();
// 
// 			setParas_Macro(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AMacroApp)

//}
	
 protected void setParas_Macro (List typedList,IMacro anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Macro) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==3){
		anApp.setMacroname(typedList.get(0).toString());
		anApp.setArg1(typedList.get(1).toString());
		anApp.setArg2(typedList.get(2).toString());
	}
 }	

// public  void caseAMacroApp(AMacroApp node) {
            //return new MacroImpl();
//}
// public  void caseTMacro(TMacro node) {
            //return new MacroImpl();
//}
// public  void caseASetcidnumAppApp(ASetcidnumAppApp node) {
//        PSetcidnumApp app_ = node.getSetcidnumApp();
//        if (app_ instanceof ASetcidnumApp) {
//            ASetcidnumApp app = (ASetcidnumApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            SetCIDNum mapp = (SetCIDNum) createModelElement_SetCIDNum();
// 
// 			setParas_Setcidnum(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ASetcidnumApp)

//}
	
 protected void setParas_SetCIDNum (List typedList,ISetCIDNum anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, SetCIDNum) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setCnum(typedList.get(0).toString());
		anApp.setA(typedList.get(1).toString());
	}
 }	

// public  void caseASetcidnumApp(ASetcidnumApp node) {
            //return new SetcidnumImpl();
//}
// public  void caseTSetcidnum(TSetcidnum node) {
            //return new SetcidnumImpl();
//}
// public  void caseAAgentcallbackloginAppApp(AAgentcallbackloginAppApp node) {
//        PAgentcallbackloginApp app_ = node.getAgentcallbackloginApp();
//        if (app_ instanceof AAgentcallbackloginApp) {
//            AAgentcallbackloginApp app = (AAgentcallbackloginApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            AgentCallbackLogin mapp = (AgentCallbackLogin) createModelElement_AgentCallbackLogin();
// 
// 			setParas_Agentcallbacklogin(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AAgentcallbackloginApp)

//}
	
 protected void setParas_AgentCallbackLogin (List typedList,IAgentCallbackLogin anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, AgentCallbackLogin) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==5){
		anApp.setAgentNo(typedList.get(0).toString());
		anApp.setOptions(typedList.get(1).toString());
		anApp.setExten(typedList.get(2).toString());
		anApp.setContext(typedList.get(3).toString());
	}
 }	

// public  void caseAAgentcallbackloginApp(AAgentcallbackloginApp node) {
            //return new AgentcallbackloginImpl();
//}
// public  void caseTAgentcallbacklogin(TAgentcallbacklogin node) {
            //return new AgentcallbackloginImpl();
//}
// public  void caseAChangemonitorAppApp(AChangemonitorAppApp node) {
//        PChangemonitorApp app_ = node.getChangemonitorApp();
//        if (app_ instanceof AChangemonitorApp) {
//            AChangemonitorApp app = (AChangemonitorApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            ChangeMonitor mapp = (ChangeMonitor) createModelElement_ChangeMonitor();
// 
// 			setParas_Changemonitor(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AChangemonitorApp)

//}
	
 protected void setParas_ChangeMonitor (List typedList,IChangeMonitor anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, ChangeMonitor) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setFilename_base(typedList.get(0).toString());
	}
 }	

// public  void caseAChangemonitorApp(AChangemonitorApp node) {
            //return new ChangemonitorImpl();
//}
// public  void caseTChangemonitor(TChangemonitor node) {
            //return new ChangemonitorImpl();
//}
// public  void caseAIax2provisionAppApp(AIax2provisionAppApp node) {
//        PIax2provisionApp app_ = node.getIax2provisionApp();
//        if (app_ instanceof AIax2provisionApp) {
//            AIax2provisionApp app = (AIax2provisionApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            IAX2Provision mapp = (IAX2Provision) createModelElement_IAX2Provision();
// 
// 			setParas_Iax2provision(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AIax2provisionApp)

//}
	
 protected void setParas_IAX2Provision (List typedList,IIAX2Provision anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, IAX2Provision) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setTemplate(typedList.get(0).toString());
	}
 }	

// public  void caseAIax2provisionApp(AIax2provisionApp node) {
            //return new Iax2provisionImpl();
//}
// public  void caseTIax2provision(TIax2provision node) {
            //return new Iax2provisionImpl();
//}
// public  void caseAUsereventAppApp(AUsereventAppApp node) {
//        PUsereventApp app_ = node.getUsereventApp();
//        if (app_ instanceof AUsereventApp) {
//            AUsereventApp app = (AUsereventApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            UserEvent mapp = (UserEvent) createModelElement_UserEvent();
// 
// 			setParas_Userevent(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AUsereventApp)

//}
	
 protected void setParas_UserEvent (List typedList,IUserEvent anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, UserEvent) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setEventname(typedList.get(0).toString());
		anApp.setBody(typedList.get(1).toString());
	}
 }	

// public  void caseAUsereventApp(AUsereventApp node) {
            //return new UsereventImpl();
//}
// public  void caseTUserevent(TUserevent node) {
            //return new UsereventImpl();
//}
// public  void caseAMp3playerAppApp(AMp3playerAppApp node) {
//        PMp3playerApp app_ = node.getMp3playerApp();
//        if (app_ instanceof AMp3playerApp) {
//            AMp3playerApp app = (AMp3playerApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            MP3Player mapp = (MP3Player) createModelElement_MP3Player();
// 
// 			setParas_Mp3player(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AMp3playerApp)

//}
	
 protected void setParas_MP3Player (List typedList,IMP3Player anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, MP3Player) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setLocation(typedList.get(0).toString());
	}
 }	

// public  void caseAMp3playerApp(AMp3playerApp node) {
            //return new Mp3playerImpl();
//}
// public  void caseTMp3player(TMp3player node) {
            //return new Mp3playerImpl();
//}
// public  void caseATransferAppApp(ATransferAppApp node) {
//        PTransferApp app_ = node.getTransferApp();
//        if (app_ instanceof ATransferApp) {
//            ATransferApp app = (ATransferApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Transfer mapp = (Transfer) createModelElement_Transfer();
// 
// 			setParas_Transfer(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ATransferApp)

//}
	
 protected void setParas_Transfer (List typedList,ITransfer anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Transfer) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setTech(typedList.get(0).toString());
		anApp.setDest(typedList.get(1).toString());
	}
 }	

// public  void caseATransferApp(ATransferApp node) {
            //return new TransferImpl();
//}
// public  void caseTTransfer(TTransfer node) {
            //return new TransferImpl();
//}
// public  void caseADigittimeoutAppApp(ADigittimeoutAppApp node) {
//        PDigittimeoutApp app_ = node.getDigittimeoutApp();
//        if (app_ instanceof ADigittimeoutApp) {
//            ADigittimeoutApp app = (ADigittimeoutApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            DigitTimeout mapp = (DigitTimeout) createModelElement_DigitTimeout();
// 
// 			setParas_Digittimeout(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ADigittimeoutApp)

//}
	
 protected void setParas_DigitTimeout (List typedList,IDigitTimeout anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, DigitTimeout) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setSeconds(typedList.get(0).toString());
	}
 }	

// public  void caseADigittimeoutApp(ADigittimeoutApp node) {
            //return new DigittimeoutImpl();
//}
// public  void caseTDigittimeout(TDigittimeout node) {
            //return new DigittimeoutImpl();
//}
// public  void caseAEvalAppApp(AEvalAppApp node) {
//        PEvalApp app_ = node.getEvalApp();
//        if (app_ instanceof AEvalApp) {
//            AEvalApp app = (AEvalApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Eval mapp = (Eval) createModelElement_Eval();
// 
// 			setParas_Eval(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AEvalApp)

//}
	
 protected void setParas_Eval (List typedList,IEval anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Eval) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setNewvar(typedList.get(0).toString());
		anApp.setSomestring(typedList.get(1).toString());
	}
 }	

// public  void caseAEvalApp(AEvalApp node) {
            //return new EvalImpl();
//}
// public  void caseTEval(TEval node) {
            //return new EvalImpl();
//}
// public  void caseASetgroupAppApp(ASetgroupAppApp node) {
//        PSetgroupApp app_ = node.getSetgroupApp();
//        if (app_ instanceof ASetgroupApp) {
//            ASetgroupApp app = (ASetgroupApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            SetGroup mapp = (SetGroup) createModelElement_SetGroup();
// 
// 			setParas_Setgroup(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ASetgroupApp)

//}
	
 protected void setParas_SetGroup (List typedList,ISetGroup anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, SetGroup) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setGroup(typedList.get(0).toString());
	}
 }	

// public  void caseASetgroupApp(ASetgroupApp node) {
            //return new SetgroupImpl();
//}
// public  void caseTSetgroup(TSetgroup node) {
            //return new SetgroupImpl();
//}
// public  void caseAGetgroupcountAppApp(AGetgroupcountAppApp node) {
//        PGetgroupcountApp app_ = node.getGetgroupcountApp();
//        if (app_ instanceof AGetgroupcountApp) {
//            AGetgroupcountApp app = (AGetgroupcountApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            GetGroupCount mapp = (GetGroupCount) createModelElement_GetGroupCount();
// 
// 			setParas_Getgroupcount(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AGetgroupcountApp)

//}
	
 protected void setParas_GetGroupCount (List typedList,IGetGroupCount anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, GetGroupCount) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setGroup(typedList.get(0).toString());
		anApp.setCategory(typedList.get(1).toString());
	}
 }	

// public  void caseAGetgroupcountApp(AGetgroupcountApp node) {
            //return new GetgroupcountImpl();
//}
// public  void caseTGetgroupcount(TGetgroupcount node) {
            //return new GetgroupcountImpl();
//}
// public  void caseAStopplaytonesAppApp(AStopplaytonesAppApp node) {
//        PStopplaytonesApp app_ = node.getStopplaytonesApp();
//        if (app_ instanceof AStopplaytonesApp) {
//            AStopplaytonesApp app = (AStopplaytonesApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            StopPlaytones mapp = (StopPlaytones) createModelElement_StopPlaytones();
// 
// 			setParas_Stopplaytones(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AStopplaytonesApp)

//}
	
 protected void setParas_StopPlaytones (List typedList,IStopPlaytones anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, StopPlaytones) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==0){
	}
 }	

// public  void caseAStopplaytonesApp(AStopplaytonesApp node) {
            //return new StopplaytonesImpl();
//}
// public  void caseTStopplaytones(TStopplaytones node) {
            //return new StopplaytonesImpl();
//}
// public  void caseALookupcidnameAppApp(ALookupcidnameAppApp node) {
//        PLookupcidnameApp app_ = node.getLookupcidnameApp();
//        if (app_ instanceof ALookupcidnameApp) {
//            ALookupcidnameApp app = (ALookupcidnameApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            LookupCIDName mapp = (LookupCIDName) createModelElement_LookupCIDName();
// 
// 			setParas_Lookupcidname(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ALookupcidnameApp)

//}
	
 protected void setParas_LookupCIDName (List typedList,ILookupCIDName anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, LookupCIDName) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==0){
	}
 }	

// public  void caseALookupcidnameApp(ALookupcidnameApp node) {
            //return new LookupcidnameImpl();
//}
// public  void caseTLookupcidname(TLookupcidname node) {
            //return new LookupcidnameImpl();
//}
// public  void caseAAppendcdruserfieldAppApp(AAppendcdruserfieldAppApp node) {
//        PAppendcdruserfieldApp app_ = node.getAppendcdruserfieldApp();
//        if (app_ instanceof AAppendcdruserfieldApp) {
//            AAppendcdruserfieldApp app = (AAppendcdruserfieldApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            AppendCDRUserField mapp = (AppendCDRUserField) createModelElement_AppendCDRUserField();
// 
// 			setParas_Appendcdruserfield(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AAppendcdruserfieldApp)

//}
	
 protected void setParas_AppendCDRUserField (List typedList,IAppendCDRUserField anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, AppendCDRUserField) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setValue(typedList.get(0).toString());
	}
 }	

// public  void caseAAppendcdruserfieldApp(AAppendcdruserfieldApp node) {
            //return new AppendcdruserfieldImpl();
//}
// public  void caseTAppendcdruserfield(TAppendcdruserfield node) {
            //return new AppendcdruserfieldImpl();
//}
// public  void caseAPausequeuememberAppApp(APausequeuememberAppApp node) {
//        PPausequeuememberApp app_ = node.getPausequeuememberApp();
//        if (app_ instanceof APausequeuememberApp) {
//            APausequeuememberApp app = (APausequeuememberApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            PauseQueueMember mapp = (PauseQueueMember) createModelElement_PauseQueueMember();
// 
// 			setParas_Pausequeuemember(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof APausequeuememberApp)

//}
	
 protected void setParas_PauseQueueMember (List typedList,IPauseQueueMember anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, PauseQueueMember) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setQueuename(typedList.get(0).toString());
		anApp.setInterface_(typedList.get(1).toString());
	}
 }	

// public  void caseAPausequeuememberApp(APausequeuememberApp node) {
            //return new PausequeuememberImpl();
//}
// public  void caseTPausequeuemember(TPausequeuemember node) {
            //return new PausequeuememberImpl();
//}
// public  void caseADeadagiAppApp(ADeadagiAppApp node) {
//        PDeadagiApp app_ = node.getDeadagiApp();
//        if (app_ instanceof ADeadagiApp) {
//            ADeadagiApp app = (ADeadagiApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            DeadAGI mapp = (DeadAGI) createModelElement_DeadAGI();
// 
// 			setParas_Deadagi(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ADeadagiApp)

//}
	
 protected void setParas_DeadAGI (List typedList,IDeadAGI anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, DeadAGI) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==0){
	}
 }	

// public  void caseADeadagiApp(ADeadagiApp node) {
            //return new DeadagiImpl();
//}
// public  void caseTDeadagi(TDeadagi node) {
            //return new DeadagiImpl();
//}
// public  void caseAParkedcallAppApp(AParkedcallAppApp node) {
//        PParkedcallApp app_ = node.getParkedcallApp();
//        if (app_ instanceof AParkedcallApp) {
//            AParkedcallApp app = (AParkedcallApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            ParkedCall mapp = (ParkedCall) createModelElement_ParkedCall();
// 
// 			setParas_Parkedcall(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AParkedcallApp)

//}
	
 protected void setParas_ParkedCall (List typedList,IParkedCall anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, ParkedCall) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setExten(typedList.get(0).toString());
	}
 }	

// public  void caseAParkedcallApp(AParkedcallApp node) {
            //return new ParkedcallImpl();
//}
// public  void caseTParkedcall(TParkedcall node) {
            //return new ParkedcallImpl();
//}
// public  void caseASetcallerpresAppApp(ASetcallerpresAppApp node) {
//        PSetcallerpresApp app_ = node.getSetcallerpresApp();
//        if (app_ instanceof ASetcallerpresApp) {
//            ASetcallerpresApp app = (ASetcallerpresApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            SetCallerPres mapp = (SetCallerPres) createModelElement_SetCallerPres();
// 
// 			setParas_Setcallerpres(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ASetcallerpresApp)

//}
	
 protected void setParas_SetCallerPres (List typedList,ISetCallerPres anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, SetCallerPres) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setPresentation(typedList.get(0).toString());
	}
 }	

// public  void caseASetcallerpresApp(ASetcallerpresApp node) {
            //return new SetcallerpresImpl();
//}
// public  void caseTSetcallerpres(TSetcallerpres node) {
            //return new SetcallerpresImpl();
//}
// public  void caseAMd5_checksum_applicationAppApp(AMd5_checksum_applicationAppApp node) {
//        PMd5_checksum_applicationApp app_ = node.getMd5_checksum_applicationApp();
//        if (app_ instanceof AMd5_checksum_applicationApp) {
//            AMd5_checksum_applicationApp app = (AMd5_checksum_applicationApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            MD5_checksum_application mapp = (MD5_checksum_application) createModelElement_MD5_checksum_application();
// 
// 			setParas_Md5_checksum_application(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AMd5_checksum_applicationApp)

//}
	
 protected void setParas_MD5_checksum_application (List typedList,IMD5_checksum_application anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, MD5_checksum_application) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==0){
	}
 }	

// public  void caseAMd5_checksum_applicationApp(AMd5_checksum_applicationApp node) {
            //return new Md5_checksum_applicationImpl();
//}
// public  void caseTMd5_checksum_application(TMd5_checksum_application node) {
            //return new Md5_checksum_applicationImpl();
//}
// public  void caseASendimageAppApp(ASendimageAppApp node) {
//        PSendimageApp app_ = node.getSendimageApp();
//        if (app_ instanceof ASendimageApp) {
//            ASendimageApp app = (ASendimageApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            SendImage mapp = (SendImage) createModelElement_SendImage();
// 
// 			setParas_Sendimage(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ASendimageApp)

//}
	
 protected void setParas_SendImage (List typedList,ISendImage anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, SendImage) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setFilename(typedList.get(0).toString());
	}
 }	

// public  void caseASendimageApp(ASendimageApp node) {
            //return new SendimageImpl();
//}
// public  void caseTSendimage(TSendimage node) {
            //return new SendimageImpl();
//}
// public  void caseALookupblacklistAppApp(ALookupblacklistAppApp node) {
//        PLookupblacklistApp app_ = node.getLookupblacklistApp();
//        if (app_ instanceof ALookupblacklistApp) {
//            ALookupblacklistApp app = (ALookupblacklistApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            LookupBlacklist mapp = (LookupBlacklist) createModelElement_LookupBlacklist();
// 
// 			setParas_Lookupblacklist(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ALookupblacklistApp)

//}
	
 protected void setParas_LookupBlacklist (List typedList,ILookupBlacklist anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, LookupBlacklist) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==0){
	}
 }	

// public  void caseALookupblacklistApp(ALookupblacklistApp node) {
            //return new LookupblacklistImpl();
//}
// public  void caseTLookupblacklist(TLookupblacklist node) {
            //return new LookupblacklistImpl();
//}
// public  void caseADialAppApp(ADialAppApp node) {
//        PDialApp app_ = node.getDialApp();
//        if (app_ instanceof ADialApp) {
//            ADialApp app = (ADialApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Dial mapp = (Dial) createModelElement_Dial();
// 
// 			setParas_Dial(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ADialApp)

//}
	
 protected void setParas_Dial (List typedList,IDial anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Dial) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==7){
		anApp.setTechnology(typedList.get(0).toString());
		anApp.setResource(typedList.get(1).toString());
		anApp.setTechnology2(typedList.get(2).toString());
		anApp.setResource2(typedList.get(3).toString());
		anApp.setTimeout(typedList.get(4).toString());
		anApp.setOptions(typedList.get(5).toString());
		anApp.setURL(typedList.get(6).toString());
	}
 }	

// public  void caseADialApp(ADialApp node) {
            //return new DialImpl();
//}
// public  void caseTDial(TDial node) {
            //return new DialImpl();
//}
// public  void caseADbputAppApp(ADbputAppApp node) {
//        PDbputApp app_ = node.getDbputApp();
//        if (app_ instanceof ADbputApp) {
//            ADbputApp app = (ADbputApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            DBput mapp = (DBput) createModelElement_DBput();
// 
// 			setParas_Dbput(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ADbputApp)

//}
	
 protected void setParas_DBput (List typedList,IDBput anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, DBput) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==3){
		anApp.setFamily(typedList.get(0).toString());
		anApp.setKey(typedList.get(1).toString());
		anApp.setValue(typedList.get(2).toString());
	}
 }	

// public  void caseADbputApp(ADbputApp node) {
            //return new DbputImpl();
//}
// public  void caseTDbput(TDbput node) {
            //return new DbputImpl();
//}
// public  void caseAExeciftimeAppApp(AExeciftimeAppApp node) {
//        PExeciftimeApp app_ = node.getExeciftimeApp();
//        if (app_ instanceof AExeciftimeApp) {
//            AExeciftimeApp app = (AExeciftimeApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            ExecIfTime mapp = (ExecIfTime) createModelElement_ExecIfTime();
// 
// 			setParas_Execiftime(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AExeciftimeApp)

//}
	
 protected void setParas_ExecIfTime (List typedList,IExecIfTime anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, ExecIfTime) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==6){
		anApp.setTimes(typedList.get(0).toString());
		anApp.setWeekdays(typedList.get(1).toString());
		anApp.setMdays(typedList.get(2).toString());
		anApp.setMonths(typedList.get(3).toString());
		anApp.setAppname(typedList.get(4).toString());
		anApp.setAppdata(typedList.get(5).toString());
	}
 }	

// public  void caseAExeciftimeApp(AExeciftimeApp node) {
            //return new ExeciftimeImpl();
//}
// public  void caseTExeciftime(TExeciftime node) {
            //return new ExeciftimeImpl();
//}
// public  void caseASetaccountAppApp(ASetaccountAppApp node) {
//        PSetaccountApp app_ = node.getSetaccountApp();
//        if (app_ instanceof ASetaccountApp) {
//            ASetaccountApp app = (ASetaccountApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            SetAccount mapp = (SetAccount) createModelElement_SetAccount();
// 
// 			setParas_Setaccount(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ASetaccountApp)

//}
	
 protected void setParas_SetAccount (List typedList,ISetAccount anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, SetAccount) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setAccount(typedList.get(0).toString());
	}
 }	

// public  void caseASetaccountApp(ASetaccountApp node) {
            //return new SetaccountImpl();
//}
// public  void caseTSetaccount(TSetaccount node) {
            //return new SetaccountImpl();
//}
// public  void caseASipgetheaderAppApp(ASipgetheaderAppApp node) {
//        PSipgetheaderApp app_ = node.getSipgetheaderApp();
//        if (app_ instanceof ASipgetheaderApp) {
//            ASipgetheaderApp app = (ASipgetheaderApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            SIPGetHeader mapp = (SIPGetHeader) createModelElement_SIPGetHeader();
// 
// 			setParas_Sipgetheader(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ASipgetheaderApp)

//}
	
 protected void setParas_SIPGetHeader (List typedList,ISIPGetHeader anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, SIPGetHeader) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setVar(typedList.get(0).toString());
		anApp.setHeadername(typedList.get(1).toString());
	}
 }	

// public  void caseASipgetheaderApp(ASipgetheaderApp node) {
            //return new SipgetheaderImpl();
//}
// public  void caseTSipgetheader(TSipgetheader node) {
            //return new SipgetheaderImpl();
//}
// public  void caseAVerboseAppApp(AVerboseAppApp node) {
//        PVerboseApp app_ = node.getVerboseApp();
//        if (app_ instanceof AVerboseApp) {
//            AVerboseApp app = (AVerboseApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Verbose mapp = (Verbose) createModelElement_Verbose();
// 
// 			setParas_Verbose(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AVerboseApp)

//}
	
 protected void setParas_Verbose (List typedList,IVerbose anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Verbose) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setLevel(typedList.get(0).toString());
		anApp.setMessage(typedList.get(1).toString());
	}
 }	

// public  void caseAVerboseApp(AVerboseApp node) {
            //return new VerboseImpl();
//}
// public  void caseTVerbose(TVerbose node) {
            //return new VerboseImpl();
//}
// public  void caseAStopmusiconholdAppApp(AStopmusiconholdAppApp node) {
//        PStopmusiconholdApp app_ = node.getStopmusiconholdApp();
//        if (app_ instanceof AStopmusiconholdApp) {
//            AStopmusiconholdApp app = (AStopmusiconholdApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            StopMusicOnHold mapp = (StopMusicOnHold) createModelElement_StopMusicOnHold();
// 
// 			setParas_Stopmusiconhold(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AStopmusiconholdApp)

//}
	
 protected void setParas_StopMusicOnHold (List typedList,IStopMusicOnHold anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, StopMusicOnHold) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==0){
	}
 }	

// public  void caseAStopmusiconholdApp(AStopmusiconholdApp node) {
            //return new StopmusiconholdImpl();
//}
// public  void caseTStopmusiconhold(TStopmusiconhold node) {
            //return new StopmusiconholdImpl();
//}
// public  void caseAWaitforsilenceAppApp(AWaitforsilenceAppApp node) {
//        PWaitforsilenceApp app_ = node.getWaitforsilenceApp();
//        if (app_ instanceof AWaitforsilenceApp) {
//            AWaitforsilenceApp app = (AWaitforsilenceApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            WaitForSilence mapp = (WaitForSilence) createModelElement_WaitForSilence();
// 
// 			setParas_Waitforsilence(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AWaitforsilenceApp)

//}
	
 protected void setParas_WaitForSilence (List typedList,IWaitForSilence anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, WaitForSilence) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setX(typedList.get(0).toString());
		anApp.setY(typedList.get(1).toString());
	}
 }	

// public  void caseAWaitforsilenceApp(AWaitforsilenceApp node) {
            //return new WaitforsilenceImpl();
//}
// public  void caseTWaitforsilence(TWaitforsilence node) {
            //return new WaitforsilenceImpl();
//}
// public  void caseASmsAppApp(ASmsAppApp node) {
//        PSmsApp app_ = node.getSmsApp();
//        if (app_ instanceof ASmsApp) {
//            ASmsApp app = (ASmsApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            SMS mapp = (SMS) createModelElement_SMS();
// 
// 			setParas_Sms(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ASmsApp)

//}
	
 protected void setParas_SMS (List typedList,ISMS anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, SMS) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==3){
		anApp.setName(typedList.get(0).toString());
		anApp.setA(typedList.get(1).toString());
		anApp.setS(typedList.get(2).toString());
	}
 }	

// public  void caseASmsApp(ASmsApp node) {
            //return new SmsImpl();
//}
// public  void caseTSms(TSms node) {
            //return new SmsImpl();
//}
// public  void caseAMusiconholdAppApp(AMusiconholdAppApp node) {
//        PMusiconholdApp app_ = node.getMusiconholdApp();
//        if (app_ instanceof AMusiconholdApp) {
//            AMusiconholdApp app = (AMusiconholdApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            MusicOnHold mapp = (MusicOnHold) createModelElement_MusicOnHold();
// 
// 			setParas_Musiconhold(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AMusiconholdApp)

//}
	
 protected void setParas_MusicOnHold (List typedList,IMusicOnHold anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, MusicOnHold) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setClass_(typedList.get(0).toString());
	}
 }	

// public  void caseAMusiconholdApp(AMusiconholdApp node) {
            //return new MusiconholdImpl();
//}
// public  void caseTMusiconhold(TMusiconhold node) {
            //return new MusiconholdImpl();
//}
// public  void caseABusyAppApp(ABusyAppApp node) {
//        PBusyApp app_ = node.getBusyApp();
//        if (app_ instanceof ABusyApp) {
//            ABusyApp app = (ABusyApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Busy mapp = (Busy) createModelElement_Busy();
// 
// 			setParas_Busy(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ABusyApp)

//}
	
 protected void setParas_Busy (List typedList,IBusy anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Busy) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setTimeout(typedList.get(0).toString());
	}
 }	

// public  void caseABusyApp(ABusyApp node) {
            //return new BusyImpl();
//}
// public  void caseTBusy(TBusy node) {
            //return new BusyImpl();
//}
// public  void caseAGotoiftimeAppApp(AGotoiftimeAppApp node) {
//        PGotoiftimeApp app_ = node.getGotoiftimeApp();
//        if (app_ instanceof AGotoiftimeApp) {
//            AGotoiftimeApp app = (AGotoiftimeApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            GotoIfTime mapp = (GotoIfTime) createModelElement_GotoIfTime();
// 
// 			setParas_Gotoiftime(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AGotoiftimeApp)

//}
	
 protected void setParas_GotoIfTime (List typedList,IGotoIfTime anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, GotoIfTime) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==7){
		anApp.setTimes(typedList.get(0).toString());
		anApp.setWeekdays(typedList.get(1).toString());
		anApp.setMdays(typedList.get(2).toString());
		anApp.setMonths(typedList.get(3).toString());
		anApp.setContext(typedList.get(4).toString());
		anApp.setExtension(typedList.get(5).toString());
		anApp.setPri(typedList.get(6).toString());
	}
 }	

// public  void caseAGotoiftimeApp(AGotoiftimeApp node) {
            //return new GotoiftimeImpl();
//}
// public  void caseTGotoiftime(TGotoiftime node) {
            //return new GotoiftimeImpl();
//}
// public  void caseACongestionAppApp(ACongestionAppApp node) {
//        PCongestionApp app_ = node.getCongestionApp();
//        if (app_ instanceof ACongestionApp) {
//            ACongestionApp app = (ACongestionApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Congestion mapp = (Congestion) createModelElement_Congestion();
// 
// 			setParas_Congestion(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ACongestionApp)

//}
	
 protected void setParas_Congestion (List typedList,ICongestion anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Congestion) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setTimeout(typedList.get(0).toString());
	}
 }	

// public  void caseACongestionApp(ACongestionApp node) {
            //return new CongestionImpl();
//}
// public  void caseTCongestion(TCongestion node) {
            //return new CongestionImpl();
//}
// public  void caseADirectoryAppApp(ADirectoryAppApp node) {
//        PDirectoryApp app_ = node.getDirectoryApp();
//        if (app_ instanceof ADirectoryApp) {
//            ADirectoryApp app = (ADirectoryApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Directory mapp = (Directory) createModelElement_Directory();
// 
// 			setParas_Directory(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ADirectoryApp)

//}
	
 protected void setParas_Directory (List typedList,IDirectory anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Directory) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==4){
		anApp.setVm(typedList.get(0).toString());
		anApp.setDial(typedList.get(1).toString());
		anApp.setContext(typedList.get(2).toString());
		anApp.setOptions(typedList.get(3).toString());
	}
 }	

// public  void caseADirectoryApp(ADirectoryApp node) {
            //return new DirectoryImpl();
//}
// public  void caseTDirectory(TDirectory node) {
            //return new DirectoryImpl();
//}
// public  void caseAAgentmonitoroutgoingAppApp(AAgentmonitoroutgoingAppApp node) {
//        PAgentmonitoroutgoingApp app_ = node.getAgentmonitoroutgoingApp();
//        if (app_ instanceof AAgentmonitoroutgoingApp) {
//            AAgentmonitoroutgoingApp app = (AAgentmonitoroutgoingApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            AgentMonitorOutgoing mapp = (AgentMonitorOutgoing) createModelElement_AgentMonitorOutgoing();
// 
// 			setParas_Agentmonitoroutgoing(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AAgentmonitoroutgoingApp)

//}
	
 protected void setParas_AgentMonitorOutgoing (List typedList,IAgentMonitorOutgoing anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, AgentMonitorOutgoing) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setOptions(typedList.get(0).toString());
	}
 }	

// public  void caseAAgentmonitoroutgoingApp(AAgentmonitoroutgoingApp node) {
            //return new AgentmonitoroutgoingImpl();
//}
// public  void caseTAgentmonitoroutgoing(TAgentmonitoroutgoing node) {
            //return new AgentmonitoroutgoingImpl();
//}
// public  void caseAMathAppApp(AMathAppApp node) {
//        PMathApp app_ = node.getMathApp();
//        if (app_ instanceof AMathApp) {
//            AMathApp app = (AMathApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Math mapp = (Math) createModelElement_Math();
// 
// 			setParas_Math(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AMathApp)

//}
	
 protected void setParas_Math (List typedList,IMath anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Math) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==0){
	}
 }	

// public  void caseAMathApp(AMathApp node) {
            //return new MathImpl();
//}
// public  void caseTMath(TMath node) {
            //return new MathImpl();
//}
// public  void caseASayunixtimeAppApp(ASayunixtimeAppApp node) {
//        PSayunixtimeApp app_ = node.getSayunixtimeApp();
//        if (app_ instanceof ASayunixtimeApp) {
//            ASayunixtimeApp app = (ASayunixtimeApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            SayUnixTime mapp = (SayUnixTime) createModelElement_SayUnixTime();
// 
// 			setParas_Sayunixtime(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ASayunixtimeApp)

//}
	
 protected void setParas_SayUnixTime (List typedList,ISayUnixTime anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, SayUnixTime) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==3){
		anApp.setUnixtime(typedList.get(0).toString());
		anApp.setTimezone(typedList.get(1).toString());
		anApp.setFormat(typedList.get(2).toString());
	}
 }	

// public  void caseASayunixtimeApp(ASayunixtimeApp node) {
            //return new SayunixtimeImpl();
//}
// public  void caseTSayunixtime(TSayunixtime node) {
            //return new SayunixtimeImpl();
//}
// public  void caseASetglobalvarAppApp(ASetglobalvarAppApp node) {
//        PSetglobalvarApp app_ = node.getSetglobalvarApp();
//        if (app_ instanceof ASetglobalvarApp) {
//            ASetglobalvarApp app = (ASetglobalvarApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            SetGlobalVar mapp = (SetGlobalVar) createModelElement_SetGlobalVar();
// 
// 			setParas_Setglobalvar(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ASetglobalvarApp)

//}
	
 protected void setParas_SetGlobalVar (List typedList,ISetGlobalVar anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, SetGlobalVar) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setN(typedList.get(0).toString());
		anApp.setValue(typedList.get(1).toString());
	}
 }	

// public  void caseASetglobalvarApp(ASetglobalvarApp node) {
            //return new SetglobalvarImpl();
//}
// public  void caseTSetglobalvar(TSetglobalvar node) {
            //return new SetglobalvarImpl();
//}
// public  void caseAWaitextenAppApp(AWaitextenAppApp node) {
//        PWaitextenApp app_ = node.getWaitextenApp();
//        if (app_ instanceof AWaitextenApp) {
//            AWaitextenApp app = (AWaitextenApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            WaitExten mapp = (WaitExten) createModelElement_WaitExten();
// 
// 			setParas_Waitexten(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AWaitextenApp)

//}
	
 protected void setParas_WaitExten (List typedList,IWaitExten anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, WaitExten) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setSeconds(typedList.get(0).toString());
	}
 }	

// public  void caseAWaitextenApp(AWaitextenApp node) {
            //return new WaitextenImpl();
//}
// public  void caseTWaitexten(TWaitexten node) {
            //return new WaitextenImpl();
//}
// public  void caseAPrefixAppApp(APrefixAppApp node) {
//        PPrefixApp app_ = node.getPrefixApp();
//        if (app_ instanceof APrefixApp) {
//            APrefixApp app = (APrefixApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Prefix mapp = (Prefix) createModelElement_Prefix();
// 
// 			setParas_Prefix(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof APrefixApp)

//}
	
 protected void setParas_Prefix (List typedList,IPrefix anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Prefix) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setDigits(typedList.get(0).toString());
	}
 }	

// public  void caseAPrefixApp(APrefixApp node) {
            //return new PrefixImpl();
//}
// public  void caseTPrefix(TPrefix node) {
            //return new PrefixImpl();
//}
// public  void caseATrysystemAppApp(ATrysystemAppApp node) {
//        PTrysystemApp app_ = node.getTrysystemApp();
//        if (app_ instanceof ATrysystemApp) {
//            ATrysystemApp app = (ATrysystemApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            TrySystem mapp = (TrySystem) createModelElement_TrySystem();
// 
// 			setParas_Trysystem(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ATrysystemApp)

//}
	
 protected void setParas_TrySystem (List typedList,ITrySystem anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, TrySystem) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setCommand(typedList.get(0).toString());
	}
 }	

// public  void caseATrysystemApp(ATrysystemApp node) {
            //return new TrysystemImpl();
//}
// public  void caseTTrysystem(TTrysystem node) {
            //return new TrysystemImpl();
//}
// public  void caseARemovequeuememberAppApp(ARemovequeuememberAppApp node) {
//        PRemovequeuememberApp app_ = node.getRemovequeuememberApp();
//        if (app_ instanceof ARemovequeuememberApp) {
//            ARemovequeuememberApp app = (ARemovequeuememberApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            RemoveQueueMember mapp = (RemoveQueueMember) createModelElement_RemoveQueueMember();
// 
// 			setParas_Removequeuemember(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ARemovequeuememberApp)

//}
	
 protected void setParas_RemoveQueueMember (List typedList,IRemoveQueueMember anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, RemoveQueueMember) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setQueuename(typedList.get(0).toString());
		anApp.setInterface_(typedList.get(1).toString());
	}
 }	

// public  void caseARemovequeuememberApp(ARemovequeuememberApp node) {
            //return new RemovequeuememberImpl();
//}
// public  void caseTRemovequeuemember(TRemovequeuemember node) {
            //return new RemovequeuememberImpl();
//}
// public  void caseARealtimeAppApp(ARealtimeAppApp node) {
//        PRealtimeApp app_ = node.getRealtimeApp();
//        if (app_ instanceof ARealtimeApp) {
//            ARealtimeApp app = (ARealtimeApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            RealTime mapp = (RealTime) createModelElement_RealTime();
// 
// 			setParas_Realtime(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ARealtimeApp)

//}
	
 protected void setParas_RealTime (List typedList,IRealTime anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, RealTime) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==4){
		anApp.setFamily(typedList.get(0).toString());
		anApp.setColmatch(typedList.get(1).toString());
		anApp.setValue(typedList.get(2).toString());
		anApp.setPrefix(typedList.get(3).toString());
	}
 }	

// public  void caseARealtimeApp(ARealtimeApp node) {
            //return new RealtimeImpl();
//}
// public  void caseTRealtime(TRealtime node) {
            //return new RealtimeImpl();
//}
// public  void caseAIcesAppApp(AIcesAppApp node) {
//        PIcesApp app_ = node.getIcesApp();
//        if (app_ instanceof AIcesApp) {
//            AIcesApp app = (AIcesApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            ICES mapp = (ICES) createModelElement_ICES();
// 
// 			setParas_Ices(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AIcesApp)

//}
	
 protected void setParas_ICES (List typedList,IICES anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, ICES) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setConfig(typedList.get(0).toString());
		anApp.setXml(typedList.get(1).toString());
	}
 }	

// public  void caseAIcesApp(AIcesApp node) {
            //return new IcesImpl();
//}
// public  void caseTIces(TIces node) {
            //return new IcesImpl();
//}
// public  void caseAAgiAppApp(AAgiAppApp node) {
//        PAgiApp app_ = node.getAgiApp();
//        if (app_ instanceof AAgiApp) {
//            AAgiApp app = (AAgiApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            AGI mapp = (AGI) createModelElement_AGI();
// 
// 			setParas_Agi(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AAgiApp)

//}
	
 protected void setParas_AGI (List typedList,IAGI anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, AGI) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==0){
	}
 }	

// public  void caseAAgiApp(AAgiApp node) {
            //return new AgiImpl();
//}
// public  void caseTAgi(TAgi node) {
            //return new AgiImpl();
//}
// public  void caseAEndwhileAppApp(AEndwhileAppApp node) {
//        PEndwhileApp app_ = node.getEndwhileApp();
//        if (app_ instanceof AEndwhileApp) {
//            AEndwhileApp app = (AEndwhileApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            EndWhile mapp = (EndWhile) createModelElement_EndWhile();
// 
// 			setParas_Endwhile(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AEndwhileApp)

//}
	
 protected void setParas_EndWhile (List typedList,IEndWhile anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, EndWhile) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==0){
	}
 }	

// public  void caseAEndwhileApp(AEndwhileApp node) {
            //return new EndwhileImpl();
//}
// public  void caseTEndwhile(TEndwhile node) {
            //return new EndwhileImpl();
//}
// public  void caseAGetcpeidAppApp(AGetcpeidAppApp node) {
//        PGetcpeidApp app_ = node.getGetcpeidApp();
//        if (app_ instanceof AGetcpeidApp) {
//            AGetcpeidApp app = (AGetcpeidApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            GetCPEID mapp = (GetCPEID) createModelElement_GetCPEID();
// 
// 			setParas_Getcpeid(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AGetcpeidApp)

//}
	
 protected void setParas_GetCPEID (List typedList,IGetCPEID anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, GetCPEID) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==0){
	}
 }	

// public  void caseAGetcpeidApp(AGetcpeidApp node) {
            //return new GetcpeidImpl();
//}
// public  void caseTGetcpeid(TGetcpeid node) {
            //return new GetcpeidImpl();
//}
// public  void caseAVmauthenticateAppApp(AVmauthenticateAppApp node) {
//        PVmauthenticateApp app_ = node.getVmauthenticateApp();
//        if (app_ instanceof AVmauthenticateApp) {
//            AVmauthenticateApp app = (AVmauthenticateApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            VMAuthenticate mapp = (VMAuthenticate) createModelElement_VMAuthenticate();
// 
// 			setParas_Vmauthenticate(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AVmauthenticateApp)

//}
	
 protected void setParas_VMAuthenticate (List typedList,IVMAuthenticate anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, VMAuthenticate) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setMailbox(typedList.get(0).toString());
		anApp.setContext(typedList.get(1).toString());
	}
 }	

// public  void caseAVmauthenticateApp(AVmauthenticateApp node) {
            //return new VmauthenticateImpl();
//}
// public  void caseTVmauthenticate(TVmauthenticate node) {
            //return new VmauthenticateImpl();
//}
// public  void caseASetcdruserfieldAppApp(ASetcdruserfieldAppApp node) {
//        PSetcdruserfieldApp app_ = node.getSetcdruserfieldApp();
//        if (app_ instanceof ASetcdruserfieldApp) {
//            ASetcdruserfieldApp app = (ASetcdruserfieldApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            SetCDRUserField mapp = (SetCDRUserField) createModelElement_SetCDRUserField();
// 
// 			setParas_Setcdruserfield(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ASetcdruserfieldApp)

//}
	
 protected void setParas_SetCDRUserField (List typedList,ISetCDRUserField anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, SetCDRUserField) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setValue(typedList.get(0).toString());
	}
 }	

// public  void caseASetcdruserfieldApp(ASetcdruserfieldApp node) {
            //return new SetcdruserfieldImpl();
//}
// public  void caseTSetcdruserfield(TSetcdruserfield node) {
            //return new SetcdruserfieldImpl();
//}
// public  void caseADisaAppApp(ADisaAppApp node) {
//        PDisaApp app_ = node.getDisaApp();
//        if (app_ instanceof ADisaApp) {
//            ADisaApp app = (ADisaApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            DISA mapp = (DISA) createModelElement_DISA();
// 
// 			setParas_Disa(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ADisaApp)

//}
	
 protected void setParas_DISA (List typedList,IDISA anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, DISA) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==4){
		anApp.setDirect(typedList.get(0).toString());
		anApp.setInward(typedList.get(1).toString());
		anApp.setSystem(typedList.get(2).toString());
		anApp.setAccess(typedList.get(3).toString());
	}
 }	

// public  void caseADisaApp(ADisaApp node) {
            //return new DisaImpl();
//}
// public  void caseTDisa(TDisa node) {
            //return new DisaImpl();
//}
// public  void caseASendurlAppApp(ASendurlAppApp node) {
//        PSendurlApp app_ = node.getSendurlApp();
//        if (app_ instanceof ASendurlApp) {
//            ASendurlApp app = (ASendurlApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            SendURL mapp = (SendURL) createModelElement_SendURL();
// 
// 			setParas_Sendurl(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ASendurlApp)

//}
	
 protected void setParas_SendURL (List typedList,ISendURL anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, SendURL) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setURL(typedList.get(0).toString());
		anApp.setOption(typedList.get(1).toString());
	}
 }	

// public  void caseASendurlApp(ASendurlApp node) {
            //return new SendurlImpl();
//}
// public  void caseTSendurl(TSendurl node) {
            //return new SendurlImpl();
//}
// public  void caseATestclientAppApp(ATestclientAppApp node) {
//        PTestclientApp app_ = node.getTestclientApp();
//        if (app_ instanceof ATestclientApp) {
//            ATestclientApp app = (ATestclientApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            TestClient mapp = (TestClient) createModelElement_TestClient();
// 
// 			setParas_Testclient(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ATestclientApp)

//}
	
 protected void setParas_TestClient (List typedList,ITestClient anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, TestClient) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setTestid(typedList.get(0).toString());
	}
 }	

// public  void caseATestclientApp(ATestclientApp node) {
            //return new TestclientImpl();
//}
// public  void caseTTestclient(TTestclient node) {
            //return new TestclientImpl();
//}
// public  void caseADundilookupAppApp(ADundilookupAppApp node) {
//        PDundilookupApp app_ = node.getDundilookupApp();
//        if (app_ instanceof ADundilookupApp) {
//            ADundilookupApp app = (ADundilookupApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            DUNDiLookup mapp = (DUNDiLookup) createModelElement_DUNDiLookup();
// 
// 			setParas_Dundilookup(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ADundilookupApp)

//}
	
 protected void setParas_DUNDiLookup (List typedList,IDUNDiLookup anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, DUNDiLookup) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==3){
		anApp.setNumber(typedList.get(0).toString());
		anApp.setContext(typedList.get(1).toString());
		anApp.setOptions(typedList.get(2).toString());
	}
 }	

// public  void caseADundilookupApp(ADundilookupApp node) {
            //return new DundilookupImpl();
//}
// public  void caseTDundilookup(TDundilookup node) {
            //return new DundilookupImpl();
//}
// public  void caseAParkAppApp(AParkAppApp node) {
//        PParkApp app_ = node.getParkApp();
//        if (app_ instanceof AParkApp) {
//            AParkApp app = (AParkApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Park mapp = (Park) createModelElement_Park();
// 
// 			setParas_Park(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AParkApp)

//}
	
 protected void setParas_Park (List typedList,IPark anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Park) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setExten(typedList.get(0).toString());
	}
 }	

// public  void caseAParkApp(AParkApp node) {
            //return new ParkImpl();
//}
// public  void caseTPark(TPark node) {
            //return new ParkImpl();
//}
// public  void caseAStartmusiconholdAppApp(AStartmusiconholdAppApp node) {
//        PStartmusiconholdApp app_ = node.getStartmusiconholdApp();
//        if (app_ instanceof AStartmusiconholdApp) {
//            AStartmusiconholdApp app = (AStartmusiconholdApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            StartMusicOnHold mapp = (StartMusicOnHold) createModelElement_StartMusicOnHold();
// 
// 			setParas_Startmusiconhold(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AStartmusiconholdApp)

//}
	
 protected void setParas_StartMusicOnHold (List typedList,IStartMusicOnHold anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, StartMusicOnHold) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setClass_(typedList.get(0).toString());
	}
 }	

// public  void caseAStartmusiconholdApp(AStartmusiconholdApp node) {
            //return new StartmusiconholdImpl();
//}
// public  void caseTStartmusiconhold(TStartmusiconhold node) {
            //return new StartmusiconholdImpl();
//}
// public  void caseAAddqueuememberAppApp(AAddqueuememberAppApp node) {
//        PAddqueuememberApp app_ = node.getAddqueuememberApp();
//        if (app_ instanceof AAddqueuememberApp) {
//            AAddqueuememberApp app = (AAddqueuememberApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            AddQueueMember mapp = (AddQueueMember) createModelElement_AddQueueMember();
// 
// 			setParas_Addqueuemember(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AAddqueuememberApp)

//}
	
 protected void setParas_AddQueueMember (List typedList,IAddQueueMember anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, AddQueueMember) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==3){
		anApp.setQueuename(typedList.get(0).toString());
		anApp.setInterface_(typedList.get(1).toString());
		anApp.setPenalty(typedList.get(2).toString());
	}
 }	

// public  void caseAAddqueuememberApp(AAddqueuememberApp node) {
            //return new AddqueuememberImpl();
//}
// public  void caseTAddqueuemember(TAddqueuemember node) {
            //return new AddqueuememberImpl();
//}
// public  void caseAParkandannounceAppApp(AParkandannounceAppApp node) {
//        PParkandannounceApp app_ = node.getParkandannounceApp();
//        if (app_ instanceof AParkandannounceApp) {
//            AParkandannounceApp app = (AParkandannounceApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            ParkAndAnnounce mapp = (ParkAndAnnounce) createModelElement_ParkAndAnnounce();
// 
// 			setParas_Parkandannounce(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AParkandannounceApp)

//}
	
 protected void setParas_ParkAndAnnounce (List typedList,IParkAndAnnounce anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, ParkAndAnnounce) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==5){
		anApp.setAnnounce(typedList.get(0).toString());
		anApp.setTemplate(typedList.get(1).toString());
		anApp.setTimeout(typedList.get(2).toString());
		anApp.setDial(typedList.get(3).toString());
		anApp.setReturn_context(typedList.get(4).toString());
	}
 }	

// public  void caseAParkandannounceApp(AParkandannounceApp node) {
            //return new ParkandannounceImpl();
//}
// public  void caseTParkandannounce(TParkandannounce node) {
            //return new ParkandannounceImpl();
//}
// public  void caseAMacroexitAppApp(AMacroexitAppApp node) {
//        PMacroexitApp app_ = node.getMacroexitApp();
//        if (app_ instanceof AMacroexitApp) {
//            AMacroexitApp app = (AMacroexitApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            MacroExit mapp = (MacroExit) createModelElement_MacroExit();
// 
// 			setParas_Macroexit(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AMacroexitApp)

//}
	
 protected void setParas_MacroExit (List typedList,IMacroExit anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, MacroExit) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==0){
	}
 }	

// public  void caseAMacroexitApp(AMacroexitApp node) {
            //return new MacroexitImpl();
//}
// public  void caseTMacroexit(TMacroexit node) {
            //return new MacroexitImpl();
//}
// public  void caseASubstringAppApp(ASubstringAppApp node) {
//        PSubstringApp app_ = node.getSubstringApp();
//        if (app_ instanceof ASubstringApp) {
//            ASubstringApp app = (ASubstringApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            SubString mapp = (SubString) createModelElement_SubString();
// 
// 			setParas_Substring(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ASubstringApp)

//}
	
 protected void setParas_SubString (List typedList,ISubString anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, SubString) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==0){
	}
 }	

// public  void caseASubstringApp(ASubstringApp node) {
            //return new SubstringImpl();
//}
// public  void caseTSubstring(TSubstring node) {
            //return new SubstringImpl();
//}
// public  void caseASaynumberAppApp(ASaynumberAppApp node) {
//        PSaynumberApp app_ = node.getSaynumberApp();
//        if (app_ instanceof ASaynumberApp) {
//            ASaynumberApp app = (ASaynumberApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            SayNumber mapp = (SayNumber) createModelElement_SayNumber();
// 
// 			setParas_Saynumber(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ASaynumberApp)

//}
	
 protected void setParas_SayNumber (List typedList,ISayNumber anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, SayNumber) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setDigits(typedList.get(0).toString());
		anApp.setGender(typedList.get(1).toString());
	}
 }	

// public  void caseASaynumberApp(ASaynumberApp node) {
            //return new SaynumberImpl();
//}
// public  void caseTSaynumber(TSaynumber node) {
            //return new SaynumberImpl();
//}
// public  void caseABackgroundAppApp(ABackgroundAppApp node) {
//        PBackgroundApp app_ = node.getBackgroundApp();
//        if (app_ instanceof ABackgroundApp) {
//            ABackgroundApp app = (ABackgroundApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Background mapp = (Background) createModelElement_Background();
// 
// 			setParas_Background(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ABackgroundApp)

//}
	
 protected void setParas_Background (List typedList,IBackground anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Background) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==4){
		anApp.setFilename1(typedList.get(0).toString());
		anApp.setFilename2(typedList.get(1).toString());
		anApp.setOptions(typedList.get(2).toString());
		anApp.setLangoverride(typedList.get(3).toString());
	}
 }	

// public  void caseABackgroundApp(ABackgroundApp node) {
            //return new BackgroundImpl();
//}
// public  void caseTBackground(TBackground node) {
            //return new BackgroundImpl();
//}
// public  void caseANbscatAppApp(ANbscatAppApp node) {
//        PNbscatApp app_ = node.getNbscatApp();
//        if (app_ instanceof ANbscatApp) {
//            ANbscatApp app = (ANbscatApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            NBScat mapp = (NBScat) createModelElement_NBScat();
// 
// 			setParas_Nbscat(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ANbscatApp)

//}
	
 protected void setParas_NBScat (List typedList,INBScat anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, NBScat) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==0){
	}
 }	

// public  void caseANbscatApp(ANbscatApp node) {
            //return new NbscatImpl();
//}
// public  void caseTNbscat(TNbscat node) {
            //return new NbscatImpl();
//}
// public  void caseAHasnewvoicemailAppApp(AHasnewvoicemailAppApp node) {
//        PHasnewvoicemailApp app_ = node.getHasnewvoicemailApp();
//        if (app_ instanceof AHasnewvoicemailApp) {
//            AHasnewvoicemailApp app = (AHasnewvoicemailApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            HasNewVoicemail mapp = (HasNewVoicemail) createModelElement_HasNewVoicemail();
// 
// 			setParas_Hasnewvoicemail(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AHasnewvoicemailApp)

//}
	
 protected void setParas_HasNewVoicemail (List typedList,IHasNewVoicemail anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, HasNewVoicemail) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==4){
		anApp.setVmbox(typedList.get(0).toString());
		anApp.setFolder(typedList.get(1).toString());
		anApp.setContext(typedList.get(2).toString());
		anApp.setVarname(typedList.get(3).toString());
	}
 }	

// public  void caseAHasnewvoicemailApp(AHasnewvoicemailApp node) {
            //return new HasnewvoicemailImpl();
//}
// public  void caseTHasnewvoicemail(THasnewvoicemail node) {
            //return new HasnewvoicemailImpl();
//}
// public  void caseASystemAppApp(ASystemAppApp node) {
//        PSystemApp app_ = node.getSystemApp();
//        if (app_ instanceof ASystemApp) {
//            ASystemApp app = (ASystemApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            System mapp = (System) createModelElement_System();
// 
// 			setParas_System(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ASystemApp)

//}
	
 protected void setParas_System (List typedList,ISystem anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, System) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setCommand(typedList.get(0).toString());
	}
 }	

// public  void caseASystemApp(ASystemApp node) {
            //return new SystemImpl();
//}
// public  void caseTSystem(TSystem node) {
            //return new SystemImpl();
//}
// public  void caseAGotoifAppApp(AGotoifAppApp node) {
//        PGotoifApp app_ = node.getGotoifApp();
//        if (app_ instanceof AGotoifApp) {
//            AGotoifApp app = (AGotoifApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            GotoIf mapp = (GotoIf) createModelElement_GotoIf();
// 
// 			setParas_Gotoif(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AGotoifApp)

//}
	
 protected void setParas_GotoIf (List typedList,IGotoIf anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, GotoIf) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==5){
		anApp.setCondition(typedList.get(0).toString());
		anApp.setLabel1(typedList.get(1).toString());
		anApp.setLabel2(typedList.get(2).toString());
	}
 }	

// public  void caseAGotoifApp(AGotoifApp node) {
            //return new GotoifImpl();
//}
// public  void caseTGotoif(TGotoif node) {
            //return new GotoifImpl();
//}
// public  void caseASetrdnisAppApp(ASetrdnisAppApp node) {
//        PSetrdnisApp app_ = node.getSetrdnisApp();
//        if (app_ instanceof ASetrdnisApp) {
//            ASetrdnisApp app = (ASetrdnisApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            SetRDNIS mapp = (SetRDNIS) createModelElement_SetRDNIS();
// 
// 			setParas_Setrdnis(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ASetrdnisApp)

//}
	
 protected void setParas_SetRDNIS (List typedList,ISetRDNIS anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, SetRDNIS) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setCnum(typedList.get(0).toString());
	}
 }	

// public  void caseASetrdnisApp(ASetrdnisApp node) {
            //return new SetrdnisImpl();
//}
// public  void caseTSetrdnis(TSetrdnis node) {
            //return new SetrdnisImpl();
//}
// public  void caseAExecifAppApp(AExecifAppApp node) {
//        PExecifApp app_ = node.getExecifApp();
//        if (app_ instanceof AExecifApp) {
//            AExecifApp app = (AExecifApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            ExecIF mapp = (ExecIF) createModelElement_ExecIF();
// 
// 			setParas_Execif(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AExecifApp)

//}
	
 protected void setParas_ExecIF (List typedList,IExecIF anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, ExecIF) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==3){
		anApp.setExpr(typedList.get(0).toString());
		anApp.setApp(typedList.get(1).toString());
		anApp.setData(typedList.get(2).toString());
	}
 }	

// public  void caseAExecifApp(AExecifApp node) {
            //return new ExecifImpl();
//}
// public  void caseTExecif(TExecif node) {
            //return new ExecifImpl();
//}
// public  void caseAMeetmeadminAppApp(AMeetmeadminAppApp node) {
//        PMeetmeadminApp app_ = node.getMeetmeadminApp();
//        if (app_ instanceof AMeetmeadminApp) {
//            AMeetmeadminApp app = (AMeetmeadminApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            MeetMeAdmin mapp = (MeetMeAdmin) createModelElement_MeetMeAdmin();
// 
// 			setParas_Meetmeadmin(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AMeetmeadminApp)

//}
	
 protected void setParas_MeetMeAdmin (List typedList,IMeetMeAdmin anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, MeetMeAdmin) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==3){
		anApp.setConfno(typedList.get(0).toString());
		anApp.setCommand(typedList.get(1).toString());
		anApp.setUser(typedList.get(2).toString());
	}
 }	

// public  void caseAMeetmeadminApp(AMeetmeadminApp node) {
            //return new MeetmeadminImpl();
//}
// public  void caseTMeetmeadmin(TMeetmeadmin node) {
            //return new MeetmeadminImpl();
//}
// public  void caseASetmusiconholdAppApp(ASetmusiconholdAppApp node) {
//        PSetmusiconholdApp app_ = node.getSetmusiconholdApp();
//        if (app_ instanceof ASetmusiconholdApp) {
//            ASetmusiconholdApp app = (ASetmusiconholdApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            SetMusicOnHold mapp = (SetMusicOnHold) createModelElement_SetMusicOnHold();
// 
// 			setParas_Setmusiconhold(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ASetmusiconholdApp)

//}
	
 protected void setParas_SetMusicOnHold (List typedList,ISetMusicOnHold anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, SetMusicOnHold) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setClass_(typedList.get(0).toString());
	}
 }	

// public  void caseASetmusiconholdApp(ASetmusiconholdApp node) {
            //return new SetmusiconholdImpl();
//}
// public  void caseTSetmusiconhold(TSetmusiconhold node) {
            //return new SetmusiconholdImpl();
//}
// public  void caseAVoicemailAppApp(AVoicemailAppApp node) {
//        PVoicemailApp app_ = node.getVoicemailApp();
//        if (app_ instanceof AVoicemailApp) {
//            AVoicemailApp app = (AVoicemailApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            VoiceMail mapp = (VoiceMail) createModelElement_VoiceMail();
// 
// 			setParas_Voicemail(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AVoicemailApp)

//}
	
 protected void setParas_VoiceMail (List typedList,IVoiceMail anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, VoiceMail) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==5){
		anApp.setS(typedList.get(0).toString());
		anApp.setU(typedList.get(1).toString());
		anApp.setB(typedList.get(2).toString());
		anApp.setExtension(typedList.get(3).toString());
		anApp.setContext(typedList.get(4).toString());
	}
 }	

// public  void caseAVoicemailApp(AVoicemailApp node) {
            //return new VoicemailImpl();
//}
// public  void caseTVoicemail(TVoicemail node) {
            //return new VoicemailImpl();
//}
// public  void caseAWaitforringAppApp(AWaitforringAppApp node) {
//        PWaitforringApp app_ = node.getWaitforringApp();
//        if (app_ instanceof AWaitforringApp) {
//            AWaitforringApp app = (AWaitforringApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            WaitForRing mapp = (WaitForRing) createModelElement_WaitForRing();
// 
// 			setParas_Waitforring(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AWaitforringApp)

//}
	
 protected void setParas_WaitForRing (List typedList,IWaitForRing anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, WaitForRing) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setTimeout(typedList.get(0).toString());
	}
 }	

// public  void caseAWaitforringApp(AWaitforringApp node) {
            //return new WaitforringImpl();
//}
// public  void caseTWaitforring(TWaitforring node) {
            //return new WaitforringImpl();
//}
// public  void caseAPlaytonesAppApp(APlaytonesAppApp node) {
//        PPlaytonesApp app_ = node.getPlaytonesApp();
//        if (app_ instanceof APlaytonesApp) {
//            APlaytonesApp app = (APlaytonesApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Playtones mapp = (Playtones) createModelElement_Playtones();
// 
// 			setParas_Playtones(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof APlaytonesApp)

//}
	
 protected void setParas_Playtones (List typedList,IPlaytones anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Playtones) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==0){
	}
 }	

// public  void caseAPlaytonesApp(APlaytonesApp node) {
            //return new PlaytonesImpl();
//}
// public  void caseTPlaytones(TPlaytones node) {
            //return new PlaytonesImpl();
//}
// public  void caseASaycountplAppApp(ASaycountplAppApp node) {
//        PSaycountplApp app_ = node.getSaycountplApp();
//        if (app_ instanceof ASaycountplApp) {
//            ASaycountplApp app = (ASaycountplApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            SayCountPL mapp = (SayCountPL) createModelElement_SayCountPL();
// 
// 			setParas_Saycountpl(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ASaycountplApp)

//}
	
 protected void setParas_SayCountPL (List typedList,ISayCountPL anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, SayCountPL) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==0){
	}
 }	

// public  void caseASaycountplApp(ASaycountplApp node) {
            //return new SaycountplImpl();
//}
// public  void caseTSaycountpl(TSaycountpl node) {
            //return new SaycountplImpl();
//}
// public  void caseAStopmonitorAppApp(AStopmonitorAppApp node) {
//        PStopmonitorApp app_ = node.getStopmonitorApp();
//        if (app_ instanceof AStopmonitorApp) {
//            AStopmonitorApp app = (AStopmonitorApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            StopMonitor mapp = (StopMonitor) createModelElement_StopMonitor();
// 
// 			setParas_Stopmonitor(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AStopmonitorApp)

//}
	
 protected void setParas_StopMonitor (List typedList,IStopMonitor anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, StopMonitor) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==0){
	}
 }	

// public  void caseAStopmonitorApp(AStopmonitorApp node) {
            //return new StopmonitorImpl();
//}
// public  void caseTStopmonitor(TStopmonitor node) {
            //return new StopmonitorImpl();
//}
// public  void caseAGetgroupmatchcountAppApp(AGetgroupmatchcountAppApp node) {
//        PGetgroupmatchcountApp app_ = node.getGetgroupmatchcountApp();
//        if (app_ instanceof AGetgroupmatchcountApp) {
//            AGetgroupmatchcountApp app = (AGetgroupmatchcountApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            GetGroupMatchCount mapp = (GetGroupMatchCount) createModelElement_GetGroupMatchCount();
// 
// 			setParas_Getgroupmatchcount(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AGetgroupmatchcountApp)

//}
	
 protected void setParas_GetGroupMatchCount (List typedList,IGetGroupMatchCount anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, GetGroupMatchCount) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setGroupmatch(typedList.get(0).toString());
		anApp.setCategory(typedList.get(1).toString());
	}
 }	

// public  void caseAGetgroupmatchcountApp(AGetgroupmatchcountApp node) {
            //return new GetgroupmatchcountImpl();
//}
// public  void caseTGetgroupmatchcount(TGetgroupmatchcount node) {
            //return new GetgroupmatchcountImpl();
//}
// public  void caseAWaitAppApp(AWaitAppApp node) {
//        PWaitApp app_ = node.getWaitApp();
//        if (app_ instanceof AWaitApp) {
//            AWaitApp app = (AWaitApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Wait mapp = (Wait) createModelElement_Wait();
// 
// 			setParas_Wait(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AWaitApp)

//}
	
 protected void setParas_Wait (List typedList,IWait anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Wait) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setSeconds(typedList.get(0).toString());
	}
 }	

// public  void caseAWaitApp(AWaitApp node) {
            //return new WaitImpl();
//}
// public  void caseTWait(TWait node) {
            //return new WaitImpl();
//}
// public  void caseAZapatellerAppApp(AZapatellerAppApp node) {
//        PZapatellerApp app_ = node.getZapatellerApp();
//        if (app_ instanceof AZapatellerApp) {
//            AZapatellerApp app = (AZapatellerApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Zapateller mapp = (Zapateller) createModelElement_Zapateller();
// 
// 			setParas_Zapateller(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AZapatellerApp)

//}
	
 protected void setParas_Zapateller (List typedList,IZapateller anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Zapateller) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setOptions(typedList.get(0).toString());
	}
 }	

// public  void caseAZapatellerApp(AZapatellerApp node) {
            //return new ZapatellerImpl();
//}
// public  void caseTZapateller(TZapateller node) {
            //return new ZapatellerImpl();
//}
// public  void caseAExecAppApp(AExecAppApp node) {
//        PExecApp app_ = node.getExecApp();
//        if (app_ instanceof AExecApp) {
//            AExecApp app = (AExecApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Exec mapp = (Exec) createModelElement_Exec();
// 
// 			setParas_Exec(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AExecApp)

//}
	
 protected void setParas_Exec (List typedList,IExec anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Exec) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setAppname(typedList.get(0).toString());
		anApp.setArguments(typedList.get(1).toString());
	}
 }	

// public  void caseAExecApp(AExecApp node) {
            //return new ExecImpl();
//}
// public  void caseTExec(TExec node) {
            //return new ExecImpl();
//}
// public  void caseASendtextAppApp(ASendtextAppApp node) {
//        PSendtextApp app_ = node.getSendtextApp();
//        if (app_ instanceof ASendtextApp) {
//            ASendtextApp app = (ASendtextApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            SendText mapp = (SendText) createModelElement_SendText();
// 
// 			setParas_Sendtext(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ASendtextApp)

//}
	
 protected void setParas_SendText (List typedList,ISendText anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, SendText) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setText(typedList.get(0).toString());
	}
 }	

// public  void caseASendtextApp(ASendtextApp node) {
            //return new SendtextImpl();
//}
// public  void caseTSendtext(TSendtext node) {
            //return new SendtextImpl();
//}
// public  void caseAZapbargeAppApp(AZapbargeAppApp node) {
//        PZapbargeApp app_ = node.getZapbargeApp();
//        if (app_ instanceof AZapbargeApp) {
//            AZapbargeApp app = (AZapbargeApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            ZapBarge mapp = (ZapBarge) createModelElement_ZapBarge();
// 
// 			setParas_Zapbarge(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AZapbargeApp)

//}
	
 protected void setParas_ZapBarge (List typedList,IZapBarge anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, ZapBarge) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setChannel(typedList.get(0).toString());
	}
 }	

// public  void caseAZapbargeApp(AZapbargeApp node) {
            //return new ZapbargeImpl();
//}
// public  void caseTZapbarge(TZapbarge node) {
            //return new ZapbargeImpl();
//}
// public  void caseASuffixAppApp(ASuffixAppApp node) {
//        PSuffixApp app_ = node.getSuffixApp();
//        if (app_ instanceof ASuffixApp) {
//            ASuffixApp app = (ASuffixApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Suffix mapp = (Suffix) createModelElement_Suffix();
// 
// 			setParas_Suffix(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ASuffixApp)

//}
	
 protected void setParas_Suffix (List typedList,ISuffix anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Suffix) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setDigits(typedList.get(0).toString());
	}
 }	

// public  void caseASuffixApp(ASuffixApp node) {
            //return new SuffixImpl();
//}
// public  void caseTSuffix(TSuffix node) {
            //return new SuffixImpl();
//}
// public  void caseADatetimeAppApp(ADatetimeAppApp node) {
//        PDatetimeApp app_ = node.getDatetimeApp();
//        if (app_ instanceof ADatetimeApp) {
//            ADatetimeApp app = (ADatetimeApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            DateTime mapp = (DateTime) createModelElement_DateTime();
// 
// 			setParas_Datetime(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ADatetimeApp)

//}
	
 protected void setParas_DateTime (List typedList,IDateTime anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, DateTime) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==3){
		anApp.setUnixtime(typedList.get(0).toString());
		anApp.setTimezone(typedList.get(1).toString());
		anApp.setFormat(typedList.get(2).toString());
	}
 }	

// public  void caseADatetimeApp(ADatetimeApp node) {
            //return new DatetimeImpl();
//}
// public  void caseTDatetime(TDatetime node) {
            //return new DatetimeImpl();
//}
// public  void caseAMd5checkAppApp(AMd5checkAppApp node) {
//        PMd5checkApp app_ = node.getMd5checkApp();
//        if (app_ instanceof AMd5checkApp) {
//            AMd5checkApp app = (AMd5checkApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            MD5Check mapp = (MD5Check) createModelElement_MD5Check();
// 
// 			setParas_Md5check(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AMd5checkApp)

//}
	
 protected void setParas_MD5Check (List typedList,IMD5Check anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, MD5Check) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setMd5hash(typedList.get(0).toString());
		anApp.setString(typedList.get(1).toString());
	}
 }	

// public  void caseAMd5checkApp(AMd5checkApp node) {
            //return new Md5checkImpl();
//}
// public  void caseTMd5check(TMd5check node) {
            //return new Md5checkImpl();
//}
// public  void caseAGotoAppApp(AGotoAppApp node) {
//        PGotoApp app_ = node.getGotoApp();
//        if (app_ instanceof AGotoApp) {
//            AGotoApp app = (AGotoApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Goto mapp = (Goto) createModelElement_Goto();
// 
// 			setParas_Goto(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AGotoApp)

//}
	
 protected void setParas_Goto (List typedList,IGoto anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Goto) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==3){
		anApp.setContext(typedList.get(0).toString());
		anApp.setPriority(typedList.get(1).toString());
	}
 }	

// public  void caseAGotoApp(AGotoApp node) {
            //return new GotoImpl();
//}
// public  void caseTGoto(TGoto node) {
            //return new GotoImpl();
//}
// public  void caseADumpchanAppApp(ADumpchanAppApp node) {
//        PDumpchanApp app_ = node.getDumpchanApp();
//        if (app_ instanceof ADumpchanApp) {
//            ADumpchanApp app = (ADumpchanApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            DumpChan mapp = (DumpChan) createModelElement_DumpChan();
// 
// 			setParas_Dumpchan(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ADumpchanApp)

//}
	
 protected void setParas_DumpChan (List typedList,IDumpChan anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, DumpChan) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setMin_verbose_level(typedList.get(0).toString());
	}
 }	

// public  void caseADumpchanApp(ADumpchanApp node) {
            //return new DumpchanImpl();
//}
// public  void caseTDumpchan(TDumpchan node) {
            //return new DumpchanImpl();
//}
// public  void caseAMonitorAppApp(AMonitorAppApp node) {
//        PMonitorApp app_ = node.getMonitorApp();
//        if (app_ instanceof AMonitorApp) {
//            AMonitorApp app = (AMonitorApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Monitor mapp = (Monitor) createModelElement_Monitor();
// 
// 			setParas_Monitor(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AMonitorApp)

//}
	
 protected void setParas_Monitor (List typedList,IMonitor anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Monitor) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==4){
		anApp.setFile_format(typedList.get(0).toString());
		anApp.setUrlbase(typedList.get(1).toString());
		anApp.setFname_base(typedList.get(2).toString());
		anApp.setOptions(typedList.get(3).toString());
	}
 }	

// public  void caseAMonitorApp(AMonitorApp node) {
            //return new MonitorImpl();
//}
// public  void caseTMonitor(TMonitor node) {
            //return new MonitorImpl();
//}
// public  void caseADbdeltreeAppApp(ADbdeltreeAppApp node) {
//        PDbdeltreeApp app_ = node.getDbdeltreeApp();
//        if (app_ instanceof ADbdeltreeApp) {
//            ADbdeltreeApp app = (ADbdeltreeApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            DBdeltree mapp = (DBdeltree) createModelElement_DBdeltree();
// 
// 			setParas_Dbdeltree(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ADbdeltreeApp)

//}
	
 protected void setParas_DBdeltree (List typedList,IDBdeltree anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, DBdeltree) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setFamily(typedList.get(0).toString());
		anApp.setKeytree(typedList.get(1).toString());
	}
 }	

// public  void caseADbdeltreeApp(ADbdeltreeApp node) {
            //return new DbdeltreeImpl();
//}
// public  void caseTDbdeltree(TDbdeltree node) {
            //return new DbdeltreeImpl();
//}
// public  void caseACheckgroupAppApp(ACheckgroupAppApp node) {
//        PCheckgroupApp app_ = node.getCheckgroupApp();
//        if (app_ instanceof ACheckgroupApp) {
//            ACheckgroupApp app = (ACheckgroupApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            CheckGroup mapp = (CheckGroup) createModelElement_CheckGroup();
// 
// 			setParas_Checkgroup(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ACheckgroupApp)

//}
	
 protected void setParas_CheckGroup (List typedList,ICheckGroup anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, CheckGroup) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setMax(typedList.get(0).toString());
		anApp.setCategory(typedList.get(1).toString());
	}
 }	

// public  void caseACheckgroupApp(ACheckgroupApp node) {
            //return new CheckgroupImpl();
//}
// public  void caseTCheckgroup(TCheckgroup node) {
            //return new CheckgroupImpl();
//}
// public  void caseANoopAppApp(ANoopAppApp node) {
//        PNoopApp app_ = node.getNoopApp();
//        if (app_ instanceof ANoopApp) {
//            ANoopApp app = (ANoopApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            NoOp mapp = (NoOp) createModelElement_NoOp();
// 
// 			setParas_Noop(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ANoopApp)

//}
	
 protected void setParas_NoOp (List typedList,INoOp anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, NoOp) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==0){
	}
 }	

// public  void caseANoopApp(ANoopApp node) {
            //return new NoopImpl();
//}
// public  void caseTNoop(TNoop node) {
            //return new NoopImpl();
//}
// public  void caseAResetcdrAppApp(AResetcdrAppApp node) {
//        PResetcdrApp app_ = node.getResetcdrApp();
//        if (app_ instanceof AResetcdrApp) {
//            AResetcdrApp app = (AResetcdrApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            ResetCDR mapp = (ResetCDR) createModelElement_ResetCDR();
// 
// 			setParas_Resetcdr(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AResetcdrApp)

//}
	
 protected void setParas_ResetCDR (List typedList,IResetCDR anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, ResetCDR) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setOptions(typedList.get(0).toString());
	}
 }	

// public  void caseAResetcdrApp(AResetcdrApp node) {
            //return new ResetcdrImpl();
//}
// public  void caseTResetcdr(TResetcdr node) {
            //return new ResetcdrImpl();
//}
// public  void caseARealtimeupdateAppApp(ARealtimeupdateAppApp node) {
//        PRealtimeupdateApp app_ = node.getRealtimeupdateApp();
//        if (app_ instanceof ARealtimeupdateApp) {
//            ARealtimeupdateApp app = (ARealtimeupdateApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            RealTimeUpdate mapp = (RealTimeUpdate) createModelElement_RealTimeUpdate();
// 
// 			setParas_Realtimeupdate(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ARealtimeupdateApp)

//}
	
 protected void setParas_RealTimeUpdate (List typedList,IRealTimeUpdate anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, RealTimeUpdate) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==5){
		anApp.setFamily(typedList.get(0).toString());
		anApp.setColmatch(typedList.get(1).toString());
		anApp.setValue(typedList.get(2).toString());
		anApp.setNewcol(typedList.get(3).toString());
		anApp.setNewval(typedList.get(4).toString());
	}
 }	

// public  void caseARealtimeupdateApp(ARealtimeupdateApp node) {
            //return new RealtimeupdateImpl();
//}
// public  void caseTRealtimeupdate(TRealtimeupdate node) {
            //return new RealtimeupdateImpl();
//}
// public  void caseAControlplaybackAppApp(AControlplaybackAppApp node) {
//        PControlplaybackApp app_ = node.getControlplaybackApp();
//        if (app_ instanceof AControlplaybackApp) {
//            AControlplaybackApp app = (AControlplaybackApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            ControlPlayback mapp = (ControlPlayback) createModelElement_ControlPlayback();
// 
// 			setParas_Controlplayback(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AControlplaybackApp)

//}
	
 protected void setParas_ControlPlayback (List typedList,IControlPlayback anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, ControlPlayback) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==6){
		anApp.setFilename(typedList.get(0).toString());
		anApp.setSkipms(typedList.get(1).toString());
		anApp.setFfchar(typedList.get(2).toString());
		anApp.setRewchar(typedList.get(3).toString());
		anApp.setStopchar(typedList.get(4).toString());
		anApp.setPausechr(typedList.get(5).toString());
	}
 }	

// public  void caseAControlplaybackApp(AControlplaybackApp node) {
            //return new ControlplaybackImpl();
//}
// public  void caseTControlplayback(TControlplayback node) {
            //return new ControlplaybackImpl();
//}
// public  void caseAFestivalAppApp(AFestivalAppApp node) {
//        PFestivalApp app_ = node.getFestivalApp();
//        if (app_ instanceof AFestivalApp) {
//            AFestivalApp app = (AFestivalApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Festival mapp = (Festival) createModelElement_Festival();
// 
// 			setParas_Festival(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AFestivalApp)

//}
	
 protected void setParas_Festival (List typedList,IFestival anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Festival) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setText(typedList.get(0).toString());
		anApp.setIntkeys(typedList.get(1).toString());
	}
 }	

// public  void caseAFestivalApp(AFestivalApp node) {
            //return new FestivalImpl();
//}
// public  void caseTFestival(TFestival node) {
            //return new FestivalImpl();
//}
// public  void caseAForkcdrAppApp(AForkcdrAppApp node) {
//        PForkcdrApp app_ = node.getForkcdrApp();
//        if (app_ instanceof AForkcdrApp) {
//            AForkcdrApp app = (AForkcdrApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            ForkCDR mapp = (ForkCDR) createModelElement_ForkCDR();
// 
// 			setParas_Forkcdr(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AForkcdrApp)

//}
	
 protected void setParas_ForkCDR (List typedList,IForkCDR anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, ForkCDR) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setOptions(typedList.get(0).toString());
	}
 }	

// public  void caseAForkcdrApp(AForkcdrApp node) {
            //return new ForkcdrImpl();
//}
// public  void caseTForkcdr(TForkcdr node) {
            //return new ForkcdrImpl();
//}
// public  void caseAProgressAppApp(AProgressAppApp node) {
//        PProgressApp app_ = node.getProgressApp();
//        if (app_ instanceof AProgressApp) {
//            AProgressApp app = (AProgressApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Progress mapp = (Progress) createModelElement_Progress();
// 
// 			setParas_Progress(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AProgressApp)

//}
	
 protected void setParas_Progress (List typedList,IProgress anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Progress) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==0){
	}
 }	

// public  void caseAProgressApp(AProgressApp node) {
            //return new ProgressImpl();
//}
// public  void caseTProgress(TProgress node) {
            //return new ProgressImpl();
//}
// public  void caseABackgrounddetectAppApp(ABackgrounddetectAppApp node) {
//        PBackgrounddetectApp app_ = node.getBackgrounddetectApp();
//        if (app_ instanceof ABackgrounddetectApp) {
//            ABackgrounddetectApp app = (ABackgrounddetectApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            BackgroundDetect mapp = (BackgroundDetect) createModelElement_BackgroundDetect();
// 
// 			setParas_Backgrounddetect(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ABackgrounddetectApp)

//}
	
 protected void setParas_BackgroundDetect (List typedList,IBackgroundDetect anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, BackgroundDetect) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==4){
		anApp.setFilename(typedList.get(0).toString());
		anApp.setSil(typedList.get(1).toString());
		anApp.setMin(typedList.get(2).toString());
		anApp.setMax(typedList.get(3).toString());
	}
 }	

// public  void caseABackgrounddetectApp(ABackgrounddetectApp node) {
            //return new BackgrounddetectImpl();
//}
// public  void caseTBackgrounddetect(TBackgrounddetect node) {
            //return new BackgrounddetectImpl();
//}
// public  void caseAHangupAppApp(AHangupAppApp node) {
//        PHangupApp app_ = node.getHangupApp();
//        if (app_ instanceof AHangupApp) {
//            AHangupApp app = (AHangupApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Hangup mapp = (Hangup) createModelElement_Hangup();
// 
// 			setParas_Hangup(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AHangupApp)

//}
	
 protected void setParas_Hangup (List typedList,IHangup anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Hangup) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==0){
	}
 }	

// public  void caseAHangupApp(AHangupApp node) {
            //return new HangupImpl();
//}
// public  void caseTHangup(THangup node) {
            //return new HangupImpl();
//}
// public  void caseAMeetmecountAppApp(AMeetmecountAppApp node) {
//        PMeetmecountApp app_ = node.getMeetmecountApp();
//        if (app_ instanceof AMeetmecountApp) {
//            AMeetmecountApp app = (AMeetmecountApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            MeetMeCount mapp = (MeetMeCount) createModelElement_MeetMeCount();
// 
// 			setParas_Meetmecount(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AMeetmecountApp)

//}
	
 protected void setParas_MeetMeCount (List typedList,IMeetMeCount anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, MeetMeCount) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setConfno(typedList.get(0).toString());
		anApp.setVar(typedList.get(1).toString());
	}
 }	

// public  void caseAMeetmecountApp(AMeetmecountApp node) {
            //return new MeetmecountImpl();
//}
// public  void caseTMeetmecount(TMeetmecount node) {
            //return new MeetmecountImpl();
//}
// public  void caseAReadfileAppApp(AReadfileAppApp node) {
//        PReadfileApp app_ = node.getReadfileApp();
//        if (app_ instanceof AReadfileApp) {
//            AReadfileApp app = (AReadfileApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            ReadFile mapp = (ReadFile) createModelElement_ReadFile();
// 
// 			setParas_Readfile(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AReadfileApp)

//}
	
 protected void setParas_ReadFile (List typedList,IReadFile anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, ReadFile) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==3){
		anApp.setVarname(typedList.get(0).toString());
		anApp.setFile(typedList.get(1).toString());
		anApp.setLength(typedList.get(2).toString());
	}
 }	

// public  void caseAReadfileApp(AReadfileApp node) {
            //return new ReadfileImpl();
//}
// public  void caseTReadfile(TReadfile node) {
            //return new ReadfileImpl();
//}
// public  void caseAAdsiprogAppApp(AAdsiprogAppApp node) {
//        PAdsiprogApp app_ = node.getAdsiprogApp();
//        if (app_ instanceof AAdsiprogApp) {
//            AAdsiprogApp app = (AAdsiprogApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            ADSIProg mapp = (ADSIProg) createModelElement_ADSIProg();
// 
// 			setParas_Adsiprog(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AAdsiprogApp)

//}
	
 protected void setParas_ADSIProg (List typedList,IADSIProg anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, ADSIProg) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setScript(typedList.get(0).toString());
	}
 }	

// public  void caseAAdsiprogApp(AAdsiprogApp node) {
            //return new AdsiprogImpl();
//}
// public  void caseTAdsiprog(TAdsiprog node) {
            //return new AdsiprogImpl();
//}
// public  void caseAZapscanAppApp(AZapscanAppApp node) {
//        PZapscanApp app_ = node.getZapscanApp();
//        if (app_ instanceof AZapscanApp) {
//            AZapscanApp app = (AZapscanApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            ZapScan mapp = (ZapScan) createModelElement_ZapScan();
// 
// 			setParas_Zapscan(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AZapscanApp)

//}
	
 protected void setParas_ZapScan (List typedList,IZapScan anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, ZapScan) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setGroup(typedList.get(0).toString());
	}
 }	

// public  void caseAZapscanApp(AZapscanApp node) {
            //return new ZapscanImpl();
//}
// public  void caseTZapscan(TZapscan node) {
            //return new ZapscanImpl();
//}
// public  void caseAZaprasAppApp(AZaprasAppApp node) {
//        PZaprasApp app_ = node.getZaprasApp();
//        if (app_ instanceof AZaprasApp) {
//            AZaprasApp app = (AZaprasApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            ZapRAS mapp = (ZapRAS) createModelElement_ZapRAS();
// 
// 			setParas_Zapras(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AZaprasApp)

//}
	
 protected void setParas_ZapRAS (List typedList,IZapRAS anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, ZapRAS) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setArgs(typedList.get(0).toString());
	}
 }	

// public  void caseAZaprasApp(AZaprasApp node) {
            //return new ZaprasImpl();
//}
// public  void caseTZapras(TZapras node) {
            //return new ZaprasImpl();
//}
// public  void caseATestserverAppApp(ATestserverAppApp node) {
//        PTestserverApp app_ = node.getTestserverApp();
//        if (app_ instanceof ATestserverApp) {
//            ATestserverApp app = (ATestserverApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            TestServer mapp = (TestServer) createModelElement_TestServer();
// 
// 			setParas_Testserver(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ATestserverApp)

//}
	
 protected void setParas_TestServer (List typedList,ITestServer anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, TestServer) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==0){
	}
 }	

// public  void caseATestserverApp(ATestserverApp node) {
            //return new TestserverImpl();
//}
// public  void caseTTestserver(TTestserver node) {
            //return new TestserverImpl();
//}
// public  void caseASaydigitsAppApp(ASaydigitsAppApp node) {
//        PSaydigitsApp app_ = node.getSaydigitsApp();
//        if (app_ instanceof ASaydigitsApp) {
//            ASaydigitsApp app = (ASaydigitsApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            SayDigits mapp = (SayDigits) createModelElement_SayDigits();
// 
// 			setParas_Saydigits(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ASaydigitsApp)

//}
	
 protected void setParas_SayDigits (List typedList,ISayDigits anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, SayDigits) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setDigits(typedList.get(0).toString());
	}
 }	

// public  void caseASaydigitsApp(ASaydigitsApp node) {
            //return new SaydigitsImpl();
//}
// public  void caseTSaydigits(TSaydigits node) {
            //return new SaydigitsImpl();
//}
// public  void caseATxtcidnameAppApp(ATxtcidnameAppApp node) {
//        PTxtcidnameApp app_ = node.getTxtcidnameApp();
//        if (app_ instanceof ATxtcidnameApp) {
//            ATxtcidnameApp app = (ATxtcidnameApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            TXTCIDName mapp = (TXTCIDName) createModelElement_TXTCIDName();
// 
// 			setParas_Txtcidname(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ATxtcidnameApp)

//}
	
 protected void setParas_TXTCIDName (List typedList,ITXTCIDName anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, TXTCIDName) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==0){
	}
 }	

// public  void caseATxtcidnameApp(ATxtcidnameApp node) {
            //return new TxtcidnameImpl();
//}
// public  void caseTTxtcidname(TTxtcidname node) {
            //return new TxtcidnameImpl();
//}
// public  void caseASofthangupAppApp(ASofthangupAppApp node) {
//        PSofthangupApp app_ = node.getSofthangupApp();
//        if (app_ instanceof ASofthangupApp) {
//            ASofthangupApp app = (ASofthangupApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            SoftHangup mapp = (SoftHangup) createModelElement_SoftHangup();
// 
// 			setParas_Softhangup(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ASofthangupApp)

//}
	
 protected void setParas_SoftHangup (List typedList,ISoftHangup anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, SoftHangup) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==3){
		anApp.setTechnology(typedList.get(0).toString());
		anApp.setResource(typedList.get(1).toString());
		anApp.setOptions(typedList.get(2).toString());
	}
 }	

// public  void caseASofthangupApp(ASofthangupApp node) {
            //return new SofthangupImpl();
//}
// public  void caseTSofthangup(TSofthangup node) {
            //return new SofthangupImpl();
//}
// public  void caseASetlanguageAppApp(ASetlanguageAppApp node) {
//        PSetlanguageApp app_ = node.getSetlanguageApp();
//        if (app_ instanceof ASetlanguageApp) {
//            ASetlanguageApp app = (ASetlanguageApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            SetLanguage mapp = (SetLanguage) createModelElement_SetLanguage();
// 
// 			setParas_Setlanguage(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ASetlanguageApp)

//}
	
 protected void setParas_SetLanguage (List typedList,ISetLanguage anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, SetLanguage) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setLanguage(typedList.get(0).toString());
	}
 }	

// public  void caseASetlanguageApp(ASetlanguageApp node) {
            //return new SetlanguageImpl();
//}
// public  void caseTSetlanguage(TSetlanguage node) {
            //return new SetlanguageImpl();
//}
// public  void caseAPrivacymanagerAppApp(APrivacymanagerAppApp node) {
//        PPrivacymanagerApp app_ = node.getPrivacymanagerApp();
//        if (app_ instanceof APrivacymanagerApp) {
//            APrivacymanagerApp app = (APrivacymanagerApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            PrivacyManager mapp = (PrivacyManager) createModelElement_PrivacyManager();
// 
// 			setParas_Privacymanager(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof APrivacymanagerApp)

//}
	
 protected void setParas_PrivacyManager (List typedList,IPrivacyManager anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, PrivacyManager) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==0){
	}
 }	

// public  void caseAPrivacymanagerApp(APrivacymanagerApp node) {
            //return new PrivacymanagerImpl();
//}
// public  void caseTPrivacymanager(TPrivacymanager node) {
            //return new PrivacymanagerImpl();
//}
// public  void caseAEchoAppApp(AEchoAppApp node) {
//        PEchoApp app_ = node.getEchoApp();
//        if (app_ instanceof AEchoApp) {
//            AEchoApp app = (AEchoApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Echo mapp = (Echo) createModelElement_Echo();
// 
// 			setParas_Echo(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AEchoApp)

//}
	
 protected void setParas_Echo (List typedList,IEcho anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Echo) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==0){
	}
 }	

// public  void caseAEchoApp(AEchoApp node) {
            //return new EchoImpl();
//}
// public  void caseTEcho(TEcho node) {
            //return new EchoImpl();
//}
// public  void caseASetcalleridAppApp(ASetcalleridAppApp node) {
//        PSetcalleridApp app_ = node.getSetcalleridApp();
//        if (app_ instanceof ASetcalleridApp) {
//            ASetcalleridApp app = (ASetcalleridApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            SetCallerID mapp = (SetCallerID) createModelElement_SetCallerID();
// 
// 			setParas_Setcallerid(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ASetcalleridApp)

//}
	
 protected void setParas_SetCallerID (List typedList,ISetCallerID anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, SetCallerID) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setClid(typedList.get(0).toString());
		anApp.setA(typedList.get(1).toString());
	}
 }	

// public  void caseASetcalleridApp(ASetcalleridApp node) {
            //return new SetcalleridImpl();
//}
// public  void caseTSetcallerid(TSetcallerid node) {
            //return new SetcalleridImpl();
//}
// public  void caseAStripmsdAppApp(AStripmsdAppApp node) {
//        PStripmsdApp app_ = node.getStripmsdApp();
//        if (app_ instanceof AStripmsdApp) {
//            AStripmsdApp app = (AStripmsdApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            StripMSD mapp = (StripMSD) createModelElement_StripMSD();
// 
// 			setParas_Stripmsd(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AStripmsdApp)

//}
	
 protected void setParas_StripMSD (List typedList,IStripMSD anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, StripMSD) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setCount(typedList.get(0).toString());
	}
 }	

// public  void caseAStripmsdApp(AStripmsdApp node) {
            //return new StripmsdImpl();
//}
// public  void caseTStripmsd(TStripmsd node) {
            //return new StripmsdImpl();
//}
// public  void caseASetamaflagsAppApp(ASetamaflagsAppApp node) {
//        PSetamaflagsApp app_ = node.getSetamaflagsApp();
//        if (app_ instanceof ASetamaflagsApp) {
//            ASetamaflagsApp app = (ASetamaflagsApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            SetAMAFlags mapp = (SetAMAFlags) createModelElement_SetAMAFlags();
// 
// 			setParas_Setamaflags(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ASetamaflagsApp)

//}
	
 protected void setParas_SetAMAFlags (List typedList,ISetAMAFlags anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, SetAMAFlags) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setFlag(typedList.get(0).toString());
	}
 }	

// public  void caseASetamaflagsApp(ASetamaflagsApp node) {
            //return new SetamaflagsImpl();
//}
// public  void caseTSetamaflags(TSetamaflags node) {
            //return new SetamaflagsImpl();
//}
// public  void caseAImportvarAppApp(AImportvarAppApp node) {
//        PImportvarApp app_ = node.getImportvarApp();
//        if (app_ instanceof AImportvarApp) {
//            AImportvarApp app = (AImportvarApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            ImportVar mapp = (ImportVar) createModelElement_ImportVar();
// 
// 			setParas_Importvar(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AImportvarApp)

//}
	
 protected void setParas_ImportVar (List typedList,IImportVar anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, ImportVar) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==3){
		anApp.setN(typedList.get(0).toString());
		anApp.setChannel(typedList.get(1).toString());
		anApp.setVariable(typedList.get(2).toString());
	}
 }	

// public  void caseAImportvarApp(AImportvarApp node) {
            //return new ImportvarImpl();
//}
// public  void caseTImportvar(TImportvar node) {
            //return new ImportvarImpl();
//}
// public  void caseAWaitmusiconholdAppApp(AWaitmusiconholdAppApp node) {
//        PWaitmusiconholdApp app_ = node.getWaitmusiconholdApp();
//        if (app_ instanceof AWaitmusiconholdApp) {
//            AWaitmusiconholdApp app = (AWaitmusiconholdApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            WaitMusicOnHold mapp = (WaitMusicOnHold) createModelElement_WaitMusicOnHold();
// 
// 			setParas_Waitmusiconhold(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AWaitmusiconholdApp)

//}
	
 protected void setParas_WaitMusicOnHold (List typedList,IWaitMusicOnHold anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, WaitMusicOnHold) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setDelay(typedList.get(0).toString());
	}
 }	

// public  void caseAWaitmusiconholdApp(AWaitmusiconholdApp node) {
            //return new WaitmusiconholdImpl();
//}
// public  void caseTWaitmusiconhold(TWaitmusiconhold node) {
            //return new WaitmusiconholdImpl();
//}
// public  void caseAQueueAppApp(AQueueAppApp node) {
//        PQueueApp app_ = node.getQueueApp();
//        if (app_ instanceof AQueueApp) {
//            AQueueApp app = (AQueueApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Queue mapp = (Queue) createModelElement_Queue();
// 
// 			setParas_Queue(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AQueueApp)

//}
	
 protected void setParas_Queue (List typedList,IQueue anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Queue) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==5){
		anApp.setQueuename(typedList.get(0).toString());
		anApp.setOptions(typedList.get(1).toString());
		anApp.setURL(typedList.get(2).toString());
		anApp.setAnnounceoverride(typedList.get(3).toString());
		anApp.setTimeout(typedList.get(4).toString());
	}
 }	

// public  void caseAQueueApp(AQueueApp node) {
            //return new QueueImpl();
//}
// public  void caseTQueue(TQueue node) {
            //return new QueueImpl();
//}
// public  void caseARecordAppApp(ARecordAppApp node) {
//        PRecordApp app_ = node.getRecordApp();
//        if (app_ instanceof ARecordApp) {
//            ARecordApp app = (ARecordApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Record mapp = (Record) createModelElement_Record();
// 
// 			setParas_Record(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ARecordApp)

//}
	
 protected void setParas_Record (List typedList,IRecord anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Record) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==5){
		anApp.setFilename(typedList.get(0).toString());
		anApp.setFormat(typedList.get(1).toString());
		anApp.setSilence(typedList.get(2).toString());
		anApp.setMaxduration(typedList.get(3).toString());
		anApp.setOptions(typedList.get(4).toString());
	}
 }	

// public  void caseARecordApp(ARecordApp node) {
            //return new RecordImpl();
//}
// public  void caseTRecord(TRecord node) {
            //return new RecordImpl();
//}
// public  void caseAStriplsdAppApp(AStriplsdAppApp node) {
//        PStriplsdApp app_ = node.getStriplsdApp();
//        if (app_ instanceof AStriplsdApp) {
//            AStriplsdApp app = (AStriplsdApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            StripLSD mapp = (StripLSD) createModelElement_StripLSD();
// 
// 			setParas_Striplsd(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AStriplsdApp)

//}
	
 protected void setParas_StripLSD (List typedList,IStripLSD anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, StripLSD) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setCount(typedList.get(0).toString());
	}
 }	

// public  void caseAStriplsdApp(AStriplsdApp node) {
            //return new StriplsdImpl();
//}
// public  void caseTStriplsd(TStriplsd node) {
            //return new StriplsdImpl();
//}
// public  void caseAHasvoicemailAppApp(AHasvoicemailAppApp node) {
//        PHasvoicemailApp app_ = node.getHasvoicemailApp();
//        if (app_ instanceof AHasvoicemailApp) {
//            AHasvoicemailApp app = (AHasvoicemailApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            HasVoicemail mapp = (HasVoicemail) createModelElement_HasVoicemail();
// 
// 			setParas_Hasvoicemail(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AHasvoicemailApp)

//}
	
 protected void setParas_HasVoicemail (List typedList,IHasVoicemail anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, HasVoicemail) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==4){
		anApp.setVmbox(typedList.get(0).toString());
		anApp.setContext(typedList.get(1).toString());
		anApp.setFolder(typedList.get(2).toString());
		anApp.setVarname(typedList.get(3).toString());
	}
 }	

// public  void caseAHasvoicemailApp(AHasvoicemailApp node) {
            //return new HasvoicemailImpl();
//}
// public  void caseTHasvoicemail(THasvoicemail node) {
            //return new HasvoicemailImpl();
//}
// public  void caseAAbsolutetimeoutAppApp(AAbsolutetimeoutAppApp node) {
//        PAbsolutetimeoutApp app_ = node.getAbsolutetimeoutApp();
//        if (app_ instanceof AAbsolutetimeoutApp) {
//            AAbsolutetimeoutApp app = (AAbsolutetimeoutApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            AbsoluteTimeout mapp = (AbsoluteTimeout) createModelElement_AbsoluteTimeout();
// 
// 			setParas_Absolutetimeout(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AAbsolutetimeoutApp)

//}
	
 protected void setParas_AbsoluteTimeout (List typedList,IAbsoluteTimeout anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, AbsoluteTimeout) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setSeconds(typedList.get(0).toString());
	}
 }	

// public  void caseAAbsolutetimeoutApp(AAbsolutetimeoutApp node) {
            //return new AbsolutetimeoutImpl();
//}
// public  void caseTAbsolutetimeout(TAbsolutetimeout node) {
            //return new AbsolutetimeoutImpl();
//}
// public  void caseASipaddheaderAppApp(ASipaddheaderAppApp node) {
//        PSipaddheaderApp app_ = node.getSipaddheaderApp();
//        if (app_ instanceof ASipaddheaderApp) {
//            ASipaddheaderApp app = (ASipaddheaderApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            SIPAddHeader mapp = (SIPAddHeader) createModelElement_SIPAddHeader();
// 
// 			setParas_Sipaddheader(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ASipaddheaderApp)

//}
	
 protected void setParas_SIPAddHeader (List typedList,ISIPAddHeader anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, SIPAddHeader) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setHeader(typedList.get(0).toString());
		anApp.setContent(typedList.get(1).toString());
	}
 }	

// public  void caseASipaddheaderApp(ASipaddheaderApp node) {
            //return new SipaddheaderImpl();
//}
// public  void caseTSipaddheader(TSipaddheader node) {
            //return new SipaddheaderImpl();
//}
// public  void caseAEagiAppApp(AEagiAppApp node) {
//        PEagiApp app_ = node.getEagiApp();
//        if (app_ instanceof AEagiApp) {
//            AEagiApp app = (AEagiApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            EAGI mapp = (EAGI) createModelElement_EAGI();
// 
// 			setParas_Eagi(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AEagiApp)

//}
	
 protected void setParas_EAGI (List typedList,IEAGI anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, EAGI) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==0){
	}
 }	

// public  void caseAEagiApp(AEagiApp node) {
            //return new EagiImpl();
//}
// public  void caseTEagi(TEagi node) {
            //return new EagiImpl();
//}
// public  void caseAAuthenticateAppApp(AAuthenticateAppApp node) {
//        PAuthenticateApp app_ = node.getAuthenticateApp();
//        if (app_ instanceof AAuthenticateApp) {
//            AAuthenticateApp app = (AAuthenticateApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Authenticate mapp = (Authenticate) createModelElement_Authenticate();
// 
// 			setParas_Authenticate(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AAuthenticateApp)

//}
	
 protected void setParas_Authenticate (List typedList,IAuthenticate anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Authenticate) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setPassword(typedList.get(0).toString());
		anApp.setOptions(typedList.get(1).toString());
	}
 }	

// public  void caseAAuthenticateApp(AAuthenticateApp node) {
            //return new AuthenticateImpl();
//}
// public  void caseTAuthenticate(TAuthenticate node) {
            //return new AuthenticateImpl();
//}
// public  void caseAUnpausequeuememberAppApp(AUnpausequeuememberAppApp node) {
//        PUnpausequeuememberApp app_ = node.getUnpausequeuememberApp();
//        if (app_ instanceof AUnpausequeuememberApp) {
//            AUnpausequeuememberApp app = (AUnpausequeuememberApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            UnpauseQueueMember mapp = (UnpauseQueueMember) createModelElement_UnpauseQueueMember();
// 
// 			setParas_Unpausequeuemember(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AUnpausequeuememberApp)

//}
	
 protected void setParas_UnpauseQueueMember (List typedList,IUnpauseQueueMember anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, UnpauseQueueMember) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setQueuename(typedList.get(0).toString());
		anApp.setInterface_(typedList.get(1).toString());
	}
 }	

// public  void caseAUnpausequeuememberApp(AUnpausequeuememberApp node) {
            //return new UnpausequeuememberImpl();
//}
// public  void caseTUnpausequeuemember(TUnpausequeuemember node) {
            //return new UnpausequeuememberImpl();
//}
// public  void caseAMacroifAppApp(AMacroifAppApp node) {
//        PMacroifApp app_ = node.getMacroifApp();
//        if (app_ instanceof AMacroifApp) {
//            AMacroifApp app = (AMacroifApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            MacroIf mapp = (MacroIf) createModelElement_MacroIf();
// 
// 			setParas_Macroif(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AMacroifApp)

//}
	
 protected void setParas_MacroIf (List typedList,IMacroIf anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, MacroIf) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==4){
		anApp.setExpr(typedList.get(0).toString());
		anApp.setMacroname_a(typedList.get(1).toString());
		anApp.setMacroname_b(typedList.get(2).toString());
		anApp.setArg1(typedList.get(3).toString());
	}
 }	

// public  void caseAMacroifApp(AMacroifApp node) {
            //return new MacroifImpl();
//}
// public  void caseTMacroif(TMacroif node) {
            //return new MacroifImpl();
//}
// public  void caseAEnumlookupAppApp(AEnumlookupAppApp node) {
//        PEnumlookupApp app_ = node.getEnumlookupApp();
//        if (app_ instanceof AEnumlookupApp) {
//            AEnumlookupApp app = (AEnumlookupApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            EnumLookup mapp = (EnumLookup) createModelElement_EnumLookup();
// 
// 			setParas_Enumlookup(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AEnumlookupApp)

//}
	
 protected void setParas_EnumLookup (List typedList,IEnumLookup anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, EnumLookup) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setExten(typedList.get(0).toString());
	}
 }	

// public  void caseAEnumlookupApp(AEnumlookupApp node) {
            //return new EnumlookupImpl();
//}
// public  void caseTEnumlookup(TEnumlookup node) {
            //return new EnumlookupImpl();
//}
// public  void caseASipdtmfmodeAppApp(ASipdtmfmodeAppApp node) {
//        PSipdtmfmodeApp app_ = node.getSipdtmfmodeApp();
//        if (app_ instanceof ASipdtmfmodeApp) {
//            ASipdtmfmodeApp app = (ASipdtmfmodeApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            SIPDtmfMode mapp = (SIPDtmfMode) createModelElement_SIPDtmfMode();
// 
// 			setParas_Sipdtmfmode(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ASipdtmfmodeApp)

//}
	
 protected void setParas_SIPDtmfMode (List typedList,ISIPDtmfMode anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, SIPDtmfMode) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==3){
		anApp.setInband(typedList.get(0).toString());
		anApp.setInfo(typedList.get(1).toString());
		anApp.setRfc2833(typedList.get(2).toString());
	}
 }	

// public  void caseASipdtmfmodeApp(ASipdtmfmodeApp node) {
            //return new SipdtmfmodeImpl();
//}
// public  void caseTSipdtmfmode(TSipdtmfmode node) {
            //return new SipdtmfmodeImpl();
//}
// public  void caseASetcidnameAppApp(ASetcidnameAppApp node) {
//        PSetcidnameApp app_ = node.getSetcidnameApp();
//        if (app_ instanceof ASetcidnameApp) {
//            ASetcidnameApp app = (ASetcidnameApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            SetCIDName mapp = (SetCIDName) createModelElement_SetCIDName();
// 
// 			setParas_Setcidname(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ASetcidnameApp)

//}
	
 protected void setParas_SetCIDName (List typedList,ISetCIDName anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, SetCIDName) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setCname(typedList.get(0).toString());
		anApp.setA(typedList.get(1).toString());
	}
 }	

// public  void caseASetcidnameApp(ASetcidnameApp node) {
            //return new SetcidnameImpl();
//}
// public  void caseTSetcidname(TSetcidname node) {
            //return new SetcidnameImpl();
//}
// public  void caseACutAppApp(ACutAppApp node) {
//        PCutApp app_ = node.getCutApp();
//        if (app_ instanceof ACutApp) {
//            ACutApp app = (ACutApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Cut mapp = (Cut) createModelElement_Cut();
// 
// 			setParas_Cut(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ACutApp)

//}
	
 protected void setParas_Cut (List typedList,ICut anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Cut) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==4){
		anApp.setNewvar(typedList.get(0).toString());
		anApp.setVarname(typedList.get(1).toString());
		anApp.setDelimiter(typedList.get(2).toString());
		anApp.setField(typedList.get(3).toString());
	}
 }	

// public  void caseACutApp(ACutApp node) {
            //return new CutImpl();
//}
// public  void caseTCut(TCut node) {
            //return new CutImpl();
//}
// public  void caseAAnswerAppApp(AAnswerAppApp node) {
//        PAnswerApp app_ = node.getAnswerApp();
//        if (app_ instanceof AAnswerApp) {
//            AAnswerApp app = (AAnswerApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Answer mapp = (Answer) createModelElement_Answer();
// 
// 			setParas_Answer(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AAnswerApp)

//}
	
 protected void setParas_Answer (List typedList,IAnswer anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Answer) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setDelay(typedList.get(0).toString());
	}
 }	

// public  void caseAAnswerApp(AAnswerApp node) {
            //return new AnswerImpl();
//}
// public  void caseTAnswer(TAnswer node) {
            //return new AnswerImpl();
//}
// public  void caseASayphoneticAppApp(ASayphoneticAppApp node) {
//        PSayphoneticApp app_ = node.getSayphoneticApp();
//        if (app_ instanceof ASayphoneticApp) {
//            ASayphoneticApp app = (ASayphoneticApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            SayPhonetic mapp = (SayPhonetic) createModelElement_SayPhonetic();
// 
// 			setParas_Sayphonetic(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ASayphoneticApp)

//}
	
 protected void setParas_SayPhonetic (List typedList,ISayPhonetic anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, SayPhonetic) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setString(typedList.get(0).toString());
	}
 }	

// public  void caseASayphoneticApp(ASayphoneticApp node) {
            //return new SayphoneticImpl();
//}
// public  void caseTSayphonetic(TSayphonetic node) {
            //return new SayphoneticImpl();
//}
// public  void caseANocdrAppApp(ANocdrAppApp node) {
//        PNocdrApp app_ = node.getNocdrApp();
//        if (app_ instanceof ANocdrApp) {
//            ANocdrApp app = (ANocdrApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            NoCDR mapp = (NoCDR) createModelElement_NoCDR();
// 
// 			setParas_Nocdr(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ANocdrApp)

//}
	
 protected void setParas_NoCDR (List typedList,INoCDR anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, NoCDR) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==0){
	}
 }	

// public  void caseANocdrApp(ANocdrApp node) {
            //return new NocdrImpl();
//}
// public  void caseTNocdr(TNocdr node) {
            //return new NocdrImpl();
//}
// public  void caseAAgentloginAppApp(AAgentloginAppApp node) {
//        PAgentloginApp app_ = node.getAgentloginApp();
//        if (app_ instanceof AAgentloginApp) {
//            AAgentloginApp app = (AAgentloginApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            AgentLogin mapp = (AgentLogin) createModelElement_AgentLogin();
// 
// 			setParas_Agentlogin(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AAgentloginApp)

//}
	
 protected void setParas_AgentLogin (List typedList,IAgentLogin anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, AgentLogin) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setAgentNo(typedList.get(0).toString());
		anApp.setOptions(typedList.get(1).toString());
	}
 }	

// public  void caseAAgentloginApp(AAgentloginApp node) {
            //return new AgentloginImpl();
//}
// public  void caseTAgentlogin(TAgentlogin node) {
            //return new AgentloginImpl();
//}
// public  void caseAWhileAppApp(AWhileAppApp node) {
//        PWhileApp app_ = node.getWhileApp();
//        if (app_ instanceof AWhileApp) {
//            AWhileApp app = (AWhileApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            While mapp = (While) createModelElement_While();
// 
// 			setParas_While(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AWhileApp)

//}
	
 protected void setParas_While (List typedList,IWhile anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, While) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setExpr(typedList.get(0).toString());
	}
 }	

// public  void caseAWhileApp(AWhileApp node) {
            //return new WhileImpl();
//}
// public  void caseTWhile(TWhile node) {
            //return new WhileImpl();
//}
// public  void caseAMailboxexistsAppApp(AMailboxexistsAppApp node) {
//        PMailboxexistsApp app_ = node.getMailboxexistsApp();
//        if (app_ instanceof AMailboxexistsApp) {
//            AMailboxexistsApp app = (AMailboxexistsApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            MailboxExists mapp = (MailboxExists) createModelElement_MailboxExists();
// 
// 			setParas_Mailboxexists(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AMailboxexistsApp)

//}
	
 protected void setParas_MailboxExists (List typedList,IMailboxExists anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, MailboxExists) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setMailbox(typedList.get(0).toString());
		anApp.setContext(typedList.get(1).toString());
	}
 }	

// public  void caseAMailboxexistsApp(AMailboxexistsApp node) {
            //return new MailboxexistsImpl();
//}
// public  void caseTMailboxexists(TMailboxexists node) {
            //return new MailboxexistsImpl();
//}
// public  void caseAMeetmeAppApp(AMeetmeAppApp node) {
//        PMeetmeApp app_ = node.getMeetmeApp();
//        if (app_ instanceof AMeetmeApp) {
//            AMeetmeApp app = (AMeetmeApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            MeetMe mapp = (MeetMe) createModelElement_MeetMe();
// 
// 			setParas_Meetme(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AMeetmeApp)

//}
	
 protected void setParas_MeetMe (List typedList,IMeetMe anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, MeetMe) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==3){
		anApp.setConfno(typedList.get(0).toString());
		anApp.setOptions(typedList.get(1).toString());
		anApp.setPin(typedList.get(2).toString());
	}
 }	

// public  void caseAMeetmeApp(AMeetmeApp node) {
            //return new MeetmeImpl();
//}
// public  void caseTMeetme(TMeetme node) {
            //return new MeetmeImpl();
//}
// public  void caseADbgetAppApp(ADbgetAppApp node) {
//        PDbgetApp app_ = node.getDbgetApp();
//        if (app_ instanceof ADbgetApp) {
//            ADbgetApp app = (ADbgetApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            DBget mapp = (DBget) createModelElement_DBget();
// 
// 			setParas_Dbget(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ADbgetApp)

//}
	
 protected void setParas_DBget (List typedList,IDBget anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, DBget) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==3){
		anApp.setVarname(typedList.get(0).toString());
		anApp.setFamily(typedList.get(1).toString());
		anApp.setKey(typedList.get(2).toString());
	}
 }	

// public  void caseADbgetApp(ADbgetApp node) {
            //return new DbgetImpl();
//}
// public  void caseTDbget(TDbget node) {
            //return new DbgetImpl();
//}
// public  void caseARingingAppApp(ARingingAppApp node) {
//        PRingingApp app_ = node.getRingingApp();
//        if (app_ instanceof ARingingApp) {
//            ARingingApp app = (ARingingApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Ringing mapp = (Ringing) createModelElement_Ringing();
// 
// 			setParas_Ringing(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ARingingApp)

//}
	
 protected void setParas_Ringing (List typedList,IRinging anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Ringing) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==0){
	}
 }	

// public  void caseARingingApp(ARingingApp node) {
            //return new RingingImpl();
//}
// public  void caseTRinging(TRinging node) {
            //return new RingingImpl();
//}
// public  void caseARetrydialAppApp(ARetrydialAppApp node) {
//        PRetrydialApp app_ = node.getRetrydialApp();
//        if (app_ instanceof ARetrydialApp) {
//            ARetrydialApp app = (ARetrydialApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            RetryDial mapp = (RetryDial) createModelElement_RetryDial();
// 
// 			setParas_Retrydial(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ARetrydialApp)

//}
	
 protected void setParas_RetryDial (List typedList,IRetryDial anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, RetryDial) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==10){
		anApp.setAnnounce(typedList.get(0).toString());
		anApp.setSleep(typedList.get(1).toString());
		anApp.setLoops(typedList.get(2).toString());
		anApp.setTechnology(typedList.get(3).toString());
		anApp.setResource(typedList.get(4).toString());
		anApp.setTechnology2(typedList.get(5).toString());
		anApp.setResource2(typedList.get(6).toString());
		anApp.setTimeout(typedList.get(7).toString());
		anApp.setOptions(typedList.get(8).toString());
		anApp.setURL(typedList.get(9).toString());
	}
 }	

// public  void caseARetrydialApp(ARetrydialApp node) {
            //return new RetrydialImpl();
//}
// public  void caseTRetrydial(TRetrydial node) {
            //return new RetrydialImpl();
//}
// public  void caseAFlashAppApp(AFlashAppApp node) {
//        PFlashApp app_ = node.getFlashApp();
//        if (app_ instanceof AFlashApp) {
//            AFlashApp app = (AFlashApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Flash mapp = (Flash) createModelElement_Flash();
// 
// 			setParas_Flash(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AFlashApp)

//}
	
 protected void setParas_Flash (List typedList,IFlash anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Flash) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==0){
	}
 }	

// public  void caseAFlashApp(AFlashApp node) {
            //return new FlashImpl();
//}
// public  void caseTFlash(TFlash node) {
            //return new FlashImpl();
//}
// public  void caseASayalphaAppApp(ASayalphaAppApp node) {
//        PSayalphaApp app_ = node.getSayalphaApp();
//        if (app_ instanceof ASayalphaApp) {
//            ASayalphaApp app = (ASayalphaApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            SayAlpha mapp = (SayAlpha) createModelElement_SayAlpha();
// 
// 			setParas_Sayalpha(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ASayalphaApp)

//}
	
 protected void setParas_SayAlpha (List typedList,ISayAlpha anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, SayAlpha) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setString(typedList.get(0).toString());
	}
 }	

// public  void caseASayalphaApp(ASayalphaApp node) {
            //return new SayalphaImpl();
//}
// public  void caseTSayalpha(TSayalpha node) {
            //return new SayalphaImpl();
//}
// public  void caseAVoicemailmainAppApp(AVoicemailmainAppApp node) {
//        PVoicemailmainApp app_ = node.getVoicemailmainApp();
//        if (app_ instanceof AVoicemailmainApp) {
//            AVoicemailmainApp app = (AVoicemailmainApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            VoiceMailMain mapp = (VoiceMailMain) createModelElement_VoiceMailMain();
// 
// 			setParas_Voicemailmain(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AVoicemailmainApp)

//}
	
 protected void setParas_VoiceMailMain (List typedList,IVoiceMailMain anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, VoiceMailMain) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==3){
		anApp.setS(typedList.get(0).toString());
		anApp.setMailbox(typedList.get(1).toString());
		anApp.setContext(typedList.get(2).toString());
	}
 }	

// public  void caseAVoicemailmainApp(AVoicemailmainApp node) {
            //return new VoicemailmainImpl();
//}
// public  void caseTVoicemailmain(TVoicemailmain node) {
            //return new VoicemailmainImpl();
//}
// public  void caseAPlaybackAppApp(APlaybackAppApp node) {
//        PPlaybackApp app_ = node.getPlaybackApp();
//        if (app_ instanceof APlaybackApp) {
//            APlaybackApp app = (APlaybackApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Playback mapp = (Playback) createModelElement_Playback();
// 
// 			setParas_Playback(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof APlaybackApp)

//}
	
 protected void setParas_Playback (List typedList,IPlayback anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Playback) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setFilename(typedList.get(0).toString());
		anApp.setOption(typedList.get(1).toString());
	}
 }	

// public  void caseAPlaybackApp(APlaybackApp node) {
            //return new PlaybackImpl();
//}
// public  void caseTPlayback(TPlayback node) {
            //return new PlaybackImpl();
//}
// public  void caseADbdelAppApp(ADbdelAppApp node) {
//        PDbdelApp app_ = node.getDbdelApp();
//        if (app_ instanceof ADbdelApp) {
//            ADbdelApp app = (ADbdelApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            DBdel mapp = (DBdel) createModelElement_DBdel();
// 
// 			setParas_Dbdel(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ADbdelApp)

//}
	
 protected void setParas_DBdel (List typedList,IDBdel anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, DBdel) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setFamily(typedList.get(0).toString());
		anApp.setKey(typedList.get(1).toString());
	}
 }	

// public  void caseADbdelApp(ADbdelApp node) {
            //return new DbdelImpl();
//}
// public  void caseTDbdel(TDbdel node) {
            //return new DbdelImpl();
//}
// public  void caseAResponsetimeoutAppApp(AResponsetimeoutAppApp node) {
//        PResponsetimeoutApp app_ = node.getResponsetimeoutApp();
//        if (app_ instanceof AResponsetimeoutApp) {
//            AResponsetimeoutApp app = (AResponsetimeoutApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            ResponseTimeout mapp = (ResponseTimeout) createModelElement_ResponseTimeout();
// 
// 			setParas_Responsetimeout(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AResponsetimeoutApp)

//}
	
 protected void setParas_ResponseTimeout (List typedList,IResponseTimeout anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, ResponseTimeout) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==1){
		anApp.setSeconds(typedList.get(0).toString());
	}
 }	

// public  void caseAResponsetimeoutApp(AResponsetimeoutApp node) {
            //return new ResponsetimeoutImpl();
//}
// public  void caseTResponsetimeout(TResponsetimeout node) {
            //return new ResponsetimeoutImpl();
//}
// public  void caseASenddtmfAppApp(ASenddtmfAppApp node) {
//        PSenddtmfApp app_ = node.getSenddtmfApp();
//        if (app_ instanceof ASenddtmfApp) {
//            ASenddtmfApp app = (ASenddtmfApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            SendDTMF mapp = (SendDTMF) createModelElement_SendDTMF();
// 
// 			setParas_Senddtmf(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ASenddtmfApp)

//}
	
 protected void setParas_SendDTMF (List typedList,ISendDTMF anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, SendDTMF) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==2){
		anApp.setDigits(typedList.get(0).toString());
		anApp.setTimeout_ms(typedList.get(1).toString());
	}
 }	

// public  void caseASenddtmfApp(ASenddtmfApp node) {
            //return new SenddtmfImpl();
//}
// public  void caseTSenddtmf(TSenddtmf node) {
            //return new SenddtmfImpl();
//}
// public  void caseAAlarmreceiverAppApp(AAlarmreceiverAppApp node) {
//        PAlarmreceiverApp app_ = node.getAlarmreceiverApp();
//        if (app_ instanceof AAlarmreceiverApp) {
//            AAlarmreceiverApp app = (AAlarmreceiverApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            AlarmReceiver mapp = (AlarmReceiver) createModelElement_AlarmReceiver();
// 
// 			setParas_Alarmreceiver(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AAlarmreceiverApp)

//}
	
 protected void setParas_AlarmReceiver (List typedList,IAlarmReceiver anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, AlarmReceiver) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==0){
	}
 }	

// public  void caseAAlarmreceiverApp(AAlarmreceiverApp node) {
            //return new AlarmreceiverImpl();
//}
// public  void caseTAlarmreceiver(TAlarmreceiver node) {
            //return new AlarmreceiverImpl();
//}
// public  void caseAReadAppApp(AReadAppApp node) {
//        PReadApp app_ = node.getReadApp();
//        if (app_ instanceof AReadApp) {
//            AReadApp app = (AReadApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Read mapp = (Read) createModelElement_Read();
// 
// 			setParas_Read(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AReadApp)

//}
	
 protected void setParas_Read (List typedList,IRead anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Read) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==6){
		anApp.setVariable(typedList.get(0).toString());
		anApp.setFilename(typedList.get(1).toString());
		anApp.setMaxdigits(typedList.get(2).toString());
		anApp.setOption(typedList.get(3).toString());
		anApp.setAttempts(typedList.get(4).toString());
		anApp.setTimeout(typedList.get(5).toString());
	}
 }	

// public  void caseAReadApp(AReadApp node) {
            //return new ReadImpl();
//}
// public  void caseTRead(TRead node) {
            //return new ReadImpl();
//}
// public  void caseASetvarAppApp(ASetvarAppApp node) {
//        PSetvarApp app_ = node.getSetvarApp();
//        if (app_ instanceof ASetvarApp) {
//            ASetvarApp app = (ASetvarApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            SetVar mapp = (SetVar) createModelElement_SetVar();
// 
// 			setParas_Setvar(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ASetvarApp)

//}
	
 protected void setParas_SetVar (List typedList,ISetVar anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, SetVar) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==4){
		anApp.setN1(typedList.get(0).toString());
		anApp.setN2(typedList.get(1).toString());
		anApp.setValue(typedList.get(2).toString());
		anApp.setOptions(typedList.get(3).toString());
	}
 }	

// public  void caseASetvarApp(ASetvarApp node) {
            //return new SetvarImpl();
//}
// public  void caseTSetvar(TSetvar node) {
            //return new SetvarImpl();
//}
// public  void caseAMilliwattAppApp(AMilliwattAppApp node) {
//        PMilliwattApp app_ = node.getMilliwattApp();
//        if (app_ instanceof AMilliwattApp) {
//            AMilliwattApp app = (AMilliwattApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Milliwatt mapp = (Milliwatt) createModelElement_Milliwatt();
// 
// 			setParas_Milliwatt(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof AMilliwattApp)

//}
	
 protected void setParas_Milliwatt (List typedList,IMilliwatt anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Milliwatt) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==0){
	}
 }	

// public  void caseAMilliwattApp(AMilliwattApp node) {
            //return new MilliwattImpl();
//}
// public  void caseTMilliwatt(TMilliwatt node) {
            //return new MilliwattImpl();
//}
// public  void caseARandomAppApp(ARandomAppApp node) {
//        PRandomApp app_ = node.getRandomApp();
//        if (app_ instanceof ARandomApp) {
//            ARandomApp app = (ARandomApp) app_;

//            PParalist paralist = app.getParalist();
//            List typedList = getTypedList(paralist);
//            Random mapp = (Random) createModelElement_Random();
// 
// 			setParas_Random(typedList, mapp);
			
//            theApp = mapp;
//        }// end of if (node instanceof ARandomApp)

//}
	
 protected void setParas_Random (List typedList,IRandom anApp ){
         if (LOGGER.isInfoEnabled()) {
            LOGGER.info("setParas(List, Random) -  : typedList="
                    + typedList);
        }
 
	// we don't handle optional parameters here
	if(typedList.size()==4){
		anApp.setProbability(typedList.get(0).toString());
		anApp.setContext(typedList.get(1).toString());
		anApp.setExtension(typedList.get(2).toString());
		anApp.setPriority(typedList.get(3).toString());
	}
 }	

// public  void caseARandomApp(ARandomApp node) {
            //return new RandomImpl();
//}
// public  void caseTRandom(TRandom node) {
            //return new RandomImpl();
//}


 protected  Object createModelElement_ChanIsAvail() {
            return new ChanIsAvailImpl();
}
 protected  Object createModelElement_Macro() {
            return new MacroImpl();
}
 protected  Object createModelElement_SetCIDNum() {
            return new SetCIDNumImpl();
}
 protected  Object createModelElement_AgentCallbackLogin() {
            return new AgentCallbackLoginImpl();
}
 protected  Object createModelElement_ChangeMonitor() {
            return new ChangeMonitorImpl();
}
 protected  Object createModelElement_IAX2Provision() {
            return new IAX2ProvisionImpl();
}
 protected  Object createModelElement_UserEvent() {
            return new UserEventImpl();
}
 protected  Object createModelElement_MP3Player() {
            return new MP3PlayerImpl();
}
 protected  Object createModelElement_Transfer() {
            return new TransferImpl();
}
 protected  Object createModelElement_DigitTimeout() {
            return new DigitTimeoutImpl();
}
 protected  Object createModelElement_Eval() {
            return new EvalImpl();
}
 protected  Object createModelElement_SetGroup() {
            return new SetGroupImpl();
}
 protected  Object createModelElement_GetGroupCount() {
            return new GetGroupCountImpl();
}
 protected  Object createModelElement_StopPlaytones() {
            return new StopPlaytonesImpl();
}
 protected  Object createModelElement_LookupCIDName() {
            return new LookupCIDNameImpl();
}
 protected  Object createModelElement_AppendCDRUserField() {
            return new AppendCDRUserFieldImpl();
}
 protected  Object createModelElement_PauseQueueMember() {
            return new PauseQueueMemberImpl();
}
 protected  Object createModelElement_DeadAGI() {
            return new DeadAGIImpl();
}
 protected  Object createModelElement_ParkedCall() {
            return new ParkedCallImpl();
}
 protected  Object createModelElement_SetCallerPres() {
            return new SetCallerPresImpl();
}
 protected  Object createModelElement_MD5_checksum_application() {
            return new MD5_checksum_applicationImpl();
}
 protected  Object createModelElement_SendImage() {
            return new SendImageImpl();
}
 protected  Object createModelElement_LookupBlacklist() {
            return new LookupBlacklistImpl();
}
 protected  Object createModelElement_Dial() {
            return new DialImpl();
}
 protected  Object createModelElement_DBput() {
            return new DBputImpl();
}
 protected  Object createModelElement_ExecIfTime() {
            return new ExecIfTimeImpl();
}
 protected  Object createModelElement_SetAccount() {
            return new SetAccountImpl();
}
 protected  Object createModelElement_SIPGetHeader() {
            return new SIPGetHeaderImpl();
}
 protected  Object createModelElement_Verbose() {
            return new VerboseImpl();
}
 protected  Object createModelElement_StopMusicOnHold() {
            return new StopMusicOnHoldImpl();
}
 protected  Object createModelElement_WaitForSilence() {
            return new WaitForSilenceImpl();
}
 protected  Object createModelElement_SMS() {
            return new SMSImpl();
}
 protected  Object createModelElement_MusicOnHold() {
            return new MusicOnHoldImpl();
}
 protected  Object createModelElement_Busy() {
            return new BusyImpl();
}
 protected  Object createModelElement_GotoIfTime() {
            return new GotoIfTimeImpl();
}
 protected  Object createModelElement_Congestion() {
            return new CongestionImpl();
}
 protected  Object createModelElement_Directory() {
            return new DirectoryImpl();
}
 protected  Object createModelElement_AgentMonitorOutgoing() {
            return new AgentMonitorOutgoingImpl();
}
 protected  Object createModelElement_Math() {
            return new MathImpl();
}
 protected  Object createModelElement_SayUnixTime() {
            return new SayUnixTimeImpl();
}
 protected  Object createModelElement_SetGlobalVar() {
            return new SetGlobalVarImpl();
}
 protected  Object createModelElement_WaitExten() {
            return new WaitExtenImpl();
}
 protected  Object createModelElement_Prefix() {
            return new PrefixImpl();
}
 protected  Object createModelElement_TrySystem() {
            return new TrySystemImpl();
}
 protected  Object createModelElement_RemoveQueueMember() {
            return new RemoveQueueMemberImpl();
}
 protected  Object createModelElement_RealTime() {
            return new RealTimeImpl();
}
 protected  Object createModelElement_ICES() {
            return new ICESImpl();
}
 protected  Object createModelElement_AGI() {
            return new AGIImpl();
}
 protected  Object createModelElement_EndWhile() {
            return new EndWhileImpl();
}
 protected  Object createModelElement_GetCPEID() {
            return new GetCPEIDImpl();
}
 protected  Object createModelElement_VMAuthenticate() {
            return new VMAuthenticateImpl();
}
 protected  Object createModelElement_SetCDRUserField() {
            return new SetCDRUserFieldImpl();
}
 protected  Object createModelElement_DISA() {
            return new DISAImpl();
}
 protected  Object createModelElement_SendURL() {
            return new SendURLImpl();
}
 protected  Object createModelElement_TestClient() {
            return new TestClientImpl();
}
 protected  Object createModelElement_DUNDiLookup() {
            return new DUNDiLookupImpl();
}
 protected  Object createModelElement_Park() {
            return new ParkImpl();
}
 protected  Object createModelElement_StartMusicOnHold() {
            return new StartMusicOnHoldImpl();
}
 protected  Object createModelElement_AddQueueMember() {
            return new AddQueueMemberImpl();
}
 protected  Object createModelElement_ParkAndAnnounce() {
            return new ParkAndAnnounceImpl();
}
 protected  Object createModelElement_MacroExit() {
            return new MacroExitImpl();
}
 protected  Object createModelElement_SubString() {
            return new SubStringImpl();
}
 protected  Object createModelElement_SayNumber() {
            return new SayNumberImpl();
}
 protected  Object createModelElement_Background() {
            return new BackgroundImpl();
}
 protected  Object createModelElement_NBScat() {
            return new NBScatImpl();
}
 protected  Object createModelElement_HasNewVoicemail() {
            return new HasNewVoicemailImpl();
}
 protected  Object createModelElement_System() {
            return new SystemImpl();
}
 protected  Object createModelElement_GotoIf() {
            return new GotoIfImpl();
}
 protected  Object createModelElement_SetRDNIS() {
            return new SetRDNISImpl();
}
 protected  Object createModelElement_ExecIF() {
            return new ExecIFImpl();
}
 protected  Object createModelElement_MeetMeAdmin() {
            return new MeetMeAdminImpl();
}
 protected  Object createModelElement_SetMusicOnHold() {
            return new SetMusicOnHoldImpl();
}
 protected  Object createModelElement_VoiceMail() {
            return new VoiceMailImpl();
}
 protected  Object createModelElement_WaitForRing() {
            return new WaitForRingImpl();
}
 protected  Object createModelElement_Playtones() {
            return new PlaytonesImpl();
}
 protected  Object createModelElement_SayCountPL() {
            return new SayCountPLImpl();
}
 protected  Object createModelElement_StopMonitor() {
            return new StopMonitorImpl();
}
 protected  Object createModelElement_GetGroupMatchCount() {
            return new GetGroupMatchCountImpl();
}
 protected  Object createModelElement_Wait() {
            return new WaitImpl();
}
 protected  Object createModelElement_Zapateller() {
            return new ZapatellerImpl();
}
 protected  Object createModelElement_Exec() {
            return new ExecImpl();
}
 protected  Object createModelElement_SendText() {
            return new SendTextImpl();
}
 protected  Object createModelElement_ZapBarge() {
            return new ZapBargeImpl();
}
 protected  Object createModelElement_Suffix() {
            return new SuffixImpl();
}
 protected  Object createModelElement_DateTime() {
            return new DateTimeImpl();
}
 protected  Object createModelElement_MD5Check() {
            return new MD5CheckImpl();
}
 protected  Object createModelElement_Goto() {
            return new GotoImpl();
}
 protected  Object createModelElement_DumpChan() {
            return new DumpChanImpl();
}
 protected  Object createModelElement_Monitor() {
            return new MonitorImpl();
}
 protected  Object createModelElement_DBdeltree() {
            return new DBdeltreeImpl();
}
 protected  Object createModelElement_CheckGroup() {
            return new CheckGroupImpl();
}
 protected  Object createModelElement_NoOp() {
            return new NoOpImpl();
}
 protected  Object createModelElement_ResetCDR() {
            return new ResetCDRImpl();
}
 protected  Object createModelElement_RealTimeUpdate() {
            return new RealTimeUpdateImpl();
}
 protected  Object createModelElement_ControlPlayback() {
            return new ControlPlaybackImpl();
}
 protected  Object createModelElement_Festival() {
            return new FestivalImpl();
}
 protected  Object createModelElement_ForkCDR() {
            return new ForkCDRImpl();
}
 protected  Object createModelElement_Progress() {
            return new ProgressImpl();
}
 protected  Object createModelElement_BackgroundDetect() {
            return new BackgroundDetectImpl();
}
 protected  Object createModelElement_Hangup() {
            return new HangupImpl();
}
 protected  Object createModelElement_MeetMeCount() {
            return new MeetMeCountImpl();
}
 protected  Object createModelElement_ReadFile() {
            return new ReadFileImpl();
}
 protected  Object createModelElement_ADSIProg() {
            return new ADSIProgImpl();
}
 protected  Object createModelElement_ZapScan() {
            return new ZapScanImpl();
}
 protected  Object createModelElement_ZapRAS() {
            return new ZapRASImpl();
}
 protected  Object createModelElement_TestServer() {
            return new TestServerImpl();
}
 protected  Object createModelElement_SayDigits() {
            return new SayDigitsImpl();
}
 protected  Object createModelElement_TXTCIDName() {
            return new TXTCIDNameImpl();
}
 protected  Object createModelElement_SoftHangup() {
            return new SoftHangupImpl();
}
 protected  Object createModelElement_SetLanguage() {
            return new SetLanguageImpl();
}
 protected  Object createModelElement_PrivacyManager() {
            return new PrivacyManagerImpl();
}
 protected  Object createModelElement_Echo() {
            return new EchoImpl();
}
 protected  Object createModelElement_SetCallerID() {
            return new SetCallerIDImpl();
}
 protected  Object createModelElement_StripMSD() {
            return new StripMSDImpl();
}
 protected  Object createModelElement_SetAMAFlags() {
            return new SetAMAFlagsImpl();
}
 protected  Object createModelElement_ImportVar() {
            return new ImportVarImpl();
}
 protected  Object createModelElement_WaitMusicOnHold() {
            return new WaitMusicOnHoldImpl();
}
 protected  Object createModelElement_Queue() {
            return new QueueImpl();
}
 protected  Object createModelElement_Record() {
            return new RecordImpl();
}
 protected  Object createModelElement_StripLSD() {
            return new StripLSDImpl();
}
 protected  Object createModelElement_HasVoicemail() {
            return new HasVoicemailImpl();
}
 protected  Object createModelElement_AbsoluteTimeout() {
            return new AbsoluteTimeoutImpl();
}
 protected  Object createModelElement_SIPAddHeader() {
            return new SIPAddHeaderImpl();
}
 protected  Object createModelElement_EAGI() {
            return new EAGIImpl();
}
 protected  Object createModelElement_Authenticate() {
            return new AuthenticateImpl();
}
 protected  Object createModelElement_UnpauseQueueMember() {
            return new UnpauseQueueMemberImpl();
}
 protected  Object createModelElement_MacroIf() {
            return new MacroIfImpl();
}
 protected  Object createModelElement_EnumLookup() {
            return new EnumLookupImpl();
}
 protected  Object createModelElement_SIPDtmfMode() {
            return new SIPDtmfModeImpl();
}
 protected  Object createModelElement_SetCIDName() {
            return new SetCIDNameImpl();
}
 protected  Object createModelElement_Cut() {
            return new CutImpl();
}
 protected  Object createModelElement_Answer() {
            return new AnswerImpl();
}
 protected  Object createModelElement_SayPhonetic() {
            return new SayPhoneticImpl();
}
 protected  Object createModelElement_NoCDR() {
            return new NoCDRImpl();
}
 protected  Object createModelElement_AgentLogin() {
            return new AgentLoginImpl();
}
 protected  Object createModelElement_While() {
            return new WhileImpl();
}
 protected  Object createModelElement_MailboxExists() {
            return new MailboxExistsImpl();
}
 protected  Object createModelElement_MeetMe() {
            return new MeetMeImpl();
}
 protected  Object createModelElement_DBget() {
            return new DBgetImpl();
}
 protected  Object createModelElement_Ringing() {
            return new RingingImpl();
}
 protected  Object createModelElement_RetryDial() {
            return new RetryDialImpl();
}
 protected  Object createModelElement_Flash() {
            return new FlashImpl();
}
 protected  Object createModelElement_SayAlpha() {
            return new SayAlphaImpl();
}
 protected  Object createModelElement_VoiceMailMain() {
            return new VoiceMailMainImpl();
}
 protected  Object createModelElement_Playback() {
            return new PlaybackImpl();
}
 protected  Object createModelElement_DBdel() {
            return new DBdelImpl();
}
 protected  Object createModelElement_ResponseTimeout() {
            return new ResponseTimeoutImpl();
}
 protected  Object createModelElement_SendDTMF() {
            return new SendDTMFImpl();
}
 protected  Object createModelElement_AlarmReceiver() {
            return new AlarmReceiverImpl();
}
 protected  Object createModelElement_Read() {
            return new ReadImpl();
}
 protected  Object createModelElement_SetVar() {
            return new SetVarImpl();
}
 protected  Object createModelElement_Milliwatt() {
            return new MilliwattImpl();
}
 protected  Object createModelElement_Random() {
            return new RandomImpl();
}

   protected List getTypedList(PParalist paralist) {
        if (paralist instanceof ACommaparalistParalist) {
            ACommaparalistParalist cop = (ACommaparalistParalist) paralist;
            ACommaparalist commaparalist = (ACommaparalist) cop.getCommaparalist();
            return commaparalist.getSpara();
            //commaparalist.toString();

        }// end of if (paralist instanceof ACommaparalistParalist)
        
        
        if (paralist instanceof ACurrparalistParalist) {
            ACurrparalistParalist cup = (ACurrparalistParalist) paralist;
            ACurrparalist currparalist = (ACurrparalist) cup.getCurrparalist();
            return currparalist.getSpara();
            
        }//end of if (paralist instanceof ACurrparalistParalist)
        
        return Collections.EMPTY_LIST;
    }



    public boolean isAdapterFor(Class adapter,Object obj) {
        // TODO Automatisch erstellter Methoden-Stub
        return false;
    }

    public Object adapt(Class adapter,Object obj) {
           if (adapter==IModelFactory.class)
            return this;

        return null;
    }

    public Object getAdapter(Class adapter) {
        // TODO Automatisch erstellter Methoden-Stub
        return null;
    }


    public void caseACommaparalistParalist(ACommaparalistParalist node) {
        java.lang.System.out.println(node);
        
    }

    public void caseACurrparalistParalist(ACurrparalistParalist node) {
        java.lang.System.out.println(node);
        
    }

    public void caseAEmptyParalist(AEmptyParalist node) {
        java.lang.System.out.println(node);
        
    }

    public void caseACommaparalist(ACommaparalist node) {
        java.lang.System.out.println(node);
        
    }

    public void caseACurrparalist(ACurrparalist node) {
        java.lang.System.out.println(node);
        
    }

    public void caseASpara(ASpara node) {
        java.lang.System.out.println(node);
        
    }

    public void caseACparaSpara(ACparaSpara node) {
        java.lang.System.out.println(node);
        
    }

    public void caseAParaSpara(AParaSpara node) {
        java.lang.System.out.println(node);
        
    }

    public void caseACpara(ACpara node) {
        java.lang.System.out.println(node);
        
    }

    public void caseAPara(APara node) {
        java.lang.System.out.println(node);
        
    }

    public void caseANumberPara(ANumberPara node) {
        java.lang.System.out.println(node);
        
    }


    public void caseTRPar(TRPar node) {
        java.lang.System.out.println(node);
        
    }

    public void caseTBlank(TBlank node) {
        java.lang.System.out.println(node);
        
    }

    public void caseTIdentifier(TIdentifier node) {
        java.lang.System.out.println(node);
        
    }

    public void caseTNumber(TNumber node) {
        java.lang.System.out.println(node);
        
    }

    public void caseTLPar(TLPar node) {
        java.lang.System.out.println(node);
        
    }

    public void caseTROp(TROp node) {
        java.lang.System.out.println(node);
        
    }

    public void caseTLOp(TLOp node) {
        java.lang.System.out.println(node);
        
    }

    public void caseTComma(TComma node) {
        java.lang.System.out.println(node);
        
    }

    public void caseTSep(TSep node) {
        java.lang.System.out.println(node);
        
    }
    
        public void caseTStsep(TStsep node) {
        // TODO Automatisch erstellter Methoden-Stub
        
    }
        public void caseAStringLitPara(AStringLitPara node) {
        // TODO Automatisch erstellter Methoden-Stub
        
    }

    public void caseTStringLit(TStringLit node) {
        // TODO Automatisch erstellter Methoden-Stub
        
    }
    
    public void caseAUrlPara(AUrlPara node) {
        // TODO Automatisch erstellter Methoden-Stub
        
    }

    public void caseTUrl(TUrl node) {
        // TODO Automatisch erstellter Methoden-Stub
        
    }

    public void caseEOF(EOF node) {
        java.lang.System.out.println(node);
        
    }


}

