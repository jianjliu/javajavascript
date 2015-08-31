
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

import js.Js;
import js.JsApplet;

// Test switch statements
public class Switches extends JsApplet
{
	private static final long serialVersionUID = 1L;

	@Override
	public void onReady() {
		switch(3) {
		case 3:
			switch(Js.cases().add("key1")
			                 .add("key2")
			                 .add("my key").indexOf("my key")) {
				case 0:
					Js.alert("case 0");
					break;
				case 1:
					Js.alert("case 1");
					break;
				case 2:
					switch(Js.cases().add("key1")
					                 .add("key2")
					                 .add("my key1").indexOf("my key1")) {
						case 0:
							Js.alert("case 0");
							break;
						case 1:
							switch(Js.cases().add("aaa").add(2).add(false).indexOf(false))
							{
								case 0:
									Js.alert("case 3");
									break;
								case 1:
									Js.alert("case 3");
									break;
								default:
									Js.alert("def");
									break;
								case 2:
									Js.alert("case 3");
									break;
							
							}
						case 2:
							switch(Js.cases().add("key1")
							                 .add("key2")
							                 .add("my key1").indexOf("my key1")) {
								case 0:
								case 1:
									Js.alert("case 2");
									break;
								default:
									Js.alert("case 2");
									break;
								case 2:
									Js.alert("case 2");
									break;
							}
//							Js.alert("dummy");
//							break;
						default:
							switch(Js.cases().add("key1")
							                   .add("key2")
							                   .add("my key1").indexOf("my key1")) {
								case 0:
								case 1:
									Js.alert("case 2");
									break;
								default:
									Js.alert("case 2");
									break;
								case 2:
									Js.alert("case 2");
									break;
							}
					}
//					Js.alert("dummy");
//					break;
				case 3:
					Js.alert("case 3");
					break;
				default:
					Js.alert("default");
			}
//			Js.alert("dummy");
		case 1:
			Js.alert("case1");
			break;
		default:
			Js.alert("default");
			break;
	}
	}

	public static void main(String[] args) {
		// Initialize and start it with JS Simulation Core
		Js.init(Core.get());
		new Switches().start();
		// Re-compile the class into JavaScript code
		new Scriptlets("jsdemo-1.0/core/lang").add(Switches.class).recompile();
	}
}
