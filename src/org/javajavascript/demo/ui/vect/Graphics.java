
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

package org.javajavascript.demo.ui.vect;

import com.jrecompiler.Scriptlets;

import js.*;
import jsx.ui.Component;
import jsx.ui.dd.Mouse;
import jsx.ui.vect.Graphic;
import jsx.ui.vect.draw.Paint;

public final class Graphics extends JsApplet
{
	private static final long serialVersionUID = 14L;

	//@Override
	public void onReady() {
		Paint g = new Paint();
		Graphic.setSize(g, 600, 400);
		Component e = g.unwrap();
		Component.appendChild(Component.body(), e);
		Component path1 = Graphic.path(new Vars<String>()
				.add(Graphic.moveTo( 40, 120))
				.add(Graphic.lineTo(300, 250))
				.add(Graphic.moveTo( 60, 100))
				.add(Graphic.lineTo(200, 350))
				.var());
		Graphic.stroke(path1, "red");
		Graphic.strokeWidth(path1, 4);
		Graphic.add(g, path1);
		Component path2 = Graphic.path(new Vars<String>()
				.add(Graphic.moveTo( 30, 130))
				.add(Graphic.lineTo(330, 150))
				.add(Graphic.moveTo(160, 10))
				.add(Graphic.lineTo( 20, 450))
				.var());
		Graphic.stroke(path2, "blue");
		Graphic.strokeWidth(path2, 3);
		Graphic.add(g, path2);
		g.attach(Mouse.getMouse(e));
	}

	public static void main(String[] args) {
		new Scriptlets("jsdemo-1.0/vect").add(Graphics.class).recompile();
	}
}
