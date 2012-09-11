(ns vmware-hackathon-noir.views.favorites
  (:require [vmware-hackathon-noir.views.common :as common]
            [noir.content.getting-started]
            [clj-http.client :as http-client]
            [clojure.data.json :as json])
  (:use [noir.core :only [defpage]]))

(defn get-favorites [handle]
  (json/read-json
   (:body (http-client/get (str "https://api.twitter.com/1/favorites/" handle ".json")))))

(defn get-favorites-str [handle]
  (reduce #(str %1 "<br/>" %2)
       (map :text (get-favorites handle)))) 

(defpage "/favorites/:id" {:keys [id]}
         (common/layout
           [:p "Welcome to vmware-hackathon-noir" [:br]  (get-favorites-str id)]))

(defpage "/abc" []
  (common/layout
   [:p "ABC!"]))