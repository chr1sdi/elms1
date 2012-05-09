
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq(/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq(/*8.54*/routes/*8.60*/.Assets.at("stylesheets/adaria/style.css"))),format.raw/*8.102*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq(/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png"))),format.raw/*9.97*/("""">
        <script src=""""),_display_(Seq(/*10.23*/routes/*10.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*10.74*/("""" type="text/javascript"></script>
    </head>
    <body>
            <div class="header">
                <h2>Freshly """"),_display_(Seq(/*14.31*/title)),format.raw/*14.36*/("""" page</h2>

                <div class="menu">
                    <ul>
                        <li><a href="/">Home</a></li>
                        <li>
                            <a href=""""),_display_(Seq(/*20.39*/routes/*20.45*/.Registrations.listOfConfirmedRegistrations)),format.raw/*20.88*/("""">Registrations</a>
                            <ul>
                                <li><a href=""""),_display_(Seq(/*22.47*/routes/*22.53*/.Registrations.listOfConfirmedRegistrations)),format.raw/*22.96*/("""">List of all confirmed registrations</a></li>
                                <li><a href="#Register">Send your registration</a></li>

                            </ul>

                        </li>
                    </ul>
                </div>
            </div>
            <br/>
            <div class="main_container">
                """),_display_(Seq(/*33.18*/content)),format.raw/*33.25*/("""
            </div>

            <div class="footer">
               Some footer stuff over here
            </div>


    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html) = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed May 09 19:59:19 BST 2012
                    SOURCE: /home/zenon/scala/elms1/app/views/main.scala.html
                    HASH: fc2a5bb5cf4b8a6460ee125e4dbd33d401adb623
                    MATRIX: 509->1|611->31|694->84|720->89|812->151|826->157|890->199|981->260|995->266|1048->298|1104->323|1119->329|1186->374|1338->495|1365->500|1590->694|1605->700|1670->743|1800->842|1815->848|1880->891|2256->1236|2285->1243
                    LINES: 19->1|22->1|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|35->14|35->14|41->20|41->20|41->20|43->22|43->22|43->22|54->33|54->33
                    -- GENERATED --
                */
            