
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
import jsx.dom.Styles;
import jsx.graphic.VML;
import jsx.ui.Component;

public final class VMLs extends JsApplet
{
	private static final long serialVersionUID = 14L;

	//@Override
	public void onReady() {
		Component e = VML.group();
		VML.coordSize(e, 600, 500);
		Component.appendChild(Component.body(), e);
		ObjectLike s = Component.style(e);
		Styles.width (s, "600px");
		Styles.height(s, "500px");
		Component path1 = VML.path(new Vars<String>()
				.add(VML.moveTo( 40, 120))
				.add(VML.lineTo( 300, 250))
				.add(VML.moveTo( 60, 100))
				.add(VML.lineTo( 200, 350))
				.var());
		VML.strokeColor(path1, "red");
		VML.strokeWeight(path1, 4);
		VML.appendChild(e, path1);
		Component path2 = VML.path(new Vars<String>()
				.add(VML.moveTo( 30, 130))
				.add(VML.lineTo(330, 150))
				.add(VML.moveTo(160, 10))
				.add(VML.lineTo( 20, 450))
				.var());
		VML.strokeColor(path2, "blue");
		VML.strokeWeight(path2, 3);
		VML.appendChild(e, path2);
	}

	public static void main(String[] args) {
		new Scriptlets("jsdemo-1.0/vect").add(VMLs.class).recompile();
	}
}
