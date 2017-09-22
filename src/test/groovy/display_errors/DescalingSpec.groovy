import spock.lang.*

class DescalingSpec extends Specification {
  def actionwords = Actionwords.newInstance()


  def setup() {
    given:
    actionwords.iHandleBeans()
    actionwords.iHandleCoffeeGrounds()
    actionwords.iHandleWaterTank()}


  def "Descaling is needed after 500 coffees"() {

    given:
    actionwords.theCoffeeMachineIsStarted()
    when:
    actionwords.iTakeCoffeeNumberCoffees(500)
    then:
    actionwords.messageMessageShouldBeDisplayed("Descaling is needed")
  }
}