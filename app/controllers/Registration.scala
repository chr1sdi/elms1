package controllers


import play.api._
import play.api.mvc._
import models._

object Registrations extends Controller {

  def listOfConfirmedRegistrations = Action{

    val regi=List(
      new Registration("zenon","zenons","dev",4,true),
      new Registration("Some","bloke","gong banger",2,false));

    Ok(views.html.registration_list(regi))
  }
}
