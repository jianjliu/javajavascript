
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

import js.Js;
import jsx.Template;
import jsx.ui.Component;
import jsx.ui.Tree;
import jsx.ui.ctrl.Clickable;
import jsx.ui.event.Click;
import jsx.ui.event.OnClick;

public final class ClickTree extends Tree
{
	public ClickTree() {
		super();
	}

	public Clickable addClickable(String node) {
		Component e = add(Template.apply(Template.SPAN, node));
		e.addListener(Click.class, new OnClick() {
			//@Override
			public void onEvent(Click evt) {
				Js.alert("An item clicked!");
			}
		});
		return Clickable.get(e);
	}

	public Clickable addClickable(String node, Tree sub) {
		Component e = super.add(Template.apply(Template.SPAN, node), sub);
		ini(e).var(PREVENTCLICK, true);
		return Clickable.get(e);
	}
}
