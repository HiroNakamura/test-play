package models


//val connection = DB.getConnection("mariadb")

case class Cliente (
    id: Int,
    nombre: String, 
    apellido:String, 
    servicio_id:String
)