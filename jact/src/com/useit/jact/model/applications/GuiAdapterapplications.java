/*
 * (c) urs zeidler
 */
package com.useit.jact.model.applications;

import com.useit.app.framework.model.dataModel.IGuiAdapter;
import com.useit.jact.gui.applications.*;

/**
 * <p>
 * </p>
 * Created : 25.02.2004
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: GuiAdapterapplications.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
public class GuiAdapterapplications implements IGuiAdapter {

	protected static GuiAdapterapplications defaultInstance;
    /**
     * 
     */
    protected GuiAdapterapplications() {
        super();
     }

   public static GuiAdapterapplications getInstance(){
    if (defaultInstance == null) {
        
            defaultInstance = new GuiAdapterapplications();
        }
        return defaultInstance;
    }

	public Object getSimplePanelFor(Object aObject){
	if(aObject instanceof  IChanIsAvail)
		return createSimplePanelFor_ChanIsAvail();		
	if(aObject instanceof  IMacro)
		return createSimplePanelFor_Macro();		
	if(aObject instanceof  ISetCIDNum)
		return createSimplePanelFor_SetCIDNum();		
	if(aObject instanceof  IAgentCallbackLogin)
		return createSimplePanelFor_AgentCallbackLogin();		
	if(aObject instanceof  IChangeMonitor)
		return createSimplePanelFor_ChangeMonitor();		
	if(aObject instanceof  IIAX2Provision)
		return createSimplePanelFor_IAX2Provision();		
	if(aObject instanceof  IUserEvent)
		return createSimplePanelFor_UserEvent();		
	if(aObject instanceof  IMP3Player)
		return createSimplePanelFor_MP3Player();		
	if(aObject instanceof  ITransfer)
		return createSimplePanelFor_Transfer();		
	if(aObject instanceof  IDigitTimeout)
		return createSimplePanelFor_DigitTimeout();		
	if(aObject instanceof  IEval)
		return createSimplePanelFor_Eval();		
	if(aObject instanceof  ISetGroup)
		return createSimplePanelFor_SetGroup();		
	if(aObject instanceof  IGetGroupCount)
		return createSimplePanelFor_GetGroupCount();		
	if(aObject instanceof  IStopPlaytones)
		return createSimplePanelFor_StopPlaytones();		
	if(aObject instanceof  ILookupCIDName)
		return createSimplePanelFor_LookupCIDName();		
	if(aObject instanceof  IAppendCDRUserField)
		return createSimplePanelFor_AppendCDRUserField();		
	if(aObject instanceof  IPauseQueueMember)
		return createSimplePanelFor_PauseQueueMember();		
	if(aObject instanceof  IDeadAGI)
		return createSimplePanelFor_DeadAGI();		
	if(aObject instanceof  IParkedCall)
		return createSimplePanelFor_ParkedCall();		
	if(aObject instanceof  ISetCallerPres)
		return createSimplePanelFor_SetCallerPres();		
	if(aObject instanceof  IMD5_checksum_application)
		return createSimplePanelFor_MD5_checksum_application();		
	if(aObject instanceof  ISendImage)
		return createSimplePanelFor_SendImage();		
	if(aObject instanceof  ILookupBlacklist)
		return createSimplePanelFor_LookupBlacklist();		
	if(aObject instanceof  IDial)
		return createSimplePanelFor_Dial();		
	if(aObject instanceof  IDBput)
		return createSimplePanelFor_DBput();		
	if(aObject instanceof  IExecIfTime)
		return createSimplePanelFor_ExecIfTime();		
	if(aObject instanceof  ISetAccount)
		return createSimplePanelFor_SetAccount();		
	if(aObject instanceof  ISIPGetHeader)
		return createSimplePanelFor_SIPGetHeader();		
	if(aObject instanceof  IVerbose)
		return createSimplePanelFor_Verbose();		
	if(aObject instanceof  IStopMusicOnHold)
		return createSimplePanelFor_StopMusicOnHold();		
	if(aObject instanceof  IWaitForSilence)
		return createSimplePanelFor_WaitForSilence();		
	if(aObject instanceof  ISMS)
		return createSimplePanelFor_SMS();		
	if(aObject instanceof  IMusicOnHold)
		return createSimplePanelFor_MusicOnHold();		
	if(aObject instanceof  IBusy)
		return createSimplePanelFor_Busy();		
	if(aObject instanceof  IGotoIfTime)
		return createSimplePanelFor_GotoIfTime();		
	if(aObject instanceof  ICongestion)
		return createSimplePanelFor_Congestion();		
	if(aObject instanceof  IDirectory)
		return createSimplePanelFor_Directory();		
	if(aObject instanceof  IAgentMonitorOutgoing)
		return createSimplePanelFor_AgentMonitorOutgoing();		
	if(aObject instanceof  IMath)
		return createSimplePanelFor_Math();		
	if(aObject instanceof  ISayUnixTime)
		return createSimplePanelFor_SayUnixTime();		
	if(aObject instanceof  ISetGlobalVar)
		return createSimplePanelFor_SetGlobalVar();		
	if(aObject instanceof  IWaitExten)
		return createSimplePanelFor_WaitExten();		
	if(aObject instanceof  IPrefix)
		return createSimplePanelFor_Prefix();		
	if(aObject instanceof  ITrySystem)
		return createSimplePanelFor_TrySystem();		
	if(aObject instanceof  IRemoveQueueMember)
		return createSimplePanelFor_RemoveQueueMember();		
	if(aObject instanceof  IRealTime)
		return createSimplePanelFor_RealTime();		
	if(aObject instanceof  IICES)
		return createSimplePanelFor_ICES();		
	if(aObject instanceof  IAGI)
		return createSimplePanelFor_AGI();		
	if(aObject instanceof  IEndWhile)
		return createSimplePanelFor_EndWhile();		
	if(aObject instanceof  IGetCPEID)
		return createSimplePanelFor_GetCPEID();		
	if(aObject instanceof  IVMAuthenticate)
		return createSimplePanelFor_VMAuthenticate();		
	if(aObject instanceof  ISetCDRUserField)
		return createSimplePanelFor_SetCDRUserField();		
	if(aObject instanceof  IDISA)
		return createSimplePanelFor_DISA();		
	if(aObject instanceof  ISendURL)
		return createSimplePanelFor_SendURL();		
	if(aObject instanceof  ITestClient)
		return createSimplePanelFor_TestClient();		
	if(aObject instanceof  IDUNDiLookup)
		return createSimplePanelFor_DUNDiLookup();		
	if(aObject instanceof  IPark)
		return createSimplePanelFor_Park();		
	if(aObject instanceof  IStartMusicOnHold)
		return createSimplePanelFor_StartMusicOnHold();		
	if(aObject instanceof  IAddQueueMember)
		return createSimplePanelFor_AddQueueMember();		
	if(aObject instanceof  IParkAndAnnounce)
		return createSimplePanelFor_ParkAndAnnounce();		
	if(aObject instanceof  IMacroExit)
		return createSimplePanelFor_MacroExit();		
	if(aObject instanceof  ISubString)
		return createSimplePanelFor_SubString();		
	if(aObject instanceof  ISayNumber)
		return createSimplePanelFor_SayNumber();		
	if(aObject instanceof  IBackground)
		return createSimplePanelFor_Background();		
	if(aObject instanceof  INBScat)
		return createSimplePanelFor_NBScat();		
	if(aObject instanceof  IHasNewVoicemail)
		return createSimplePanelFor_HasNewVoicemail();		
	if(aObject instanceof  ISystem)
		return createSimplePanelFor_System();		
	if(aObject instanceof  IGotoIf)
		return createSimplePanelFor_GotoIf();		
	if(aObject instanceof  ISetRDNIS)
		return createSimplePanelFor_SetRDNIS();		
	if(aObject instanceof  IExecIF)
		return createSimplePanelFor_ExecIF();		
	if(aObject instanceof  IMeetMeAdmin)
		return createSimplePanelFor_MeetMeAdmin();		
	if(aObject instanceof  ISetMusicOnHold)
		return createSimplePanelFor_SetMusicOnHold();		
	if(aObject instanceof  IVoiceMail)
		return createSimplePanelFor_VoiceMail();		
	if(aObject instanceof  IWaitForRing)
		return createSimplePanelFor_WaitForRing();		
	if(aObject instanceof  IPlaytones)
		return createSimplePanelFor_Playtones();		
	if(aObject instanceof  ISayCountPL)
		return createSimplePanelFor_SayCountPL();		
	if(aObject instanceof  IStopMonitor)
		return createSimplePanelFor_StopMonitor();		
	if(aObject instanceof  IGetGroupMatchCount)
		return createSimplePanelFor_GetGroupMatchCount();		
	if(aObject instanceof  IWait)
		return createSimplePanelFor_Wait();		
	if(aObject instanceof  IZapateller)
		return createSimplePanelFor_Zapateller();		
	if(aObject instanceof  IExec)
		return createSimplePanelFor_Exec();		
	if(aObject instanceof  ISendText)
		return createSimplePanelFor_SendText();		
	if(aObject instanceof  IZapBarge)
		return createSimplePanelFor_ZapBarge();		
	if(aObject instanceof  ISuffix)
		return createSimplePanelFor_Suffix();		
	if(aObject instanceof  IDateTime)
		return createSimplePanelFor_DateTime();		
	if(aObject instanceof  IMD5Check)
		return createSimplePanelFor_MD5Check();		
	if(aObject instanceof  IGoto)
		return createSimplePanelFor_Goto();		
	if(aObject instanceof  IDumpChan)
		return createSimplePanelFor_DumpChan();		
	if(aObject instanceof  IMonitor)
		return createSimplePanelFor_Monitor();		
	if(aObject instanceof  IDBdeltree)
		return createSimplePanelFor_DBdeltree();		
	if(aObject instanceof  ICheckGroup)
		return createSimplePanelFor_CheckGroup();		
	if(aObject instanceof  INoOp)
		return createSimplePanelFor_NoOp();		
	if(aObject instanceof  IResetCDR)
		return createSimplePanelFor_ResetCDR();		
	if(aObject instanceof  IRealTimeUpdate)
		return createSimplePanelFor_RealTimeUpdate();		
	if(aObject instanceof  IControlPlayback)
		return createSimplePanelFor_ControlPlayback();		
	if(aObject instanceof  IFestival)
		return createSimplePanelFor_Festival();		
	if(aObject instanceof  IForkCDR)
		return createSimplePanelFor_ForkCDR();		
	if(aObject instanceof  IProgress)
		return createSimplePanelFor_Progress();		
	if(aObject instanceof  IBackgroundDetect)
		return createSimplePanelFor_BackgroundDetect();		
	if(aObject instanceof  IHangup)
		return createSimplePanelFor_Hangup();		
	if(aObject instanceof  IMeetMeCount)
		return createSimplePanelFor_MeetMeCount();		
	if(aObject instanceof  IReadFile)
		return createSimplePanelFor_ReadFile();		
	if(aObject instanceof  IADSIProg)
		return createSimplePanelFor_ADSIProg();		
	if(aObject instanceof  IZapScan)
		return createSimplePanelFor_ZapScan();		
	if(aObject instanceof  IZapRAS)
		return createSimplePanelFor_ZapRAS();		
	if(aObject instanceof  ITestServer)
		return createSimplePanelFor_TestServer();		
	if(aObject instanceof  ISayDigits)
		return createSimplePanelFor_SayDigits();		
	if(aObject instanceof  ITXTCIDName)
		return createSimplePanelFor_TXTCIDName();		
	if(aObject instanceof  ISoftHangup)
		return createSimplePanelFor_SoftHangup();		
	if(aObject instanceof  ISetLanguage)
		return createSimplePanelFor_SetLanguage();		
	if(aObject instanceof  IPrivacyManager)
		return createSimplePanelFor_PrivacyManager();		
	if(aObject instanceof  IEcho)
		return createSimplePanelFor_Echo();		
	if(aObject instanceof  ISetCallerID)
		return createSimplePanelFor_SetCallerID();		
	if(aObject instanceof  IStripMSD)
		return createSimplePanelFor_StripMSD();		
	if(aObject instanceof  ISetAMAFlags)
		return createSimplePanelFor_SetAMAFlags();		
	if(aObject instanceof  IImportVar)
		return createSimplePanelFor_ImportVar();		
	if(aObject instanceof  IWaitMusicOnHold)
		return createSimplePanelFor_WaitMusicOnHold();		
	if(aObject instanceof  IQueue)
		return createSimplePanelFor_Queue();		
	if(aObject instanceof  IRecord)
		return createSimplePanelFor_Record();		
	if(aObject instanceof  IStripLSD)
		return createSimplePanelFor_StripLSD();		
	if(aObject instanceof  IHasVoicemail)
		return createSimplePanelFor_HasVoicemail();		
	if(aObject instanceof  IAbsoluteTimeout)
		return createSimplePanelFor_AbsoluteTimeout();		
	if(aObject instanceof  ISIPAddHeader)
		return createSimplePanelFor_SIPAddHeader();		
	if(aObject instanceof  IEAGI)
		return createSimplePanelFor_EAGI();		
	if(aObject instanceof  IAuthenticate)
		return createSimplePanelFor_Authenticate();		
	if(aObject instanceof  IUnpauseQueueMember)
		return createSimplePanelFor_UnpauseQueueMember();		
	if(aObject instanceof  IMacroIf)
		return createSimplePanelFor_MacroIf();		
	if(aObject instanceof  IEnumLookup)
		return createSimplePanelFor_EnumLookup();		
	if(aObject instanceof  ISIPDtmfMode)
		return createSimplePanelFor_SIPDtmfMode();		
	if(aObject instanceof  ISetCIDName)
		return createSimplePanelFor_SetCIDName();		
	if(aObject instanceof  ICut)
		return createSimplePanelFor_Cut();		
	if(aObject instanceof  IAnswer)
		return createSimplePanelFor_Answer();		
	if(aObject instanceof  ISayPhonetic)
		return createSimplePanelFor_SayPhonetic();		
	if(aObject instanceof  INoCDR)
		return createSimplePanelFor_NoCDR();		
	if(aObject instanceof  IAgentLogin)
		return createSimplePanelFor_AgentLogin();		
	if(aObject instanceof  IWhile)
		return createSimplePanelFor_While();		
	if(aObject instanceof  IMailboxExists)
		return createSimplePanelFor_MailboxExists();		
	if(aObject instanceof  IMeetMe)
		return createSimplePanelFor_MeetMe();		
	if(aObject instanceof  IDBget)
		return createSimplePanelFor_DBget();		
	if(aObject instanceof  IRinging)
		return createSimplePanelFor_Ringing();		
	if(aObject instanceof  IRetryDial)
		return createSimplePanelFor_RetryDial();		
	if(aObject instanceof  IFlash)
		return createSimplePanelFor_Flash();		
	if(aObject instanceof  ISayAlpha)
		return createSimplePanelFor_SayAlpha();		
	if(aObject instanceof  IVoiceMailMain)
		return createSimplePanelFor_VoiceMailMain();		
	if(aObject instanceof  IPlayback)
		return createSimplePanelFor_Playback();		
	if(aObject instanceof  IDBdel)
		return createSimplePanelFor_DBdel();		
	if(aObject instanceof  IResponseTimeout)
		return createSimplePanelFor_ResponseTimeout();		
	if(aObject instanceof  ISendDTMF)
		return createSimplePanelFor_SendDTMF();		
	if(aObject instanceof  IAlarmReceiver)
		return createSimplePanelFor_AlarmReceiver();		
	if(aObject instanceof  IRead)
		return createSimplePanelFor_Read();		
	if(aObject instanceof  ISetVar)
		return createSimplePanelFor_SetVar();		
	if(aObject instanceof  IMilliwatt)
		return createSimplePanelFor_Milliwatt();		
	if(aObject instanceof  IRandom)
		return createSimplePanelFor_Random();		
		return null;
	}
	
	
