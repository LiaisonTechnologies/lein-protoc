# lein-protoc

[![Build Status](https://travis-ci.org/LiaisonTechnologies/lein-protoc.svg?branch=master)](https://travis-ci.org/LiaisonTechnologies/lein-protoc)

> [API Docs](https://liaisontechnologies.github.io/lein-protoc/)

A Leiningen plugin to compile [Google Protocol Buffers](https://developers.google.com/protocol-buffers/) to Java

This plugin provides seamless support for building projects that include `.proto` files. There
is no need to pre-download the `protoc` compiler. The plugin will manage the dependency for you
with cross-platform support. The plugin will work out of the box in Linux, MacOSX, and Windows
build environments.

## Usage

Put `[lein-protoc "0.4.0"]` into the `:plugins` vector of your project.clj.

The following options can be configured in the project.clj:

- `:protoc-version` the Protocol Buffers Compiler version to use. Defaults to `"3.4.0"`.
- `:proto-source-paths` vector of absolute paths or paths relative to the project root that contain the .proto files to be compiled. Defaults to `["src/proto"]`
- `:proto-target-path ` the absolute path or path relative to the project root where the sources should be generated. Defaults to `${target-path}/generated-sources/protobuf`
- `:protoc-grpc` true (or empty map) to generate interfaces for gRPC service definitions with default settings. Defaults to `false`. Can optionally provide a map with the following configs:
  - `:version` version number for gRPC codegen. Defaults to `"1.6.1"`.
  - `:target-path` absolute path or path relative to the project root where the sources should be generated. Defaults to the `:proto-target-path`
- `:protoc-timeout` timeout value in seconds for the compilation process. Defaults to `60`

The plugin hooks to the `javac` task so that sources will be generated prior to java compilation.
Alternatively, the sources can be generated independently with:

    $ lein protoc

## License

Copyright © 2017 Liaison Technologies

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
