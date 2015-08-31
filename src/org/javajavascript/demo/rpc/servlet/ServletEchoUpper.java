
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

package org.javajavascript.demo.rpc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.ParserConfigurationException;

import org.javajavascript.demo.rpc.server.ServerEcho;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;


import js.ArrayLike;
import js.Js;
import js.ObjectLike;
import jsx.http.rpc.server.XMLHttpServer;

public class ServletEchoUpper extends HttpServlet
{
	private static final long serialVersionUID = -6417185601858032659L;

	static {
		Js.init(org.jscripter.sim.server.ServerSide.get());
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException {
		response.setContentType("text/xml");
		response.setCharacterEncoding("utf-8");
		try {
			PrintWriter pw = response.getWriter();
			pw.println(
					new XMLHttpServer() {
						@Override
						protected Object call(ObjectLike base, ArrayLike<?> args) {
							return new ServerEcho(base).upper((String)args.get(0));
						}
					}.respond(new InputSource(request.getReader()))
			);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}
	}
}
