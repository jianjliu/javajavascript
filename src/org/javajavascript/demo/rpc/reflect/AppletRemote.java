
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

package org.javajavascript.demo.rpc.reflect;

import com.jrecompiler.Scriptlets;

import js.Js;
import js.JsApplet;
import jsx.client.Browser;
import jsx.http.rpc.remote.Reflector;
import jsx.http.rpc.remote.client.CClass;
import jsx.http.rpc.remote.client.CObject;

public class AppletRemote extends JsApplet
{
	private static final long serialVersionUID = 1627633785795842082L;

	@Override
	public void onReady() {
		Js.alert(Browser.userAgent.var());
		Js.alert("Registering!");
		Reflector r = new Reflector("../ServletReflector").register();
		Js.alert("Loading class!");
		CClass cc = CClass.forName(
				"org.javajavascript.demo.rpc.reflect.server.MyObject",
				r
		);
		Js.alert(cc.getName());
		Js.alert("Creating!");
		CObject co = cc.newInstance();
		Js.alert(co.toString());
		Js.alert(co.getStringField("myField"));
		Js.alert("Finalizing!");
	}

	public static void main(String[] args) {
		new Scriptlets("jsdemo-1.0/rpc").add(AppletRemote.class).recompile();
	}
}
