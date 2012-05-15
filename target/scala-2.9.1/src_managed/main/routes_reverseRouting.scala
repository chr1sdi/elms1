// @SOURCE:/home/zenon/scala/elms1/conf/routes
// @HASH:42e7f67fdccd61277fc43d146778113013ecbf2f
// @DATE:Mon May 14 16:08:22 BST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
class ReverseRegistrations {
    


 
// @LINE:16
def confirm() = {
   Call("POST", "/registrations/confirm")
}
                                                        
 
// @LINE:15
def delete() = {
   Call("POST", "/registrations/delete")
}
                                                        
 
// @LINE:12
def viewRegistrations() = {
   Call("GET", "/registrations/view")
}
                                                        
 
// @LINE:14
def saveNew() = {
   Call("POST", "/registrations/add")
}
                                                        
 
// @LINE:13
def addNew() = {
   Call("GET", "/registrations/add")
}
                                                        

                      
    
}
                            

// @LINE:19
class ReverseError {
    


 
// @LINE:19
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
                    


// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
class ReverseRegistrations {
    


 
// @LINE:16
def confirm = JavascriptReverseRoute(
   "controllers.Registrations.confirm",
   """
      function() {
      return _wA({method:"POST", url:"/registrations/confirm"})
      }
   """
)
                                                        
 
// @LINE:15
def delete = JavascriptReverseRoute(
   "controllers.Registrations.delete",
   """
      function() {
      return _wA({method:"POST", url:"/registrations/delete"})
      }
   """
)
                                                        
 
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
def saveNew = JavascriptReverseRoute(
   "controllers.Registrations.saveNew",
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
                            

// @LINE:19
class ReverseError {
    


 
// @LINE:19
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
                    


// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
class ReverseRegistrations {
    


 
// @LINE:16
def confirm() = new play.api.mvc.HandlerRef(
   controllers.Registrations.confirm(), HandlerDef(this, "controllers.Registrations", "confirm", Seq())
)
                              
 
// @LINE:15
def delete() = new play.api.mvc.HandlerRef(
   controllers.Registrations.delete(), HandlerDef(this, "controllers.Registrations", "delete", Seq())
)
                              
 
// @LINE:12
def viewRegistrations() = new play.api.mvc.HandlerRef(
   controllers.Registrations.viewRegistrations(), HandlerDef(this, "controllers.Registrations", "viewRegistrations", Seq())
)
                              
 
// @LINE:14
def saveNew() = new play.api.mvc.HandlerRef(
   controllers.Registrations.saveNew(), HandlerDef(this, "controllers.Registrations", "saveNew", Seq())
)
                              
 
// @LINE:13
def addNew() = new play.api.mvc.HandlerRef(
   controllers.Registrations.addNew(), HandlerDef(this, "controllers.Registrations", "addNew", Seq())
)
                              

                      
    
}
                            

// @LINE:19
class ReverseError {
    


 
// @LINE:19
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
                    
                