(defproject org.clojars.awebneck/lein-protoc "0.5.3"
  :description "Leiningen plugin for compiling Protocol Buffers"
  :url "https://github.com/awebneck/lein-protoc"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :eval-in-leiningen true
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/spec.alpha "0.2.176"]
                 [org.clojure/core.specs.alpha "0.2.44"]]
  :profiles {:dev {:dependencies [[com.google.protobuf/protobuf-java "3.3.1"]]}}
  :plugins [[lein-codox "0.10.3"]]
  :codox
  {:output-path "docs"
   :metadata {:doc/format :markdown}
   :source-uri "https://github.com/awebneck/lein-protoc/blob/{version}/{filepath}/#L{line}"})
