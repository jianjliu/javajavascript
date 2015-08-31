
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
import jsx.ui.Widget;
import jsx.ui.Viewport;
import jsx.ui.layout.BorderLayout;
import jsx.ui.event.Click;
import jsx.ui.event.OnClick;
import jsx.ui.html.Button;

public final class Borders extends JsApplet
{
	private static final long serialVersionUID = -6193633323752351460L;

	//@Override
	public void onReady() {
		Viewport.hideOverflow();
		Viewport.get().getContainer().setLayout(new BorderLayout());
		Button north = new Button("NORTH", "North");
		Button south = new Button("SOUTH", "South");
		Button west = new Button("WEST", "West");
		Button east = new Button("EAST", "East");
		Button center = new Button("CENTER", "Center");
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
		Viewport.get().getContainer().add(new Vars<Widget>()
				.add(north)
				.add(south)
				.add(west)
				.add(east)
				.add(center)
				.var()
		);
	}

	public static void main(String[] args) {
		new Scriptlets("jsdemo-1.0/ui").add(Borders.class).recompile();
	}
}
