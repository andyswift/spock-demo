package no.iterate.animal

import spock.lang.Specification

/**
 * Tests the Groovy Fish class
 */
class FishTest extends Specification {

    def "should have a name"() {
        given: "We have a fish called George"

        Fish fish = new Fish(name:"George")

        when: "When we ask for its name"
        String fishName = fish.name;

        then: "It is George"
        fishName == "George"
    }

    def "should not be possible to change a fishes name"() {
        given: "We have a fish called George"

        Fish fish = new Fish(name:"George")

        when: "When we try and change its name"
        fish.name = "a new name"

        then: "exception is thrown"
        thrown(ReadOnlyPropertyException)
    }

    def "Two fishes with the same name are equal"() {
        given: "We have a 2 fishes called George"

        Fish george = new Fish(name:"George")
        Fish george2 = new Fish(name:"George")

        expect: "george and george2 to be equal"
        george == george2
    }
}