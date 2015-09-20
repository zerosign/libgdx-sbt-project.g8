resolvers ++= Seq(
  Resolver.jcenterRepo
)

addSbtPlugin("com.hanhuy.sbt" % "android-sdk-plugin" % "1.4.14")

addSbtPlugin("org.roboscala" % "sbt-robovm" % "1.6.0")
