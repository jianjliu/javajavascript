
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

package org.javajavascript.demo.core.io;

import java.io.StringReader;

import org.jscripter.sim.core.Core;

import com.jrecompiler.Scriptlets;

import js.*;
import jsx.client.Browser;

// Test IO and JJTree
public class IOs extends JsApplet
{
	private static final long serialVersionUID = 1L;

	@Override
	public void onReady() {
		Js.alert(Browser.userAgent.var());
		String str = "/**\n * <p>An abstract base class for JavadocParser {@link Token}.</p>\n *\n * @author <a href=\"mailto:jianjunliu@126.com\">J.J.Liu (Jianjun Liu)</a> at <a href=\"http://www.javadoq.com\" target=\"_blank\">http://www.javadoq.com</a>\n */";
		try {
//			Js.alert(new JavadocParser(new StringReader(str)).CompilationUnit().firstToken.beginColumn);
			new JavadocParser(new StringReader(str)).CompilationUnit();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Js.alert(Browser.userAgent.var());
	}

	public static void main(String[] args) {
		// Initialize and start it with JS Simulation Core
		Js.init(Core.get());
		new IOs().start();
		// Re-compile the class into JavaScript code
		new Scriptlets("jsdemo-1.0/core/io").add(IOs.class).recompile();
	}
}
