(def config (load-file "../config.clj"))

(defproject hyperion/hyperion-dev (:version config)
  :description "Development Tools for Hyperion"
  :dependencies [[org.clojure/clojure ~(:clojure-version config)]
                 [hyperion/hyperion-core ~(:version config)]]
  :dev-dependencies [[speclj ~(:speclj-version config)]]
  :test-path "spec")
