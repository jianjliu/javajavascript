
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
import jsx.ui.event.Click;
import jsx.ui.event.OnClick;
import jsx.ui.html.Button;

public final class ClickMenus extends JsApplet
{
	private static final long serialVersionUID = 15L;

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

		ClickMenu m1 = new ClickMenu("Menu01");
		m1.add(new ClickMenu("MenuItem11aaa"));
		m1.add(new ClickMenu("MenuItem12b"));
		m1.add(new ClickMenu("MenuItem13ccccc"));
		m1.add(new ClickMenu("MenuItem14"));
		ClickMenu m2 = new ClickMenu("Menu02");
		m2.add(new ClickMenu("MenuItem21"));
		ClickMenu m22 = new ClickMenu("Menu22");
		m22.add(new ClickMenu("MenuItem221"));
		m22.add(new ClickMenu("MenuItem222"));
		m22.add(new ClickMenu("MenuItem223"));
		m2.add(m22);
		m2.add(new ClickMenu("MenuItem23"));
		m2.add(new ClickMenu("MenuItem24"));
		ClickMenu m3 = new ClickMenu("Menu03");
		m3.add(new ClickMenu("MenuItem31"));
		m3.add(new ClickMenu("MenuItem32"));
		m3.add(new ClickMenu("MenuItem33"));
		m3.add(new ClickMenu("MenuItem34"));
		ClickMenu m4 = new ClickMenu("Menu04");
		m4.add(new ClickMenu("MenuItem41"));
		m4.add(new ClickMenu("MenuItem42"));
		m4.add(new ClickMenu("MenuItem43"));
		m4.add(new ClickMenu("MenuItem44"));
		m4.addListener(Click.class, new OnClick() {
			//@Override
			public void onEvent(Click arg0) {
				Js.alert("A menu clicked!");
			}
		});
		Viewport.get().add(new Vars<Widget>().add(tb).add(m1).add(m2).add(m3).add(m4).var());
	}

	public static void main(String[] args) {
		new Scriptlets("jsdemo-1.0/ui").add(ClickMenus.class).recompile();
	}
}
