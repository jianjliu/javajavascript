
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

// Test long numbers
public class Longs extends JsApplet
{
	private static final long serialVersionUID = 7447548872305229868L;

	@Override
	public void onReady() {
		int i = -1;
		Js.alert(Js.shr(i, 1));
		Js.alert(Js.shru(i, 1));
		Js.alert(Js.shr(-1, 1));
		Js.alert(Js.shr(-1L, 1));
		Js.alert(Js.shru(-1, 1));
		Js.alert(Js.shru(-1L, 1));
		Js.alert(Js.shl(1, 34));
		Js.alert(Js.shl(1, 33));
		Js.alert(Js.shl(1, 32));
		Js.alert(Js.shl(1, 31));
		Js.alert(Js.shl(1L, 34));
		Js.alert(Js.shl(1L, 33));
		Js.alert(Js.shl(1L, 32));
		Js.alert(Js.shl(1L, 31));
		Js.alert(0x8000000000000000L >>> 1);
		Js.alert(0x8000000000000000L >> 1);
		Js.alert(0x7FFFFFFFFFFFFFFFL >>> 1);
		Js.alert(0x7FFFFFFFFFFFFFFFL >> 1);
		Js.alert(Js.shru(0x8000000000000000L, 1));
		Js.alert(Js.shr(0x8000000000000000L, 1));
		Js.alert(Js.shru(0x7FFFFFFFFFFFFFFFL, 1));
		Js.alert(Js.shr(0x7FFFFFFFFFFFFFFFL, 1));
		Js.alert((byte)-7);
		Js.alert(Js.shr((byte)-7, 1));
		Js.alert(Js.shru((byte)-7, 1));
		Js.alert(Js.shr(-7, 1));
		Js.alert(Js.shru(-7, 1));
		int v = -7;
		Js.alert((byte)v);
		Js.alert(Js.shr((byte)v, 1));
		Js.alert(Js.shru((byte)v, 1));
		Js.alert(Js.shr(v, 1));
		Js.alert(Js.shru(v, 1));
		long lv1 = 0x8FFF0000FFFF0000L;
		long lv2 = 0x8FFF00F0FFF00000L;
		Js.alert(0x8FFF0000FFFF0000L << 33);
		Js.alert(0x8FFF0000FFFF0000L >> 37);
		Js.alert(0x8FFF0000FFFF0000L >>> 43);
		Js.alert(0x8FFF0000FFFF0000L & 0x8FFF00F0FFF00000L);
		Js.alert(0x8FFF0000FFFF0000L | 0x8FFF00F0FFF00000L);
		Js.alert(0x8FFF0000FFFF0000L ^ 0x8FFF00F0FFF00000L);
		Js.alert(lv1 << 33);
		Js.alert(lv1 >> 37);
		Js.alert(lv1 >>> 43);
		Js.alert(Long.toHexString(lv1 & lv2));
		Js.alert(Long.toHexString(lv1 | lv2));
		Js.alert(lv1 ^ lv2);
	}

	public static void main(String[] args) {
		// Initialize and start it with JS Simulation Core
		Js.init(Core.get());
		new Longs().start();
		// Re-compile the class into JavaScript code
		new Scriptlets("jsdemo-1.0/core/lang").add(Longs.class).recompile();
	}
}
