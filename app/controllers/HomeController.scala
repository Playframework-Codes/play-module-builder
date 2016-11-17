package controllers

import javax.inject._

import modules.MyComponent
import play.api._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(myComponent: MyComponent) extends Controller {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  val hello = myComponent.showMessage("This is my Module")

  def index = Action {
    Ok(hello.toString)
  }

}
