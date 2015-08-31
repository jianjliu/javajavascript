
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
import jsx.ui.ctrl.Checkable;
import jsx.ui.ctrl.Uncheckable;
import jsx.ui.event.Change;
import jsx.ui.event.Check;
import jsx.ui.event.OnChange;
import jsx.ui.event.OnCheck;
import jsx.ui.event.OnUncheck;
import jsx.ui.event.Uncheck;

public final class Groups extends JsApplet
{
	private static final long serialVersionUID = 17L;

	//@Override
	public void onReady() {
		Js.alert(Browser.userAgent.var());

		Checkable cc1 = new Uncheckable("my choice 1");
		Checkable cc2 = new Uncheckable("my choice 2");
		cc1.group(cc2);
		Viewport.get().add(cc1);
		Viewport.get().add(cc2);
		cc1.addListener(Change.class, new OnChange() {
			//@Override
			public void onEvent(Change evt) {
				Js.alert("Choice 1 changed!");
			}
		});
		cc1.addListener(Check.class, new OnCheck() {
			//@Override
			public void onEvent(Check evt) {
				Js.alert("Choice 1 checked!");
			}
		});
		cc1.addListener(Uncheck.class, new OnUncheck() {
			//@Override
			public void onEvent(Uncheck evt) {
				Js.alert("Choice 1 unchecked!");
			}
		});
		cc2.addListener(Change.class, new OnChange() {
			//@Override
			public void onEvent(Change evt) {
				Js.alert("Choice 2 changed!");
			}
		});
		cc2.addListener(Check.class, new OnCheck() {
			//@Override
			public void onEvent(Check evt) {
				Js.alert("Choice 2 checked!");
			}
		});
		cc2.addListener(Uncheck.class, new OnUncheck() {
			//@Override
			public void onEvent(Uncheck evt) {
				Js.alert("Choice 2 unchecked!");
			}
		});
	}

	public static void main(String[] args) {
		new Scriptlets("jsdemo-1.0/ui").add(Groups.class).recompile();
	}
}
