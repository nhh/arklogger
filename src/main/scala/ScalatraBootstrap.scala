import com.nhh.controller._
import org.scalatra._
import javax.servlet.ServletContext

class ScalatraBootstrap extends LifeCycle {

  override def init(context: ServletContext) {
    context.mount(new BaseController, "/*")
    context.mount(new LogController, "/log/*")
  }

}