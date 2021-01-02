package com.github.spauck.gitwebui.config

interface Config
{
  /**
   * Get a value from the configuration.
   *
   * @return null if the value does not exist in the config
   */
  fun get(key: String): String?

  /**
   * Get a value from the configuration, else use the provided default
   */
  fun get(key: String, defaultValue: String): String
}
