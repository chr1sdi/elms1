// @SOURCE:/home/zenon/scala/elms1/conf/routes
// @HASH:d969889c52e9050eb27312cffe2be7d8d121798e
// @DATE:Wed May 09 13:42:32 BST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:9
val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    

// @LINE:12
val controllers_Registrations_listOfConfirmedRegistrations2 = Route("GET", PathPattern(List(StaticPart("/registrations/confirmed"))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""","""/registrations/confirmed""","""controllers.Registrations.listOfConfirmedRegistrations"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:9
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    

// @LINE:12
case controllers_Registrations_listOfConfirmedRegistrations2(params) => {
   call { 
        invokeHandler(_root_.controllers.Registrations.listOfConfirmedRegistrations, HandlerDef(this, "controllers.Registrations", "listOfConfirmedRegistrations", Nil))
   }
}
                    
}
    
}
                