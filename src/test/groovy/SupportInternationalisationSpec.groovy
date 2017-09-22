import spock.lang.*

class SupportInternationalisationSpec extends Specification {
  def actionwords = Actionwords.newInstance()



  def messagesAreBasedOnLanguage(language, readyMessage) {
    // Well, sometimes, you just get a coffee.

    // Tags: priority:medium


    actionwords.iStartTheCoffeeMachineUsingLanguageLang(language)
    actionwords.messageMessageShouldBeDisplayed(readyMessage)
  }

  def "Messages are based on language - English"() {
    expect:
    messagesAreBasedOnLanguage("en", "Ready")
  }

  def "Messages are based on language - French"() {
    expect:
    messagesAreBasedOnLanguage("fr", "Pret")
  }


  def "No messages are displayed when machine is shut down"() {
    // Tags: priority:medium


    given:
    actionwords.theCoffeeMachineIsStarted()
    when:
    actionwords.iShutdownTheCoffeeMachine()
    then:
    actionwords.messageMessageShouldBeDisplayed("")
  }
}