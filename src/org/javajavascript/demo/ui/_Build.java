
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

public final class _Build
{
	public static void main(String[] args) {
		// Re-compile all the applets into JavaScript at one shot.
		new Scriptlets("jsdemo-1.0/ui").add(Borders.class).recompile();
		new Scriptlets("jsdemo-1.0/ui").add(Checkboxes.class).recompile();
		new Scriptlets("jsdemo-1.0/ui").add(Clickables.class).recompile();
		new Scriptlets("jsdemo-1.0/ui").add(ClickMenus.class).recompile();
		new Scriptlets("jsdemo-1.0/ui").add(ClickTrees.class).recompile();
		new Scriptlets("jsdemo-1.0/ui").add(Containers.class).recompile();
		new Scriptlets("jsdemo-1.0/ui").add(Dialogs.class).recompile();
		new Scriptlets("jsdemo-1.0/ui").add(Fits.class).recompile();
		new Scriptlets("jsdemo-1.0/ui").add(Functions.class).recompile();
		new Scriptlets("jsdemo-1.0/ui").add(Groups.class).recompile();
		new Scriptlets("jsdemo-1.0/ui").add(Menus.class).recompile();
		new Scriptlets("jsdemo-1.0/ui").add(Moveables.class).recompile();
		new Scriptlets("jsdemo-1.0/ui").add(ProgressBars.class).recompile();
		new Scriptlets("jsdemo-1.0/ui").add(Radios.class).recompile();
		new Scriptlets("jsdemo-1.0/ui").add(Trees.class).recompile();
		new Scriptlets("jsdemo-1.0/ui").add(Uncheckables.class).recompile();
	}
}
