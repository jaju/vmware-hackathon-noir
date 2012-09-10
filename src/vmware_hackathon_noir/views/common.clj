(ns vmware-hackathon-noir.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page :only [include-css include-js html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "vmware-hackathon-noir"]
               (include-css "/css/reset.css")
               (include-css "/css/bootstrap.css")
               (include-css "/css/bootstrap-responsive.css")
               (include-js "/js/bootstrap.js")]
              [:body
               [:div.container-fluid
                [:div.navbar
                 [:div.navbar-inner
                  [:div.navbar-fixed-top]]]
                
                [:div.wrapper
                 [:div.row-fluid
                  [:div.span12 content]]]]]))
