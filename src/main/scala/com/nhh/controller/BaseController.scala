package com.nhh.controller

import com.typesafe.scalalogging.Logger

class BaseController extends ApplicationController {

  val logger = Logger(this.getClass.getCanonicalName)

  get("/"){
    logger.info(s"${request.getRemoteHost} - GET /")
    "OK"
  }

}
