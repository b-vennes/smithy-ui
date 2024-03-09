import $ivy.`com.disneystreaming.smithy4s::smithy4s-mill-codegen-plugin::0.18.11`

import mill._
import scalalib._
import smithy4s.codegen.mill._

object core extends ScalaModule {
  def scalaVersion = "3.3.3"

  def ivyDeps = Agg(
    ivy"com.disneystreaming.smithy4s::smithy4s-core:0.17.19"
  )
}

object example extends ScalaModule with Smithy4sModule {
  def scalaVersion = "3.3.3"

  def moduleDeps = Seq(core)

  def ivyDeps = Agg(
    ivy"com.disneystreaming.smithy4s::smithy4s-core:${smithy4sVersion()}",
    ivy"com.disneystreaming.smithy4s::smithy4s-http4s-swagger:${smithy4sVersion()}",
    ivy"org.http4s::http4s-ember-server:0.23.25"
  )
}
