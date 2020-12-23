package controllers.api
 
import javax.inject._
import play.api.mvc._
import play.api.libs.json._
import models.{Filosofo}
 
class FilosofoController @Inject()(
    cc: ControllerComponents
) extends AbstractController(cc) {
 
    implicit val filosofoFormat = Json.format[Filosofo]
 
    def getAllFilosofos = Action {
        val obras:List[String] = List("Así habló Zaratustra", "El anticristo", "La gaya ciencia","La genealogía de la moral")
        val filosofo = new Filosofo(1, "Friedrich Nietzsche", "Alemania", obras)
        Ok(Json.toJson(filosofo))
    }
}