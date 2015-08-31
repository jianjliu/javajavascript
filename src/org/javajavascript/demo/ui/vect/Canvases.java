
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
import jsx.ui.vect.Canvas;
import jsx.ui.vect.canvas.CanvasLine;
import jsx.ui.vect.canvas.CanvasPaint;
import jsx.ui.vect.canvas.CanvasSketch;

public final class Canvases extends JsApplet
{
	private static final long serialVersionUID = 14L;

	//@Override
	public void onReady() {
		Component d1 = new Component("<div style='left:30px;top:50px;position:absolute;border:2px solid black;'></div>");
		Component d2 = new Component("<div style='position:absolute;left:350px;top:10px;width:304px;height:404px;border:2px solid black;'></div>");
		Component d3 = new Component("<div style='left:680px;top:50px;position:relative;width:304px;height:404px;border:4px solid black;'></div>");

		Component.appendChild(Component.body(), d1);
		Component.appendChild(Component.body(), d2);
		Component.appendChild(Component.body(), d3);

		Canvas c1 = Canvas.create(Component.getHTMLElement(d1));
		Canvas.width (c1, 300);
		Canvas.height(c1, 400);
		Canvas.strokeStyle(c1, "red");
		Canvas.lineWidth(c1, 3);
		Canvas c2 = Canvas.create(Component.getHTMLElement(d2));
		Canvas.width (c2, 300);
		Canvas.height(c2, 400);
		Canvas.strokeStyle(c2, "blue");
		Canvas.lineWidth(c2, 3);
		Canvas c3 = Canvas.create(Component.getHTMLElement(d3));
		Canvas.width (c3, 300);
		Canvas.height(c3, 400);
		Canvas.strokeStyle(c3, "green");
		Canvas.lineWidth(c3, 3);

		new CanvasPaint(c1).attach(Mouse.getMouse(c1.unwrap()));
		new CanvasSketch(c2).attach(Mouse.getMouse(c2.unwrap()));
		new CanvasLine(c3).attach(Mouse.getMouse(c3.unwrap()));
	}

	public static void main(String[] args) {
		new Scriptlets("jsdemo-1.0/vect").add(Canvases.class).recompile();
	}
}
