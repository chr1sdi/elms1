// @SOURCE:/home/zenon/scala/elms1/conf/routes
// @HASH:a2140bafe8f713b9c4b68fddd7c7af9a0c0fd320
// @DATE:Thu May 10 02:05:42 BST 2012

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
val controllers_Registrations_viewRegistrations2 = Route("GET", PathPattern(List(StaticPart("/registrations/view"))))
                    

// @LINE:13
val controllers_Registrations_addNew3 = Route("GET", PathPattern(List(StaticPart("/registrations/add"))))
                    

// @LINE:14
val controllers_Registrations_submit4 = Route("POST", PathPattern(List(StaticPart("/registrations/add"))))
                    

// @LINE:17
val controllers_Error_showError5 = Route("GET", PathPattern(List(StaticPart("/registrations/error"))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""","""/registrations/view""","""controllers.Registrations.viewRegistrations"""),("""GET""","""/registrations/add""","""controllers.Registrations.addNew"""),("""POST""","""/registrations/add""","""controllers.Registrations.submit"""),("""GET""","""/registrations/error""","""controllers.Error.showError(errorMessage:String)"""))
             
    
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
case controllers_Registrations_viewRegistrations2(params) => {
   call { 
        invokeHandler(_root_.controllers.Registrations.viewRegistrations, HandlerDef(this, "controllers.Registrations", "viewRegistrations", Nil))
   }
}
                    

// @LINE:13
case controllers_Registrations_addNew3(params) => {
   call { 
        invokeHandler(_root_.controllers.Registrations.addNew, HandlerDef(this, "controllers.Registrations", "addNew", Nil))
   }
}
                    

// @LINE:14
case controllers_Registrations_submit4(params) => {
   call { 
        invokeHandler(_root_.controllers.Registrations.submit, HandlerDef(this, "controllers.Registrations", "submit", Nil))
   }
}
                    

// @LINE:17
case controllers_Error_showError5(params) => {
   call(params.fromQuery[String]("errorMessage", None)) { (errorMessage) =>
        invokeHandler(_root_.controllers.Error.showError(errorMessage), HandlerDef(this, "controllers.Error", "showError", Seq(classOf[String])))
   }
}
                    
}
    
}
                