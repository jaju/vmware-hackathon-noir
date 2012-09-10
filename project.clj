(defproject vmware-hackathon-noir "0.1.0-SNAPSHOT"
            :description "VMWare Hackathon"
            :dependencies [[org.clojure/clojure "1.4.0"]
                           [noir "1.3.0-beta3"]]
            :ring {:handler vmware-hackathon-noir.server/handler}
            :main vmware-hackathon-noir.server)

