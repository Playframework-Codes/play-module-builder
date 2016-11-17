package modules

import play.api.inject.{Binding, Module}
import play.api.{Configuration, Environment}
import play.api.inject.Module
/**
  * Created by chhaichivon on 11/14/16.
  */
class MyModule extends Module{
  def bindings(environment: Environment, configuration: Configuration): Seq[Binding[_]] = {
    Seq(
      bind[MyComponent].to[MyComponentImpl]
    )
  }
}
