/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 * Copyright (c) 1998-1999 IBM Corp. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package javax.rmi;

import java.lang.String;
import java.rmi.RemoteException;


public class DogImpl implements Dog, java.io.Serializable
{
    private String fBark = "Rrruf!";

    public DogImpl (String bark)
    {
        fBark = bark;
    }

    public String bark () throws RemoteException
    {
        return fBark;
    }

    public void die () throws RemoteException
    {
    }
}