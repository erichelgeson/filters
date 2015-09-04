package filters

class InterceptorTestController {

    def bar
    def beforeInterceptor = {
         println "Tracing action ${actionUri}"
         bar = "bar"
    }

    def index() {
      render "foo $bar"
    }
}
