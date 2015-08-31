
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

// Test do-while statements
public class DoWhiles extends JsApplet
{
	private static final long serialVersionUID = 1L;

	@Override
	public void onReady() {
		int a = 2;
		float b = 3;
		float c = a + b;
		double d = 5.55555;
		loop:do {
			do {
				Js.alert(a + b + c + d);
				b++;
				if (b > 5) {
					break loop;
				}
				if (a > 5) {
					break;
				}
				if (a < 5 && b == 5) {
					continue;
				}
				if (a == 5 && b < 5) {
					continue loop;
				}
				++b;
				switch(Js.cases().add("aaa").add(2).add(false).indexOf(false)) {
				case 0:
					int i = 0;
					do {
						i = i + 1;
						if (i > 3) {
							break;
						}
						i = i + 1;
					}while(true);
				case 1:
					switch(Js.cases().add("aaa").add(2).add(false).indexOf(false))
					{
						case 0:
							int ii = 0;
							do {
								ii = ii + 1;
								if (ii > 3) {
									break;
								}
								ii = ii + 1;
							}while(true);
						case 1:
							Js.alert("case 3");
							int ij = 3;
							if (ij > 2) {
								break;
							}
						default:
							Js.alert("def");
							break;
						case 2:
							Js.alert("case 3");
							break;
					
					}
//					Js.alert("dummy");
//					break;
				default:
					Js.alert("default");
					break;
				case 2:
					switch(Js.cases().add("aaa").add(2).add(false).indexOf(false))
					{
						case 0:
							int ii = 0;
							do {
								ii = ii + 1;
								if (ii > 3) {
									break;
								}
								ii = ii + 1;
							} while(ii < 7);
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
			}
			} while (b < 7);
			++a;
		} while (a < 5);
	}

	public static void main(String[] args) {
		// Initialize and start it with JS Simulation Core
		Js.init(Core.get());
		new DoWhiles().start();
		// Re-compile the class into JavaScript code
		new Scriptlets("jsdemo-1.0/core/lang").add(DoWhiles.class).recompile(true);
	}
}
