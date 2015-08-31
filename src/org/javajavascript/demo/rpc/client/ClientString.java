
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

package org.javajavascript.demo.rpc.client;

import org.javajavascript.demo.rpc.common.XMLHttpString;

import js.Initializer;
import js.Vars;

public final class ClientString extends XMLHttpString
{
	public static final String UPPER = "../ServletStringUpper";
	public static final String LOWER = "../ServletStringLower";

	public ClientString(String value) {
		super(new Initializer().set(XMLHttpString.value, value).var());
	}

	@Override
	public String lower() {
		return (String)call(
				LOWER,
				new Vars<String>().var()
		);
	}

	@Override
	public String upper() {
		return (String)call(
				UPPER,
				new Vars<String>().var()
		);
	}
}
