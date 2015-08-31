
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

package org.javajavascript.demo;

import java.applet.Applet;
import netscape.javascript.JSObject;

//General tests for primitive types in Java applets with LiveConnect
public final class LiveTypes extends Applet
{
	private static final long serialVersionUID = -6426578854192893632L;

	private final static String getType(Object o) {
		return o instanceof JSObject ? "JSObject" :
			o == null ? "null" : o.getClass().getName();
	}

	private final static void setGet(Object o, JSObject win) {
		win.setMember("$temp", o);
		System.out.println(getType(o) + " -> " + getType(win.getMember("$temp")));
	}

	@Override
	public void start() {
		System.out.println("id = " + getParameter("id"));
		System.out.println("name = " + getParameter("name"));
		JSObject win = JSObject.getWindow(this);
		System.out.println(win.eval("navigator.userAgent"));
		win.eval("$array=[]");
		win.eval("$boolean=true");
		win.eval("$function=function(){}");
		win.eval("$number=2011");
		win.eval("$object={}");
		win.eval("$string='2011'");
		System.out.println("window.$array:        " + getType(win.getMember("$array"       )));
		System.out.println("window.$boolean:      " + getType(win.getMember("$boolean"     )));
		System.out.println("window.$function:     " + getType(win.getMember("$function"    )));
		System.out.println("window.$number:       " + getType(win.getMember("$number"      )));
		System.out.println("window.$object:       " + getType(win.getMember("$object"      )));
		System.out.println("window.$string:       " + getType(win.getMember("$string"      )));
		setGet(new Object[]{}, win);
		setGet(true, win);
		setGet("astring", win);
		setGet('c', win);
		setGet((byte)1, win);
		setGet((short)1, win);
		setGet((int)1, win);
		setGet((long)1, win);
		setGet((float)1, win);
		setGet((double)1, win);
		setGet(new Object(), win);
	}
}
