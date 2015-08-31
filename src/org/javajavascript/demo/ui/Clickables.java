
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
import jsx.dom.Markups;
import jsx.ui.Viewport;
import jsx.ui.ctrl.Clickable;
import jsx.ui.ctrl.DblClickable;
import jsx.ui.event.Click;
import jsx.ui.event.DblClick;
import jsx.ui.event.OnClick;
import jsx.ui.event.OnDblClick;

public final class Clickables extends JsApplet
{
	private static final long serialVersionUID = 155L;

	//@Override
	public void onReady() {
		Js.alert(Browser.userAgent.var());
		Clickable c = new Clickable(Markups.button("CLICKABLE", "The Clickable"));
		c.addListener(Click.class, new OnClick() {
			//@Override
			public void onEvent(Click evt) {
				Js.win().alert("Hello The Button1!");
			}
		});
		Viewport.get().add(c);
		DblClickable dc = new DblClickable("<span>Double-click here!</span>");
		Viewport.get().add(dc);
		dc.addListener(DblClick.class, new OnDblClick() {
			//@Override
			public void onEvent(DblClick evt) {
				Js.alert("Double clicked!");
			}
		});
	}

	public static void main(String[] args) {
		new Scriptlets("jsdemo-1.0/ui").add(Clickables.class).recompile();
	}
}
