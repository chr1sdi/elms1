
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
object error extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(errorMessage:String):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.23*/("""

"""),_display_(Seq(/*3.2*/main("Errores completo")/*3.26*/{_display_(Seq(format.raw/*3.27*/("""
   <div>
       <h2>An error occured!</h2>
       <h4>"""),_display_(Seq(/*6.13*/errorMessage)),format.raw/*6.25*/("""</h4>
   </div>

""")))})))}
    }
    
    def render(errorMessage:String) = apply(errorMessage)
    
    def f:((String) => play.api.templates.Html) = (errorMessage) => apply(errorMessage)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 10 01:55:30 BST 2012
                    SOURCE: /home/zenon/scala/elms1/app/views/error.scala.html
                    HASH: 1e902017e325090f717133bd07f641bcd2c9668b
                    MATRIX: 505->1|598->22|630->25|662->49|695->50|781->106|814->118
                    LINES: 19->1|22->1|24->3|24->3|24->3|27->6|27->6
                    -- GENERATED --
                */
            