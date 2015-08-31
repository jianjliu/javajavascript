
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

// Test floats
public class Floats extends JsApplet
{
	private static final long serialVersionUID = 1L;

	@Override
	public void onReady() {
		float f = 3.3346333e27f;
		Js.alert(f);
		Js.alert(Float.floatToIntBits(f));
		Js.alert(Float.floatToRawIntBits(f));
		Js.alert(Float.intBitsToFloat(Float.floatToIntBits(f)));
		Js.alert(Float.intBitsToFloat(Float.floatToRawIntBits(f)));
		Js.alert(Float.intBitsToFloat(1831626113));
	}

	public static void main(String[] args) {
		// Initialize and start it with JS Simulation Core
		Js.init(Core.get());
		new Floats().start();
		// Re-compile the class into JavaScript code
		new Scriptlets("jsdemo-1.0/core/lang").add(Floats.class).recompile();
	}
}
