package tdd.marsrover

import spock.lang.*

class MarsRoverControlUnitSpec extends Specification {

	def "can move fordward once"() {
		given:
			def engineSpy = Mock(Engine)
			def marsRover = new MarsRoverControlUnit(engine: engineSpy)

		when: 
			marsRover.move("f")

		then: 
			1 * engineSpy.fordward(1)
	}

}