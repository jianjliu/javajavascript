
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

import js.Js;
import js.JsApplet;
import jsx.dom.Markups;
import jsx.ui.Container;
import jsx.ui.Viewport;
import jsx.ui.layout.CardLayout;
import jsx.ui.ctrl.Clickable;
import jsx.ui.event.Click;
import jsx.ui.event.OnClick;

public final class Fits extends JsApplet
{
	private static final long serialVersionUID = 8309130070523754910L;

	//@Override
	public void onReady() {
		Viewport.get().getContainer().setLayout(
				new CardLayout()
		);
		Container c = new Container();
		Viewport.get().getContainer().add(c);
		c.setLayout(
				new CardLayout()
		);
		Clickable b = new Clickable(Markups.button("MY BUTTON", "My Button"));
		c.add(b);
		b.addListener(Click.class, new OnClick() {
			//@Override
			public void onEvent(Click evt) {
				Js.win().alert("Hello Button!");
			}
		});
	}

	public static void main(String[] args) {
		new Scriptlets("jsdemo-1.0/ui").add(Fits.class).recompile();
	}
}
