
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

package org.javajavascript.demo;

import org.javajavascript.demo.core.Alerts;
import org.javajavascript.demo.core.Confirms;
import org.javajavascript.demo.core.Formats;
import org.javajavascript.demo.core.Functions;
import org.javajavascript.demo.core.Prompts;
import org.javajavascript.demo.core.Timeouts;
import org.javajavascript.demo.core.lang.ArrayLiterals;
import org.javajavascript.demo.core.lang.Arrays;
import org.javajavascript.demo.core.lang.Breaks;
import org.javajavascript.demo.core.lang.Cast;
import org.javajavascript.demo.core.lang.Dates;
import org.javajavascript.demo.core.lang.DoWhiles;
import org.javajavascript.demo.core.lang.Doubles;
import org.javajavascript.demo.core.lang.Each;
import org.javajavascript.demo.core.lang.Finalizables;
import org.javajavascript.demo.core.lang.Floats;
import org.javajavascript.demo.core.lang.HashCode;
import org.javajavascript.demo.core.lang.Integers;
import org.javajavascript.demo.core.lang.Longs;
import org.javajavascript.demo.core.lang.Objects;
import org.javajavascript.demo.core.lang.Sine;
import org.javajavascript.demo.core.lang.Strings;
import org.javajavascript.demo.core.lang.Switches;
import org.javajavascript.demo.core.lang.TheRef;
import org.javajavascript.demo.core.lang.TheVar;
import org.javajavascript.demo.core.lang.Throws;
import org.javajavascript.demo.core.lang.ToString;
import org.javajavascript.demo.core.lang.TypeOf;
import org.javajavascript.demo.core.lang.Whiles;
import org.javajavascript.demo.http.AppletAjax;
import org.javajavascript.demo.rpc.AppletEcho;
import org.javajavascript.demo.rpc.AppletString;
import org.javajavascript.demo.rpc.reflect.AppletAsync;
import org.javajavascript.demo.rpc.reflect.AppletRemote;
import org.javajavascript.demo.ui.Borders;
import org.javajavascript.demo.ui.Checkboxes;
import org.javajavascript.demo.ui.ClickMenus;
import org.javajavascript.demo.ui.ClickTrees;
import org.javajavascript.demo.ui.Clickables;
import org.javajavascript.demo.ui.Containers;
import org.javajavascript.demo.ui.Dialogs;
import org.javajavascript.demo.ui.Fits;
import org.javajavascript.demo.ui.Groups;
import org.javajavascript.demo.ui.Menus;
import org.javajavascript.demo.ui.Moveables;
import org.javajavascript.demo.ui.ProgressBars;
import org.javajavascript.demo.ui.Radios;
import org.javajavascript.demo.ui.Trees;
import org.javajavascript.demo.ui.Uncheckables;
import org.javajavascript.demo.ui.vect.Canvases;
import org.javajavascript.demo.ui.vect.Curves;
import org.javajavascript.demo.ui.vect.Graphics;
import org.javajavascript.demo.ui.vect.SVGs;
import org.javajavascript.demo.ui.vect.VMLs;

import com.jrecompiler.Scriptlets;

public final class _Build
{
	public static void main(String[] args) {
		// Re-compile all the applets into JavaScript at one shot.
		new Scriptlets("jsdemo-1.0/core").add(Alerts.class).recompile();
		new Scriptlets("jsdemo-1.0/core").add(Confirms.class).recompile();
		new Scriptlets("jsdemo-1.0/core").add(Formats.class).recompile();
		new Scriptlets("jsdemo-1.0/core").add(Functions.class).recompile();
		new Scriptlets("jsdemo-1.0/core").add(Prompts.class).recompile();
		new Scriptlets("jsdemo-1.0/core").add(Timeouts.class).recompile();

		new Scriptlets("jsdemo-1.0/core/lang").add(ArrayLiterals.class).recompile();
		new Scriptlets("jsdemo-1.0/core/lang").add(Arrays.class).recompile();
		new Scriptlets("jsdemo-1.0/core/lang").add(Breaks.class).recompile();
		new Scriptlets("jsdemo-1.0/core/lang").add(Cast.class).recompile();
		new Scriptlets("jsdemo-1.0/core/lang").add(Dates.class).recompile();
		new Scriptlets("jsdemo-1.0/core/lang").add(Doubles.class).recompile();
		new Scriptlets("jsdemo-1.0/core/lang").add(DoWhiles.class).recompile();
		new Scriptlets("jsdemo-1.0/core/lang").add(Each.class).recompile();
		new Scriptlets("jsdemo-1.0/core/lang").add(Finalizables.class).recompile();
		new Scriptlets("jsdemo-1.0/core/lang").add(Functions.class).recompile();
		new Scriptlets("jsdemo-1.0/core/lang").add(Floats.class).recompile();
		new Scriptlets("jsdemo-1.0/core/lang").add(HashCode.class).recompile();
		new Scriptlets("jsdemo-1.0/core/lang").add(Integers.class).recompile();
		new Scriptlets("jsdemo-1.0/core/lang").add(Longs.class).recompile();
		new Scriptlets("jsdemo-1.0/core/lang").add(Objects.class).recompile();
		new Scriptlets("jsdemo-1.0/core/lang").add(Sine.class).recompile();
		new Scriptlets("jsdemo-1.0/core/lang").add(Strings.class).recompile();
		new Scriptlets("jsdemo-1.0/core/lang").add(Switches.class).recompile();
		new Scriptlets("jsdemo-1.0/core/lang").add(TheRef.class).recompile();
		new Scriptlets("jsdemo-1.0/core/lang").add(TheVar.class).recompile();
		new Scriptlets("jsdemo-1.0/core/lang").add(Throws.class).recompile();
		new Scriptlets("jsdemo-1.0/core/lang").add(ToString.class).recompile();
		new Scriptlets("jsdemo-1.0/core/lang").add(TypeOf.class).recompile();
		new Scriptlets("jsdemo-1.0/core/lang").add(Whiles.class).recompile();

		new Scriptlets("jsdemo-1.0/http").add(AppletAjax.class).recompile();
		new Scriptlets("jsdemo-1.0/rpc").add(AppletEcho.class).recompile();
		new Scriptlets("jsdemo-1.0/rpc").add(AppletString.class).recompile();

		new Scriptlets("jsdemo-1.0/rpc").add(AppletAsync.class).recompile();
		new Scriptlets("jsdemo-1.0/rpc").add(AppletRemote.class).recompile();

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

		new Scriptlets("jsdemo-1.0/vect").add(Canvases.class).recompile();
		new Scriptlets("jsdemo-1.0/vect").add(Curves.class).recompile();
		new Scriptlets("jsdemo-1.0/vect").add(Graphics.class).recompile();
		new Scriptlets("jsdemo-1.0/vect").add(SVGs.class).recompile();
		new Scriptlets("jsdemo-1.0/vect").add(VMLs.class).recompile();
	}
}
