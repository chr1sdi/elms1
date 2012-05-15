package controllers


import play.api._
import play.api.data._
import play.api.data.Forms._
import play.api.data.validation.Constraints._
import play.api.mvc._
import models._
import org.joda.time.DateTime

object Registrations extends Controller {

  val newRegistrationForm = Form(
    tuple(
      "firstName" -> nonEmptyText,
      "lastName" -> nonEmptyText,
      "profession" -> nonEmptyText,
      "yearsOfExperience" -> number
    )
  )

  val identityInfo = Form {
    single("id" -> text)
  }

  def viewRegistrations = Action {
    Ok(views.html.registrationList(models.Registrations.getRegistrationList))
  }

  def addNew() = Action {
    Ok(views.html.newRegistration())
  }

  private def goToRegistrationList: Result = {
    Ok(views.html.registrationList(models.Registrations.getRegistrationList))

  }

  private def showError(errorMessage: String, form: Form[(String, String, String, Int)]): Result = {
    BadRequest(views.html.error(errorMessage))
  }

  private def showError(errorMessage: String): Result = BadRequest(views.html.error(errorMessage))


  def saveNew = Action {
    implicit request => {
      newRegistrationForm.bindFromRequest.fold(
        errors => showError("something wend terribly wrong while adding", errors),
        reg => {
          val (firstName, lastName, profession, expYears) = reg
          models.Registrations.addNew(Registration(firstName, lastName, profession, expYears))
          goToRegistrationList

        }

      )
    }
  }

  def delete = Action {
    implicit request =>
      identityInfo.bindFromRequest.fold(
        errors => showError("something went wrong with deletion"),
        delInfo => {
          val id = delInfo
          models.Registrations.remove(id)
          goToRegistrationList
        }
      )
  }

  def confirm = Action {
    implicit request =>
      identityInfo.bindFromRequest.fold(
        errors => showError("something went wrong with confirming"),
        confInfo => {
          models.Registrations.confirm(confInfo)
          goToRegistrationList
        }
      )
  }
}
