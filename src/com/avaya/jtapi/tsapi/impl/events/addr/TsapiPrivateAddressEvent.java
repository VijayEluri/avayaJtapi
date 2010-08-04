/*    */ package com.avaya.jtapi.tsapi.impl.events.addr;
/*    */ 
/*    */ import javax.telephony.Address;
/*    */ import javax.telephony.privatedata.events.PrivateAddrEv;
/*    */ 
/*    */ public final class TsapiPrivateAddressEvent extends TsapiAddressEvent
/*    */   implements PrivateAddrEv
/*    */ {
/*    */   public int getID()
/*    */   {
/* 17 */     return 600;
/*    */   }
/*    */ 
/*    */   public TsapiPrivateAddressEvent(Address _address, int _cause, int _metaCode, Object _privateData)
/*    */   {
/* 26 */     super(_address, _cause, _metaCode, _privateData, 5);
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Daniel Jurado\Meus documentos\My Dropbox\install\Avaya\jtapi-sdk-5.2.2.483\lib\ecsjtapia.jar
 * Qualified Name:     com.avaya.jtapi.tsapi.impl.events.addr.TsapiPrivateAddressEvent
 * JD-Core Version:    0.5.4
 */