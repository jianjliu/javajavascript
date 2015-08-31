
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

import js.Js;
import js.JsApplet;

public class Numbers extends JsApplet
{
	private static final long serialVersionUID = 1L;

	@Override
	public void onReady() {
		System.out.println(int[][].class.getName());
		System.out.println("(byte)-7 = " + ((byte)-7));
		System.out.println("(byte)-7 + 1 = " + (((byte)-7) + 1));
		System.out.println("(int)(char)-7 = " + ((int)(char)-7));
		System.out.println("(byte)-7 >> 1 = " + (((byte)-7) >> 1));
		System.out.println("(byte)-7 >>> 1 = " + (((byte)-7) >>> 1));
		System.out.println("-7 >> 1 = " + (-7 >> 1));
		System.out.println("-7 >>> 1 = " + (-7 >>> 1));
		System.out.println("(byte)0x80 = " + ((byte)0x80));
		System.out.println("(byte)0x80 + 1 = " + (((byte)0x80) + 1));
		System.out.println("(int)(char)0x80 = " + ((int)(char)0x80));
		System.out.println("(byte)0x80 >> 1 = " + (((byte)0x80) >> 1));
		System.out.println("(byte)0x80 >>> 1 = " + (((byte)0x80) >>> 1));
		System.out.println("0x80 >> 1 = " + (0x80 >> 1));
		System.out.println("0x80 >>> 1 = " + (0x80 >>> 1));
		int v = -7;
		System.out.println("(byte)v = " + ((byte)v));
		System.out.println("(byte)v + 1 = " + (((byte)v) + 1));
		System.out.println("(byte)v >> 1 = " + (((byte)v) >> 1));
		System.out.println("(byte)v >>> 1 = " + (((byte)v) >>> 1));
		System.out.println("v >> 1 = " + (v >> 1));
		System.out.println("v >>> 1 = " + (v >>> 1));
		v = 0x80;
		System.out.println("(byte)v = " + ((byte)v));
		System.out.println("(byte)v + 1 = " + (((byte)v) + 1));
		System.out.println("(byte)v >> 1 = " + (((byte)v) >> 1));
		System.out.println("(byte)v >>> 1 = " + (((byte)v) >>> 1));
		System.out.println("v >> 1 = " + (v >> 1));
		System.out.println("v >>> 1 = " + (v >>> 1));

		System.out.println("(short)0x8000 = " + ((short)0x8000));
		System.out.println("(short)0x8000 + 1 = " + (((short)0x8000) + 1));
		System.out.println("(short)0x8000 >> 1 = " + (((short)0x8000) >> 1));
		System.out.println("(short)0x8000 >>> 1 = " + (((short)0x8000) >>> 1));
		System.out.println("0x8000 >> 1 = " + (0x8000 >> 1));
		System.out.println("0x8000 >>> 1 = " + (0x8000 >>> 1));
		v = 0x8000;
		System.out.println("(short)v = " + ((short)v));
		System.out.println("(short)v + 1 = " + (((short)v) + 1));
		System.out.println("(short)v >> 1 = " + (((short)v) >> 1));
		System.out.println("(short)v >>> 1 = " + (((short)v) >>> 1));
		System.out.println("v >> 1 = " + (v >> 1));
		System.out.println("v >>> 1 = " + (v >>> 1));
		System.out.println("0x8000000000000000L >>> 1 = " + (0x8000000000000000L >>> 1));
		System.out.println("0x8000000000000000L & -1L = " + (0x8000000000000000L & -1L));
		System.out.println("0x8000000000000000L = " + 0x8000000000000000L);
		System.out.println("(int)0x8000000000000000L = " + (int)0x8000000000000000L);
		System.out.println("1 << 34 = " + (1 << 34));
		System.out.println("1 << 34 = " + (1 << 33));
		System.out.println("1 << 34 = " + (1 << 32));
		System.out.println("1 << 34 = " + (1 << 31));
		System.out.println("1L << 34 = " + (1L << 34));
		System.out.println("1L << 34 = " + (1L << 33));
		System.out.println("1L << 34 = " + (1L << 32));
		System.out.println("1L << 34 = " + (1L << 31));
		System.out.println("0x8000000000000000L >>> 1 = " + (0x8000000000000000L >>> 1));
		System.out.println("0x8000000000000000L >> 1 = " + (0x8000000000000000L >> 1));
		System.out.println("0x7FFFFFFFFFFFFFFFL >>> 1 = " + (0x7FFFFFFFFFFFFFFFL >>> 1));
		System.out.println("0x7FFFFFFFFFFFFFFFL >> 1 = " + (0x7FFFFFFFFFFFFFFFL >> 1));
	}

	public static void main(String[] args) {
		// Initialize and start it with JS Simulation Core
		Js.init(Core.get());
		new Numbers().start();
	}
}
