package com.nhh.controller

class LogControllerTests extends ApplicationTests {

  addServlet(classOf[LogController], "/log/*")

  test("GET /log/grc?notetitle=Hello+World&message=Lore+Ipsum+Dolor on LogController should return status 200 and body should equal empty String"){
    get("/log/grc?notetitle=Hello+World&message=Lore+Ipsum+Dolor"){
      status should equal (200)
      body should equal ("OK")
    }
  }

}
