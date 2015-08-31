
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
import jsx.ui.Widget;
import jsx.ui.Viewport;
import jsx.ui.ctrl.Menu;
import jsx.ui.event.Click;
import jsx.ui.event.OnClick;
import jsx.ui.html.Button;

public final class Menus extends JsApplet
{
	private static final long serialVersionUID = 16L;

	//@Override
	public void onReady() {
		Js.alert(Browser.userAgent.var());

		final Button tb = new Button("THE BUTTON", "The Button1");
		tb.addListener(Click.class, new OnClick() {
			//@Override
			public void onEvent(Click evt) {
				Js.win().alert("Hello The Button1!");
			}
		});

		Menu m1 = new Menu("Menu01");
		m1.add(new Menu("MenuItem11aaa"));
		m1.add(new Menu("MenuItem12b"));
		m1.add(new Menu("MenuItem13ccccc"));
		m1.add(new Menu("MenuItem14"));
		Menu m2 = new Menu("Menu02");
		m2.add(new Menu("MenuItem21"));
		Menu m22 = new Menu("Menu22");
		m22.add(new Menu("MenuItem221"));
		m22.add(new Menu("MenuItem222"));
		m22.add(new Menu("MenuItem223"));
		m2.add(m22);
		m2.add(new Menu("MenuItem23"));
		m2.add(new Menu("MenuItem24"));
		Menu m3 = new Menu("Menu03");
		m3.add(new Menu("MenuItem31"));
		m3.add(new Menu("MenuItem32"));
		m3.add(new Menu("MenuItem33"));
		m3.add(new Menu("MenuItem34"));
		Menu m4 = new Menu("Menu04");
		m4.add(new Menu("MenuItem41"));
		m4.add(new Menu("MenuItem42"));
		m4.add(new Menu("MenuItem43"));
		m4.add(new Menu("MenuItem44"));
		m4.addListener(Click.class, new OnClick() {
			//@Override
			public void onEvent(Click arg0) {
				Js.alert("A menu clicked!");
			}
		});
		Viewport.get().add(new Vars<Widget>().add(tb).add(m1).add(m2).add(m3).add(m4).var());
	}

	public static void main(String[] args) {
		new Scriptlets("jsdemo-1.0/ui").add(Menus.class).recompile();
	}
}
