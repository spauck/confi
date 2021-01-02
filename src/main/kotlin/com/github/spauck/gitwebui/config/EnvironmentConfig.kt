package com.github.spauck.gitwebui.config

import org.slf4j.LoggerFactory

private val log = LoggerFactory.getLogger(EnvironmentConfig::class.java)

class EnvironmentConfig : Config
{
  override fun get(key: String): String?
  {
    return System.getenv(key)
  }

  override fun get(key: String, defaultValue: String): String
  {
    var value = get(key)
    if (value == null)
    {
      log.info("Environment variable {} not defined", key)
      value = defaultValue
    }
    log.info("Using {}={}", key, value)
    return value
  }
}
