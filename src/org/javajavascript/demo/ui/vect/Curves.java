
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
import jsx.motion.Fourier;
import jsx.motion.Linear;
import jsx.motion.Spline;
import jsx.ui.Component;
import jsx.ui.vect.Graphic;

public final class Curves extends JsApplet
{
	private static final long serialVersionUID = 14L;

	//@Override
	public void onReady() {
		Graphic g = new Graphic();
		Graphic.setSize(g, 600, 400);
		Component e = g.unwrap();
		Component.appendChild(Component.body(), e);
		ArrayLike<Number> curve = new Vars<Number>()
			.add(1).add(2).add(3).add(25).add(51).add(52).add(53).var();
		Component path1 = Graphic.curve(g, new Linear(curve), 50);
		Graphic.fill(path1, "none");
		Graphic.stroke(path1, "red");
		Graphic.strokeWidth(path1, 1);
		Component path2 = Graphic.curve(g, new Fourier(curve), 50);
		Graphic.fill(path2, "none");
		Graphic.stroke(path2, "blue");
		Graphic.strokeWidth(path2, 1);
		Component path3 = Graphic.curve(g, new Spline(curve), 50);
		Graphic.fill(path3, "none");
		Graphic.stroke(path3, "green");
		Graphic.strokeWidth(path3, 1);
	}

	public static void main(String[] args) {
		new Scriptlets("jsdemo-1.0/vect").add(Curves.class).recompile();
	}
}
