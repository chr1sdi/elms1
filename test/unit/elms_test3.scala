package unit

import org.specs2.mutable._
import models._


class elms_test3 extends Specification{
  "Specification for Registrations in MongoDB take_2" should {
    "start with empty database" in {
      Registrations.getRegistrationList must have size(0)
    }

  }
}
