package com.nhh.controller

import com.typesafe.scalalogging.Logger

class LogController extends ApplicationController {

  val logger = Logger(this.getClass.getCanonicalName)

  get("/:serverId") {
    logger.info(s"${params("serverId")} :: ${params("notetitle")} :: ${params("message")}")
    "OK"
  }

}