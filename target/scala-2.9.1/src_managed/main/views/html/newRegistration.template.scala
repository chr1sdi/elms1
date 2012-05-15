
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
object newRegistration extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq(_display_(Seq(/*1.2*/main("New Registration")/*1.26*/ {_display_(Seq(format.raw/*1.28*/("""

	<div >

	    <h3>New registration form</h3>
	    <br/>

        """),_display_(Seq(/*8.10*/helper/*8.16*/.form(action = routes.Registrations.saveNew)/*8.60*/{_display_(Seq(format.raw/*8.61*/("""
            <div>
                <table>
                    <tr>
                        <td>First name</td>
                        <td><input type="text" name="firstName" placeholder="la first name" /></td>
                    </tr>
                    <tr>
                        <td>Last name</td>
                        <td><input type="text" name="lastName" placeholder="la last name" /></td>
                    </tr>
                    <tr>
                        <td>Profession</td>
                        <td><input type="text" name="profession" placeholder="la profession" /></td>
                        <td><input type="text" name="yearsOfExperience" placeholder="la years"/></td>
                    </tr>

                </table>
            </div>


            <div>

                <input type="submit" value="Send registration"/>
                <a href=""""),_display_(Seq(/*32.27*/routes/*32.33*/.Application.index)),format.raw/*32.51*/("""" class="btn btn-large">Cancel</a>
            </div>
        """)))})),format.raw/*34.10*/("""
	</div>

""")))})))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 14 12:32:03 BST 2012
                    SOURCE: /home/zenon/scala/elms1/app/views/newRegistration.scala.html
                    HASH: 89afafcb25617b1cd108bc71de77edc293636bf9
                    MATRIX: 578->1|610->25|644->27|742->95|756->101|808->145|841->146|1757->1031|1772->1037|1812->1055|1907->1118
                    LINES: 22->1|22->1|22->1|29->8|29->8|29->8|29->8|53->32|53->32|53->32|55->34
                    -- GENERATED --
                */
            