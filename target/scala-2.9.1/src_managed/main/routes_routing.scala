// @SOURCE:/home/zenon/scala/elms1/conf/routes
// @HASH:1a98835135916211cf771726744b26613c34343e
// @DATE:Fri May 11 16:21:48 BST 2012

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
val controllers_Registrations_saveNew4 = Route("POST", PathPattern(List(StaticPart("/registrations/add"))))
                    

// @LINE:15
val controllers_Registrations_delete5 = Route("POST", PathPattern(List(StaticPart("/registrations/delete"))))
                    

// @LINE:16
val controllers_Registrations_confirm6 = Route("POST", PathPattern(List(StaticPart("/registraions/confirm"))))
                    

// @LINE:19
val controllers_Error_showError7 = Route("GET", PathPattern(List(StaticPart("/registrations/error"))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""","""/registrations/view""","""controllers.Registrations.viewRegistrations"""),("""GET""","""/registrations/add""","""controllers.Registrations.addNew"""),("""POST""","""/registrations/add""","""controllers.Registrations.saveNew"""),("""POST""","""/registrations/delete""","""controllers.Registrations.delete"""),("""POST""","""/registraions/confirm""","""controllers.Registrations.confirm"""),("""GET""","""/registrations/error""","""controllers.Error.showError(errorMessage:String)"""))
             
    
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
case controllers_Registrations_saveNew4(params) => {
   call { 
        invokeHandler(_root_.controllers.Registrations.saveNew, HandlerDef(this, "controllers.Registrations", "saveNew", Nil))
   }
}
                    

// @LINE:15
case controllers_Registrations_delete5(params) => {
   call { 
        invokeHandler(_root_.controllers.Registrations.delete, HandlerDef(this, "controllers.Registrations", "delete", Nil))
   }
}
                    

// @LINE:16
case controllers_Registrations_confirm6(params) => {
   call { 
        invokeHandler(_root_.controllers.Registrations.confirm, HandlerDef(this, "controllers.Registrations", "confirm", Nil))
   }
}
                    

// @LINE:19
case controllers_Error_showError7(params) => {
   call(params.fromQuery[String]("errorMessage", None)) { (errorMessage) =>
        invokeHandler(_root_.controllers.Error.showError(errorMessage), HandlerDef(this, "controllers.Error", "showError", Seq(classOf[String])))
   }
}
                    
}
    
}
                