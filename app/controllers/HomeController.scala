package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.db._


/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  //http://localhost:9000/
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  //http://localhost:9000/saludo
  def saludo() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.saludo())
  }

}
