package controllers.api
 
import javax.inject._
import play.api.mvc._
import play.api.libs.json._
import models.{Filosofo}
 
class FilosofoController @Inject()(
    cc: ControllerComponents
) extends AbstractController(cc) {
 
    implicit val filosofoFormat = Json.format[Filosofo]
 
    //http://localhost:9000/api/filosofos
    def getAllFilosofos = Action {
        val obrasNietzsche:List[String] = List("Así habló Zaratustra", "El anticristo", "La gaya ciencia","La genealogía de la moral")
        val nietzsche = new Filosofo(1, "Friedrich Nietzsche", "Alemania", obrasNietzsche)
        val obrasKant:List[String] = List("Crítica de la razón pura","Crítica del juicio")
        val kant = new Filosofo(2, "Immanuel Kant", "Prusia", obrasKant)
        val listaFilosofos:List[Filosofo] = List(nietzsche,kant)
        Ok(Json.toJson(listaFilosofos))
    }
}