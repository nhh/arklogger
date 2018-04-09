package com.nhh.controller

class BaseControllerTests extends ApplicationTests {

  addServlet(classOf[BaseController], "/*")

  test("GET / on LogController should return status 200"){
    get("/"){
      status should equal (200)
    }
  }

}
