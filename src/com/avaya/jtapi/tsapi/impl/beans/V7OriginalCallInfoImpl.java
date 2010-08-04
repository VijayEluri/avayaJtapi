/*    */ package com.avaya.jtapi.tsapi.impl.beans;
/*    */ 
/*    */ import com.avaya.jtapi.tsapi.V7DeviceHistoryEntry;
/*    */ import com.avaya.jtapi.tsapi.V7OriginalCallInfo;
/*    */ 
/*    */ public final class V7OriginalCallInfoImpl extends V5OriginalCallInfoImpl
/*    */   implements V7OriginalCallInfo
/*    */ {
/*    */   private V7DeviceHistoryEntry[] deviceHistory;
/*    */ 
/*    */   public V7DeviceHistoryEntry[] getDeviceHistory()
/*    */   {
/* 21 */     return this.deviceHistory;
/*    */   }
/*    */ 
/*    */   public boolean hasDeviceHistory()
/*    */   {
/* 26 */     return this.deviceHistory != null;
/*    */   }
/*    */ 
/*    */   public void setDeviceHistory(V7DeviceHistoryEntry[] _deviceHistory)
/*    */   {
/* 31 */     this.deviceHistory = _deviceHistory;
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Daniel Jurado\Meus documentos\My Dropbox\install\Avaya\jtapi-sdk-5.2.2.483\lib\ecsjtapia.jar
 * Qualified Name:     com.avaya.jtapi.tsapi.impl.beans.V7OriginalCallInfoImpl
 * JD-Core Version:    0.5.4
 */