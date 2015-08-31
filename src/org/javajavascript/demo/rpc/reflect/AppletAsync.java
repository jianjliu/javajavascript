
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
import jsx.Returnable;
import jsx.client.Browser;
import jsx.http.rpc.remote.Reflector;
import jsx.http.rpc.remote.client.CClass;
import jsx.http.rpc.remote.client.CObject;

public class AppletAsync extends JsApplet
{
	private static final long serialVersionUID = 6004361904491241423L;

	private static void ready() {
		final Returnable<CObject> ro = new Returnable<CObject>() {
			public void onReturn(CObject co) {
				Js.alert("Creating2!");
				co.toString(new Returnable<String>() {
					public void onReturn(String s) {
						Js.alert(s);
					}
				});
				co.getStringField("myField", new Returnable<String>() {
					public void onReturn(String s) {
						Js.alert(s);
					}
				});
				co.toString(new Returnable<String>() {
					public void onReturn(String s) {
						Js.alert(s);
					}
				});
				co.toString(new Returnable<String>() {
					public void onReturn(String s) {
						Js.alert(s);
					}
				});
				co.getStringField("myField", new Returnable<String>() {
					public void onReturn(String s) {
						Js.alert(s);
					}
				});
				co.getStringField("myField", new Returnable<String>() {
					public void onReturn(String s) {
						Js.alert(s);
					}
				});
			}
		};

		final Returnable<CClass> rc = new Returnable<CClass>() {
			public void onReturn(final CClass cc) {
				Js.alert(cc.getName());
				Js.alert("Creating1!");
				cc.newInstance(ro);
			}
		};

		new Reflector("../ServletReflector").register(new Returnable<Reflector>() {
			public void onReturn(Reflector r) {
				Js.alert("Loading class!");
				CClass.forName(
						"org.javajavascript.demo.rpc.reflect.server.MyObject",
						r,
						rc
				);
			}
		});
	}

	@Override
	public void onReady() {
		Js.alert(Browser.userAgent.var());
		ready();
	}

	public static void main(String[] args) {
		new Scriptlets("jsdemo-1.0/rpc").add(AppletAsync.class).recompile();
	}
}
