
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

import js.Js;
import js.JsApplet;
import jsx.TaskManager;
import jsx.client.Browser;
import jsx.ui.ProgressBar;
import jsx.ui.Viewport;
import jsx.ui.ctrl.Clickable;
import jsx.ui.event.Click;
import jsx.ui.event.OnClick;
import jsx.ui.event.Progress;

public final class ProgressBars extends JsApplet
{
	private static final long serialVersionUID = 17L;

	//@Override
	public void onReady() {
		Js.alert(Browser.userAgent.var());

		final ProgressBar pb = new ProgressBar();
		final TaskManager tm = new TaskManager(100);
		Viewport.get().add(pb);
		Clickable c = Clickable.get(pb.unwrap());
		c.addListener(Click.class, new OnClick() {
			//@Override
			public void onEvent(Click evt) {
				for (int i = 0; i < 101; i++) {
					pb.fire(new Progress(i), tm);
				}
			}
		});
	}

	public static void main(String[] args) {
		new Scriptlets("jsdemo-1.0/ui").add(ProgressBars.class).recompile();
	}
}
