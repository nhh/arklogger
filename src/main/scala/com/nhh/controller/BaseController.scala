package com.nhh.controller

import com.typesafe.scalalogging.Logger

class BaseController extends ApplicationController {

  val logger = Logger("BaseController")

  get("/"){
    logger.info(s"${request.getRemoteHost} - GET /")
    "OK"
  }

}
