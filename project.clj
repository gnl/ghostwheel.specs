(defproject gnl/ghostwheel.specs "0.3.7"
  :description "A collection of third-party library specs for Clojure written in Ghostwheel's gspec syntax"
  :url "https://github.com/gnl/ghostwheel.specs"
  :scm {:name "git"
        :url  "https://github.com/gnl/ghostwheel.specs"}
  :license {:name "Eclipse Public License"
            :url  "https://choosealicense.com/licenses/epl-2.0/"}
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]]
  :dependencies [[gnl/ghostwheel "0.3.7"]]
  :profiles {:dev {:dependencies [[org.clojure/clojurescript "1.10.520"]
                                  [org.clojure/clojure "1.10.0"]]}}
  :source-paths ["src"]
  :clean-targets ^{:protect false} ["target" "resources"])
