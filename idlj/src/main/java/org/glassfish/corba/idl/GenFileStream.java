/*
 * Copyright (c) 1997, 2020, Oracle and/or its affiliates.
 * Copyright (c) 1997-1999 IBM Corp. All rights reserved.
 * Copyright (c) 2019 Payara Services Ltd.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package org.glassfish.corba.idl;

// NOTES:

import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GenFileStream extends PrintWriter
{
  public GenFileStream (String filename)
  {
    // What I really want to do here is:
    // super (byteStream = new ByteArrayOutputStream ());
    // but that isn't legal.  The super constructor MUST
    // be called before any instance variables are used.
    // This implementation gets around that problem.
    // <f49747.1>
    //super (tmpByteStream = new ByteArrayOutputStream ());
    //byteStream = tmpByteStream;
    super (tmpCharArrayWriter = new CharArrayWriter());
    charArrayWriter = tmpCharArrayWriter;
    name = filename;
  } // ctor

    @Override
    public void close() {
        File file = new File(name);
        try {
            if (checkError()) {
                throw new IOException();
            }
            try (FileWriter fileWriter = new FileWriter(file)) {
                fileWriter.write(charArrayWriter.toCharArray());
            }
        } catch (IOException e) {
            String[] parameters = {name, e.toString()};
            System.err.println(Util.getMessage("GenFileStream.1", parameters));
        }
        super.close();
    } // close

  public String name ()
  {
    return name;
  } // name

  // <f49747.1>
  //private ByteArrayOutputStream        byteStream;
  //private static ByteArrayOutputStream tmpByteStream;
  private final  CharArrayWriter    charArrayWriter;
  private static CharArrayWriter tmpCharArrayWriter;
  private final  String                        name;
} // GenFileStream
