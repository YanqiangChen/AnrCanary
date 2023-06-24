/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.tencent.matrix.lifecycle.supervisor;
public interface ISubordinateProxy extends android.os.IInterface
{
  /** Default implementation for ISubordinateProxy. */
  public static class Default implements com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy
  {
    @Override public void dispatchState(java.lang.String scene, java.lang.String stateName, boolean state) throws android.os.RemoteException
    {
    }
    @Override public void dispatchKill(java.lang.String scene, java.lang.String targetProcess, int targetPid) throws android.os.RemoteException
    {
    }
    @Override public void dispatchDeath(java.lang.String scene, java.lang.String targetProcess, int targetPid, boolean isLruKill) throws android.os.RemoteException
    {
    }
    @Override public com.tencent.matrix.util.MemInfo getMemInfo() throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy
  {
    private static final java.lang.String DESCRIPTOR = "com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy interface,
     * generating a proxy if needed.
     */
    public static com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy))) {
        return ((com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy)iin);
      }
      return new com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy.Stub.Proxy(obj);
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
        case TRANSACTION_dispatchState:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          boolean _arg2;
          _arg2 = (0!=data.readInt());
          this.dispatchState(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_dispatchKill:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          this.dispatchKill(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_dispatchDeath:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          boolean _arg3;
          _arg3 = (0!=data.readInt());
          this.dispatchDeath(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getMemInfo:
        {
          data.enforceInterface(descriptor);
          com.tencent.matrix.util.MemInfo _result = this.getMemInfo();
          reply.writeNoException();
          if ((_result!=null)) {
            reply.writeInt(1);
            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy
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
      @Override public void dispatchState(java.lang.String scene, java.lang.String stateName, boolean state) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(scene);
          _data.writeString(stateName);
          _data.writeInt(((state)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_dispatchState, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().dispatchState(scene, stateName, state);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void dispatchKill(java.lang.String scene, java.lang.String targetProcess, int targetPid) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(scene);
          _data.writeString(targetProcess);
          _data.writeInt(targetPid);
          boolean _status = mRemote.transact(Stub.TRANSACTION_dispatchKill, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().dispatchKill(scene, targetProcess, targetPid);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void dispatchDeath(java.lang.String scene, java.lang.String targetProcess, int targetPid, boolean isLruKill) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(scene);
          _data.writeString(targetProcess);
          _data.writeInt(targetPid);
          _data.writeInt(((isLruKill)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_dispatchDeath, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().dispatchDeath(scene, targetProcess, targetPid, isLruKill);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public com.tencent.matrix.util.MemInfo getMemInfo() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.tencent.matrix.util.MemInfo _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getMemInfo, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getMemInfo();
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = com.tencent.matrix.util.MemInfo.CREATOR.createFromParcel(_reply);
          }
          else {
            _result = null;
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy sDefaultImpl;
    }
    static final int TRANSACTION_dispatchState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_dispatchKill = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_dispatchDeath = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_getMemInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    public static boolean setDefaultImpl(com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Stub.Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public void dispatchState(java.lang.String scene, java.lang.String stateName, boolean state) throws android.os.RemoteException;
  public void dispatchKill(java.lang.String scene, java.lang.String targetProcess, int targetPid) throws android.os.RemoteException;
  public void dispatchDeath(java.lang.String scene, java.lang.String targetProcess, int targetPid, boolean isLruKill) throws android.os.RemoteException;
  public com.tencent.matrix.util.MemInfo getMemInfo() throws android.os.RemoteException;
}
