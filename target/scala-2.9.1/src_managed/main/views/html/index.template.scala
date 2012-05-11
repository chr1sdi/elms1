
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq(_display_(Seq(/*2.2*/main("Home pagee")/*2.20*/ {_display_(Seq(format.raw/*2.22*/("""

    <div >
        <h4>Aaaaw yeah, home page</h4>
        <p>And some fancy registration image</p>
        <img src="http://www.cven-recv.org/images/registration.jpg" style="width:200px;height:200px;"/>

    </div>
""")))})))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 09 20:42:13 BST 2012
                    SOURCE: /home/zenon/scala/elms1/app/views/index.scala.html
                    HASH: 0101efaee0e7d5962f52d8608e98120e36390289
                    MATRIX: 568->2|594->20|628->22
                    LINES: 22->2|22->2|22->2
                    -- GENERATED --
                */
            