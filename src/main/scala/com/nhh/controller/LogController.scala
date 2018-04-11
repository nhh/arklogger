package com.nhh.controller

import com.typesafe.scalalogging.Logger

class LogController extends ApplicationController {

  val logger = Logger("LogController")

  get("/:serverId") {
    logger.info(s"${params("serverId")} :: ${params("notetitle")} :: ${params("message")}")
    "OK"
  }

}