public Object getPanelFor(Object aObject){
	if(aObject instanceof  IChanIsAvail)
		return createPanelFor_ChanIsAvail();		
	if(aObject instanceof  IMacro)
		return createPanelFor_Macro();		
	if(aObject instanceof  ISetCIDNum)
		return createPanelFor_SetCIDNum();		
	if(aObject instanceof  IAgentCallbackLogin)
		return createPanelFor_AgentCallbackLogin();		
	if(aObject instanceof  IChangeMonitor)
		return createPanelFor_ChangeMonitor();		
	if(aObject instanceof  IIAX2Provision)
		return createPanelFor_IAX2Provision();		
	if(aObject instanceof  IUserEvent)
		return createPanelFor_UserEvent();		
	if(aObject instanceof  IMP3Player)
		return createPanelFor_MP3Player();		
	if(aObject instanceof  ITransfer)
		return createPanelFor_Transfer();		
	if(aObject instanceof  IDigitTimeout)
		return createPanelFor_DigitTimeout();		
	if(aObject instanceof  IEval)
		return createPanelFor_Eval();		
	if(aObject instanceof  ISetGroup)
		return createPanelFor_SetGroup();		
	if(aObject instanceof  IGetGroupCount)
		return createPanelFor_GetGroupCount();		
	if(aObject instanceof  IStopPlaytones)
		return createPanelFor_StopPlaytones();		
	if(aObject instanceof  ILookupCIDName)
		return createPanelFor_LookupCIDName();		
	if(aObject instanceof  IAppendCDRUserField)
		return createPanelFor_AppendCDRUserField();		
	if(aObject instanceof  IPauseQueueMember)
		return createPanelFor_PauseQueueMember();		
	if(aObject instanceof  IDeadAGI)
		return createPanelFor_DeadAGI();		
	if(aObject instanceof  IParkedCall)
		return createPanelFor_ParkedCall();		
	if(aObject instanceof  ISetCallerPres)
		return createPanelFor_SetCallerPres();		
	if(aObject instanceof  IMD5_checksum_application)
		return createPanelFor_MD5_checksum_application();		
	if(aObject instanceof  ISendImage)
		return createPanelFor_SendImage();		
	if(aObject instanceof  ILookupBlacklist)
		return createPanelFor_LookupBlacklist();		
	if(aObject instanceof  IDial)
		return createPanelFor_Dial();		
	if(aObject instanceof  IDBput)
		return createPanelFor_DBput();		
	if(aObject instanceof  IExecIfTime)
		return createPanelFor_ExecIfTime();		
	if(aObject instanceof  ISetAccount)
		return createPanelFor_SetAccount();		
	if(aObject instanceof  ISIPGetHeader)
		return createPanelFor_SIPGetHeader();		
	if(aObject instanceof  IVerbose)
		return createPanelFor_Verbose();		
	if(aObject instanceof  IStopMusicOnHold)
		return createPanelFor_StopMusicOnHold();		
	if(aObject instanceof  IWaitForSilence)
		return createPanelFor_WaitForSilence();		
	if(aObject instanceof  ISMS)
		return createPanelFor_SMS();		
	if(aObject instanceof  IMusicOnHold)
		return createPanelFor_MusicOnHold();		
	if(aObject instanceof  IBusy)
		return createPanelFor_Busy();		
	if(aObject instanceof  IGotoIfTime)
		return createPanelFor_GotoIfTime();		
	if(aObject instanceof  ICongestion)
		return createPanelFor_Congestion();		
	if(aObject instanceof  IDirectory)
		return createPanelFor_Directory();		
	if(aObject instanceof  IAgentMonitorOutgoing)
		return createPanelFor_AgentMonitorOutgoing();		
	if(aObject instanceof  IMath)
		return createPanelFor_Math();		
	if(aObject instanceof  ISayUnixTime)
		return createPanelFor_SayUnixTime();		
	if(aObject instanceof  ISetGlobalVar)
		return createPanelFor_SetGlobalVar();		
	if(aObject instanceof  IWaitExten)
		return createPanelFor_WaitExten();		
	if(aObject instanceof  IPrefix)
		return createPanelFor_Prefix();		
	if(aObject instanceof  ITrySystem)
		return createPanelFor_TrySystem();		
	if(aObject instanceof  IRemoveQueueMember)
		return createPanelFor_RemoveQueueMember();		
	if(aObject instanceof  IRealTime)
		return createPanelFor_RealTime();		
	if(aObject instanceof  IICES)
		return createPanelFor_ICES();		
	if(aObject instanceof  IAGI)
		return createPanelFor_AGI();		
	if(aObject instanceof  IEndWhile)
		return createPanelFor_EndWhile();		
	if(aObject instanceof  IGetCPEID)
		return createPanelFor_GetCPEID();		
	if(aObject instanceof  IVMAuthenticate)
		return createPanelFor_VMAuthenticate();		
	if(aObject instanceof  ISetCDRUserField)
		return createPanelFor_SetCDRUserField();		
	if(aObject instanceof  IDISA)
		return createPanelFor_DISA();		
	if(aObject instanceof  ISendURL)
		return createPanelFor_SendURL();		
	if(aObject instanceof  ITestClient)
		return createPanelFor_TestClient();		
	if(aObject instanceof  IDUNDiLookup)
		return createPanelFor_DUNDiLookup();		
	if(aObject instanceof  IPark)
		return createPanelFor_Park();		
	if(aObject instanceof  IStartMusicOnHold)
		return createPanelFor_StartMusicOnHold();		
	if(aObject instanceof  IAddQueueMember)
		return createPanelFor_AddQueueMember();		
	if(aObject instanceof  IParkAndAnnounce)
		return createPanelFor_ParkAndAnnounce();		
	if(aObject instanceof  IMacroExit)
		return createPanelFor_MacroExit();		
	if(aObject instanceof  ISubString)
		return createPanelFor_SubString();		
	if(aObject instanceof  ISayNumber)
		return createPanelFor_SayNumber();		
	if(aObject instanceof  IBackground)
		return createPanelFor_Background();		
	if(aObject instanceof  INBScat)
		return createPanelFor_NBScat();		
	if(aObject instanceof  IHasNewVoicemail)
		return createPanelFor_HasNewVoicemail();		
	if(aObject instanceof  ISystem)
		return createPanelFor_System();		
	if(aObject instanceof  IGotoIf)
		return createPanelFor_GotoIf();		
	if(aObject instanceof  ISetRDNIS)
		return createPanelFor_SetRDNIS();		
	if(aObject instanceof  IExecIF)
		return createPanelFor_ExecIF();		
	if(aObject instanceof  IMeetMeAdmin)
		return createPanelFor_MeetMeAdmin();		
	if(aObject instanceof  ISetMusicOnHold)
		return createPanelFor_SetMusicOnHold();		
	if(aObject instanceof  IVoiceMail)
		return createPanelFor_VoiceMail();		
	if(aObject instanceof  IWaitForRing)
		return createPanelFor_WaitForRing();		
	if(aObject instanceof  IPlaytones)
		return createPanelFor_Playtones();		
	if(aObject instanceof  ISayCountPL)
		return createPanelFor_SayCountPL();		
	if(aObject instanceof  IStopMonitor)
		return createPanelFor_StopMonitor();		
	if(aObject instanceof  IGetGroupMatchCount)
		return createPanelFor_GetGroupMatchCount();		
	if(aObject instanceof  IWait)
		return createPanelFor_Wait();		
	if(aObject instanceof  IZapateller)
		return createPanelFor_Zapateller();		
	if(aObject instanceof  IExec)
		return createPanelFor_Exec();		
	if(aObject instanceof  ISendText)
		return createPanelFor_SendText();		
	if(aObject instanceof  IZapBarge)
		return createPanelFor_ZapBarge();		
	if(aObject instanceof  ISuffix)
		return createPanelFor_Suffix();		
	if(aObject instanceof  IDateTime)
		return createPanelFor_DateTime();		
	if(aObject instanceof  IMD5Check)
		return createPanelFor_MD5Check();		
	if(aObject instanceof  IGoto)
		return createPanelFor_Goto();		
	if(aObject instanceof  IDumpChan)
		return createPanelFor_DumpChan();		
	if(aObject instanceof  IMonitor)
		return createPanelFor_Monitor();		
	if(aObject instanceof  IDBdeltree)
		return createPanelFor_DBdeltree();		
	if(aObject instanceof  ICheckGroup)
		return createPanelFor_CheckGroup();		
	if(aObject instanceof  INoOp)
		return createPanelFor_NoOp();		
	if(aObject instanceof  IResetCDR)
		return createPanelFor_ResetCDR();		
	if(aObject instanceof  IRealTimeUpdate)
		return createPanelFor_RealTimeUpdate();		
	if(aObject instanceof  IControlPlayback)
		return createPanelFor_ControlPlayback();		
	if(aObject instanceof  IFestival)
		return createPanelFor_Festival();		
	if(aObject instanceof  IForkCDR)
		return createPanelFor_ForkCDR();		
	if(aObject instanceof  IProgress)
		return createPanelFor_Progress();		
	if(aObject instanceof  IBackgroundDetect)
		return createPanelFor_BackgroundDetect();		
	if(aObject instanceof  IHangup)
		return createPanelFor_Hangup();		
	if(aObject instanceof  IMeetMeCount)
		return createPanelFor_MeetMeCount();		
	if(aObject instanceof  IReadFile)
		return createPanelFor_ReadFile();		
	if(aObject instanceof  IADSIProg)
		return createPanelFor_ADSIProg();		
	if(aObject instanceof  IZapScan)
		return createPanelFor_ZapScan();		
	if(aObject instanceof  IZapRAS)
		return createPanelFor_ZapRAS();		
	if(aObject instanceof  ITestServer)
		return createPanelFor_TestServer();		
	if(aObject instanceof  ISayDigits)
		return createPanelFor_SayDigits();		
	if(aObject instanceof  ITXTCIDName)
		return createPanelFor_TXTCIDName();		
	if(aObject instanceof  ISoftHangup)
		return createPanelFor_SoftHangup();		
	if(aObject instanceof  ISetLanguage)
		return createPanelFor_SetLanguage();		
	if(aObject instanceof  IPrivacyManager)
		return createPanelFor_PrivacyManager();		
	if(aObject instanceof  IEcho)
		return createPanelFor_Echo();		
	if(aObject instanceof  ISetCallerID)
		return createPanelFor_SetCallerID();		
	if(aObject instanceof  IStripMSD)
		return createPanelFor_StripMSD();		
	if(aObject instanceof  ISetAMAFlags)
		return createPanelFor_SetAMAFlags();		
	if(aObject instanceof  IImportVar)
		return createPanelFor_ImportVar();		
	if(aObject instanceof  IWaitMusicOnHold)
		return createPanelFor_WaitMusicOnHold();		
	if(aObject instanceof  IQueue)
		return createPanelFor_Queue();		
	if(aObject instanceof  IRecord)
		return createPanelFor_Record();		
	if(aObject instanceof  IStripLSD)
		return createPanelFor_StripLSD();		
	if(aObject instanceof  IHasVoicemail)
		return createPanelFor_HasVoicemail();		
	if(aObject instanceof  IAbsoluteTimeout)
		return createPanelFor_AbsoluteTimeout();		
	if(aObject instanceof  ISIPAddHeader)
		return createPanelFor_SIPAddHeader();		
	if(aObject instanceof  IEAGI)
		return createPanelFor_EAGI();		
	if(aObject instanceof  IAuthenticate)
		return createPanelFor_Authenticate();		
	if(aObject instanceof  IUnpauseQueueMember)
		return createPanelFor_UnpauseQueueMember();		
	if(aObject instanceof  IMacroIf)
		return createPanelFor_MacroIf();		
	if(aObject instanceof  IEnumLookup)
		return createPanelFor_EnumLookup();		
	if(aObject instanceof  ISIPDtmfMode)
		return createPanelFor_SIPDtmfMode();		
	if(aObject instanceof  ISetCIDName)
		return createPanelFor_SetCIDName();		
	if(aObject instanceof  ICut)
		return createPanelFor_Cut();		
	if(aObject instanceof  IAnswer)
		return createPanelFor_Answer();		
	if(aObject instanceof  ISayPhonetic)
		return createPanelFor_SayPhonetic();		
	if(aObject instanceof  INoCDR)
		return createPanelFor_NoCDR();		
	if(aObject instanceof  IAgentLogin)
		return createPanelFor_AgentLogin();		
	if(aObject instanceof  IWhile)
		return createPanelFor_While();		
	if(aObject instanceof  IMailboxExists)
		return createPanelFor_MailboxExists();		
	if(aObject instanceof  IMeetMe)
		return createPanelFor_MeetMe();		
	if(aObject instanceof  IDBget)
		return createPanelFor_DBget();		
	if(aObject instanceof  IRinging)
		return createPanelFor_Ringing();		
	if(aObject instanceof  IRetryDial)
		return createPanelFor_RetryDial();		
	if(aObject instanceof  IFlash)
		return createPanelFor_Flash();		
	if(aObject instanceof  ISayAlpha)
		return createPanelFor_SayAlpha();		
	if(aObject instanceof  IVoiceMailMain)
		return createPanelFor_VoiceMailMain();		
	if(aObject instanceof  IPlayback)
		return createPanelFor_Playback();		
	if(aObject instanceof  IDBdel)
		return createPanelFor_DBdel();		
	if(aObject instanceof  IResponseTimeout)
		return createPanelFor_ResponseTimeout();		
	if(aObject instanceof  ISendDTMF)
		return createPanelFor_SendDTMF();		
	if(aObject instanceof  IAlarmReceiver)
		return createPanelFor_AlarmReceiver();		
	if(aObject instanceof  IRead)
		return createPanelFor_Read();		
	if(aObject instanceof  ISetVar)
		return createPanelFor_SetVar();		
	if(aObject instanceof  IMilliwatt)
		return createPanelFor_Milliwatt();		
	if(aObject instanceof  IRandom)
		return createPanelFor_Random();		
		return null;
	}
	
