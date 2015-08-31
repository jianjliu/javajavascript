
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

//General tests for simple calls in Java applets with LiveConnect
public final class LiveCalls extends Applet
{
	private static final long serialVersionUID = -8198120882718367931L;

	@Override
	public void start() {
		JSObject win = JSObject.getWindow(this);
		System.out.println(win.eval("navigator.userAgent"));
		win.call("alert", new Object[]{"Hello!"});
		JSObject alert = (JSObject)win.getMember("alert");
		alert.call("call", new Object[]{win, "Hello LiveCall!"});
	}
}
