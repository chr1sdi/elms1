package controllers

import play.api._
import play.api.data._
import play.api.data.Forms._
import play.api.data.validation.Constraints._
import play.api.mvc._
import models._
import org.joda.time.DateTime

object Error extends Controller{

  def showError(errorMessage:String) = Action{
    Ok(views.html.error(errorMessage))
  }

  def viewRegistrations = Action{

    Ok(views.html.registrationList(models.Registrations.getRegistrationList))
  }
}
