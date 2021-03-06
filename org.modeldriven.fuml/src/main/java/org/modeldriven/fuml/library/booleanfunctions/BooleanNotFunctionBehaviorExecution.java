/*
 * Copyright 2008 Lockheed Martin Corporation, except as stated in the file 
 * entitled Licensing-Information. 
 * 
 * All modifications copyright 2009-2012 Data Access Technologies, Inc.
 * 
 * Licensed under the Academic Free License version 3.0 
 * (http://www.opensource.org/licenses/afl-3.0.php), except as stated 
 * in the file entitled Licensing-Information. 
 *
 * Contributors:
 *   MDS - initial API and implementation
 *
 */

package org.modeldriven.fuml.library.booleanfunctions;

import java.util.List;

import fuml.Debug;

public class BooleanNotFunctionBehaviorExecution extends
		BooleanFunctionBehaviorExecution {

	@Override
	public boolean doBooleanFunction(List<Boolean> arguments) {
		boolean result = !arguments.get(0);
		Debug.println("[doBody] Boolean Not result = " + result);
		return result;
	}

    @Override
	public fuml.semantics.values.Value new_() {
        return new BooleanNotFunctionBehaviorExecution();
    }	
	
} // BooleanNotFunctionBehaviorExecution
