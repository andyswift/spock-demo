package no.iterate.animal

import spock.lang.Specification

/**
 * Tests the JavaFish
 */
class JavaFishTest extends Specification {

    def "Should have a name"() {
        given: "We have a fish called George"

        JavaFish fish = new JavaFish("Java")

        when: "When we ask for its name"
        String fishName = fish.name

        then: "It is Java"
        fishName == "Java"
    }

    def "Should not be possible to change the Java Fishes name"() {
        given: "We have a fish called George"

        JavaFish fish = new JavaFish("George")

        when: "When we try and change its name"
        fish.name = "a new name"

        then: "exception is thrown"
        thrown(ReadOnlyPropertyException)
    }

    def "Two Java fishes with the same name are equal"() {
        given: "We have 2 fishes called George"

        JavaFish george = new JavaFish("George")
        JavaFish george2 = new JavaFish("George")

        expect: "george and george2 to be equal"
        george == george2
    }
}