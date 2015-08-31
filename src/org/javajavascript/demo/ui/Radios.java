
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
import jsx.client.Browser;
import jsx.ui.Viewport;
import jsx.ui.event.Check;
import jsx.ui.event.OnCheck;
import jsx.ui.event.OnUncheck;
import jsx.ui.event.Uncheck;
import jsx.ui.html.Group;
import jsx.ui.html.Label;
import jsx.ui.html.Radio;

public final class Radios extends JsApplet
{
	private static final long serialVersionUID = 17L;

	//@Override
	public void onReady() {
		Js.alert(Browser.userAgent.var());

		Radio rb1 = new Radio(Group.get("test"));
		Radio rb2 = new Radio(Group.get("test"));
		Viewport.get().add(new Label(rb1, "my radio 1"));
		Viewport.get().add(new Label(rb2, "my radio 2"));
		rb1.addListener(Check.class, new OnCheck() {
			//@Override
			public void onEvent(Check evt) {
				Js.alert("Radio 1 Checked!");
			}
		});
		rb1.addListener(Uncheck.class, new OnUncheck() {
			//@Override
			public void onEvent(Uncheck evt) {
				Js.alert("Radio 1 Unchecked!");
			}
		});
		rb2.addListener(Check.class, new OnCheck() {
			//@Override
			public void onEvent(Check evt) {
				Js.alert("Radio 2 Checked!");
			}
		});
		rb2.addListener(Uncheck.class, new OnUncheck() {
			//@Override
			public void onEvent(Uncheck evt) {
				Js.alert("Radio 2 Unchecked!");
			}
		});
	}

	public static void main(String[] args) {
		new Scriptlets("jsdemo-1.0/ui").add(Radios.class).recompile();
	}
}
