package com.cg.freshers
 
import spock.lang.Specification
import org.springframework.boot.test.context.SpringBootTest

class DerivedDataSpockSpec extends Specification {
 
    def "test validateOperator equal"() {
        given:
        DerivedData derivedData = new DerivedData()
 
        expect:
        derivedData.validateOperator("100", "100", "equal") == true
    }
 
    def "test validateOperator not equal"() {
        given:
        DerivedData derivedData = new DerivedData()
 
        expect:
        derivedData.validateOperator("100", "200", "not equal") == true
    }
}