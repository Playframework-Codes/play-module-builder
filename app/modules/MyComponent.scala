package modules

import com.google.inject.Inject
import play.api.inject.ApplicationLifecycle

import scala.concurrent.Future

/**
  * Created by chhaichivon on 11/14/16.
  */
/*
trait MyComponent{
  def showMessage(str :String)

}

class MyComponentImpl @Inject() (lifecycle: ApplicationLifecycle ) extends MyComponent{
  // previous contents of plugin.onStart
  lifecycle.addStopHook{() =>
    //previous content of plugin. onStop
    Future.successful()
  }

  override def showMessage(str: String): Unit = {
   return str
  }

}*/
