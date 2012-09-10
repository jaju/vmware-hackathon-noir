(ns vmware-hackathon-noir.views.welcome
  (:require [vmware-hackathon-noir.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to vmware-hackathon-noir"]))
