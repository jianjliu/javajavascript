
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

package org.javajavascript.demo.rpc;

import org.javajavascript.demo.rpc.client.ClientString;

import js.Js;
import js.JsApplet;
import js.Vars;

import com.jrecompiler.Scriptlets;

public final class AppletString extends JsApplet
{
	private static final long serialVersionUID = 2870601641817385449L;

	@Override
	public void onReady() {
		ClientString str = new ClientString("Hello World!");
		Js.alert(ClientString.string(str, ClientString.value));
		Js.alert(str.lower());
		Js.alert(str.upper());
		str.new Caller(ClientString.LOWER) {
			@Override
			protected void callback(Object ret) {
				Js.alert(ret);
			}
		}.call(new Vars<String>().var());
		str.new Caller(ClientString.UPPER) {
			@Override
			protected void callback(Object ret) {
				Js.alert(ret);
			}
		}.call(new Vars<String>().var());
	}

	public static void main(String[] args) {
		new Scriptlets("jsdemo-1.0/rpc").add(AppletString.class).recompile();
	}
}
