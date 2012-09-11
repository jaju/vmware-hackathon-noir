(ns vmware-hackathon-noir.views.favorites
  (:require [vmware-hackathon-noir.views.common :as common]
            [noir.content.getting-started]
            [clj-http.client :as http-client]
            [clojure.data.json :as json])
  (:use [noir.core :only [defpage]]))

(defn get-favorites [handle]
  (json/read-json
   (:body (http-client/get (str "https://api.twitter.com/1/favorites/" handle ".json")))))

(defn condense-tweets [full-tweets]
  (map #(list (-> % :user :screen_name) (:text %)) full-tweets))

(defn formatted-name-and-text-from-tweets [condensed-tweets]
  (reduce #(conj % [:tr [:td (first %2)] [:td (second %2)]]) [:table] condensed-tweets))

(defpage "/favorites/:id" {:keys [id]}
  (common/layout
   [:p (str "Here are " id "'s newest favorites!") [:br]
    (formatted-name-and-text-from-tweets (condense-tweets (get-favorites id)))]))
