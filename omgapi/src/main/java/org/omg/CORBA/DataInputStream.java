/*
 * Copyright (c) 1997, 2020 Oracle and/or its affiliates.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the Eclipse Distribution License
 * v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License v. 2.0 are satisfied: GNU General Public License v2.0
 * w/Classpath exception which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause OR GPL-2.0 WITH
 * Classpath-exception-2.0
 */

package org.omg.CORBA;

/** Defines the methods used to read primitive data types from input streams
* for unmarshaling custom value types.  This interface is used by user
* written custom unmarshaling code for custom value types.
* @see org.omg.CORBA.DataOutputStream
* @see org.omg.CORBA.CustomMarshal
* @version 1.13 07/27/07
*/
public interface DataInputStream extends org.omg.CORBA.portable.ValueBase
{
    /** Reads an IDL <code>Any</code> value from the input stream.
    * @return  the <code>Any</code> read.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    org.omg.CORBA.Any read_any ();

    /** Reads an IDL boolean value from the input stream.
    * @return  the boolean read.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    boolean read_boolean ();

    /** Reads an IDL character value from the input stream.
    * @return  the character read.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    char read_char ();

    /** Reads an IDL wide character value from the input stream.
    * @return  the wide character read.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    char read_wchar ();

    /** Reads an IDL octet value from the input stream.
    * @return  the octet value read.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    byte read_octet ();

    /** Reads an IDL short from the input stream.
    * @return  the short read.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    short read_short ();

    /** Reads an IDL unsigned short from the input stream.
    * @return  the unsigned short read.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    short read_ushort ();

    /** Reads an IDL long from the input stream.
    * @return  the long read.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    int read_long ();

    /** Reads an IDL unsigned long from the input stream.
    * @return  the unsigned long read.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    int read_ulong ();

    /** Reads an IDL long long from the input stream.
    * @return  the long long read.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    long read_longlong ();

    /** Reads an unsigned IDL long long from the input stream.
    * @return  the unsigned long long read.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    long read_ulonglong ();

    /** Reads an IDL float from the input stream.
    * @return  the float read.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    float read_float ();

    /** Reads an IDL double from the input stream.
    * @return  the double read.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    double read_double ();
    // read_longdouble not supported by IDL/Java mapping

    /** Reads an IDL string from the input stream.
    * @return  the string read.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    String read_string ();

    /** Reads an IDL wide string from the input stream.
    * @return  the wide string read.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    String read_wstring ();

    /** Reads an IDL CORBA::Object from the input stream.
    * @return  the CORBA::Object read.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    org.omg.CORBA.Object read_Object ();

    /** Reads an IDL Abstract interface from the input stream.
    * @return  the Abstract interface read.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    java.lang.Object read_Abstract ();

    /** Reads an IDL value type from the input stream.
    * @return  the value type read.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    java.io.Serializable read_Value ();

    /** Reads an IDL typecode from the input stream.
    * @return  the typecode read.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    org.omg.CORBA.TypeCode read_TypeCode ();

    /** Reads array of IDL Anys from offset for length elements from the
    * input stream.  
    * @param seq The out parameter holder for the array to be read.
    * @param offset The index into seq of the first element to read from the
    * input stream.
    * @param length The number of elements to read from the input stream.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    void read_any_array (org.omg.CORBA.AnySeqHolder seq, int offset, int length);

    /** Reads array of IDL booleans from offset for length elements from the
    * input stream.  
    * @param seq The out parameter holder for the array to be read.
    * @param offset The index into seq of the first element to read from the
    * input stream.
    * @param length The number of elements to read from the input stream.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    void read_boolean_array (org.omg.CORBA.BooleanSeqHolder seq, int offset, int length);

    /** Reads array of IDL characters from offset for length elements from the
    * input stream.  
    * @param seq The out parameter holder for the array to be read.
    * @param offset The index into seq of the first element to read from the
    * input stream.
    * @param length The number of elements to read from the input stream.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    void read_char_array (org.omg.CORBA.CharSeqHolder seq, int offset, int length);

    /** Reads array of IDL wide characters from offset for length elements from the
    * input stream.  
    * @param seq The out parameter holder for the array to be read.
    * @param offset The index into seq of the first element to read from the
    * input stream.
    * @param length The number of elements to read from the input stream.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    void read_wchar_array (org.omg.CORBA.WCharSeqHolder seq, int offset, int length);

    /** Reads array of IDL octets from offset for length elements from the
    * input stream.  
    * @param seq The out parameter holder for the array to be read.
    * @param offset The index into seq of the first element to read from the
    * input stream.
    * @param length The number of elements to read from the input stream.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    void read_octet_array (org.omg.CORBA.OctetSeqHolder seq, int offset, int length);

    /** Reads array of IDL shorts from offset for length elements from the
    * input stream.  
    * @param seq The out parameter holder for the array to be read.
    * @param offset The index into seq of the first element to read from the
    * input stream.
    * @param length The number of elements to read from the input stream.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    void read_short_array (org.omg.CORBA.ShortSeqHolder seq, int offset, int length);

    /** Reads array of IDL unsigned shorts from offset for length elements from the
    * input stream.  
    * @param seq The out parameter holder for the array to be read.
    * @param offset The index into seq of the first element to read from the
    * input stream.
    * @param length The number of elements to read from the input stream.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    void read_ushort_array (org.omg.CORBA.UShortSeqHolder seq, int offset, int length);

    /** Reads array of IDL longs from offset for length elements from the
    * input stream.  
    * @param seq The out parameter holder for the array to be read.
    * @param offset The index into seq of the first element to read from the
    * input stream.
    * @param length The number of elements to read from the input stream.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    void read_long_array (org.omg.CORBA.LongSeqHolder seq, int offset, int length);

    /** Reads array of IDL unsigned longs from offset for length elements from the
    * input stream.  
    * @param seq The out parameter holder for the array to be read.
    * @param offset The index into seq of the first element to read from the
    * input stream.
    * @param length The number of elements to read from the input stream.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    void read_ulong_array (org.omg.CORBA.ULongSeqHolder seq, int offset, int length);

    /** Reads array of IDL unsigned long longs from offset for length elements from the
    * input stream.  
    * @param seq The out parameter holder for the array to be read.
    * @param offset The index into seq of the first element to read from the
    * input stream.
    * @param length The number of elements to read from the input stream.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    void read_ulonglong_array (org.omg.CORBA.ULongLongSeqHolder seq, int offset, int length);

    /** Reads array of IDL long longs from offset for length elements from the
    * input stream.  
    * @param seq The out parameter holder for the array to be read.
    * @param offset The index into seq of the first element to read from the
    * input stream.
    * @param length The number of elements to read from the input stream.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    void read_longlong_array (org.omg.CORBA.LongLongSeqHolder seq, int offset, int length);

    /** Reads array of IDL floats from offset for length elements from the
    * input stream.  
    * @param seq The out parameter holder for the array to be read.
    * @param offset The index into seq of the first element to read from the
    * input stream.
    * @param length The number of elements to read from the input stream.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    void read_float_array (org.omg.CORBA.FloatSeqHolder seq, int offset, int length);

    /** Reads array of IDL doubles from offset for length elements from the
    * input stream.  
    * @param seq The out parameter holder for the array to be read.
    * @param offset The index into seq of the first element to read from the
    * input stream.
    * @param length The number of elements to read from the input stream.
    * @throws org.omg.CORBA.MARSHAL
    * If an inconsistency is detected, including not having registered 
    * a streaming policy, then the standard system exception MARSHAL is raised.
    */
    void read_double_array (org.omg.CORBA.DoubleSeqHolder seq, int offset, int length);
} // interface DataInputStream

