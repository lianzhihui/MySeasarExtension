
package com.len.myseasarextension.action;

import org.seasar.cubby.action.Action;
import org.seasar.cubby.action.ActionClass;
import org.seasar.cubby.action.ActionResult;
import org.seasar.cubby.action.Forward;
import org.seasar.cubby.action.Path;


@ActionClass
@Path("/")
public class IndexAction extends Action {

	@Path("/")
	public ActionResult index() {
		return new Forward("/index.html");
	}
}
