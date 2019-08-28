package clazz.accompany.action

object Game {
  def main(args: Array[String]): Unit = {
    val personOne = new GamePerson("hassan")
    val personTwo = new GamePerson("sherry")
    val personThree = new GamePerson("mark")

    GamePerson.joinGame(personOne)
    GamePerson.joinGame(personThree)
    GamePerson.joinGame(personTwo)

    GamePerson.showNum()
  }
}
