package com.github.spauck.gitwebui.config

class MapConfig(private val map: Map<String, String>) : Config
{
  override operator fun get(key: String): String?
  {
    return map[key]
  }

  override operator fun get(key: String, defaultValue: String): String
  {
    return map[key] ?: defaultValue
  }
}
