
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

import js.*;
import js.core.*;
import jsx.core.ObjectLikes;

// Test objects
public class Objects extends JsApplet
{
	private static final long serialVersionUID = 1L;

	private static class Inner
	{
		private final String msg;
		private Inner(String msg) {
			this.msg = msg;
		}
		public String getMsg() {
			return msg;
		}
		@Override
		public String toString() {
			return msg;
		}
	}

	@Override
	public void onReady() {
		final ObjectLike o1 = new Initializer().set("field1", 1)
		                                       .set("field2", 2.2)
		                                       .set("field3", "value3")
		                                       .var();
		ObjectLikes.each(o1, new Function<Boolean>() {
			@Override
			protected Boolean function(Object jsthis, Call<Boolean> callee) {
				String p = (String)callee.arguments.get(0);
				Js.alert(Js.add(Js.add(p, " = "), o1.var(p)));
				return true;
			}
		}.var());
		Js.alert(Js.valueOf(1));
		Js.alert(Js.valueOf(1).toString());
		Js.alert(Js.valueOf(1).getClass());
		Js.alert(Js.valueOf(1).getClass().toString());
		Object o2 = new Object();
		Js.alert(o2.toString());
		Inner o3 = new Inner("Inner message");
		Js.alert(o3.getMsg());
		Js.alert(o3.getClass());
		Js.alert(o3.getClass().getClass());
		Js.alert(o3.getClass().getClass().getClass());
		Js.alert(o3);
		Js.alert(o3.toString());
		Js.alert(o3);
		Js.alert(o3.toString());
		Js.alert(Js.valueOf(o3));

		JsObject o4 = Js.object(o1).var();
		o4.var("test", "Test object!");
		Js.alert(o4.var("test"));
		Js.alert(o1.var("test"));
	}

	public static void main(String[] args) {
		// Initialize and start it with JS Simulation Core
		Js.init(Core.get());
		new Objects().start();
		// Re-compile the class into JavaScript code
		new Scriptlets("jsdemo-1.0/core/lang").add(Objects.class).recompile();
	}
}
