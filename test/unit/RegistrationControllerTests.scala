package unit

import org.specs2.mutable._
import models._


class RegistrationControllerTests extends Specification{
  "Specification for Registrations in MongoDB take_2" should {
    "start with empty database" in {
      Registrations.getRegistrationList must have size(0)
    }

  }
}
