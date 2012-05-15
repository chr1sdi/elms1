
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
        """),_display_(Seq(/*10.10*/if(registrationList.length ==0)/*10.41*/{_display_(Seq(format.raw/*10.42*/("""
            <h3>Sorry gringo no people</h3>
        """)))}/*12.10*/else/*12.14*/{_display_(Seq(format.raw/*12.15*/("""
            """),_display_(Seq(/*13.14*/registrationDetails(registrationList, true))),format.raw/*13.57*/("""
        """)))})),format.raw/*14.10*/("""
    </div>
    <a href=""""),_display_(Seq(/*16.15*/routes/*16.21*/.Registrations.addNew)),format.raw/*16.42*/(""""  class="style-button">Send your registration</a>

</div>

""")))})))}
    }
    
    def render(registrationList:List[Registration]) = apply(registrationList)
    
    def f:((List[Registration]) => play.api.templates.Html) = (registrationList) => apply(registrationList)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 15 15:39:06 BST 2012
                    SOURCE: /home/zenon/scala/elms1/app/views/registrationList.scala.html
                    HASH: c5d1b09887100b9641a91ad097c72f48d0f1309e
                    MATRIX: 528->1|637->38|669->41|720->84|754->86|874->175|914->206|948->207|1021->261|1034->265|1068->266|1113->280|1178->323|1220->333|1277->359|1292->365|1335->386
                    LINES: 19->1|22->1|24->3|24->3|24->3|31->10|31->10|31->10|33->12|33->12|33->12|34->13|34->13|35->14|37->16|37->16|37->16
                    -- GENERATED --
                */
            