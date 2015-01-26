package no.iterate.animal

import spock.lang.Specification

/**
 * Shows the different phases of execution in a Spock test
 */
class AnatomyTest extends Specification {

    def setup() {}          // run before every feature method
    def cleanup() {}        // run after every feature method
    def setupSpec() {}     // run before the first feature method
    def cleanupSpec() {}   // run after the last feature method

    def "My great test"() {
       expect:
       1==1
    }
}