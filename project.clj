(defproject clj_torrent "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.zachallaun/bencode "0.1.1-SNAPSHOT"]]
  :main ^:skip-aot clj-torrent.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
