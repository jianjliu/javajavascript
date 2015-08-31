
/*
 *  JavaJavaScript - Java scripts more!
 *  Copyright (C) 2008-2011  J.J.Liu<jianjunliu@126.com> <http://www.javajavascript.org>
 *  
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *  
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.javajavascript.demo.core;

import org.jscripter.sim.core.Core;

import com.jrecompiler.Scriptlets;

import js.*;
import jsx.Timeout;

// Test jsx.Timeout
public final class Timeouts extends JsApplet
{
	private static final long serialVersionUID = -2509668852942881306L;

	@Override
	public void onReady() {
		new Timeout() {
			public void run() {
				Js.alert("Hello Timeout!");
			}
		}.set();
	}

	public static void main(String[] args) {
		// Initialize and start it with JS Simulation Core
		Js.init(Core.get());
		new Timeouts().start();
		// Re-compile the class into JavaScript code
		new Scriptlets("jsdemo-1.0/core").add(Timeouts.class).recompile();
	}
}
