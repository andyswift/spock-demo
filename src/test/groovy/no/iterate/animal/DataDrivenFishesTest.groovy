package no.iterate.animal

import spock.lang.Specification
import spock.lang.Unroll

/**
 * Data tables
 */
class DataDrivenFishesTest extends Specification {

    def "Fish equals demo"() {

        when: "Comparing names"
        def result  = fishName == fishName2
        then:
        result == isEqual
        where:
        fishName | fishName2 || isEqual
        "George" | "George"  || true
        "George" | "Barny"   || false

    }

    @Unroll("Fish #fishName == #fishName2 is #isEqual")
    def "Demonstrates the Unroll feature of spock"() {

        when: "Comparing names"
        def result  = fishName == fishName2
        then: "Hint: try making the test fail you can then see the nice description in the test runner."
        result == isEqual
        where:
        fishName | fishName2 || isEqual
        "George" | "George"  || true
        "George" | "Barny"   || false

    }

}