
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
import jsx.Code;
import jsx.client.Browser;
import jsx.ui.Viewport;
import jsx.ui.css.StyleSheets;

public final class ClickTrees extends JsApplet
{
	private static final long serialVersionUID = 17L;

	//@Override
	public void onReady() {
		Js.alert(Browser.userAgent.var());
		StyleSheets.link(
				Code.join("css", "/", "demo"),
				StyleSheets.css(ClickTree.class)
		);

		ClickTree t2 = new ClickTree();
		t2.addClickable("Tree node 1 level 2");
		t2.addClickable("Tree node 2 level 2");
		t2.addClickable("Tree node 3 level 2");
		ClickTree t1 = new ClickTree();
		t1.addClickable("Tree node 1 level 1");
		t1.addClickable("Tree node 2 level 1");
		t1.addClickable("Tree node 3 level 1", t2);
		t1.addClickable("Tree node 4 level 1");
		ClickTree t = new ClickTree();
		t.addClickable("Tree node 1 level 0");
		t.addClickable("Tree node 2 level 0", t1);
		t.addClickable("Tree node 3 level 0");
		t.addClickable("Tree node 4 level 0");
		t.addClickable("Tree node 5 level 0");
		t.addClickable("Tree node 6 level 0");
		t.addClickable("Tree node 7 level 0");
		Viewport.get().add(t);
	}

	public static void main(String[] args) {
		new Scriptlets("jsdemo-1.0/ui").add(ClickTrees.class).recompile();
	}
}
