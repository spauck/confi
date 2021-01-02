# Confi

This project provides general configuration for JVM apps

## Principles & Goals

- In keeping with [The Twelve-Factor App](https://12factor.net/) design principles the primary goal of this project is to support configuration from the environment.
- All configuration should preferably be done through mechanisms not pinned to a particular technology.
  Examples of such technology specific mechanisms would be Java system properties or bean configuration.
- Ideally the avenue of configuration should be opaque to the consuming application.
  i.e. it shouldn't know or care if configuration is coming from the environment or a file.

## Design Choices

Configuration is constrained to be in the form of key-value pairs of strings.
Further, keys may only consist of characters valid for defining environment variables within a shell.
See [The Open Group Base Specifications](https://pubs.opengroup.org/onlinepubs/000095399/basedefs/xbd_chap08.html).
> Environment variable names used by the utilities in the Shell and Utilities volume of IEEE Std 1003.1-2001 consist solely of uppercase letters, digits, and the '_' (underscore) from the characters defined in `Portable Character Set` and do not begin with a digit.
