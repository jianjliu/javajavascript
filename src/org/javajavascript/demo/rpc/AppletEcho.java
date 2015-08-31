
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

import org.javajavascript.demo.rpc.client.ClientEcho;

import js.Js;
import js.JsApplet;
import js.Vars;

import com.jrecompiler.Scriptlets;

public final class AppletEcho extends JsApplet
{
	private static final long serialVersionUID = 6506876769356971124L;

	@Override
	public void onReady() {
		ClientEcho echo = new ClientEcho();
		Js.alert(echo.lower("Hello World!"));
		Js.alert(echo.upper("Hello World!"));
		echo.new Caller(ClientEcho.LOWER) {
			@Override
			protected void callback(Object ret) {
				Js.alert(ret);
			}
		}.call(new Vars<String>().add("Hello Ajax!").var());
		echo.new Caller(ClientEcho.UPPER) {
			@Override
			protected void callback(Object ret) {
				Js.alert(ret);
			}
		}.call(new Vars<String>().add("Hello Ajax!").var());
	}

	public static void main(String[] args) {
		new Scriptlets("jsdemo-1.0/rpc").add(AppletEcho.class).recompile();
	}
}