public Object getTableModelFor(Object aObject){
	if(aObject instanceof  IChanIsAvail)
		return createTableModelFor_ChanIsAvail();		
	if(aObject instanceof  IMacro)
		return createTableModelFor_Macro();		
	if(aObject instanceof  ISetCIDNum)
		return createTableModelFor_SetCIDNum();		
	if(aObject instanceof  IAgentCallbackLogin)
		return createTableModelFor_AgentCallbackLogin();		
	if(aObject instanceof  IChangeMonitor)
		return createTableModelFor_ChangeMonitor();		
	if(aObject instanceof  IIAX2Provision)
		return createTableModelFor_IAX2Provision();		
	if(aObject instanceof  IUserEvent)
		return createTableModelFor_UserEvent();		
	if(aObject instanceof  IMP3Player)
		return createTableModelFor_MP3Player();		
	if(aObject instanceof  ITransfer)
		return createTableModelFor_Transfer();		
	if(aObject instanceof  IDigitTimeout)
		return createTableModelFor_DigitTimeout();		
	if(aObject instanceof  IEval)
		return createTableModelFor_Eval();		
	if(aObject instanceof  ISetGroup)
		return createTableModelFor_SetGroup();		
	if(aObject instanceof  IGetGroupCount)
		return createTableModelFor_GetGroupCount();		
	if(aObject instanceof  IStopPlaytones)
		return createTableModelFor_StopPlaytones();		
	if(aObject instanceof  ILookupCIDName)
		return createTableModelFor_LookupCIDName();		
	if(aObject instanceof  IAppendCDRUserField)
		return createTableModelFor_AppendCDRUserField();		
	if(aObject instanceof  IPauseQueueMember)
		return createTableModelFor_PauseQueueMember();		
	if(aObject instanceof  IDeadAGI)
		return createTableModelFor_DeadAGI();		
	if(aObject instanceof  IParkedCall)
		return createTableModelFor_ParkedCall();		
	if(aObject instanceof  ISetCallerPres)
		return createTableModelFor_SetCallerPres();		
	if(aObject instanceof  IMD5_checksum_application)
		return createTableModelFor_MD5_checksum_application();		
	if(aObject instanceof  ISendImage)
		return createTableModelFor_SendImage();		
	if(aObject instanceof  ILookupBlacklist)
		return createTableModelFor_LookupBlacklist();		
	if(aObject instanceof  IDial)
		return createTableModelFor_Dial();		
	if(aObject instanceof  IDBput)
		return createTableModelFor_DBput();		
	if(aObject instanceof  IExecIfTime)
		return createTableModelFor_ExecIfTime();		
	if(aObject instanceof  ISetAccount)
		return createTableModelFor_SetAccount();		
	if(aObject instanceof  ISIPGetHeader)
		return createTableModelFor_SIPGetHeader();		
	if(aObject instanceof  IVerbose)
		return createTableModelFor_Verbose();		
	if(aObject instanceof  IStopMusicOnHold)
		return createTableModelFor_StopMusicOnHold();		
	if(aObject instanceof  IWaitForSilence)
		return createTableModelFor_WaitForSilence();		
	if(aObject instanceof  ISMS)
		return createTableModelFor_SMS();		
	if(aObject instanceof  IMusicOnHold)
		return createTableModelFor_MusicOnHold();		
	if(aObject instanceof  IBusy)
		return createTableModelFor_Busy();		
	if(aObject instanceof  IGotoIfTime)
		return createTableModelFor_GotoIfTime();		
	if(aObject instanceof  ICongestion)
		return createTableModelFor_Congestion();		
	if(aObject instanceof  IDirectory)
		return createTableModelFor_Directory();		
	if(aObject instanceof  IAgentMonitorOutgoing)
		return createTableModelFor_AgentMonitorOutgoing();		
	if(aObject instanceof  IMath)
		return createTableModelFor_Math();		
	if(aObject instanceof  ISayUnixTime)
		return createTableModelFor_SayUnixTime();		
	if(aObject instanceof  ISetGlobalVar)
		return createTableModelFor_SetGlobalVar();		
	if(aObject instanceof  IWaitExten)
		return createTableModelFor_WaitExten();		
	if(aObject instanceof  IPrefix)
		return createTableModelFor_Prefix();		
	if(aObject instanceof  ITrySystem)
		return createTableModelFor_TrySystem();		
	if(aObject instanceof  IRemoveQueueMember)
		return createTableModelFor_RemoveQueueMember();		
	if(aObject instanceof  IRealTime)
		return createTableModelFor_RealTime();		
	if(aObject instanceof  IICES)
		return createTableModelFor_ICES();		
	if(aObject instanceof  IAGI)
		return createTableModelFor_AGI();		
	if(aObject instanceof  IEndWhile)
		return createTableModelFor_EndWhile();		
	if(aObject instanceof  IGetCPEID)
		return createTableModelFor_GetCPEID();		
	if(aObject instanceof  IVMAuthenticate)
		return createTableModelFor_VMAuthenticate();		
	if(aObject instanceof  ISetCDRUserField)
		return createTableModelFor_SetCDRUserField();		
	if(aObject instanceof  IDISA)
		return createTableModelFor_DISA();		
	if(aObject instanceof  ISendURL)
		return createTableModelFor_SendURL();		
	if(aObject instanceof  ITestClient)
		return createTableModelFor_TestClient();		
	if(aObject instanceof  IDUNDiLookup)
		return createTableModelFor_DUNDiLookup();		
	if(aObject instanceof  IPark)
		return createTableModelFor_Park();		
	if(aObject instanceof  IStartMusicOnHold)
		return createTableModelFor_StartMusicOnHold();		
	if(aObject instanceof  IAddQueueMember)
		return createTableModelFor_AddQueueMember();		
	if(aObject instanceof  IParkAndAnnounce)
		return createTableModelFor_ParkAndAnnounce();		
	if(aObject instanceof  IMacroExit)
		return createTableModelFor_MacroExit();		
	if(aObject instanceof  ISubString)
		return createTableModelFor_SubString();		
	if(aObject instanceof  ISayNumber)
		return createTableModelFor_SayNumber();		
	if(aObject instanceof  IBackground)
		return createTableModelFor_Background();		
	if(aObject instanceof  INBScat)
		return createTableModelFor_NBScat();		
	if(aObject instanceof  IHasNewVoicemail)
		return createTableModelFor_HasNewVoicemail();		
	if(aObject instanceof  ISystem)
		return createTableModelFor_System();		
	if(aObject instanceof  IGotoIf)
		return createTableModelFor_GotoIf();		
	if(aObject instanceof  ISetRDNIS)
		return createTableModelFor_SetRDNIS();		
	if(aObject instanceof  IExecIF)
		return createTableModelFor_ExecIF();		
	if(aObject instanceof  IMeetMeAdmin)
		return createTableModelFor_MeetMeAdmin();		
	if(aObject instanceof  ISetMusicOnHold)
		return createTableModelFor_SetMusicOnHold();		
	if(aObject instanceof  IVoiceMail)
		return createTableModelFor_VoiceMail();		
	if(aObject instanceof  IWaitForRing)
		return createTableModelFor_WaitForRing();		
	if(aObject instanceof  IPlaytones)
		return createTableModelFor_Playtones();		
	if(aObject instanceof  ISayCountPL)
		return createTableModelFor_SayCountPL();		
	if(aObject instanceof  IStopMonitor)
		return createTableModelFor_StopMonitor();		
	if(aObject instanceof  IGetGroupMatchCount)
		return createTableModelFor_GetGroupMatchCount();		
	if(aObject instanceof  IWait)
		return createTableModelFor_Wait();		
	if(aObject instanceof  IZapateller)
		return createTableModelFor_Zapateller();		
	if(aObject instanceof  IExec)
		return createTableModelFor_Exec();		
	if(aObject instanceof  ISendText)
		return createTableModelFor_SendText();		
	if(aObject instanceof  IZapBarge)
		return createTableModelFor_ZapBarge();		
	if(aObject instanceof  ISuffix)
		return createTableModelFor_Suffix();		
	if(aObject instanceof  IDateTime)
		return createTableModelFor_DateTime();		
	if(aObject instanceof  IMD5Check)
		return createTableModelFor_MD5Check();		
	if(aObject instanceof  IGoto)
		return createTableModelFor_Goto();		
	if(aObject instanceof  IDumpChan)
		return createTableModelFor_DumpChan();		
	if(aObject instanceof  IMonitor)
		return createTableModelFor_Monitor();		
	if(aObject instanceof  IDBdeltree)
		return createTableModelFor_DBdeltree();		
	if(aObject instanceof  ICheckGroup)
		return createTableModelFor_CheckGroup();		
	if(aObject instanceof  INoOp)
		return createTableModelFor_NoOp();		
	if(aObject instanceof  IResetCDR)
		return createTableModelFor_ResetCDR();		
	if(aObject instanceof  IRealTimeUpdate)
		return createTableModelFor_RealTimeUpdate();		
	if(aObject instanceof  IControlPlayback)
		return createTableModelFor_ControlPlayback();		
	if(aObject instanceof  IFestival)
		return createTableModelFor_Festival();		
	if(aObject instanceof  IForkCDR)
		return createTableModelFor_ForkCDR();		
	if(aObject instanceof  IProgress)
		return createTableModelFor_Progress();		
	if(aObject instanceof  IBackgroundDetect)
		return createTableModelFor_BackgroundDetect();		
	if(aObject instanceof  IHangup)
		return createTableModelFor_Hangup();		
	if(aObject instanceof  IMeetMeCount)
		return createTableModelFor_MeetMeCount();		
	if(aObject instanceof  IReadFile)
		return createTableModelFor_ReadFile();		
	if(aObject instanceof  IADSIProg)
		return createTableModelFor_ADSIProg();		
	if(aObject instanceof  IZapScan)
		return createTableModelFor_ZapScan();		
	if(aObject instanceof  IZapRAS)
		return createTableModelFor_ZapRAS();		
	if(aObject instanceof  ITestServer)
		return createTableModelFor_TestServer();		
	if(aObject instanceof  ISayDigits)
		return createTableModelFor_SayDigits();		
	if(aObject instanceof  ITXTCIDName)
		return createTableModelFor_TXTCIDName();		
	if(aObject instanceof  ISoftHangup)
		return createTableModelFor_SoftHangup();		
	if(aObject instanceof  ISetLanguage)
		return createTableModelFor_SetLanguage();		
	if(aObject instanceof  IPrivacyManager)
		return createTableModelFor_PrivacyManager();		
	if(aObject instanceof  IEcho)
		return createTableModelFor_Echo();		
	if(aObject instanceof  ISetCallerID)
		return createTableModelFor_SetCallerID();		
	if(aObject instanceof  IStripMSD)
		return createTableModelFor_StripMSD();		
	if(aObject instanceof  ISetAMAFlags)
		return createTableModelFor_SetAMAFlags();		
	if(aObject instanceof  IImportVar)
		return createTableModelFor_ImportVar();		
	if(aObject instanceof  IWaitMusicOnHold)
		return createTableModelFor_WaitMusicOnHold();		
	if(aObject instanceof  IQueue)
		return createTableModelFor_Queue();		
	if(aObject instanceof  IRecord)
		return createTableModelFor_Record();		
	if(aObject instanceof  IStripLSD)
		return createTableModelFor_StripLSD();		
	if(aObject instanceof  IHasVoicemail)
		return createTableModelFor_HasVoicemail();		
	if(aObject instanceof  IAbsoluteTimeout)
		return createTableModelFor_AbsoluteTimeout();		
	if(aObject instanceof  ISIPAddHeader)
		return createTableModelFor_SIPAddHeader();		
	if(aObject instanceof  IEAGI)
		return createTableModelFor_EAGI();		
	if(aObject instanceof  IAuthenticate)
		return createTableModelFor_Authenticate();		
	if(aObject instanceof  IUnpauseQueueMember)
		return createTableModelFor_UnpauseQueueMember();		
	if(aObject instanceof  IMacroIf)
		return createTableModelFor_MacroIf();		
	if(aObject instanceof  IEnumLookup)
		return createTableModelFor_EnumLookup();		
	if(aObject instanceof  ISIPDtmfMode)
		return createTableModelFor_SIPDtmfMode();		
	if(aObject instanceof  ISetCIDName)
		return createTableModelFor_SetCIDName();		
	if(aObject instanceof  ICut)
		return createTableModelFor_Cut();		
	if(aObject instanceof  IAnswer)
		return createTableModelFor_Answer();		
	if(aObject instanceof  ISayPhonetic)
		return createTableModelFor_SayPhonetic();		
	if(aObject instanceof  INoCDR)
		return createTableModelFor_NoCDR();		
	if(aObject instanceof  IAgentLogin)
		return createTableModelFor_AgentLogin();		
	if(aObject instanceof  IWhile)
		return createTableModelFor_While();		
	if(aObject instanceof  IMailboxExists)
		return createTableModelFor_MailboxExists();		
	if(aObject instanceof  IMeetMe)
		return createTableModelFor_MeetMe();		
	if(aObject instanceof  IDBget)
		return createTableModelFor_DBget();		
	if(aObject instanceof  IRinging)
		return createTableModelFor_Ringing();		
	if(aObject instanceof  IRetryDial)
		return createTableModelFor_RetryDial();		
	if(aObject instanceof  IFlash)
		return createTableModelFor_Flash();		
	if(aObject instanceof  ISayAlpha)
		return createTableModelFor_SayAlpha();		
	if(aObject instanceof  IVoiceMailMain)
		return createTableModelFor_VoiceMailMain();		
	if(aObject instanceof  IPlayback)
		return createTableModelFor_Playback();		
	if(aObject instanceof  IDBdel)
		return createTableModelFor_DBdel();		
	if(aObject instanceof  IResponseTimeout)
		return createTableModelFor_ResponseTimeout();		
	if(aObject instanceof  ISendDTMF)
		return createTableModelFor_SendDTMF();		
	if(aObject instanceof  IAlarmReceiver)
		return createTableModelFor_AlarmReceiver();		
	if(aObject instanceof  IRead)
		return createTableModelFor_Read();		
	if(aObject instanceof  ISetVar)
		return createTableModelFor_SetVar();		
	if(aObject instanceof  IMilliwatt)
		return createTableModelFor_Milliwatt();		
	if(aObject instanceof  IRandom)
		return createTableModelFor_Random();		
		return null;
	}

