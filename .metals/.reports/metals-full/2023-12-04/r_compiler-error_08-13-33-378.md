file://<WORKSPACE>/day2%20-%20Scala/puzzle1/src/main/scala/Main.scala
### java.lang.AssertionError: NoDenotation.owner

occurred in the presentation compiler.

action parameters:
offset: 302
uri: file://<WORKSPACE>/day2%20-%20Scala/puzzle1/src/main/scala/Main.scala
text:
```scala
@main def hello: Unit =
  val home = System.getProperty("user.home")
  val source = scala.io.Source.fromFile(s"${home}/src/adventofcode2023/day2 - Scala/puzzle1/test.txt")
  for (line <- source.getLines) {
    println(line)
    val game = line.split(",").map(_.trim)
    val game_num = game.split(" ")[@@]
  }
  source.close()

// 12 red cubes, 13 green cubes, and 14 blue cubes
```



#### Error stacktrace:

```
dotty.tools.dotc.core.SymDenotations$NoDenotation$.owner(SymDenotations.scala:2582)
	scala.meta.internal.pc.SignatureHelpProvider$.isValid(SignatureHelpProvider.scala:83)
	scala.meta.internal.pc.SignatureHelpProvider$.notCurrentApply(SignatureHelpProvider.scala:96)
	scala.meta.internal.pc.SignatureHelpProvider$.$anonfun$1(SignatureHelpProvider.scala:48)
	scala.collection.StrictOptimizedLinearSeqOps.loop$3(LinearSeq.scala:280)
	scala.collection.StrictOptimizedLinearSeqOps.dropWhile(LinearSeq.scala:282)
	scala.collection.StrictOptimizedLinearSeqOps.dropWhile$(LinearSeq.scala:278)
	scala.collection.immutable.List.dropWhile(List.scala:79)
	scala.meta.internal.pc.SignatureHelpProvider$.signatureHelp(SignatureHelpProvider.scala:48)
	scala.meta.internal.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:375)
```
#### Short summary: 

java.lang.AssertionError: NoDenotation.owner