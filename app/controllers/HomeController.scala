package controllers

import javax.inject._
import play.api._
import play.api.mvc._


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
