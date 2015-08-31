
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

import org.jscripter.sim.core.Core;

import js.*;
import js.core.*;

//General tests about org.jscripter.sim.core.Core
public final class Cores extends JsApplet
{
	private static final long serialVersionUID = -2974184094097811193L;

	@Override
	public void onReady() {
		try {
			Js.alert(JsGlobal.Object.with());
			Js.alert(JsGlobal.Object.prototype.with(Js.core()));
			Js.alert(JsGlobal.Function.with());
			Js.alert(JsGlobal.Function.prototype.with(Js.core()));
			Js.alert(JsObject.toString.with(JsGlobal.Object.prototype.with(Js.core())));
			Js.alert(JsObject.valueOf.with(JsGlobal.Object.prototype.with(Js.core())));
			Js.alert(JsFunction.toString.with(JsGlobal.Function.prototype.with(Js.core())));
			Js.alert(JsFunction.valueOf.with(JsGlobal.Function.prototype.with(Js.core())));
			Js.alert(JsGlobal.Array.with());
			Js.alert(JsGlobal.Array.prototype.with(Js.core()));
			Js.alert(JsArray.toString.with(JsGlobal.Array.prototype.with(Js.core())));
			Js.alert(JsArray.valueOf.with(JsGlobal.Array.prototype.with(Js.core())));
			Js.alert(JsGlobal.Boolean.with());
			Js.alert(JsGlobal.Boolean.prototype.with(Js.core()));
			Js.alert(JsBoolean.toString.with(JsGlobal.Boolean.prototype.with(Js.core())));
			Js.alert(JsBoolean.valueOf.with(JsGlobal.Boolean.prototype.with(Js.core())));
			Js.alert(JsGlobal.Date.with());
			Js.alert(JsGlobal.Date.prototype.with(Js.core()));
			Js.alert(JsDate.toString.with(JsGlobal.Date.prototype.with(Js.core())));
			Js.alert(JsDate.valueOf.with(JsGlobal.Date.prototype.with(Js.core())));
			Js.alert(JsGlobal.Number.with());
			Js.alert(JsGlobal.Number.prototype.with(Js.core()));
			Js.alert(JsNumber.toString.with(JsGlobal.Number.prototype.with(Js.core())));
			Js.alert(JsNumber.valueOf.with(JsGlobal.Number.prototype.with(Js.core())));
			Js.alert(JsGlobal.RegExp.with());
			Js.alert(JsGlobal.RegExp.prototype.with(Js.core()));
			Js.alert(JsRegExp.toString.with(JsGlobal.RegExp.prototype.with(Js.core())));
			Js.alert(JsRegExp.valueOf.with(JsGlobal.RegExp.prototype.with(Js.core())));
			Js.alert(JsGlobal.String.with());
			Js.alert(JsGlobal.String.prototype.with(Js.core()));
			Js.alert(JsString.toString.with(JsGlobal.String.prototype.with(Js.core())));
			Js.alert(JsString.valueOf.with(JsGlobal.String.prototype.with(Js.core())));
			Js.alert(new Function<Void>() {
				@Override
				protected Void function(Object jsthis, Call<Void> callee) {
					return null;
				}
			}.var());
			Js.alert(new Function<Void>() {
				@Override
				protected Void function(Object jsthis, Call<Void> callee) {
					return null;
				}
			});

			Js.alert(new JsNumber(3));
			Js.alert(new JsString(""));
			Js.alert(new JsString((String)null));
			Js.alert(new JsBoolean(false));
			ArrayLike<?> arr = Js.<String>array();
			Js.alert(arr.push("aaa"));
			Js.alert(arr.push("bbb"));
			Js.alert(arr.pop());
			Js.alert(arr.push("ccc"));
			Js.alert(arr);
			JsArray ar = arr.var();
			Js.alert(JsObject.toString.with(ar));
			Js.alert(JsObject.valueOf.with(ar));
			Js.alert(ar);
			Js.alert(ar.pop());
			Js.alert(ar.push("ddd"));
			Js.alert(ar);
		} catch (NullPointerException npe) {
			npe.printStackTrace();
			throw npe;
		}
	}

	public static void main(String[] args) {
		Js.init(Core.get());
		new Cores().start();
	}
}
