/*
 * Copyright (c) 1994, 2020 Oracle and/or its affiliates. All rights reserved.
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

package org.glassfish.rmic.tools.tree;

import org.glassfish.rmic.tools.java.*;
import org.glassfish.rmic.tools.asm.Assembler;

/**
 * WARNING: The contents of this source file are not part of any
 * supported API.  Code that depends on them does so at its own risk:
 * they are subject to change or removal without notice.
 */
public
class NegativeExpression extends UnaryExpression {
    /**
     * Constructor
     */
    public NegativeExpression(long where, Expression right) {
        super(NEG, where, right.type, right);
    }

    /**
     * Select the type of the expression
     */
    void selectType(Environment env, Context ctx, int tm) {
        if ((tm & TM_DOUBLE) != 0) {
            type = Type.tDouble;
        } else if ((tm & TM_FLOAT) != 0) {
            type = Type.tFloat;
        } else if ((tm & TM_LONG) != 0) {
            type = Type.tLong;
        } else {
            type = Type.tInt;
        }
        right = convert(env, ctx, type, right);
    }

    /**
     * Evaluate
     */
    Expression eval(int a) {
        return new IntExpression(where, -a);
    }
    Expression eval(long a) {
        return new LongExpression(where, -a);
    }
    Expression eval(float a) {
        return new FloatExpression(where, -a);
    }
    Expression eval(double a) {
        return new DoubleExpression(where, -a);
    }

    /**
     * Simplify
     */
    Expression simplify() {
        if (right.op == NEG) {
            return ((NegativeExpression)right).right;
        }
        return this;
    }

    /**
     * Code
     */
    public void codeValue(Environment env, Context ctx, Assembler asm) {
        right.codeValue(env, ctx, asm);
        asm.add(where, opc_ineg + type.getTypeCodeOffset());
    }
}
