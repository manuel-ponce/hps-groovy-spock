import spock.lang.*

class ServeCoffeeSpec extends Specification {
  def actionwords = Actionwords.newInstance()



  def "Simple use"() {
    // Well, sometimes, you just get a coffee.

    // Tags: priority:high


    given:
    actionwords.theCoffeeMachineIsStarted()
    when:
    actionwords.iTakeACoffee()
    then:
    actionwords.coffeeShouldBeServed()
  }
}