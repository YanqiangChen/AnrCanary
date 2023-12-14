/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.tencent.matrix.lifecycle.supervisor;
public interface ISupervisorProxy extends android.os.IInterface
{
  /** Default implementation for ISupervisorProxy. */
  public static class Default implements com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy
  {
    @Override public void registerSubordinate(com.tencent.matrix.lifecycle.supervisor.ProcessToken[] tokens, com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy subordinateProxy) throws android.os.RemoteException
    {
    }
    @Override public void onStateChanged(com.tencent.matrix.lifecycle.supervisor.ProcessToken token) throws android.os.RemoteException
    {
    }
    @Override public void onSceneChanged(java.lang.String scene) throws android.os.RemoteException
    {
    }
    @Override public void onProcessKilled(com.tencent.matrix.lifecycle.supervisor.ProcessToken token) throws android.os.RemoteException
    {
    }
    @Override public void onProcessRescuedFromKill(com.tencent.matrix.lifecycle.supervisor.ProcessToken token) throws android.os.RemoteException
    {
    }
    @Override public void onProcessKillCanceled(com.tencent.matrix.lifecycle.supervisor.ProcessToken token) throws android.os.RemoteException
    {
    }
    @Override public java.lang.String getRecentScene() throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy
  {
    private static final java.lang.String DESCRIPTOR = "com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy interface,
     * generating a proxy if needed.
     */
    public static com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy))) {
        return ((com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy)iin);
      }
      return new com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_registerSubordinate:
        {
          data.enforceInterface(descriptor);
          com.tencent.matrix.lifecycle.supervisor.ProcessToken[] _arg0;
          _arg0 = data.createTypedArray(com.tencent.matrix.lifecycle.supervisor.ProcessToken.CREATOR);
          com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy _arg1;
          _arg1 = com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy.Stub.asInterface(data.readStrongBinder());
          this.registerSubordinate(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onStateChanged:
        {
          data.enforceInterface(descriptor);
          com.tencent.matrix.lifecycle.supervisor.ProcessToken _arg0;
          if ((0!=data.readInt())) {
            _arg0 = com.tencent.matrix.lifecycle.supervisor.ProcessToken.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.onStateChanged(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onSceneChanged:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.onSceneChanged(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onProcessKilled:
        {
          data.enforceInterface(descriptor);
          com.tencent.matrix.lifecycle.supervisor.ProcessToken _arg0;
          if ((0!=data.readInt())) {
            _arg0 = com.tencent.matrix.lifecycle.supervisor.ProcessToken.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.onProcessKilled(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onProcessRescuedFromKill:
        {
          data.enforceInterface(descriptor);
          com.tencent.matrix.lifecycle.supervisor.ProcessToken _arg0;
          if ((0!=data.readInt())) {
            _arg0 = com.tencent.matrix.lifecycle.supervisor.ProcessToken.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.onProcessRescuedFromKill(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_onProcessKillCanceled:
        {
          data.enforceInterface(descriptor);
          com.tencent.matrix.lifecycle.supervisor.ProcessToken _arg0;
          if ((0!=data.readInt())) {
            _arg0 = com.tencent.matrix.lifecycle.supervisor.ProcessToken.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.onProcessKillCanceled(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getRecentScene:
        {
          data.enforceInterface(descriptor);
          java.lang.String _result = this.getRecentScene();
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void registerSubordinate(com.tencent.matrix.lifecycle.supervisor.ProcessToken[] tokens, com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy subordinateProxy) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedArray(tokens, 0);
          _data.writeStrongBinder((((subordinateProxy!=null))?(subordinateProxy.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_registerSubordinate, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().registerSubordinate(tokens, subordinateProxy);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onStateChanged(com.tencent.matrix.lifecycle.supervisor.ProcessToken token) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((token!=null)) {
            _data.writeInt(1);
            token.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onStateChanged, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onStateChanged(token);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onSceneChanged(java.lang.String scene) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(scene);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onSceneChanged, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onSceneChanged(scene);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onProcessKilled(com.tencent.matrix.lifecycle.supervisor.ProcessToken token) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((token!=null)) {
            _data.writeInt(1);
            token.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onProcessKilled, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onProcessKilled(token);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onProcessRescuedFromKill(com.tencent.matrix.lifecycle.supervisor.ProcessToken token) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((token!=null)) {
            _data.writeInt(1);
            token.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onProcessRescuedFromKill, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onProcessRescuedFromKill(token);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onProcessKillCanceled(com.tencent.matrix.lifecycle.supervisor.ProcessToken token) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((token!=null)) {
            _data.writeInt(1);
            token.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onProcessKillCanceled, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onProcessKillCanceled(token);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public java.lang.String getRecentScene() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getRecentScene, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getRecentScene();
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy sDefaultImpl;
    }
    static final int TRANSACTION_registerSubordinate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_onSceneChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_onProcessKilled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_onProcessRescuedFromKill = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_onProcessKillCanceled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_getRecentScene = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    public static boolean setDefaultImpl(com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy impl) {
      if (Stub.Proxy.sDefaultImpl == null && impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public void registerSubordinate(com.tencent.matrix.lifecycle.supervisor.ProcessToken[] tokens, com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy subordinateProxy) throws android.os.RemoteException;
  public void onStateChanged(com.tencent.matrix.lifecycle.supervisor.ProcessToken token) throws android.os.RemoteException;
  public void onSceneChanged(java.lang.String scene) throws android.os.RemoteException;
  public void onProcessKilled(com.tencent.matrix.lifecycle.supervisor.ProcessToken token) throws android.os.RemoteException;
  public void onProcessRescuedFromKill(com.tencent.matrix.lifecycle.supervisor.ProcessToken token) throws android.os.RemoteException;
  public void onProcessKillCanceled(com.tencent.matrix.lifecycle.supervisor.ProcessToken token) throws android.os.RemoteException;
  public java.lang.String getRecentScene() throws android.os.RemoteException;
}
