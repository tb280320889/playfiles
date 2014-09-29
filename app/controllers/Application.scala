package controllers

import play.api._
import play.api.mvc._
import play.i18n.Lang

object Application extends Controller {

  def index = Action {
		implicit def defaultLang =Lang.forCode("fr")
    Redirect(routes.Products.list())
  }

}