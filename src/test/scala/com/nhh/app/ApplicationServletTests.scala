package com.nhh.app

import org.scalatra.test.scalatest._

class ApplicationServletTests extends ScalatraFunSuite {

  addServlet(classOf[ApplicationServlet], "/*")

  test("GET / on ApplicationServlet should return status 200"){
    get("/"){
      status should equal (200)
    }
  }

}
