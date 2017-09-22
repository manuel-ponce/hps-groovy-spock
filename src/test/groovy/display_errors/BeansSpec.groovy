import spock.lang.*

class BeansSpec extends Specification {
  def actionwords = Actionwords.newInstance()


  def setup() {
    given:
    actionwords.theCoffeeMachineIsStarted()
    actionwords.iHandleEverythingExceptTheBeans()}


  def "Message \"Fill beans\" is displayed after 38 coffees are taken"() {
    // Tags: priority:high


    when:
    actionwords.iTakeCoffeeNumberCoffees(38)
    then:
    actionwords.messageMessageShouldBeDisplayed("Fill beans")
  }
  def "It is possible to take 40 coffees before there is really no more beans"() {
    // Tags: priority:low


    when:
    actionwords.iTakeCoffeeNumberCoffees(40)
    then:
    actionwords.coffeeShouldBeServed()
    when:
    actionwords.iTakeACoffee()
    then:
    actionwords.coffeeShouldNotBeServed()
    actionwords.messageMessageShouldBeDisplayed("Fill beans")
  }
  def "After adding beans, the message \"Fill beans\" disappears"() {
    // Tags: priority:high


    when:
    actionwords.iTakeCoffeeNumberCoffees(40)
    actionwords.iFillTheBeansTank()
    then:
    actionwords.messageMessageShouldBeDisplayed("Ready")
  }
}