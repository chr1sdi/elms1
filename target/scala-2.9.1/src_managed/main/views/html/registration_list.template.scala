
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
    <table cellspacing="4">
        <tr>
            <th>First name</th>
            <th>Last name</th>
            <th>Profession</th>
            <th>Experience</th>
            <th>Confirmed</th>
        </tr>
    """),_display_(Seq(/*15.6*/registrationList/*15.22*/.map/*15.26*/{registration =>_display_(Seq(format.raw/*15.42*/("""
        <tr>
            <td>"""),_display_(Seq(/*17.18*/registration/*17.30*/.firstName)),format.raw/*17.40*/("""</td>
            <td>"""),_display_(Seq(/*18.18*/registration/*18.30*/.lastName)),format.raw/*18.39*/("""</td>
            <td>"""),_display_(Seq(/*19.18*/registration/*19.30*/.profession)),format.raw/*19.41*/("""</td>
            <td>"""),_display_(Seq(/*20.18*/registration/*20.30*/.yearsOfExperience)),format.raw/*20.48*/(""" years</td>
            <td>"""),_display_(Seq(/*21.18*/registration/*21.30*/.isConfirmed)),format.raw/*21.42*/("""</td>
        </tr>

    """)))})),format.raw/*24.6*/("""
    </table>

</div>

""")))})))}
    }
    
    def render(registrationList:List[Registration]) = apply(registrationList)
    
    def f:((List[Registration]) => play.api.templates.Html) = (registrationList) => apply(registrationList)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 09 19:51:24 BST 2012
                    SOURCE: /home/zenon/scala/elms1/app/views/registration_list.scala.html
                    HASH: 07e560091487d8fad26b9b11932bc61d211f84ab
                    MATRIX: 529->1|638->38|670->41|721->84|755->86|1061->362|1086->378|1099->382|1148->398|1210->429|1231->441|1263->451|1317->474|1338->486|1369->495|1423->518|1444->530|1477->541|1531->564|1552->576|1592->594|1652->623|1673->635|1707->647|1764->673
                    LINES: 19->1|22->1|24->3|24->3|24->3|36->15|36->15|36->15|36->15|38->17|38->17|38->17|39->18|39->18|39->18|40->19|40->19|40->19|41->20|41->20|41->20|42->21|42->21|42->21|45->24
                    -- GENERATED --
                */
            