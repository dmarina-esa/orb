package org.omg.CORBA;

/**
* org/omg/CORBA/ContainerHolder.java .
* IGNORE Generated by the IDL-to-Java compiler (portable), version "3.2"
* from idlj/src/main/java/com/sun/tools/corba/ee/idl/ir.idl
* IGNORE Sunday, January 21, 2018 1:54:22 PM EST
*/


// orbos 98-01-18: Objects By Value -- end
public final class ContainerHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CORBA.Container value = null;

  public ContainerHolder ()
  {
  }

  public ContainerHolder (org.omg.CORBA.Container initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CORBA.ContainerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CORBA.ContainerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CORBA.ContainerHelper.type ();
  }

}