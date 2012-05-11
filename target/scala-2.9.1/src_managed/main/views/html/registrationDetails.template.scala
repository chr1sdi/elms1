
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
object registrationDetails extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Registration],Boolean,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(registrationList:List[Registration], isAdmin:Boolean = false):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.64*/("""

<div>
    <table cellspacing="4">
        <tr>
            <th>First name</th>
            <th>Last name</th>
            <th>Profession</th>
            <th>Experience</th>
            <th>Confirmed</th>
            <th>Confirmation date</th>
        </tr>
        """),_display_(Seq(/*13.10*/registrationList/*13.26*/.map/*13.30*/{registration =>_display_(Seq(format.raw/*13.46*/("""
        <tr>
            <td>"""),_display_(Seq(/*15.18*/registration/*15.30*/.firstName)),format.raw/*15.40*/("""</td>
            <td>"""),_display_(Seq(/*16.18*/registration/*16.30*/.lastName)),format.raw/*16.39*/("""</td>
            <td>"""),_display_(Seq(/*17.18*/registration/*17.30*/.profession)),format.raw/*17.41*/("""</td>
            <td>"""),_display_(Seq(/*18.18*/registration/*18.30*/.yearsOfExperience)),format.raw/*18.48*/(""" years</td>
            <td>"""),_display_(Seq(/*19.18*/registration/*19.30*/.isConfirmed)),format.raw/*19.42*/("""</td>
            <td>"""),_display_(Seq(/*20.18*/registration/*20.30*/.confirmationDate)),format.raw/*20.47*/("""</td>
            """),_display_(Seq(/*21.14*/if(isAdmin)/*21.25*/ {_display_(Seq(format.raw/*21.27*/("""
                <td><a href="#delete this">Delete</a></td>
            """)))})),format.raw/*23.14*/("""
            """),_display_(Seq(/*24.14*/if(isAdmin && !registration.isConfirmed)/*24.54*/{_display_(Seq(format.raw/*24.55*/("""
                <td><a href="#confirm this">Confirm</a></td>
            """)))})),format.raw/*26.14*/("""
        </tr>
        """)))})),format.raw/*28.10*/("""
    </table>
</div>"""))}
    }
    
    def render(registrationList:List[Registration],isAdmin:Boolean) = apply(registrationList,isAdmin)
    
    def f:((List[Registration],Boolean) => play.api.templates.Html) = (registrationList,isAdmin) => apply(registrationList,isAdmin)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 09 21:03:58 BST 2012
                    SOURCE: /home/zenon/scala/elms1/app/views/registrationDetails.scala.html
                    HASH: bea815000186a8ec4f0debbbe973ec5673b092d3
                    MATRIX: 539->1|673->63|973->332|998->348|1011->352|1060->368|1122->399|1143->411|1175->421|1229->444|1250->456|1281->465|1335->488|1356->500|1389->511|1443->534|1464->546|1504->564|1564->593|1585->605|1619->617|1673->640|1694->652|1733->669|1783->688|1803->699|1838->701|1943->774|1988->788|2037->828|2071->829|2178->904|2234->928
                    LINES: 19->1|22->1|34->13|34->13|34->13|34->13|36->15|36->15|36->15|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|40->19|40->19|40->19|41->20|41->20|41->20|42->21|42->21|42->21|44->23|45->24|45->24|45->24|47->26|49->28
                    -- GENERATED --
                */
            