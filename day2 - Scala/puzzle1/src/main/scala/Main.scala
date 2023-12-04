import scala.util.boundary, boundary.break
@main def hello: Unit =
  val home = System.getProperty("user.home")
  val source = scala.io.Source.fromFile(s"${home}/src/adventofcode2023/day2 - Scala/puzzle1/input")
  val max_red = 12
  val max_green = 13
  val max_blue = 14

  var total = 0

  for (line <- source.getLines) {
    println(line)
    val game = line.split(":").map(_.trim)
    val game_num = game(0).split(" ")(1)
    var good_game = true
    boundary {
      for (grab <- game(1).split(";").map(_.trim)) {
        for (colour <- grab.split(",").map(_.trim)) {
          val colour_split = colour.split(" ")

          if (colour_split(1) == "red") {
            if (colour_split(0).toIntOption.get > max_red) {
              good_game = false
              break()
            }
          } else if (colour_split(1) == "green") {
            if (colour_split(0).toIntOption.get > max_green) {
              good_game = false
              break()
            }
          } else {
            if (colour_split(0).toIntOption.get > max_blue) {
              good_game = false
              break()
            }
          }
        }
      }
    }

    if (good_game) {
      total = total + game_num.toIntOption.get
    }

    println(total)


  }
  source.close()
