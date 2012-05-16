package models

import org.joda.time.DateTime
import com.mongodb.casbah.Imports._
import com.novus.salat._
import com.novus.salat.annotations._
import com.novus.salat.global._
import com.mongodb.casbah.commons.ValidBSONType.ObjectId
import org.joda.time.format.{DateTimeFormatter, DateTimeFormat}


case class Registration(firstName: String, lastName: String,
                        profession: String, yearsOfExperience: Int = 0,
                        var isConfirmed: Boolean = false,
                        var confirmationDate: Option[String] = None,
                        @Key("_id") var id: Option[ObjectId] = None)


object Registrations {
  private var _databaseName = "elms1"

  private val mongoConnection = MongoConnection()
  private def registrations = mongoConnection(_databaseName)("Registrations")
  private var isInitialized=false
  private var registrationList = List[Registration]()
  private var currentId=1

  def setDatabaseTo(databaseName:String){
    _databaseName=databaseName
  }

  def clearAll = registrations.remove(DBObject())

  def addNew(registration:Registration){
    registrations+=grater[Registration].asDBObject(registration)
  }

  def getRegistrationList = {
    //registrations.remove(DBObject())
    registrations.map(grater[Registration].asObject(_)).toList
  }

  def remove(id:String){
    registrations.remove(MongoDBObject("_id" -> new ObjectId(id)));
  }

  def confirm(id:String){
    val dateFormatter = DateTimeFormat forPattern ("dd-MM-yyy HH:mm:ss")
    registrations.update(
      MongoDBObject("_id"->new ObjectId(id)),
      $set(
        "isConfirmed" -> true,
        "confirmationDate" -> DateTime.now().toString(dateFormatter)
      )
      //$set("confirmationDate" -> DateTime.now())
    )

  }

  private def initializeWithSampleData{
    //addNew(Registration("zenon","zenons","dev",4,true,Option(DateTime.now)))
    addNew(Registration("Some","bloke","gong banger",2,false))
  }

}