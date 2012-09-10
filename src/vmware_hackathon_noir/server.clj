(ns vmware-hackathon-noir.server
  (:use noir.core)
  (:require [noir.server :as server]))

(server/load-views-ns 'vmware-hackathon-noir.views)

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "8080"))]
    (server/start port {:mode mode
                        :ns 'vmware-hackathon-noir})))

(server/load-views "src/vmware_hackathon_noir/views")

(def handler (server/gen-handler {:ns 'vmware-hackathon-noir.server}))