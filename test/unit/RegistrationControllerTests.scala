package unit

import org.specs2._
import models._
import specification._


class RegistrationControllerTests extends Specification{

  private var registrationList:List[Registration] = List.empty



  def is=

  "Specification for Registrations in MongoDB"    ^ br^
    "Given database ${test1}"                     ^ setDbTo^
    "and cleared all registrations ${dfds}"       ^ clearDB^
    "When user requests list of registrations"    ^ getRegistrationListFromDB^
    "Then returned list should be empty"          ^ checkIfListIsEmpty^
                                                  end

  object setDbTo extends Given[Unit]{
    def extract(spec:String) =  Registrations.setDatabaseTo(extract1(spec))
  }
  object clearDB extends When[Any,Any] {
    def extract(obj:Any, spec:String) = Registrations.clearAll
  }

  object getRegistrationListFromDB extends  When[Any,Any] {
    def extract(obj:Any, spec:String) = registrationList = Registrations.getRegistrationList
  }
  object checkIfListIsEmpty extends Then[Any] {
    def extract(obj:Any, spec:String) = registrationList must beEmpty
  }
}