public Object createSimplePanelFor_ChanIsAvail(){
return new ChanIsAvailDataPanelImpl();
}
public Object createPanelFor_ChanIsAvail(){
return new ChanIsAvailDataPanelImpl();
}
public Object createTableModelFor_ChanIsAvail(){
return null;
}
public Object createSimplePanelFor_Macro(){
return new MacroDataPanelImpl();
}
public Object createPanelFor_Macro(){
return new MacroDataPanelImpl();
}
public Object createTableModelFor_Macro(){
return null;
}
public Object createSimplePanelFor_SetCIDNum(){
return new SetCIDNumDataPanelImpl();
}
public Object createPanelFor_SetCIDNum(){
return new SetCIDNumDataPanelImpl();
}
public Object createTableModelFor_SetCIDNum(){
return null;
}
public Object createSimplePanelFor_AgentCallbackLogin(){
return new AgentCallbackLoginDataPanelImpl();
}
public Object createPanelFor_AgentCallbackLogin(){
return new AgentCallbackLoginDataPanelImpl();
}
public Object createTableModelFor_AgentCallbackLogin(){
return null;
}
public Object createSimplePanelFor_ChangeMonitor(){
return new ChangeMonitorDataPanelImpl();
}
public Object createPanelFor_ChangeMonitor(){
return new ChangeMonitorDataPanelImpl();
}
public Object createTableModelFor_ChangeMonitor(){
return null;
}
public Object createSimplePanelFor_IAX2Provision(){
return new IAX2ProvisionDataPanelImpl();
}
public Object createPanelFor_IAX2Provision(){
return new IAX2ProvisionDataPanelImpl();
}
public Object createTableModelFor_IAX2Provision(){
return null;
}
public Object createSimplePanelFor_UserEvent(){
return new UserEventDataPanelImpl();
}
public Object createPanelFor_UserEvent(){
return new UserEventDataPanelImpl();
}
public Object createTableModelFor_UserEvent(){
return null;
}
public Object createSimplePanelFor_MP3Player(){
return new MP3PlayerDataPanelImpl();
}
public Object createPanelFor_MP3Player(){
return new MP3PlayerDataPanelImpl();
}
public Object createTableModelFor_MP3Player(){
return null;
}
public Object createSimplePanelFor_Transfer(){
return new TransferDataPanelImpl();
}
public Object createPanelFor_Transfer(){
return new TransferDataPanelImpl();
}
public Object createTableModelFor_Transfer(){
return null;
}
public Object createSimplePanelFor_DigitTimeout(){
return new DigitTimeoutDataPanelImpl();
}
public Object createPanelFor_DigitTimeout(){
return new DigitTimeoutDataPanelImpl();
}
public Object createTableModelFor_DigitTimeout(){
return null;
}
public Object createSimplePanelFor_Eval(){
return new EvalDataPanelImpl();
}
public Object createPanelFor_Eval(){
return new EvalDataPanelImpl();
}
public Object createTableModelFor_Eval(){
return null;
}
public Object createSimplePanelFor_SetGroup(){
return new SetGroupDataPanelImpl();
}
public Object createPanelFor_SetGroup(){
return new SetGroupDataPanelImpl();
}
public Object createTableModelFor_SetGroup(){
return null;
}
public Object createSimplePanelFor_GetGroupCount(){
return new GetGroupCountDataPanelImpl();
}
public Object createPanelFor_GetGroupCount(){
return new GetGroupCountDataPanelImpl();
}
public Object createTableModelFor_GetGroupCount(){
return null;
}
public Object createSimplePanelFor_StopPlaytones(){
return new StopPlaytonesDataPanelImpl();
}
public Object createPanelFor_StopPlaytones(){
return new StopPlaytonesDataPanelImpl();
}
public Object createTableModelFor_StopPlaytones(){
return null;
}
public Object createSimplePanelFor_LookupCIDName(){
return new LookupCIDNameDataPanelImpl();
}
public Object createPanelFor_LookupCIDName(){
return new LookupCIDNameDataPanelImpl();
}
public Object createTableModelFor_LookupCIDName(){
return null;
}
public Object createSimplePanelFor_AppendCDRUserField(){
return new AppendCDRUserFieldDataPanelImpl();
}
public Object createPanelFor_AppendCDRUserField(){
return new AppendCDRUserFieldDataPanelImpl();
}
public Object createTableModelFor_AppendCDRUserField(){
return null;
}
public Object createSimplePanelFor_PauseQueueMember(){
return new PauseQueueMemberDataPanelImpl();
}
public Object createPanelFor_PauseQueueMember(){
return new PauseQueueMemberDataPanelImpl();
}
public Object createTableModelFor_PauseQueueMember(){
return null;
}
public Object createSimplePanelFor_DeadAGI(){
return new DeadAGIDataPanelImpl();
}
public Object createPanelFor_DeadAGI(){
return new DeadAGIDataPanelImpl();
}
public Object createTableModelFor_DeadAGI(){
return null;
}
public Object createSimplePanelFor_ParkedCall(){
return new ParkedCallDataPanelImpl();
}
public Object createPanelFor_ParkedCall(){
return new ParkedCallDataPanelImpl();
}
public Object createTableModelFor_ParkedCall(){
return null;
}
public Object createSimplePanelFor_SetCallerPres(){
return new SetCallerPresDataPanelImpl();
}
public Object createPanelFor_SetCallerPres(){
return new SetCallerPresDataPanelImpl();
}
public Object createTableModelFor_SetCallerPres(){
return null;
}
public Object createSimplePanelFor_MD5_checksum_application(){
return new MD5_checksum_applicationDataPanelImpl();
}
public Object createPanelFor_MD5_checksum_application(){
return new MD5_checksum_applicationDataPanelImpl();
}
public Object createTableModelFor_MD5_checksum_application(){
return null;
}
public Object createSimplePanelFor_SendImage(){
return new SendImageDataPanelImpl();
}
public Object createPanelFor_SendImage(){
return new SendImageDataPanelImpl();
}
public Object createTableModelFor_SendImage(){
return null;
}
public Object createSimplePanelFor_LookupBlacklist(){
return new LookupBlacklistDataPanelImpl();
}
public Object createPanelFor_LookupBlacklist(){
return new LookupBlacklistDataPanelImpl();
}
public Object createTableModelFor_LookupBlacklist(){
return null;
}
public Object createSimplePanelFor_Dial(){
return new DialDataPanelImpl();
}
public Object createPanelFor_Dial(){
return new DialDataPanelImpl();
}
public Object createTableModelFor_Dial(){
return null;
}
public Object createSimplePanelFor_DBput(){
return new DBputDataPanelImpl();
}
public Object createPanelFor_DBput(){
return new DBputDataPanelImpl();
}
public Object createTableModelFor_DBput(){
return null;
}
public Object createSimplePanelFor_ExecIfTime(){
return new ExecIfTimeDataPanelImpl();
}
public Object createPanelFor_ExecIfTime(){
return new ExecIfTimeDataPanelImpl();
}
public Object createTableModelFor_ExecIfTime(){
return null;
}
public Object createSimplePanelFor_SetAccount(){
return new SetAccountDataPanelImpl();
}
public Object createPanelFor_SetAccount(){
return new SetAccountDataPanelImpl();
}
public Object createTableModelFor_SetAccount(){
return null;
}
public Object createSimplePanelFor_SIPGetHeader(){
return new SIPGetHeaderDataPanelImpl();
}
public Object createPanelFor_SIPGetHeader(){
return new SIPGetHeaderDataPanelImpl();
}
public Object createTableModelFor_SIPGetHeader(){
return null;
}
public Object createSimplePanelFor_Verbose(){
return new VerboseDataPanelImpl();
}
public Object createPanelFor_Verbose(){
return new VerboseDataPanelImpl();
}
public Object createTableModelFor_Verbose(){
return null;
}
public Object createSimplePanelFor_StopMusicOnHold(){
return new StopMusicOnHoldDataPanelImpl();
}
public Object createPanelFor_StopMusicOnHold(){
return new StopMusicOnHoldDataPanelImpl();
}
public Object createTableModelFor_StopMusicOnHold(){
return null;
}
public Object createSimplePanelFor_WaitForSilence(){
return new WaitForSilenceDataPanelImpl();
}
public Object createPanelFor_WaitForSilence(){
return new WaitForSilenceDataPanelImpl();
}
public Object createTableModelFor_WaitForSilence(){
return null;
}
public Object createSimplePanelFor_SMS(){
return new SMSDataPanelImpl();
}
public Object createPanelFor_SMS(){
return new SMSDataPanelImpl();
}
public Object createTableModelFor_SMS(){
return null;
}
public Object createSimplePanelFor_MusicOnHold(){
return new MusicOnHoldDataPanelImpl();
}
public Object createPanelFor_MusicOnHold(){
return new MusicOnHoldDataPanelImpl();
}
public Object createTableModelFor_MusicOnHold(){
return null;
}
public Object createSimplePanelFor_Busy(){
return new BusyDataPanelImpl();
}
public Object createPanelFor_Busy(){
return new BusyDataPanelImpl();
}
public Object createTableModelFor_Busy(){
return null;
}
public Object createSimplePanelFor_GotoIfTime(){
return new GotoIfTimeDataPanelImpl();
}
public Object createPanelFor_GotoIfTime(){
return new GotoIfTimeDataPanelImpl();
}
public Object createTableModelFor_GotoIfTime(){
return null;
}
public Object createSimplePanelFor_Congestion(){
return new CongestionDataPanelImpl();
}
public Object createPanelFor_Congestion(){
return new CongestionDataPanelImpl();
}
public Object createTableModelFor_Congestion(){
return null;
}
public Object createSimplePanelFor_Directory(){
return new DirectoryDataPanelImpl();
}
public Object createPanelFor_Directory(){
return new DirectoryDataPanelImpl();
}
public Object createTableModelFor_Directory(){
return null;
}
public Object createSimplePanelFor_AgentMonitorOutgoing(){
return new AgentMonitorOutgoingDataPanelImpl();
}
public Object createPanelFor_AgentMonitorOutgoing(){
return new AgentMonitorOutgoingDataPanelImpl();
}
public Object createTableModelFor_AgentMonitorOutgoing(){
return null;
}
public Object createSimplePanelFor_Math(){
return new MathDataPanelImpl();
}
public Object createPanelFor_Math(){
return new MathDataPanelImpl();
}
public Object createTableModelFor_Math(){
return null;
}
public Object createSimplePanelFor_SayUnixTime(){
return new SayUnixTimeDataPanelImpl();
}
public Object createPanelFor_SayUnixTime(){
return new SayUnixTimeDataPanelImpl();
}
public Object createTableModelFor_SayUnixTime(){
return null;
}
public Object createSimplePanelFor_SetGlobalVar(){
return new SetGlobalVarDataPanelImpl();
}
public Object createPanelFor_SetGlobalVar(){
return new SetGlobalVarDataPanelImpl();
}
public Object createTableModelFor_SetGlobalVar(){
return null;
}
public Object createSimplePanelFor_WaitExten(){
return new WaitExtenDataPanelImpl();
}
public Object createPanelFor_WaitExten(){
return new WaitExtenDataPanelImpl();
}
public Object createTableModelFor_WaitExten(){
return null;
}
public Object createSimplePanelFor_Prefix(){
return new PrefixDataPanelImpl();
}
public Object createPanelFor_Prefix(){
return new PrefixDataPanelImpl();
}
public Object createTableModelFor_Prefix(){
return null;
}
public Object createSimplePanelFor_TrySystem(){
return new TrySystemDataPanelImpl();
}
public Object createPanelFor_TrySystem(){
return new TrySystemDataPanelImpl();
}
public Object createTableModelFor_TrySystem(){
return null;
}
public Object createSimplePanelFor_RemoveQueueMember(){
return new RemoveQueueMemberDataPanelImpl();
}
public Object createPanelFor_RemoveQueueMember(){
return new RemoveQueueMemberDataPanelImpl();
}
public Object createTableModelFor_RemoveQueueMember(){
return null;
}
public Object createSimplePanelFor_RealTime(){
return new RealTimeDataPanelImpl();
}
public Object createPanelFor_RealTime(){
return new RealTimeDataPanelImpl();
}
public Object createTableModelFor_RealTime(){
return null;
}
public Object createSimplePanelFor_ICES(){
return new ICESDataPanelImpl();
}
public Object createPanelFor_ICES(){
return new ICESDataPanelImpl();
}
public Object createTableModelFor_ICES(){
return null;
}
public Object createSimplePanelFor_AGI(){
return new AGIDataPanelImpl();
}
public Object createPanelFor_AGI(){
return new AGIDataPanelImpl();
}
public Object createTableModelFor_AGI(){
return null;
}
public Object createSimplePanelFor_EndWhile(){
return new EndWhileDataPanelImpl();
}
public Object createPanelFor_EndWhile(){
return new EndWhileDataPanelImpl();
}
public Object createTableModelFor_EndWhile(){
return null;
}
public Object createSimplePanelFor_GetCPEID(){
return new GetCPEIDDataPanelImpl();
}
public Object createPanelFor_GetCPEID(){
return new GetCPEIDDataPanelImpl();
}
public Object createTableModelFor_GetCPEID(){
return null;
}
public Object createSimplePanelFor_VMAuthenticate(){
return new VMAuthenticateDataPanelImpl();
}
public Object createPanelFor_VMAuthenticate(){
return new VMAuthenticateDataPanelImpl();
}
public Object createTableModelFor_VMAuthenticate(){
return null;
}
public Object createSimplePanelFor_SetCDRUserField(){
return new SetCDRUserFieldDataPanelImpl();
}
public Object createPanelFor_SetCDRUserField(){
return new SetCDRUserFieldDataPanelImpl();
}
public Object createTableModelFor_SetCDRUserField(){
return null;
}
public Object createSimplePanelFor_DISA(){
return new DISADataPanelImpl();
}
public Object createPanelFor_DISA(){
return new DISADataPanelImpl();
}
public Object createTableModelFor_DISA(){
return null;
}
public Object createSimplePanelFor_SendURL(){
return new SendURLDataPanelImpl();
}
public Object createPanelFor_SendURL(){
return new SendURLDataPanelImpl();
}
public Object createTableModelFor_SendURL(){
return null;
}
public Object createSimplePanelFor_TestClient(){
return new TestClientDataPanelImpl();
}
public Object createPanelFor_TestClient(){
return new TestClientDataPanelImpl();
}
public Object createTableModelFor_TestClient(){
return null;
}
public Object createSimplePanelFor_DUNDiLookup(){
return new DUNDiLookupDataPanelImpl();
}
public Object createPanelFor_DUNDiLookup(){
return new DUNDiLookupDataPanelImpl();
}
public Object createTableModelFor_DUNDiLookup(){
return null;
}
public Object createSimplePanelFor_Park(){
return new ParkDataPanelImpl();
}
public Object createPanelFor_Park(){
return new ParkDataPanelImpl();
}
public Object createTableModelFor_Park(){
return null;
}
public Object createSimplePanelFor_StartMusicOnHold(){
return new StartMusicOnHoldDataPanelImpl();
}
public Object createPanelFor_StartMusicOnHold(){
return new StartMusicOnHoldDataPanelImpl();
}
public Object createTableModelFor_StartMusicOnHold(){
return null;
}
public Object createSimplePanelFor_AddQueueMember(){
return new AddQueueMemberDataPanelImpl();
}
public Object createPanelFor_AddQueueMember(){
return new AddQueueMemberDataPanelImpl();
}
public Object createTableModelFor_AddQueueMember(){
return null;
}
public Object createSimplePanelFor_ParkAndAnnounce(){
return new ParkAndAnnounceDataPanelImpl();
}
public Object createPanelFor_ParkAndAnnounce(){
return new ParkAndAnnounceDataPanelImpl();
}
public Object createTableModelFor_ParkAndAnnounce(){
return null;
}
public Object createSimplePanelFor_MacroExit(){
return new MacroExitDataPanelImpl();
}
public Object createPanelFor_MacroExit(){
return new MacroExitDataPanelImpl();
}
public Object createTableModelFor_MacroExit(){
return null;
}
public Object createSimplePanelFor_SubString(){
return new SubStringDataPanelImpl();
}
public Object createPanelFor_SubString(){
return new SubStringDataPanelImpl();
}
public Object createTableModelFor_SubString(){
return null;
}
public Object createSimplePanelFor_SayNumber(){
return new SayNumberDataPanelImpl();
}
public Object createPanelFor_SayNumber(){
return new SayNumberDataPanelImpl();
}
public Object createTableModelFor_SayNumber(){
return null;
}
public Object createSimplePanelFor_Background(){
return new BackgroundDataPanelImpl();
}
public Object createPanelFor_Background(){
return new BackgroundDataPanelImpl();
}
public Object createTableModelFor_Background(){
return null;
}
public Object createSimplePanelFor_NBScat(){
return new NBScatDataPanelImpl();
}
public Object createPanelFor_NBScat(){
return new NBScatDataPanelImpl();
}
public Object createTableModelFor_NBScat(){
return null;
}
public Object createSimplePanelFor_HasNewVoicemail(){
return new HasNewVoicemailDataPanelImpl();
}
public Object createPanelFor_HasNewVoicemail(){
return new HasNewVoicemailDataPanelImpl();
}
public Object createTableModelFor_HasNewVoicemail(){
return null;
}
public Object createSimplePanelFor_System(){
return new SystemDataPanelImpl();
}
public Object createPanelFor_System(){
return new SystemDataPanelImpl();
}
public Object createTableModelFor_System(){
return null;
}
public Object createSimplePanelFor_GotoIf(){
return new GotoIfDataPanelImpl();
}
public Object createPanelFor_GotoIf(){
return new GotoIfDataPanelImpl();
}
public Object createTableModelFor_GotoIf(){
return null;
}
public Object createSimplePanelFor_SetRDNIS(){
return new SetRDNISDataPanelImpl();
}
public Object createPanelFor_SetRDNIS(){
return new SetRDNISDataPanelImpl();
}
public Object createTableModelFor_SetRDNIS(){
return null;
}
public Object createSimplePanelFor_ExecIF(){
return new ExecIFDataPanelImpl();
}
public Object createPanelFor_ExecIF(){
return new ExecIFDataPanelImpl();
}
public Object createTableModelFor_ExecIF(){
return null;
}
public Object createSimplePanelFor_MeetMeAdmin(){
return new MeetMeAdminDataPanelImpl();
}
public Object createPanelFor_MeetMeAdmin(){
return new MeetMeAdminDataPanelImpl();
}
public Object createTableModelFor_MeetMeAdmin(){
return null;
}
public Object createSimplePanelFor_SetMusicOnHold(){
return new SetMusicOnHoldDataPanelImpl();
}
public Object createPanelFor_SetMusicOnHold(){
return new SetMusicOnHoldDataPanelImpl();
}
public Object createTableModelFor_SetMusicOnHold(){
return null;
}
public Object createSimplePanelFor_VoiceMail(){
return new VoiceMailDataPanelImpl();
}
public Object createPanelFor_VoiceMail(){
return new VoiceMailDataPanelImpl();
}
public Object createTableModelFor_VoiceMail(){
return null;
}
public Object createSimplePanelFor_WaitForRing(){
return new WaitForRingDataPanelImpl();
}
public Object createPanelFor_WaitForRing(){
return new WaitForRingDataPanelImpl();
}
public Object createTableModelFor_WaitForRing(){
return null;
}
public Object createSimplePanelFor_Playtones(){
return new PlaytonesDataPanelImpl();
}
public Object createPanelFor_Playtones(){
return new PlaytonesDataPanelImpl();
}
public Object createTableModelFor_Playtones(){
return null;
}
public Object createSimplePanelFor_SayCountPL(){
return new SayCountPLDataPanelImpl();
}
public Object createPanelFor_SayCountPL(){
return new SayCountPLDataPanelImpl();
}
public Object createTableModelFor_SayCountPL(){
return null;
}
public Object createSimplePanelFor_StopMonitor(){
return new StopMonitorDataPanelImpl();
}
public Object createPanelFor_StopMonitor(){
return new StopMonitorDataPanelImpl();
}
public Object createTableModelFor_StopMonitor(){
return null;
}
public Object createSimplePanelFor_GetGroupMatchCount(){
return new GetGroupMatchCountDataPanelImpl();
}
public Object createPanelFor_GetGroupMatchCount(){
return new GetGroupMatchCountDataPanelImpl();
}
public Object createTableModelFor_GetGroupMatchCount(){
return null;
}
public Object createSimplePanelFor_Wait(){
return new WaitDataPanelImpl();
}
public Object createPanelFor_Wait(){
return new WaitDataPanelImpl();
}
public Object createTableModelFor_Wait(){
return null;
}
public Object createSimplePanelFor_Zapateller(){
return new ZapatellerDataPanelImpl();
}
public Object createPanelFor_Zapateller(){
return new ZapatellerDataPanelImpl();
}
public Object createTableModelFor_Zapateller(){
return null;
}
public Object createSimplePanelFor_Exec(){
return new ExecDataPanelImpl();
}
public Object createPanelFor_Exec(){
return new ExecDataPanelImpl();
}
public Object createTableModelFor_Exec(){
return null;
}
public Object createSimplePanelFor_SendText(){
return new SendTextDataPanelImpl();
}
public Object createPanelFor_SendText(){
return new SendTextDataPanelImpl();
}
public Object createTableModelFor_SendText(){
return null;
}
public Object createSimplePanelFor_ZapBarge(){
return new ZapBargeDataPanelImpl();
}
public Object createPanelFor_ZapBarge(){
return new ZapBargeDataPanelImpl();
}
public Object createTableModelFor_ZapBarge(){
return null;
}
public Object createSimplePanelFor_Suffix(){
return new SuffixDataPanelImpl();
}
public Object createPanelFor_Suffix(){
return new SuffixDataPanelImpl();
}
public Object createTableModelFor_Suffix(){
return null;
}
public Object createSimplePanelFor_DateTime(){
return new DateTimeDataPanelImpl();
}
public Object createPanelFor_DateTime(){
return new DateTimeDataPanelImpl();
}
public Object createTableModelFor_DateTime(){
return null;
}
public Object createSimplePanelFor_MD5Check(){
return new MD5CheckDataPanelImpl();
}
public Object createPanelFor_MD5Check(){
return new MD5CheckDataPanelImpl();
}
public Object createTableModelFor_MD5Check(){
return null;
}
public Object createSimplePanelFor_Goto(){
return new GotoDataPanelImpl();
}
public Object createPanelFor_Goto(){
return new GotoDataPanelImpl();
}
public Object createTableModelFor_Goto(){
return null;
}
public Object createSimplePanelFor_DumpChan(){
return new DumpChanDataPanelImpl();
}
public Object createPanelFor_DumpChan(){
return new DumpChanDataPanelImpl();
}
public Object createTableModelFor_DumpChan(){
return null;
}
public Object createSimplePanelFor_Monitor(){
return new MonitorDataPanelImpl();
}
public Object createPanelFor_Monitor(){
return new MonitorDataPanelImpl();
}
public Object createTableModelFor_Monitor(){
return null;
}
public Object createSimplePanelFor_DBdeltree(){
return new DBdeltreeDataPanelImpl();
}
public Object createPanelFor_DBdeltree(){
return new DBdeltreeDataPanelImpl();
}
public Object createTableModelFor_DBdeltree(){
return null;
}
public Object createSimplePanelFor_CheckGroup(){
return new CheckGroupDataPanelImpl();
}
public Object createPanelFor_CheckGroup(){
return new CheckGroupDataPanelImpl();
}
public Object createTableModelFor_CheckGroup(){
return null;
}
public Object createSimplePanelFor_NoOp(){
return new NoOpDataPanelImpl();
}
public Object createPanelFor_NoOp(){
return new NoOpDataPanelImpl();
}
public Object createTableModelFor_NoOp(){
return null;
}
public Object createSimplePanelFor_ResetCDR(){
return new ResetCDRDataPanelImpl();
}
public Object createPanelFor_ResetCDR(){
return new ResetCDRDataPanelImpl();
}
public Object createTableModelFor_ResetCDR(){
return null;
}
public Object createSimplePanelFor_RealTimeUpdate(){
return new RealTimeUpdateDataPanelImpl();
}
public Object createPanelFor_RealTimeUpdate(){
return new RealTimeUpdateDataPanelImpl();
}
public Object createTableModelFor_RealTimeUpdate(){
return null;
}
public Object createSimplePanelFor_ControlPlayback(){
return new ControlPlaybackDataPanelImpl();
}
public Object createPanelFor_ControlPlayback(){
return new ControlPlaybackDataPanelImpl();
}
public Object createTableModelFor_ControlPlayback(){
return null;
}
public Object createSimplePanelFor_Festival(){
return new FestivalDataPanelImpl();
}
public Object createPanelFor_Festival(){
return new FestivalDataPanelImpl();
}
public Object createTableModelFor_Festival(){
return null;
}
public Object createSimplePanelFor_ForkCDR(){
return new ForkCDRDataPanelImpl();
}
public Object createPanelFor_ForkCDR(){
return new ForkCDRDataPanelImpl();
}
public Object createTableModelFor_ForkCDR(){
return null;
}
public Object createSimplePanelFor_Progress(){
return new ProgressDataPanelImpl();
}
public Object createPanelFor_Progress(){
return new ProgressDataPanelImpl();
}
public Object createTableModelFor_Progress(){
return null;
}
public Object createSimplePanelFor_BackgroundDetect(){
return new BackgroundDetectDataPanelImpl();
}
public Object createPanelFor_BackgroundDetect(){
return new BackgroundDetectDataPanelImpl();
}
public Object createTableModelFor_BackgroundDetect(){
return null;
}
public Object createSimplePanelFor_Hangup(){
return new HangupDataPanelImpl();
}
public Object createPanelFor_Hangup(){
return new HangupDataPanelImpl();
}
public Object createTableModelFor_Hangup(){
return null;
}
public Object createSimplePanelFor_MeetMeCount(){
return new MeetMeCountDataPanelImpl();
}
public Object createPanelFor_MeetMeCount(){
return new MeetMeCountDataPanelImpl();
}
public Object createTableModelFor_MeetMeCount(){
return null;
}
public Object createSimplePanelFor_ReadFile(){
return new ReadFileDataPanelImpl();
}
public Object createPanelFor_ReadFile(){
return new ReadFileDataPanelImpl();
}
public Object createTableModelFor_ReadFile(){
return null;
}
public Object createSimplePanelFor_ADSIProg(){
return new ADSIProgDataPanelImpl();
}
public Object createPanelFor_ADSIProg(){
return new ADSIProgDataPanelImpl();
}
public Object createTableModelFor_ADSIProg(){
return null;
}
public Object createSimplePanelFor_ZapScan(){
return new ZapScanDataPanelImpl();
}
public Object createPanelFor_ZapScan(){
return new ZapScanDataPanelImpl();
}
public Object createTableModelFor_ZapScan(){
return null;
}
public Object createSimplePanelFor_ZapRAS(){
return new ZapRASDataPanelImpl();
}
public Object createPanelFor_ZapRAS(){
return new ZapRASDataPanelImpl();
}
public Object createTableModelFor_ZapRAS(){
return null;
}
public Object createSimplePanelFor_TestServer(){
return new TestServerDataPanelImpl();
}
public Object createPanelFor_TestServer(){
return new TestServerDataPanelImpl();
}
public Object createTableModelFor_TestServer(){
return null;
}
public Object createSimplePanelFor_SayDigits(){
return new SayDigitsDataPanelImpl();
}
public Object createPanelFor_SayDigits(){
return new SayDigitsDataPanelImpl();
}
public Object createTableModelFor_SayDigits(){
return null;
}
public Object createSimplePanelFor_TXTCIDName(){
return new TXTCIDNameDataPanelImpl();
}
public Object createPanelFor_TXTCIDName(){
return new TXTCIDNameDataPanelImpl();
}
public Object createTableModelFor_TXTCIDName(){
return null;
}
public Object createSimplePanelFor_SoftHangup(){
return new SoftHangupDataPanelImpl();
}
public Object createPanelFor_SoftHangup(){
return new SoftHangupDataPanelImpl();
}
public Object createTableModelFor_SoftHangup(){
return null;
}
public Object createSimplePanelFor_SetLanguage(){
return new SetLanguageDataPanelImpl();
}
public Object createPanelFor_SetLanguage(){
return new SetLanguageDataPanelImpl();
}
public Object createTableModelFor_SetLanguage(){
return null;
}
public Object createSimplePanelFor_PrivacyManager(){
return new PrivacyManagerDataPanelImpl();
}
public Object createPanelFor_PrivacyManager(){
return new PrivacyManagerDataPanelImpl();
}
public Object createTableModelFor_PrivacyManager(){
return null;
}
public Object createSimplePanelFor_Echo(){
return new EchoDataPanelImpl();
}
public Object createPanelFor_Echo(){
return new EchoDataPanelImpl();
}
public Object createTableModelFor_Echo(){
return null;
}
public Object createSimplePanelFor_SetCallerID(){
return new SetCallerIDDataPanelImpl();
}
public Object createPanelFor_SetCallerID(){
return new SetCallerIDDataPanelImpl();
}
public Object createTableModelFor_SetCallerID(){
return null;
}
public Object createSimplePanelFor_StripMSD(){
return new StripMSDDataPanelImpl();
}
public Object createPanelFor_StripMSD(){
return new StripMSDDataPanelImpl();
}
public Object createTableModelFor_StripMSD(){
return null;
}
public Object createSimplePanelFor_SetAMAFlags(){
return new SetAMAFlagsDataPanelImpl();
}
public Object createPanelFor_SetAMAFlags(){
return new SetAMAFlagsDataPanelImpl();
}
public Object createTableModelFor_SetAMAFlags(){
return null;
}
public Object createSimplePanelFor_ImportVar(){
return new ImportVarDataPanelImpl();
}
public Object createPanelFor_ImportVar(){
return new ImportVarDataPanelImpl();
}
public Object createTableModelFor_ImportVar(){
return null;
}
public Object createSimplePanelFor_WaitMusicOnHold(){
return new WaitMusicOnHoldDataPanelImpl();
}
public Object createPanelFor_WaitMusicOnHold(){
return new WaitMusicOnHoldDataPanelImpl();
}
public Object createTableModelFor_WaitMusicOnHold(){
return null;
}
public Object createSimplePanelFor_Queue(){
return new QueueDataPanelImpl();
}
public Object createPanelFor_Queue(){
return new QueueDataPanelImpl();
}
public Object createTableModelFor_Queue(){
return null;
}
public Object createSimplePanelFor_Record(){
return new RecordDataPanelImpl();
}
public Object createPanelFor_Record(){
return new RecordDataPanelImpl();
}
public Object createTableModelFor_Record(){
return null;
}
public Object createSimplePanelFor_StripLSD(){
return new StripLSDDataPanelImpl();
}
public Object createPanelFor_StripLSD(){
return new StripLSDDataPanelImpl();
}
public Object createTableModelFor_StripLSD(){
return null;
}
public Object createSimplePanelFor_HasVoicemail(){
return new HasVoicemailDataPanelImpl();
}
public Object createPanelFor_HasVoicemail(){
return new HasVoicemailDataPanelImpl();
}
public Object createTableModelFor_HasVoicemail(){
return null;
}
public Object createSimplePanelFor_AbsoluteTimeout(){
return new AbsoluteTimeoutDataPanelImpl();
}
public Object createPanelFor_AbsoluteTimeout(){
return new AbsoluteTimeoutDataPanelImpl();
}
public Object createTableModelFor_AbsoluteTimeout(){
return null;
}
public Object createSimplePanelFor_SIPAddHeader(){
return new SIPAddHeaderDataPanelImpl();
}
public Object createPanelFor_SIPAddHeader(){
return new SIPAddHeaderDataPanelImpl();
}
public Object createTableModelFor_SIPAddHeader(){
return null;
}
public Object createSimplePanelFor_EAGI(){
return new EAGIDataPanelImpl();
}
public Object createPanelFor_EAGI(){
return new EAGIDataPanelImpl();
}
public Object createTableModelFor_EAGI(){
return null;
}
public Object createSimplePanelFor_Authenticate(){
return new AuthenticateDataPanelImpl();
}
public Object createPanelFor_Authenticate(){
return new AuthenticateDataPanelImpl();
}
public Object createTableModelFor_Authenticate(){
return null;
}
public Object createSimplePanelFor_UnpauseQueueMember(){
return new UnpauseQueueMemberDataPanelImpl();
}
public Object createPanelFor_UnpauseQueueMember(){
return new UnpauseQueueMemberDataPanelImpl();
}
public Object createTableModelFor_UnpauseQueueMember(){
return null;
}
public Object createSimplePanelFor_MacroIf(){
return new MacroIfDataPanelImpl();
}
public Object createPanelFor_MacroIf(){
return new MacroIfDataPanelImpl();
}
public Object createTableModelFor_MacroIf(){
return null;
}
public Object createSimplePanelFor_EnumLookup(){
return new EnumLookupDataPanelImpl();
}
public Object createPanelFor_EnumLookup(){
return new EnumLookupDataPanelImpl();
}
public Object createTableModelFor_EnumLookup(){
return null;
}
public Object createSimplePanelFor_SIPDtmfMode(){
return new SIPDtmfModeDataPanelImpl();
}
public Object createPanelFor_SIPDtmfMode(){
return new SIPDtmfModeDataPanelImpl();
}
public Object createTableModelFor_SIPDtmfMode(){
return null;
}
public Object createSimplePanelFor_SetCIDName(){
return new SetCIDNameDataPanelImpl();
}
public Object createPanelFor_SetCIDName(){
return new SetCIDNameDataPanelImpl();
}
public Object createTableModelFor_SetCIDName(){
return null;
}
public Object createSimplePanelFor_Cut(){
return new CutDataPanelImpl();
}
public Object createPanelFor_Cut(){
return new CutDataPanelImpl();
}
public Object createTableModelFor_Cut(){
return null;
}
public Object createSimplePanelFor_Answer(){
return new AnswerDataPanelImpl();
}
public Object createPanelFor_Answer(){
return new AnswerDataPanelImpl();
}
public Object createTableModelFor_Answer(){
return null;
}
public Object createSimplePanelFor_SayPhonetic(){
return new SayPhoneticDataPanelImpl();
}
public Object createPanelFor_SayPhonetic(){
return new SayPhoneticDataPanelImpl();
}
public Object createTableModelFor_SayPhonetic(){
return null;
}
public Object createSimplePanelFor_NoCDR(){
return new NoCDRDataPanelImpl();
}
public Object createPanelFor_NoCDR(){
return new NoCDRDataPanelImpl();
}
public Object createTableModelFor_NoCDR(){
return null;
}
public Object createSimplePanelFor_AgentLogin(){
return new AgentLoginDataPanelImpl();
}
public Object createPanelFor_AgentLogin(){
return new AgentLoginDataPanelImpl();
}
public Object createTableModelFor_AgentLogin(){
return null;
}
public Object createSimplePanelFor_While(){
return new WhileDataPanelImpl();
}
public Object createPanelFor_While(){
return new WhileDataPanelImpl();
}
public Object createTableModelFor_While(){
return null;
}
public Object createSimplePanelFor_MailboxExists(){
return new MailboxExistsDataPanelImpl();
}
public Object createPanelFor_MailboxExists(){
return new MailboxExistsDataPanelImpl();
}
public Object createTableModelFor_MailboxExists(){
return null;
}
public Object createSimplePanelFor_MeetMe(){
return new MeetMeDataPanelImpl();
}
public Object createPanelFor_MeetMe(){
return new MeetMeDataPanelImpl();
}
public Object createTableModelFor_MeetMe(){
return null;
}
public Object createSimplePanelFor_DBget(){
return new DBgetDataPanelImpl();
}
public Object createPanelFor_DBget(){
return new DBgetDataPanelImpl();
}
public Object createTableModelFor_DBget(){
return null;
}
public Object createSimplePanelFor_Ringing(){
return new RingingDataPanelImpl();
}
public Object createPanelFor_Ringing(){
return new RingingDataPanelImpl();
}
public Object createTableModelFor_Ringing(){
return null;
}
public Object createSimplePanelFor_RetryDial(){
return new RetryDialDataPanelImpl();
}
public Object createPanelFor_RetryDial(){
return new RetryDialDataPanelImpl();
}
public Object createTableModelFor_RetryDial(){
return null;
}
public Object createSimplePanelFor_Flash(){
return new FlashDataPanelImpl();
}
public Object createPanelFor_Flash(){
return new FlashDataPanelImpl();
}
public Object createTableModelFor_Flash(){
return null;
}
public Object createSimplePanelFor_SayAlpha(){
return new SayAlphaDataPanelImpl();
}
public Object createPanelFor_SayAlpha(){
return new SayAlphaDataPanelImpl();
}
public Object createTableModelFor_SayAlpha(){
return null;
}
public Object createSimplePanelFor_VoiceMailMain(){
return new VoiceMailMainDataPanelImpl();
}
public Object createPanelFor_VoiceMailMain(){
return new VoiceMailMainDataPanelImpl();
}
public Object createTableModelFor_VoiceMailMain(){
return null;
}
public Object createSimplePanelFor_Playback(){
return new PlaybackDataPanelImpl();
}
public Object createPanelFor_Playback(){
return new PlaybackDataPanelImpl();
}
public Object createTableModelFor_Playback(){
return null;
}
public Object createSimplePanelFor_DBdel(){
return new DBdelDataPanelImpl();
}
public Object createPanelFor_DBdel(){
return new DBdelDataPanelImpl();
}
public Object createTableModelFor_DBdel(){
return null;
}
public Object createSimplePanelFor_ResponseTimeout(){
return new ResponseTimeoutDataPanelImpl();
}
public Object createPanelFor_ResponseTimeout(){
return new ResponseTimeoutDataPanelImpl();
}
public Object createTableModelFor_ResponseTimeout(){
return null;
}
public Object createSimplePanelFor_SendDTMF(){
return new SendDTMFDataPanelImpl();
}
public Object createPanelFor_SendDTMF(){
return new SendDTMFDataPanelImpl();
}
public Object createTableModelFor_SendDTMF(){
return null;
}
public Object createSimplePanelFor_AlarmReceiver(){
return new AlarmReceiverDataPanelImpl();
}
public Object createPanelFor_AlarmReceiver(){
return new AlarmReceiverDataPanelImpl();
}
public Object createTableModelFor_AlarmReceiver(){
return null;
}
public Object createSimplePanelFor_Read(){
return new ReadDataPanelImpl();
}
public Object createPanelFor_Read(){
return new ReadDataPanelImpl();
}
public Object createTableModelFor_Read(){
return null;
}
public Object createSimplePanelFor_SetVar(){
return new SetVarDataPanelImpl();
}
public Object createPanelFor_SetVar(){
return new SetVarDataPanelImpl();
}
public Object createTableModelFor_SetVar(){
return null;
}
public Object createSimplePanelFor_Milliwatt(){
return new MilliwattDataPanelImpl();
}
public Object createPanelFor_Milliwatt(){
return new MilliwattDataPanelImpl();
}
public Object createTableModelFor_Milliwatt(){
return null;
}
public Object createSimplePanelFor_Random(){
return new RandomDataPanelImpl();
}
public Object createPanelFor_Random(){
return new RandomDataPanelImpl();
}
public Object createTableModelFor_Random(){
return null;
}

public Object getAdapter(Class arg0) {
	// TODO Auto-generated method stub
	return null;
}

public boolean isAdapterFor(Class arg0, Object arg1) {
	// TODO Auto-generated method stub
	return false;
}

}
