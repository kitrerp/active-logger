(defproject de.active-group/active-logger "0.3.0"
  :description "Active Logger: Utilities and DSL for logging on top of Timbre."
  :url "http://github.com/active-group/active-logger"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[com.taoensso/timbre "4.10.0"]
                 [de.active-group/active-clojure "0.35.0"]
                 [de.active-group/timbre-riemann "0.2.0"]
                 [riemann-clojure-client "0.5.1"]
                 [timbre-logstash "0.3.0"]]
  :repl-options {:init-ns active.clojure.logger.core})
