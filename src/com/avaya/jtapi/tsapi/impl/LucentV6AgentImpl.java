/*    */ package com.avaya.jtapi.tsapi.impl;
/*    */ 
/*    */ import com.avaya.jtapi.tsapi.LucentV6Agent;
/*    */ import com.avaya.jtapi.tsapi.impl.core.TSAgent;
/*    */ import com.avaya.jtapi.tsapi.util.TsapiTrace;
/*    */ 
/*    */ class LucentV6AgentImpl extends LucentAgentImpl
/*    */   implements LucentV6Agent
/*    */ {
/*    */   public boolean equals(Object obj)
/*    */   {
/* 19 */     if (obj instanceof LucentV6AgentImpl)
/*    */     {
/* 21 */       return this.tsAgent.equals(((LucentV6AgentImpl)obj).tsAgent);
/*    */     }
/*    */ 
/* 25 */     return false;
/*    */   }
/*    */ 
/*    */   LucentV6AgentImpl(TSAgent _tsAgent)
/*    */   {
/* 32 */     super(_tsAgent);
/* 33 */     TsapiTrace.traceConstruction(this, LucentV6AgentImpl.class);
/*    */   }
/*    */ 
/*    */   protected void finalize()
/*    */     throws Throwable
/*    */   {
/* 39 */     super.finalize();
/* 40 */     TsapiTrace.traceDestruction(this, LucentV6AgentImpl.class);
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Daniel Jurado\Meus documentos\My Dropbox\install\Avaya\jtapi-sdk-5.2.2.483\lib\ecsjtapia.jar
 * Qualified Name:     com.avaya.jtapi.tsapi.impl.LucentV6AgentImpl
 * JD-Core Version:    0.5.4
 */