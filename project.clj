(defproject battlesnake-clojure "1.0.0"
  :description "Clojure starter for Battlesnake 2016"
  :url "https://github.com/sendwithus/battlesnake-clojure"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.4.0"]
                 [ring/ring-defaults "0.1.2"]
                 [ring/ring-json "0.3.1"]]
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler battlesnake-clojure.handler/app
         :auto-reload? true
         :auto-refresh? true}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
