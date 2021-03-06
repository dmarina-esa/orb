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

package com.sun.corba.ee.impl.oa.poa ;

import org.omg.PortableServer.Servant ;
import org.omg.PortableServer.ServantManager ;
import org.omg.PortableServer.ForwardRequest ;
import org.omg.PortableServer.POAPackage.WrongPolicy ;
import org.omg.PortableServer.POAPackage.ObjectNotActive ;
import org.omg.PortableServer.POAPackage.ServantNotActive ;
import org.omg.PortableServer.POAPackage.ObjectAlreadyActive ;
import org.omg.PortableServer.POAPackage.ServantAlreadyActive ;
import org.omg.PortableServer.POAPackage.NoServant ;

/** Implementation of POAPolicyMediator that provides policy specific
 * operations on the POA.
 */
public class POAPolicyMediatorImpl_NR_UDS extends POAPolicyMediatorBase {
    private Servant defaultServant ;

    POAPolicyMediatorImpl_NR_UDS( Policies policies, POAImpl poa ) 
    {
        super( policies, poa ) ;

        // assert !policies.retainServants() && policies.useDefaultServant()
        if (policies.retainServants()) {
            throw wrapper.policyMediatorBadPolicyInFactory();
        }

        if (!policies.useDefaultServant()) {
            throw wrapper.policyMediatorBadPolicyInFactory();
        }

        defaultServant = null ;
    }
    
    protected java.lang.Object internalGetServant( byte[] id, 
        String operation ) throws ForwardRequest {

        poa.readLock() ;
        try {
            if (defaultServant == null) {
                throw wrapper.poaNoDefaultServant();
            }

            return defaultServant;
        } finally {
            poa.readUnlock() ;
        }
    }

    public void returnServant() 
    {
        // NO-OP
    }

    public void etherealizeAll() 
    {   
        // NO-OP
    }

    public void clearAOM() 
    {
        // NO-OP
    }

    public ServantManager getServantManager() throws WrongPolicy
    {
        throw new WrongPolicy();
    }

    public void setServantManager( ServantManager servantManager ) throws WrongPolicy
    {
        throw new WrongPolicy();
    }

    public Servant getDefaultServant() throws NoServant, WrongPolicy 
    {
        if (defaultServant == null) {
            throw new NoServant();
        }
        return defaultServant;
    }

    public void setDefaultServant( Servant servant ) throws WrongPolicy
    {
        this.defaultServant = servant;
        setDelegate(defaultServant, "DefaultServant".getBytes());
    }

    public final void activateObject(byte[] id, Servant servant) 
        throws WrongPolicy, ServantAlreadyActive, ObjectAlreadyActive
    {
        throw new WrongPolicy();
    }

    public Servant deactivateObject( byte[] id ) throws ObjectNotActive, WrongPolicy 
    {
        throw new WrongPolicy();
    }

    public byte[] servantToId( Servant servant ) throws ServantNotActive, WrongPolicy
    {   
        throw new WrongPolicy();
    }

    public Servant idToServant( byte[] id ) 
        throws WrongPolicy, ObjectNotActive
    {
        if (defaultServant != null) {
            return defaultServant;
        }

        throw new ObjectNotActive() ;
    }
}
