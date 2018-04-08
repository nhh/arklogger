package com.nhh.app

import com.typesafe.scalalogging.Logger
import org.scalatra._

class ApplicationServlet extends ScalatraServlet {
  val logger = Logger("arklogger")

  get("/:serverId") {
    logger.info(s"${params("serverId")} :: ${params("notetitle")} :: ${params("message")}")
  }

}