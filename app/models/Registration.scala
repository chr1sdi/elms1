package models

import org.joda.time.DateTime
import collection.mutable.ArrayBuffer


case class Registration(firstName: String, lastName: String,
                        profession: String, yearsOfExperience: Int = 0,
                        var isConfirmed: Boolean = false,
                        var confirmationDate: Option[DateTime] = None,
                        var id: Option[Int] = None)


object Registrations {

  private var isInitialized=false
  private var registrationList = List[Registration]()
  private var currentId=1



  def addNew(registration:Registration){
    registration.id=Option(currentId)
    registrationList=registrationList ++ List(registration)
    currentId = currentId+1
  }

  def getRegistrationList: List[Registration] = {
    if (!isInitialized) {
      initializeWithSampleData
      isInitialized=true
    }
    registrationList
  }

  def remove(id:Int){
    registrationList= registrationList.remove(reg => reg.id==Option(id))
  }

  def confirm(id:Int){
    var reg = registrationList.find(reg=>reg.id==Option(id)).get
    reg.isConfirmed=true
    reg.confirmationDate=Option(DateTime.now())
  }

  private def initializeWithSampleData{
    addNew(Registration("zenon","zenons","dev",4,true,Option(DateTime.now)))
    addNew(Registration("Some","bloke","gong banger",2,false))
  }

}