/*    */ package com.avaya.jtapi.tsapi.impl.events.conn;
/*    */ 
/*    */ import com.avaya.jtapi.tsapi.LucentV5CallInfo;
/*    */ 
/*    */ public final class LucentV5ConnQueuedEventImpl extends LucentConnQueuedEventImpl
/*    */   implements LucentV5CallInfo
/*    */ {
/*    */   public LucentV5ConnQueuedEventImpl(ConnEventParams params, int numberQueued)
/*    */   {
/* 16 */     super(params, numberQueued);
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Daniel Jurado\Meus documentos\My Dropbox\install\Avaya\jtapi-sdk-5.2.2.483\lib\ecsjtapia.jar
 * Qualified Name:     com.avaya.jtapi.tsapi.impl.events.conn.LucentV5ConnQueuedEventImpl
 * JD-Core Version:    0.5.4
 */