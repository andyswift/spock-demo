package no.iterate.animal

import spock.lang.Ignore
import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Stepwise

/**
 * Demonstrates the @Stepwise annotation and @Shared fields
 */
@Stepwise
class StepwiseFishesTest extends Specification {

    @Shared
    int sharedCount = 0

    int notSharedCount = 0

    def "This runs first"() {
        when:
        sharedCount = 1
        notSharedCount = 1
        then:
        sharedCount == 1;
        notSharedCount == 1
    }

    def "This always runs second"() {
        expect: "Shared count is updated because it is shared between test executions"
        sharedCount == 1;
        and: "Not shared is not updated because it is not shared between test executions"
        notSharedCount == 0
    }

    @Ignore("Remove this ignore to stop Fourth test from running")
    def "This one third"() {
        expect: "fail on purpose"
        1==0
    }

    def "Fourth"() {
        expect: "This test is automatically ignored due to the failing third test"
        1==1
    }

}