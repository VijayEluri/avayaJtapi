package com.avaya.jtapi.tsapi;

public abstract interface ITsapiProviderEx extends ITsapiProvider
{
  public abstract String getServerID();

  public abstract void setHeartbeatInterval(short paramShort)
    throws TsapiInvalidArgumentException;
}

/* Location:           C:\Documents and Settings\Daniel Jurado\Meus documentos\My Dropbox\install\Avaya\jtapi-sdk-5.2.2.483\lib\ecsjtapia.jar
 * Qualified Name:     com.avaya.jtapi.tsapi.ITsapiProviderEx
 * JD-Core Version:    0.5.4
 */