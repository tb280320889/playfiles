package controllers

import models.Product
import play.api.mvc.{Action, Controller}

/** IntelliJ IDEA
	* Created by Administrator
	* Date : 14-9-26 
	* Time : 上午1:19 
	*/

object Products extends Controller {
	def list = Action { implicit request =>
		val products = Product.findAll
		Ok(views.html.products.list(products))
	}

}
