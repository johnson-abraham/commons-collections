/*
 * $Header: /home/jerenkrantz/tmp/commons/commons-convert/cvs/home/cvs/jakarta-commons//collections/src/java/org/apache/commons/collections/Attic/ArrayIterator.java,v 1.16 2002/08/15 23:13:51 pjack Exp $
 * $Revision: 1.16 $
 * $Date: 2002/08/15 23:13:51 $
 *
 * ====================================================================
 *
 * The Apache Software License, Version 1.1
 *
 * Copyright (c) 1999-2002 The Apache Software Foundation.  All rights
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution, if
 *    any, must include the following acknowlegement:
 *       "This product includes software developed by the
 *        Apache Software Foundation (http://www.apache.org/)."
 *    Alternately, this acknowlegement may appear in the software itself,
 *    if and wherever such third-party acknowlegements normally appear.
 *
 * 4. The names "The Jakarta Project", "Commons", and "Apache Software
 *    Foundation" must not be used to endorse or promote products derived
 *    from this software without prior written permission. For written
 *    permission, please contact apache@apache.org.
 *
 * 5. Products derived from this software may not be called "Apache"
 *    nor may "Apache" appear in their names without prior written
 *    permission of the Apache Group.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */
package org.apache.commons.collections;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

/** Implements an {@link Iterator} over an array of objects.
  *
  * @since 1.0
  * @author <a href="mailto:jstrachan@apache.org">James Strachan</a>
  * @author Mauricio S. Moura
  * @author <a href="mailto:mas@apache.org">Michael A. Smith</a>
  * @version $Revision: 1.16 $
  * @deprecated this class has been moved to the iterators subpackage
  */
public class ArrayIterator 
extends org.apache.commons.collections.iterators.ArrayIterator {
    
    /**
     *  Construct an ArrayIterator.  Using this constructor, the iterator is
     *  equivalent to an empty iterator until {@link #setArray(Object)} is
     *  called to establish the array to iterate over.
     **/
    public ArrayIterator() {
        super();
    }
   
    /**
     *  Construct an ArrayIterator that will iterate over the values in the
     *  specified array.
     *
     *  @param array the array to iterate over.
     *
     *  @exception IllegalArgumentException if <code>array</code> is not an
     *  array.
     *
     *  @exception NullPointerException 
     *  if <code>array</code> is <code>null</code>
     **/
    public ArrayIterator(Object array) {
        super(array);
    }

    /**
     *  Construct an ArrayIterator that will iterate over the values in the
     *  specified array.
     *
     *  @param array the array to iterate over.
     *  @param start the index to start iterating at.
     *
     *  @exception IllegalArgumentException if <code>array</code> is not an
     *  array.
     *
     *  @exception NullPointerException 
     *  if <code>array</code> is <code>null</code>
     **/
    public ArrayIterator(Object array, int start) {
        super(array, start);
    }

    /**
     *  Construct an ArrayIterator that will iterate over the values in the
     *  specified array.
     *
     *  @param array the array to iterate over.
     *  @param start the index to start iterating at.
     *  @param end the index to finish iterating at.
     *
     *  @exception IllegalArgumentException if <code>array</code> is not an
     *  array.
     *
     *  @exception NullPointerException 
     *  if <code>array</code> is <code>null</code>
     **/
    public ArrayIterator(Object array, int start, int end) {
        super(array, start, end);
    }

}
