(defproject org.clojars.awebneck/lein-protoc "0.5.5"
  :description "Leiningen plugin for compiling Protocol Buffers"
  :url "https://github.com/awebneck/lein-protoc"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :eval-in-leiningen true
  :profiles {:dev {:dependencies [[com.google.protobuf/protobuf-java "3.6.0"]]}}
  :plugins [[lein-codox "0.10.4"]]
  :codox
  {:output-path "docs"
   :metadata {:doc/format :markdown}
   :source-uri "https://github.com/awebneck/lein-protoc/blob/{version}/{filepath}/#L{line}"})
