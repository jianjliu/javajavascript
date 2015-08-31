
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

package org.javajavascript.demo.core.lang;

import org.jscripter.sim.core.Core;
import com.jrecompiler.Scriptlets;

import js.Js;
import js.JsApplet;
import js.core.JsArray;
import js.core.JsGlobal;

// Test arrays
public class Arrays extends JsApplet
{
	private static final long serialVersionUID = 1L;

	@Override
	public void onReady() {
		// JRecompiler 1.0 doesn't accept Java array class
//		Js.alert(int[][].class);
//		Class<?> c = int[].class;
		int[][] aii = new int[2][3];
		Js.alert(aii.getClass());
		Js.alert(aii.getClass().toString());
//		Js.alert(aii instanceof int[][]);
//		Js.alert(c.isInstance(aii));
//		Js.alert(aii[0] instanceof int[]);
//		Js.alert(c.isInstance(aii[1]));
		Js.alert(Js.date());
		js.core.JsDate d = JsGlobal.Date.with().create();
		Js.alert(d);
		JsArray a = JsGlobal.Array.with().create();
		a.push(100000);
		a.push(100001);
		a.push(100002);
		Js.alert(a.var(JsArray.length));
		Js.alert(a);
	}

	public static void main(String[] args) {
		// Initialize and start it with JS Simulation Core
		Js.init(Core.get());
		new Arrays().start();
		// Re-compile the class into JavaScript code
		new Scriptlets("jsdemo-1.0/core/lang").add(Arrays.class).recompile();
	}
}
