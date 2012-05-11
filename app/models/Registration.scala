package models

import org.joda.time.DateTime


case class Registration(firstName: String, lastName: String,
                        profession: String, yearsOfExperience: Int = 0, isConfirmed: Boolean = false,
                        confirmationDate: Option[DateTime] = None,
                        id: Option[Int] = None)


object Registrations {

  private var isInitialized=false
  private var registrationList = List[Registration]()




  def addNew(registration:Registration){
    registrationList=registrationList ++ List(registration)
  }

  def getRegistrationList: List[Registration] = {
    if (!isInitialized) {
      initializeWithSampleData
      isInitialized=true
    }
    registrationList
  }

  private def initializeWithSampleData{
    addNew(Registration("zenon","zenons","dev",4,true,Option(DateTime.now)))
    addNew(Registration("Some","bloke","gong banger",2,false))
  }

}