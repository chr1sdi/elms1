
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
	"""),_display_(Seq(/*2.3*/helper/*2.9*/.form(action = routes.Registrations.submit)/*2.52*/{_display_(Seq(format.raw/*2.53*/("""
	<div >

	    <h3>New registration form</h3>
	    <br/>
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
	        <a href=""""),_display_(Seq(/*30.20*/routes/*30.26*/.Application.index)),format.raw/*30.44*/("""" class="btn btn-large">Cancel</a>
	    </div>
	</div>
	""")))})),format.raw/*33.3*/("""
""")))})))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 10 03:38:33 BST 2012
                    SOURCE: /home/zenon/scala/elms1/app/views/newRegistration.scala.html
                    HASH: ea53e0a7d02ebb0bf868a42fb5b0dcc87cc74abf
                    MATRIX: 578->1|610->25|644->27|676->30|689->36|740->79|773->80|1644->920|1659->926|1699->944|1787->1001
                    LINES: 22->1|22->1|22->1|23->2|23->2|23->2|23->2|51->30|51->30|51->30|54->33
                    -- GENERATED --
                */
            