resolvers +=
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("com.github.sbt" % "sbt-native-packager" % "1.9.4")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.0")