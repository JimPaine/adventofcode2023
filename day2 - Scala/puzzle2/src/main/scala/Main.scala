import scala.util.boundary, boundary.break
@main def hello: Unit =
  val home = System.getProperty("user.home")
  val source = scala.io.Source.fromFile(s"${home}/src/adventofcode2023/day2 - Scala/puzzle2/input")


  var total = 0

  for (line <- source.getLines) {
    println(line)
    var max_red = 0
    var max_green = 0
    var max_blue = 0

    val game = line.split(":").map(_.trim)
    val game_num = game(0).split(" ")(1)

    boundary {
      for (grab <- game(1).split(";").map(_.trim)) {
        for (colour <- grab.split(",").map(_.trim)) {
          val colour_split = colour.split(" ")

          if (colour_split(1) == "red") {
            val current_red = colour_split(0).toIntOption.get
            if (current_red > max_red) {
              max_red = current_red
            }
          } else if (colour_split(1) == "green") {
            val current_green = colour_split(0).toIntOption.get
            if (current_green > max_green) {
              max_green = current_green
            }
          } else {
            val current_blue = colour_split(0).toIntOption.get
            if (current_blue > max_blue) {
              max_blue = current_blue
            }
          }
        }
      }
    }

    total = total + (max_red * max_green * max_blue)

    println(total)


  }
  source.close()
