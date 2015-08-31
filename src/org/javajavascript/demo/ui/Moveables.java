
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
import js.user.*;
import jsx.client.Browser;
import jsx.dom.Markups;
import jsx.dom.Styles;
import jsx.dom.query.Path;
import jsx.ui.Viewport;
import jsx.ui.ctrl.Clickable;
import jsx.ui.Component;
import jsx.ui.Widget;
import jsx.ui.dd.Draggable;
import jsx.ui.dd.Mouse;
import jsx.ui.event.Click;
import jsx.ui.event.OnClick;
import jsx.ui.html.Button;

public final class Moveables extends JsApplet
{
	private static final long serialVersionUID = 8842700543175606669L;

	//@Override
	public void onReady() {
		Js.alert(Browser.userAgent.var());

		Button mb = new Button("DRAGGABLE", "Draggable");
		mb.addListener(Click.class, new OnClick() {
			//@Override
			public void onEvent(Click evt) {
				Js.win().alert("Hello Moveable!");
			}
		});
		Clickable b = new Clickable(Markups.button("MOVEABLE", "Moveable"));
		Mouse h = Mouse.getMouse(mb.unwrap());
		Mouse.setDelay(h, 1000);
		new Draggable(mb.unwrap(), h);
		Draggable d = new Draggable(b.unwrap(), h);
		d.limit(Draggable.LIMIT_X);
		ObjectLike p = new Initializer().var();
		Styles.left(p, "100px");
		Styles.top (p, "100px");
		Component.applyStyle(mb.unwrap(), p);
		Styles.left(p, "320px");
		Styles.top (p, "120px");
		Component.applyStyle(b.unwrap(), p);

		Viewport.get().getContainer().add(new Vars<Widget>().add(mb).add(b).var());

		ArrayLike<JsNode> nodes = new Path().add("body").add("button").select();
		Js.alert(nodes.length());
	}

	public static void main(String[] args) {
		new Scriptlets("jsdemo-1.0/ui").add(Moveables.class).recompile();
	}
}
