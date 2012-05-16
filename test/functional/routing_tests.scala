package functional

import org.specs2.mutable._
import play.api.test._
import play.api.test.Helpers._
import models.Registration

class routing_tests extends Specification{
  "Current routing" should {

    "respond to / with Index Page" in {
      val Some(result) = routeAndCall(FakeRequest(GET,"/"))

      status(result) must equalTo(OK)
      contentType(result) must beSome("text/html")
      contentAsString(result) must contain("home page")
    }

    "respond to /registrations/view with Registration list page" in {
      val Some(result) = routeAndCall(FakeRequest(GET,"/registrations/view"))

      status(result) must equalTo(OK)
      contentType(result) must beSome("text/html")
      contentAsString(result) must contain("List of all confirmed registrations:")
    }

    "respond to /registration/add with Add new registration page" in{
      val Some(result) = routeAndCall(FakeRequest(GET, "/registrations/add"))

      status(result) must equalTo(OK)
      contentType(result) must beSome("text/html")
      contentAsString(result) must contain("ew registration form")
    }
  }

    "List of all registrations" should{
      "print message 'There is no ppl' when empty DB" in{
        val retrievedHTML = views.html.registrationList(List.empty)

        contentType(retrievedHTML) must equalTo("text/html")
        contentAsString(retrievedHTML) must contain("Sorry gringo no people")
      }

      "display table with registrations when registrations in db" in {
        val nonEmptyList = List(Registration("testFirstName", "testLastName", "testProfession", 2))

        val retrievedHTML = views.html.registrationList(nonEmptyList)

        contentType(retrievedHTML) must equalTo("text/html")
        contentAsString(retrievedHTML) must contain("testFirstName")
        contentAsString(retrievedHTML) must contain("testLastName")
        contentAsString(retrievedHTML) must contain("testProfession")

      }
    }


}

