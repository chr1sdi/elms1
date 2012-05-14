
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
object registrationList extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Registration],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(registrationList:List[Registration]):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.39*/("""

"""),_display_(Seq(/*3.2*/main("List of all confirmed registrations")/*3.45*/ {_display_(Seq(format.raw/*3.47*/("""

<div>
    <h3>List of all confirmed registrations:</h3>
    <br />
    <div>
        """),_display_(Seq(/*9.10*/registrationDetails(registrationList, true))),format.raw/*9.53*/("""
    </div>
    <a href=""""),_display_(Seq(/*11.15*/routes/*11.21*/.Registrations.addNew)),format.raw/*11.42*/(""""  class="style-button">Send your registration</a>

</div>

""")))})))}
    }
    
    def render(registrationList:List[Registration]) = apply(registrationList)
    
    def f:((List[Registration]) => play.api.templates.Html) = (registrationList) => apply(registrationList)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 11 15:50:24 BST 2012
                    SOURCE: /home/zenon/scala/elms1/app/views/registrationList.scala.html
                    HASH: 9c626c909ddfda595abd4a12c90feadf11d273a4
                    MATRIX: 528->1|637->38|669->41|720->84|754->86|872->174|936->217|993->243|1008->249|1051->270
                    LINES: 19->1|22->1|24->3|24->3|24->3|30->9|30->9|32->11|32->11|32->11
                    -- GENERATED --
                */
            