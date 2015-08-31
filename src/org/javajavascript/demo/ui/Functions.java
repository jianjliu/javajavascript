
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

package org.javajavascript.demo.ui;

import com.jrecompiler.Scriptlets;

import js.*;
import js.core.*;
import jsx.client.Browser;

public final class Functions extends JsApplet
{
	private static final long serialVersionUID = 8842700543175606669L;

	//@Override
	public void onReady() {
		Js.alert(Browser.userAgent.var());
		JsGlobal.Function.with().create("alert('hello function!');").invoke();
		Js.function("alert('hello function!');").invoke();
	}

	public static void main(String[] args) {
		new Scriptlets("jsdemo-1.0/ui").add(Functions.class).recompile();
	}
}
