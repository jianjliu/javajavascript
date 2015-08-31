
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
import jsx.ui.Container;
import jsx.ui.Viewport;
import jsx.ui.layout.BorderLayout;
import jsx.ui.ctrl.Clickable;
import jsx.ui.Widget;
import jsx.ui.dd.Resizer;
import jsx.ui.event.Click;
import jsx.ui.event.OnClick;

public final class Containers extends JsApplet
{
	private static final long serialVersionUID = 8842700543175606669L;

	//@Override
	public void onReady() {
		Js.alert(Browser.userAgent.var());

		Container c = new Container();
		Resizer.addResizers(c, Resizer.ALL);
		c.setLayout(new BorderLayout());

		Clickable north = new Clickable(Markups.button("NORTH", "North"));
		Clickable south = new Clickable(Markups.button("SOUTH", "South"));
		Clickable west = new Clickable(Markups.button("WEST", "West"));
		Clickable east = new Clickable(Markups.button("EAST", "East"));
		Clickable center = new Clickable(Markups.button("CENTER", "Center"));
		north.addListener(Click.class, new OnClick() {
			//@Override
			public void onEvent(Click evt) {
				Js.win().alert("Hello North!");
			}
		});
		south.addListener(Click.class, new OnClick() {
			//@Override
			public void onEvent(Click evt) {
				Js.win().alert("Hello South!");
			}
		});
		west.addListener(Click.class, new OnClick() {
			//@Override
			public void onEvent(Click evt) {
				Js.win().alert("Hello West!");
			}
		});
		east.addListener(Click.class, new OnClick() {
			//@Override
			public void onEvent(Click evt) {
				Js.win().alert("Hello East!");
			}
		});
		center.addListener(Click.class, new OnClick() {
			//@Override
			public void onEvent(Click evt) {
				Js.win().alert("Hello Center!");
			}
		});

		c.add(new Vars<Widget>()
				.add(north)
				.add(south)
				.add(west)
				.add(east)
				.add(center)
				.var()
		);

		Viewport.get().getContainer().add(new Vars<Widget>().add(c).var());
	}

	public static void main(String[] args) {
		new Scriptlets("jsdemo-1.0/ui").add(Containers.class).recompile();
	}
}
