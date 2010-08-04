/*     */ package com.avaya.jtapi.tsapi.impl;
/*     */ 
/*     */ import com.avaya.jtapi.tsapi.ConnectionID;
/*     */ import com.avaya.jtapi.tsapi.ITsapiConnIDPrivate;
/*     */ import com.avaya.jtapi.tsapi.ITsapiConnection;
/*     */ import com.avaya.jtapi.tsapi.LucentConnection;
/*     */ import com.avaya.jtapi.tsapi.LucentTerminalConnection;
/*     */ import com.avaya.jtapi.tsapi.LucentV6Connection;
/*     */ import com.avaya.jtapi.tsapi.TsapiInvalidArgumentException;
/*     */ import com.avaya.jtapi.tsapi.TsapiInvalidPartyException;
/*     */ import com.avaya.jtapi.tsapi.TsapiInvalidStateException;
/*     */ import com.avaya.jtapi.tsapi.TsapiMethodNotSupportedException;
/*     */ import com.avaya.jtapi.tsapi.TsapiPlatformException;
/*     */ import com.avaya.jtapi.tsapi.TsapiPrivate;
/*     */ import com.avaya.jtapi.tsapi.TsapiPrivilegeViolationException;
/*     */ import com.avaya.jtapi.tsapi.TsapiResourceUnavailableException;
/*     */ import com.avaya.jtapi.tsapi.UserToUserInfo;
/*     */ import com.avaya.jtapi.tsapi.csta1.CSTAConnectionID;
/*     */ import com.avaya.jtapi.tsapi.csta1.CSTAPrivate;
/*     */ import com.avaya.jtapi.tsapi.csta1.LucentClearConnection;
/*     */ import com.avaya.jtapi.tsapi.csta1.LucentUserToUserInfo;
/*     */ import com.avaya.jtapi.tsapi.csta1.LucentV6ClearConnection;
/*     */ import com.avaya.jtapi.tsapi.impl.core.TSConnection;
/*     */ import com.avaya.jtapi.tsapi.impl.core.TSProviderImpl;
/*     */ import com.avaya.jtapi.tsapi.impl.core.TSTrunk;
/*     */ import com.avaya.jtapi.tsapi.impl.core.TsapiPromoter;
/*     */ import com.avaya.jtapi.tsapi.util.TsapiTrace;
/*     */ import javax.telephony.Address;
/*     */ import javax.telephony.Connection;
/*     */ import javax.telephony.InvalidArgumentException;
/*     */ import javax.telephony.PlatformException;
/*     */ import javax.telephony.Terminal;
/*     */ import javax.telephony.callcenter.CallCenterTrunk;
/*     */ import javax.telephony.capabilities.ConnectionCapabilities;
/*     */ import javax.telephony.privatedata.PrivateData;
/*     */ 
/*     */ class TsapiConnection
/*     */   implements ITsapiConnection, PrivateData, ITsapiConnIDPrivate, LucentV6Connection
/*     */ {
/*     */   TSConnection tsConnection;
/* 565 */   CSTAPrivate privData = null;
/*     */ 
/*     */   public final int getState()
/*     */   {
/*  55 */     TsapiTrace.traceEntry("getState[]", this);
/*     */     try
/*     */     {
/*  58 */       int state = this.tsConnection.getConnectionState();
/*  59 */       TsapiTrace.traceExit("getState[]", this);
/*  60 */       return state;
/*     */     }
/*     */     finally
/*     */     {
/*  64 */       this.privData = null; }  } 
/*     */   // ERROR //
/*     */   public final javax.telephony.Call getCall() { return null;}// Byte code:
/*     */     //   0: ldc 7
/*     */     //   2: aload_0
/*     */     //   3: invokestatic 2	com/avaya/jtapi/tsapi/util/TsapiTrace:traceEntry	(Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield 3	com/avaya/jtapi/tsapi/impl/TsapiConnection:tsConnection	Lcom/avaya/jtapi/tsapi/impl/core/TSConnection;
/*     */     //   10: invokevirtual 8	com/avaya/jtapi/tsapi/impl/core/TSConnection:getTSCall	()Lcom/avaya/jtapi/tsapi/impl/core/TSCall;
/*     */     //   13: astore_1
/*     */     //   14: aload_1
/*     */     //   15: ifnull +25 -> 40
/*     */     //   18: aload_1
/*     */     //   19: iconst_0
/*     */     //   20: invokestatic 9	com/avaya/jtapi/tsapi/impl/TsapiCreateObject:getTsapiObject	(Ljava/lang/Object;Z)Ljava/lang/Object;
/*     */     //   23: checkcast 10	javax/telephony/Call
/*     */     //   26: astore_2
/*     */     //   27: ldc 7
/*     */     //   29: aload_0
/*     */     //   30: invokestatic 5	com/avaya/jtapi/tsapi/util/TsapiTrace:traceExit	(Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   33: aload_2
/*     */     //   34: astore_3
/*     */     //   35: jsr +25 -> 60
/*     */     //   38: aload_3
/*     */     //   39: areturn
/*     */     //   40: new 11	com/avaya/jtapi/tsapi/TsapiPlatformException
/*     */     //   43: dup
/*     */     //   44: iconst_4
/*     */     //   45: iconst_0
/*     */     //   46: ldc 12
/*     */     //   48: invokespecial 13	com/avaya/jtapi/tsapi/TsapiPlatformException:<init>	(IILjava/lang/String;)V
/*     */     //   51: athrow
/*     */     //   52: astore 4
/*     */     //   54: jsr +6 -> 60
/*     */     //   57: aload 4
/*     */     //   59: athrow
/*     */     //   60: astore 5
/*     */     //   62: aload_0
/*     */     //   63: aconst_null
/*     */     //   64: putfield 6	com/avaya/jtapi/tsapi/impl/TsapiConnection:privData	Lcom/avaya/jtapi/tsapi/csta1/CSTAPrivate;
/*     */     //   67: ret 5
/*     */     //
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   6	38	52	finally
/*     */     //   40	57	52	finally } 
/*     */   // ERROR //
/*     */   public final Address getAddress() { return null;}// Byte code:
/*     */     //   0: ldc 14
/*     */     //   2: aload_0
/*     */     //   3: invokestatic 2	com/avaya/jtapi/tsapi/util/TsapiTrace:traceEntry	(Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield 3	com/avaya/jtapi/tsapi/impl/TsapiConnection:tsConnection	Lcom/avaya/jtapi/tsapi/impl/core/TSConnection;
/*     */     //   10: invokevirtual 15	com/avaya/jtapi/tsapi/impl/core/TSConnection:getTSDevice	()Lcom/avaya/jtapi/tsapi/impl/core/TSDevice;
/*     */     //   13: astore_1
/*     */     //   14: aload_1
/*     */     //   15: ifnull +25 -> 40
/*     */     //   18: aload_1
/*     */     //   19: iconst_1
/*     */     //   20: invokestatic 9	com/avaya/jtapi/tsapi/impl/TsapiCreateObject:getTsapiObject	(Ljava/lang/Object;Z)Ljava/lang/Object;
/*     */     //   23: checkcast 16	javax/telephony/Address
/*     */     //   26: astore_2
/*     */     //   27: ldc 14
/*     */     //   29: aload_0
/*     */     //   30: invokestatic 5	com/avaya/jtapi/tsapi/util/TsapiTrace:traceExit	(Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   33: aload_2
/*     */     //   34: astore_3
/*     */     //   35: jsr +25 -> 60
/*     */     //   38: aload_3
/*     */     //   39: areturn
/*     */     //   40: new 11	com/avaya/jtapi/tsapi/TsapiPlatformException
/*     */     //   43: dup
/*     */     //   44: iconst_4
/*     */     //   45: iconst_0
/*     */     //   46: ldc 17
/*     */     //   48: invokespecial 13	com/avaya/jtapi/tsapi/TsapiPlatformException:<init>	(IILjava/lang/String;)V
/*     */     //   51: athrow
/*     */     //   52: astore 4
/*     */     //   54: jsr +6 -> 60
/*     */     //   57: aload 4
/*     */     //   59: athrow
/*     */     //   60: astore 5
/*     */     //   62: aload_0
/*     */     //   63: aconst_null
/*     */     //   64: putfield 6	com/avaya/jtapi/tsapi/impl/TsapiConnection:privData	Lcom/avaya/jtapi/tsapi/csta1/CSTAPrivate;
/*     */     //   67: ret 5
/*     */     //
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   6	38	52	finally
/*     */     //   40	57	52	finally } 
/*     */   // ERROR //
/*     */   public final javax.telephony.TerminalConnection[] getTerminalConnections() { return null;}// Byte code:
/*     */     //   0: ldc 18
/*     */     //   2: aload_0
/*     */     //   3: invokestatic 2	com/avaya/jtapi/tsapi/util/TsapiTrace:traceEntry	(Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield 3	com/avaya/jtapi/tsapi/impl/TsapiConnection:tsConnection	Lcom/avaya/jtapi/tsapi/impl/core/TSConnection;
/*     */     //   10: invokevirtual 19	com/avaya/jtapi/tsapi/impl/core/TSConnection:getTSTermConns	()Ljava/util/Vector;
/*     */     //   13: astore_1
/*     */     //   14: aload_1
/*     */     //   15: ifnonnull +16 -> 31
/*     */     //   18: ldc 18
/*     */     //   20: aload_0
/*     */     //   21: invokestatic 5	com/avaya/jtapi/tsapi/util/TsapiTrace:traceExit	(Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   24: aconst_null
/*     */     //   25: astore_2
/*     */     //   26: jsr +109 -> 135
/*     */     //   29: aload_2
/*     */     //   30: areturn
/*     */     //   31: aload_1
/*     */     //   32: dup
/*     */     //   33: astore_2
/*     */     //   34: monitorenter
/*     */     //   35: aload_1
/*     */     //   36: invokevirtual 20	java/util/Vector:size	()I
/*     */     //   39: ifne +18 -> 57
/*     */     //   42: ldc 18
/*     */     //   44: aload_0
/*     */     //   45: invokestatic 5	com/avaya/jtapi/tsapi/util/TsapiTrace:traceExit	(Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   48: aconst_null
/*     */     //   49: astore_3
/*     */     //   50: aload_2
/*     */     //   51: monitorexit
/*     */     //   52: jsr +83 -> 135
/*     */     //   55: aload_3
/*     */     //   56: areturn
/*     */     //   57: aload_1
/*     */     //   58: invokevirtual 20	java/util/Vector:size	()I
/*     */     //   61: anewarray 21	javax/telephony/TerminalConnection
/*     */     //   64: astore_3
/*     */     //   65: iconst_0
/*     */     //   66: istore 4
/*     */     //   68: iload 4
/*     */     //   70: aload_1
/*     */     //   71: invokevirtual 20	java/util/Vector:size	()I
/*     */     //   74: if_icmpge +29 -> 103
/*     */     //   77: aload_3
/*     */     //   78: iload 4
/*     */     //   80: aload_1
/*     */     //   81: iload 4
/*     */     //   83: invokevirtual 22	java/util/Vector:elementAt	(I)Ljava/lang/Object;
/*     */     //   86: checkcast 23	com/avaya/jtapi/tsapi/impl/core/TSConnection
/*     */     //   89: iconst_0
/*     */     //   90: invokestatic 9	com/avaya/jtapi/tsapi/impl/TsapiCreateObject:getTsapiObject	(Ljava/lang/Object;Z)Ljava/lang/Object;
/*     */     //   93: checkcast 21	javax/telephony/TerminalConnection
/*     */     //   96: aastore
/*     */     //   97: iinc 4 1
/*     */     //   100: goto -32 -> 68
/*     */     //   103: ldc 18
/*     */     //   105: aload_0
/*     */     //   106: invokestatic 5	com/avaya/jtapi/tsapi/util/TsapiTrace:traceExit	(Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   109: aload_3
/*     */     //   110: astore 4
/*     */     //   112: aload_2
/*     */     //   113: monitorexit
/*     */     //   114: jsr +21 -> 135
/*     */     //   117: aload 4
/*     */     //   119: areturn
/*     */     //   120: astore 5
/*     */     //   122: aload_2
/*     */     //   123: monitorexit
/*     */     //   124: aload 5
/*     */     //   126: athrow
/*     */     //   127: astore 6
/*     */     //   129: jsr +6 -> 135
/*     */     //   132: aload 6
/*     */     //   134: athrow
/*     */     //   135: astore 7
/*     */     //   137: aload_0
/*     */     //   138: aconst_null
/*     */     //   139: putfield 6	com/avaya/jtapi/tsapi/impl/TsapiConnection:privData	Lcom/avaya/jtapi/tsapi/csta1/CSTAPrivate;
/*     */     //   142: ret 7
/*     */     //
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   35	52	120	finally
/*     */     //   57	114	120	finally
/*     */     //   120	124	120	finally
/*     */     //   6	29	127	finally
/*     */     //   31	55	127	finally
/*     */     //   57	117	127	finally
/*     */     //   120	132	127	finally } 
/* 169 */   public final void disconnect() throws TsapiPrivilegeViolationException, TsapiResourceUnavailableException, TsapiMethodNotSupportedException, TsapiInvalidStateException { TsapiTrace.traceEntry("disconnect[]", this);
/*     */     try
/*     */     {
/* 172 */       this.tsConnection.disconnect(this.privData);
/*     */     }
/*     */     finally
/*     */     {
/* 176 */       this.privData = null;
/*     */     }
/* 178 */     TsapiTrace.traceExit("disconnect[]", this); }
/*     */ 
/*     */ 
/*     */   public final void disconnect(short dropResource, UserToUserInfo userInfo)
/*     */     throws TsapiPrivilegeViolationException, TsapiResourceUnavailableException, TsapiMethodNotSupportedException, TsapiInvalidStateException
/*     */   {
/* 185 */     TsapiTrace.traceEntry("disconnect[short dropResource, UserToUserInfo userInfo]", this);
/* 186 */     LucentClearConnection lcc = null;
/* 187 */     LucentUserToUserInfo asn_uui = TsapiPromoter.demoteUserToUserInfo(userInfo);
/*     */ 
/* 190 */     if (this.tsConnection.getTSProviderImpl().isLucentV6())
/*     */     {
/* 192 */       lcc = new LucentV6ClearConnection(dropResource, asn_uui);
/*     */     }
/*     */     else
/*     */     {
/* 196 */       lcc = new LucentClearConnection(dropResource, asn_uui);
/*     */     }
/* 198 */     this.privData = lcc.makeTsapiPrivate();
/* 199 */     disconnect();
/* 200 */     TsapiTrace.traceExit("disconnect[short dropResource, UserToUserInfo userInfo]", this);
/*     */   }
/*     */ 
/*     */   public final ConnectionCapabilities getCapabilities()
/*     */   {
/* 209 */     TsapiTrace.traceEntry("getCapabilities[]", this);
/*     */     try
/*     */     {
/* 212 */       ConnectionCapabilities caps = this.tsConnection.getTsapiConnCapabilities();
/* 213 */       TsapiTrace.traceExit("getCapabilities[]", this);
/* 214 */       return caps;
/*     */     }
/*     */     finally
/*     */     {
/* 218 */       this.privData = null;
/*     */     }
/*     */   }
/*     */ 
/*     */   public final ConnectionCapabilities getConnectionCapabilities(Terminal terminal, Address address)
/*     */     throws InvalidArgumentException, PlatformException
/*     */   {
/* 227 */     TsapiTrace.traceEntry("getConnectionCapabilities[Terminal terminal, Address address]", this);
/* 228 */     ConnectionCapabilities caps = getCapabilities();
/* 229 */     TsapiTrace.traceExit("getConnectionCapabilities[Terminal terminal, Address address]", this);
/* 230 */     return caps;
/*     */   }
/*     */ 
/*     */   public final int getCallControlState()
/*     */   {
/* 239 */     TsapiTrace.traceEntry("getCallControlState[]", this);
/*     */     try
/*     */     {
/* 242 */       int i = this.tsConnection.getCallControlConnectionState();
/* 243 */       TsapiTrace.traceExit("getCallControlState[]", this);
/* 244 */       return i;
/*     */     }
/*     */     finally
/*     */     {
/* 248 */       this.privData = null;
/*     */     }
/*     */   }
/*     */ 
/*     */   public final void accept()
/*     */     throws TsapiInvalidStateException, TsapiMethodNotSupportedException, TsapiPrivilegeViolationException, TsapiResourceUnavailableException
/*     */   {
/* 258 */     TsapiTrace.traceEntry("accept[]", this);
/*     */     try
/*     */     {
/* 261 */       throw new TsapiMethodNotSupportedException(4, 0, "unsupported by implementation");
/*     */     }
/*     */     finally
/*     */     {
/* 265 */       this.privData = null;
/*     */     }
/*     */   }
/*     */ 
/*     */   public final void reject()
/*     */     throws TsapiInvalidStateException, TsapiMethodNotSupportedException, TsapiPrivilegeViolationException, TsapiResourceUnavailableException
/*     */   {
/* 276 */     TsapiTrace.traceEntry("reject[]", this);
/*     */     try
/*     */     {
/* 279 */       throw new TsapiMethodNotSupportedException(4, 0, "unsupported by implementation");
/*     */     }
/*     */     finally
/*     */     {
/* 283 */       this.privData = null;
/*     */     }
/*     */   }
/*     */ 
/*     */   public final Connection redirect(String destinationAddress)
/*     */     throws TsapiInvalidStateException, TsapiInvalidPartyException, TsapiMethodNotSupportedException, TsapiPrivilegeViolationException, TsapiResourceUnavailableException
/*     */   {
/* 294 */     TsapiTrace.traceEntry("redirect[String destinationAddress]", this);
/*     */     try
/*     */     {
/* 297 */       TSConnection conn = this.tsConnection.redirect(destinationAddress, this.privData);
/*     */       Connection connexion;
/* 298 */       if (conn != null)
/*     */       {
/* 300 */         connexion = (Connection)TsapiCreateObject.getTsapiObject(conn, true);
/* 301 */         TsapiTrace.traceExit("redirect[String destinationAddress]", this);
/* 302 */         return connexion;
/*     */       }
/*     */ 
/* 306 */       TsapiTrace.traceExit("redirect[String destinationAddress]", this);
/* 307 */       return null;
/*     */     }
/*     */     finally
/*     */     {
/* 312 */       this.privData = null;
/*     */     }
/*     */   }
/*     */ 
/*     */   public final void listenHold(LucentTerminalConnection partyToHold)
/*     */     throws TsapiInvalidStateException, TsapiInvalidArgumentException, TsapiMethodNotSupportedException, TsapiPrivilegeViolationException, TsapiResourceUnavailableException
/*     */   {
/* 326 */     TsapiTrace.traceEntry("listenHold[LucentTerminalConnection partyToHold]", this);
/*     */     try
/*     */     {
/* 329 */       TSConnection party = (partyToHold == null) ? null : ((TsapiTerminalConnection)partyToHold).tsConnection;
/*     */ 
/* 331 */       this.tsConnection.listenHold(party);
/*     */     }
/*     */     finally
/*     */     {
/* 335 */       this.privData = null;
/*     */     }
/* 337 */     TsapiTrace.traceExit("listenHold[LucentTerminalConnection partyToHold]", this);
/*     */   }
/*     */ 
/*     */   public final void listenUnhold(LucentTerminalConnection partyToUnhold)
/*     */     throws TsapiInvalidStateException, TsapiInvalidArgumentException, TsapiMethodNotSupportedException, TsapiPrivilegeViolationException, TsapiResourceUnavailableException
/*     */   {
/* 350 */     TsapiTrace.traceEntry("listenUnhold[LucentTerminalConnection partyToUnhold]", this);
/*     */     try
/*     */     {
/* 353 */       TSConnection party = (partyToUnhold == null) ? null : ((TsapiTerminalConnection)partyToUnhold).tsConnection;
/*     */ 
/* 355 */       this.tsConnection.listenUnhold(party);
/*     */     }
/*     */     finally
/*     */     {
/* 359 */       this.privData = null;
/*     */     }
/* 361 */     TsapiTrace.traceExit("listenUnhold[LucentTerminalConnection partyToUnhold]", this);
/*     */   }
/*     */ 
/*     */   public final void listenHold(LucentConnection partyToHold)
/*     */     throws TsapiInvalidStateException, TsapiInvalidArgumentException, TsapiMethodNotSupportedException, TsapiPrivilegeViolationException, TsapiResourceUnavailableException
/*     */   {
/* 374 */     TsapiTrace.traceEntry("listenHold[LucentConnection partyToHold]", this);
/*     */     try
/*     */     {
/* 377 */       TSConnection party = (partyToHold == null) ? null : ((TsapiConnection)partyToHold).tsConnection;
/*     */ 
/* 379 */       this.tsConnection.listenHold(party);
/*     */     }
/*     */     finally
/*     */     {
/* 383 */       this.privData = null;
/*     */     }
/* 385 */     TsapiTrace.traceExit("listenHold[LucentConnection partyToHold]", this);
/*     */   }
/*     */ 
/*     */   public final void listenUnhold(LucentConnection partyToUnhold)
/*     */     throws TsapiInvalidStateException, TsapiInvalidArgumentException, TsapiMethodNotSupportedException, TsapiPrivilegeViolationException, TsapiResourceUnavailableException
/*     */   {
/* 398 */     TsapiTrace.traceEntry("listenUnhold[LucentConnection partyToUnhold]", this);
/*     */     try
/*     */     {
/* 401 */       TSConnection party = (partyToUnhold == null) ? null : ((TsapiConnection)partyToUnhold).tsConnection;
/*     */ 
/* 403 */       this.tsConnection.listenUnhold(party);
/*     */     }
/*     */     finally
/*     */     {
/* 407 */       this.privData = null;
/*     */     }
/* 409 */     TsapiTrace.traceExit("listenUnhold[LucentConnection partyToUnhold]", this);
/*     */   }
/*     */ 
/*     */   public final void addToAddress(String additionalAddress)
/*     */     throws TsapiInvalidStateException, TsapiMethodNotSupportedException, TsapiPrivilegeViolationException, TsapiResourceUnavailableException
/*     */   {
/* 418 */     TsapiTrace.traceEntry("addToAddress[String additionalAddress]", this);
/*     */     try
/*     */     {
/* 421 */       throw new TsapiMethodNotSupportedException(4, 0, "unsupported by implementation");
/*     */     }
/*     */     finally
/*     */     {
/* 425 */       this.privData = null;
/*     */     }
/*     */   }
/*     */ 
/*     */   public final Connection park(String destAddress)
/*     */     throws TsapiInvalidStateException, TsapiMethodNotSupportedException, TsapiPrivilegeViolationException, TsapiInvalidPartyException, TsapiResourceUnavailableException
/*     */   {
/* 436 */     TsapiTrace.traceEntry("park[String destAddress]", this);
/*     */     try
/*     */     {
/* 439 */       throw new TsapiMethodNotSupportedException(4, 0, "unsupported by implementation");
/*     */     }
/*     */     finally
/*     */     {
/* 443 */       this.privData = null;
/*     */     }
/*     */   }
/*     */ 
/*     */   public final CallCenterTrunk getTrunk()
/*     */   {
/* 453 */     TsapiTrace.traceEntry("getTrunk[]", this);
/*     */     try
/*     */     {
/* 456 */       TSTrunk tsTrunk = this.tsConnection.getTSTrunk();
/*     */       CallCenterTrunk trunk;
/* 457 */       if (tsTrunk != null)
/*     */       {
/* 459 */         trunk = (CallCenterTrunk)TsapiCreateObject.getTsapiObject(tsTrunk, false);
/* 460 */         TsapiTrace.traceExit("getTrunk[]", this);
/* 461 */         return trunk;
/*     */       }
/*     */ 
/* 465 */       TsapiTrace.traceExit("getTrunk[]", this);
/* 466 */       return null;
/*     */     }
/*     */     finally
/*     */     {
/* 471 */       this.privData = null;
/*     */     }
/*     */   }
/*     */ 
/*     */   public final void setPrivateData(Object data)
/*     */   {
/* 478 */     TsapiTrace.traceEntry("setPrivateData[Object data]", this);
/*     */     try
/*     */     {
/* 481 */       this.privData = TsapiPromoter.demoteTsapiPrivate((TsapiPrivate)data);
/*     */     }
/*     */     catch (ClassCastException e)
/*     */     {
/* 485 */       throw new TsapiPlatformException(3, 0, "data is not a TsapiPrivate object");
/*     */     }
/*     */ 
/* 488 */     TsapiTrace.traceExit("setPrivateData[Object data]", this);
/*     */   }
/*     */ 
/*     */   public final Object getPrivateData()
/*     */   {
/* 493 */     TsapiTrace.traceEntry("getPrivateData[]", this);
/* 494 */     Object obj = TsapiPromoter.promoteTsapiPrivate((CSTAPrivate)this.tsConnection.getConnPrivateData());
/* 495 */     TsapiTrace.traceExit("getPrivateData[]", this);
/* 496 */     return obj;
/*     */   }
/*     */ 
/*     */   public final Object sendPrivateData(Object data)
/*     */   {
/* 501 */     TsapiTrace.traceEntry("sendPrivateData[Object data]", this);
/*     */     try
/*     */     {
/* 504 */       Object obj = this.tsConnection.sendPrivateData(TsapiPromoter.demoteTsapiPrivate((TsapiPrivate)data));
/*     */ 
/* 506 */       TsapiTrace.traceExit("sendPrivateData[Object data]", this);
/* 507 */       return obj;
/*     */     }
/*     */     catch (ClassCastException e)
/*     */     {
/* 511 */       throw new TsapiPlatformException(3, 0, "data is not a TsapiPrivate object");
/*     */     }
/*     */   }
/*     */ 
/*     */   public final ConnectionID getTsapiConnectionID()
/*     */   {
/* 518 */     TsapiTrace.traceEntry("getTsapiConnectionID[]", this);
/*     */     try
/*     */     {
/* 521 */       CSTAConnectionID cstaConnectionID = this.tsConnection.getConnID();
/* 522 */       ConnectionID id = new ConnectionID(cstaConnectionID.getCallID(), cstaConnectionID.getDeviceID(), (short)cstaConnectionID.getDevIDType());
/*     */ 
/* 525 */       TsapiTrace.traceExit("getTsapiConnectionID[]", this);
/* 526 */       return id;
/*     */     }
/*     */     finally
/*     */     {
/* 530 */       this.privData = null;
/*     */     }
/*     */   }
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 536 */     return this.tsConnection.hashCode();
/*     */   }
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 542 */     if (obj instanceof TsapiConnection)
/*     */     {
/* 544 */       return this.tsConnection.equals(((TsapiConnection)obj).tsConnection);
/*     */     }
/*     */ 
/* 548 */     return false;
/*     */   }
/*     */ 
/*     */   TsapiConnection(TSConnection _tsConnection)
/*     */   {
/* 570 */     this.tsConnection = _tsConnection;
/* 571 */     TsapiTrace.traceConstruction(this, TsapiConnection.class);
/*     */   }
/*     */ 
/*     */   protected void finalize()
/*     */     throws Throwable
/*     */   {
/* 577 */     super.finalize();
/* 578 */     TsapiTrace.traceDestruction(this, TsapiConnection.class);
/*     */   }
/*     */ 
/*     */   TSConnection getTSConnection()
/*     */   {
/* 586 */     TsapiTrace.traceEntry("getTSConnection[]", this);
/* 587 */     TsapiTrace.traceExit("getTSConnection[]", this);
/* 588 */     return this.tsConnection;
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Daniel Jurado\Meus documentos\My Dropbox\install\Avaya\jtapi-sdk-5.2.2.483\lib\ecsjtapia.jar
 * Qualified Name:     com.avaya.jtapi.tsapi.impl.TsapiConnection
 * JD-Core Version:    0.5.4
 */