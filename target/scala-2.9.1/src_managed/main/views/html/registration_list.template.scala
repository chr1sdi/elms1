
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
object registration_list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Registration],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(registrationList:List[Registration]):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.39*/("""

"""),_display_(Seq(/*3.2*/main("List of all confirmed registrations")/*3.45*/ {_display_(Seq(format.raw/*3.47*/("""

<div>
    <h3>List of all confirmed registrations:</h3>
    """),_display_(Seq(/*7.6*/registrationDetails(registrationList, true))),format.raw/*7.49*/("""


</div>

""")))})))}
    }
    
    def render(registrationList:List[Registration]) = apply(registrationList)
    
    def f:((List[Registration]) => play.api.templates.Html) = (registrationList) => apply(registrationList)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 09 23:19:29 BST 2012
                    SOURCE: /home/zenon/scala/elms1/app/views/registrationList.scala.html
                    HASH: da7d0e81c522afc7cc254206c37ed2236c953789
                    MATRIX: 529->1|638->38|670->41|721->84|755->86|847->149|911->192
                    LINES: 19->1|22->1|24->3|24->3|24->3|28->7|28->7
                    -- GENERATED --
                */
            