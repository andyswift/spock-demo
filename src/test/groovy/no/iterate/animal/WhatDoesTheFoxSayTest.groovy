package no.iterate.animal

import spock.lang.Specification
/**
 * Tests what the fox says.
 * This also demonstrates that it is possible to use a Java library (Guava) with Groovy
 */
class WhatDoesTheFoxSayTest extends Specification {

    def "The fox says what it is told"() {
        given: "A fox created with a silly voice module"
        Fox fox = new Fox(voiceModule: { "ni ni ni" })

        expect: "The fox says ni ni ni"
        "ni ni ni" == fox.says().orNull();
    }

    def "A fox without voice module says nothing"() {
        given:"A fox with no voice module"
        Fox fox = new Fox(voiceModule: null)

        expect: "The fox says nothing"
        null == fox.says().orNull()
    }
}