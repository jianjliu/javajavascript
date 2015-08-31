
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
import jsx.graphic.SVG;
import jsx.ui.Component;

public final class SVGs extends JsApplet
{
	private static final long serialVersionUID = 14L;

	//@Override
	public void onReady() {
		Component e = SVG.svg();
		Component.appendChild(Component.body(), e);
		SVG.viewBox(e, 0, 0, 600, 500);
		Component.setAttribute(e, SVG.WIDTH , 600);
		Component.setAttribute(e, SVG.HEIGHT, 500);
		Component path1 = SVG.path(new Vars<String>()
				.add(SVG.moveTo( 40, 120))
				.add(SVG.lineTo(300, 250))
				.add(SVG.moveTo( 60, 100))
				.add(SVG.lineTo(200, 350))
				.var());
		SVG.stroke(path1, "red");
		SVG.strokeWidth(path1, 4);
		Component.appendChild(e, path1);
		Component path2 = SVG.path(new Vars<String>()
				.add(SVG.moveTo( 30, 130))
				.add(SVG.lineTo(330, 150))
				.add(SVG.moveTo(160, 10))
				.add(SVG.lineTo( 20, 450))
				.var());
		SVG.stroke(path2, "blue");
		SVG.strokeWidth(path2, 3);
		Component.appendChild(e, path2);
//		Component.detach(path1);
	}

	public static void main(String[] args) {
		new Scriptlets("jsdemo-1.0/vect").add(SVGs.class).recompile();
	}
}
