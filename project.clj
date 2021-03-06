(defproject clj-workshop "0.1.0-SNAPSHOT"
  :plugins [[lein-cljfmt "0.6.6"]
            [lein-nsorg "0.3.0"]]

  :dependencies [[clojure-csv/clojure-csv      "2.0.2"]
                 [com.stuartsierra/component   "1.0.0"]
                 [datascript                   "1.0.0"]
                 [funcool/cuerdas              "2.1.0"]
                 [io.pedestal/pedestal.service "0.5.7"]
                 [io.pedestal/pedestal.route   "0.5.7"]
                 [io.pedestal/pedestal.jetty   "0.5.7"]
                 [lambdaisland/kaocha          "1.0.641"]
                 [mount                        "0.1.16"]
                 [org.clojure/clojure          "1.10.1"]
                 [org.clojure/data.json        "0.2.6"]]

  :aliases {"lint-fix" ["do"
                        ["nsorg" "--replace"]
                        ["cljfmt" "fix"]]
            "kaocha"   ["run" "-m" "kaocha.runner"]}

  :main ^:skip-aot clj-workshop-2020.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
