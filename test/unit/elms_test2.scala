package unit

import org.specs2._
import models._

class elms_test2 extends Specification{ def is =
	  "Specification for Registrations MongoDB".title    ^
	                                                     p^
	  "A starting scenerio should be"                     ^
	    "with DB cleared"                                ^ isDbEmpty^
	                                                     end
	 

	def isDbEmpty = 
		"return empty list when empty"					 ! empty().e1
														 end

	case class empty(){
		def e1 = {
			val retrievedRegistrations = Registrations.getRegistrationList
	    	retrievedRegistrations must have size(0)
	  	}
	}


}
