
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

package org.javajavascript.demo.core.lang;

import com.jrecompiler.Scriptlets;

public final class _Build
{
	public static void main(String[] args) {
		// Re-compile all the applets into JavaScript at one shot.
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
	}
}
