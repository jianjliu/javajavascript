
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
import jsx.ui.Viewport;
import jsx.ui.box.Dialog;
import jsx.ui.box.MessageBox;
import jsx.ui.fx.FadeIn;
import jsx.ui.fx.Transform;

public final class Dialogs extends JsApplet
{
	private static final long serialVersionUID = 14444L;

	//@Override
	public void onReady() {
		Js.alert(Browser.userAgent.var());

		MessageBox mb = new MessageBox("Test Box", "A testing message.");
		Viewport.get().add(mb);
		Dialog dlg = new Dialog("Test Dialog");
		Viewport.get().add(dlg);
		new FadeIn(dlg.unwrap());
		new Transform(dlg.unwrap());
	}

	public static void main(String[] args) {
		new Scriptlets("jsdemo-1.0/ui").add(Dialogs.class).recompile();
	}
}
