
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

package org.javajavascript.demo.http;

import com.jrecompiler.Scriptlets;

import js.*;
import js.user.*;
import jsx.client.Browser;
import jsx.http.Ajax;
import jsx.http.Http;
import jsx.http.event.HTTPAborted;
import jsx.http.event.HTTPLoaded;
import jsx.http.event.HTTPOpen;
import jsx.http.event.HTTPReceiving;
import jsx.http.event.HTTPSent;
import jsx.http.event.OnHTTPAborted;
import jsx.http.event.OnHTTPLoaded;
import jsx.http.event.OnHTTPOpen;
import jsx.http.event.OnHTTPReceiving;
import jsx.http.event.OnHTTPSent;

public final class AppletAjax extends JsApplet
{
	private static final long serialVersionUID = -7178162438874531586L;

	@Override
	public void onReady() {
		Js.alert(Browser.userAgent.var());

		final Ajax ajax = new Ajax();
//		Ajax.setTimeout(ajax, 20);
		ajax.addListener(HTTPAborted.class, new OnHTTPAborted() {
			public void onEvent(HTTPAborted evt) {
				Js.alert("Aborted");
			}
		});
		ajax.addListener(HTTPOpen.class, new OnHTTPOpen() {
			public void onEvent(HTTPOpen evt) {
				Js.alert("Open");
			}
		});
		ajax.addListener(HTTPSent.class, new OnHTTPSent() {
			public void onEvent(HTTPSent evt) {
				Js.alert("Sent");
			}
		});
		ajax.addListener(HTTPReceiving.class, new OnHTTPReceiving() {
			public void onEvent(HTTPReceiving evt) {
				Js.alert("Recieving");
			}
		});
		ajax.addListener(HTTPLoaded.class, new OnHTTPLoaded() {
			public void onEvent(HTTPLoaded evt) {
				Js.alert("Loaded");
				JsXMLHttpRequest http = HTTPLoaded.getSource(evt).http();
				if (Js.be(http)) {
					if (Js.eq(Http.status(http), 200)) {
						Js.alert(Http.responseText(http));
					} else {
						Js.alert(Http.statusText(http));
					}
				}
			}
		});

		Js.win().alert("Hello Http!");
		ajax.get("../ServletRequest");
	}

	public static void main(String[] args) {
		new Scriptlets("jsdemo-1.0/http").add(AppletAjax.class).recompile();
	}
}
