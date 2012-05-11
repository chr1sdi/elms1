// @SOURCE:/home/zenon/scala/elms1/conf/routes
// @HASH:a2140bafe8f713b9c4b68fddd7c7af9a0c0fd320
// @DATE:Thu May 10 02:05:42 BST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:14
// @LINE:13
// @LINE:12
class ReverseRegistrations {
    


 
// @LINE:12
def viewRegistrations() = {
   Call("GET", "/registrations/view")
}
                                                        
 
// @LINE:14
def submit() = {
   Call("POST", "/registrations/add")
}
                                                        
 
// @LINE:13
def addNew() = {
   Call("GET", "/registrations/add")
}
                                                        

                      
    
}
                            

// @LINE:17
class ReverseError {
    


 
// @LINE:17
def showError(errorMessage:String) = {
   Call("GET", "/registrations/error" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("errorMessage", errorMessage)))))
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
                    


// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:14
// @LINE:13
// @LINE:12
class ReverseRegistrations {
    


 
// @LINE:12
def viewRegistrations = JavascriptReverseRoute(
   "controllers.Registrations.viewRegistrations",
   """
      function() {
      return _wA({method:"GET", url:"/registrations/view"})
      }
   """
)
                                                        
 
// @LINE:14
def submit = JavascriptReverseRoute(
   "controllers.Registrations.submit",
   """
      function() {
      return _wA({method:"POST", url:"/registrations/add"})
      }
   """
)
                                                        
 
// @LINE:13
def addNew = JavascriptReverseRoute(
   "controllers.Registrations.addNew",
   """
      function() {
      return _wA({method:"GET", url:"/registrations/add"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:17
class ReverseError {
    


 
// @LINE:17
def showError = JavascriptReverseRoute(
   "controllers.Error.showError",
   """
      function(errorMessage) {
      return _wA({method:"GET", url:"/registrations/error" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("errorMessage", errorMessage)])})
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
                    


// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:14
// @LINE:13
// @LINE:12
class ReverseRegistrations {
    


 
// @LINE:12
def viewRegistrations() = new play.api.mvc.HandlerRef(
   controllers.Registrations.viewRegistrations(), HandlerDef(this, "controllers.Registrations", "viewRegistrations", Seq())
)
                              
 
// @LINE:14
def submit() = new play.api.mvc.HandlerRef(
   controllers.Registrations.submit(), HandlerDef(this, "controllers.Registrations", "submit", Seq())
)
                              
 
// @LINE:13
def addNew() = new play.api.mvc.HandlerRef(
   controllers.Registrations.addNew(), HandlerDef(this, "controllers.Registrations", "addNew", Seq())
)
                              

                      
    
}
                            

// @LINE:17
class ReverseError {
    


 
// @LINE:17
def showError(errorMessage:String) = new play.api.mvc.HandlerRef(
   controllers.Error.showError(errorMessage), HandlerDef(this, "controllers.Error", "showError", Seq(classOf[String]))
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
                    
                