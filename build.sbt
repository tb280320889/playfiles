import play.Project._

name := "playfiles"

version := "1.0"

playScalaSettings

libraryDependencies ++= Seq(

	"net.sf.barcode4j" % "barcode4j" % "2.0"
)