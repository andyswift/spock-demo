package no.iterate.animal

import groovy.transform.Immutable
import spock.lang.Specification

/**
 * Shows that groovy uses big decimal by default and supports
 * operator overloading
 */
class OperatorOverloadingTest extends Specification {

    def "BigDecimal is default way of representing decimal numbers in grovvy"() {
        given: "A decimal number"
        def decimalNumber = 1.2323
        expect: "It is actually a bigdecimal"
        decimalNumber instanceof BigDecimal
    }

    def "BigDecimal can be treated like floats when adding subtracting etc"() {
        given: "A decimal number"
        def decimalNumber = 1.2323
        when: "Add one, (operator overloading)"
        def result = decimalNumber + 1
        then: "Result should be the same as 1.2323 + 1 = 2.2323"
        result == 2.2323
    }

    def "Should be possibile to use + operator on a Custom object" (){
        given: "Two Examples"
        def hello = new Example("Hello")
        def world = new Example("World")

        expect: "The result of adding them to also be an Example object"
        hello + world instanceof Example
        and: "The name should be a concatenation"
        (hello + world).name == "HelloWorld"
    }

    def "Should be possibile to use - operator on a Custom object" (){
        given: "Two Examples"
        def hello = new Example("Hello")
        def helloWorld = new Example("HelloWorld")

        expect: "The result of subtracting them should also be an Example object"
        hello - hello instanceof Example
        and: "Hello is removed from HelloWorld"
        (helloWorld - hello).name == "World"
    }

    /**
     * Class used to demonstrate operator overloading
     */
    @Immutable
    class Example {

        String name

        Example plus(Example other) {
            return new Example(name: name + other.name)
        }

        Example minus(Example other) {
            return new Example(name: name - other.name)
        }
    }

}