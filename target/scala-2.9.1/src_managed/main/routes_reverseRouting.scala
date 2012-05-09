// @SOURCE:/home/zenon/scala/elms1/conf/routes
// @HASH:d969889c52e9050eb27312cffe2be7d8d121798e
// @DATE:Wed May 09 13:42:32 BST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:12
class ReverseRegistrations {
    


 
// @LINE:12
def listOfConfirmedRegistrations() = {
   Call("GET", "/registrations/confirmed")
}
                                                        

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        

                      
    
}
                            

// @LINE:9
class ReverseAssets {
    


 
// @LINE:9
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:12
class ReverseRegistrations {
    


 
// @LINE:12
def listOfConfirmedRegistrations = JavascriptReverseRoute(
   "controllers.Registrations.listOfConfirmedRegistrations",
   """
      function() {
      return _wA({method:"GET", url:"/registrations/confirmed"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:9
class ReverseAssets {
    


 
// @LINE:9
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:12
class ReverseRegistrations {
    


 
// @LINE:12
def listOfConfirmedRegistrations() = new play.api.mvc.HandlerRef(
   controllers.Registrations.listOfConfirmedRegistrations(), HandlerDef(this, "controllers.Registrations", "listOfConfirmedRegistrations", Seq())
)
                              

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:9
class ReverseAssets {
    


 
// @LINE:9
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                