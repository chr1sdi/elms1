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
      "yearsOfExperience" -> number
    )
  )

  def viewRegistrations = Action{
    Ok(views.html.registrationList(models.Registrations.getRegistrationList))
  }

  def addNew() = Action{
    Ok(views.html.newRegistration())
  }

  def submit = Action{

    implicit request=> {
      newRegistrationForm.bindFromRequest.fold(
        errors => Ok(views.html.error("something wend terribly wrong")),
        reg=>{
          val (firstName,lastName,expYears) = reg
          models.Registrations.addNew(Registration(firstName,lastName,"test prof",expYears))
        }

      )


      //models.Registrations.addNew(Registration(s1,"lName","prof",1))
      Ok(views.html.registrationList(models.Registrations.getRegistrationList))
    }
      /*newRegistrationForm.bindFromRequest().fold(
      errors => Ok(views.html.error("something went bad")),
      reg => {
        val (fName, lName, years) = reg
        val registration = Registration("asdfasdfasdfasdfasdf", "asdfasdfasdf", "temp professino", 2)

        models.Registrations.addNew(registration)


        Redirect(routes.Application.index())
      }
    )
                                                                 */

   //models.Registrations.addNew(Registration("fNa11me","lName","prof",1))
    //Redirect(routes.Registrations.viewRegistrations())

  }
}
