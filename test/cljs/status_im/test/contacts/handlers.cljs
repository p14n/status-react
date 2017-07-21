(ns status-im.test.contacts.handlers
  (:require [cljs.test :refer-macros [deftest is]]
            reagent.core
            [re-frame.core :as rf]
            [day8.re-frame.test :refer-macros [run-test-sync]]
            status-im.specs
            status-im.db
            [status-im.contacts.events :as e]
            [status-im.handlers :as h]
            status-im.subs))

(defn test-fixtures
  []
  (rf/reg-cofx
    ::e/get-all-contacts
    (fn [coeffects _]
      (assoc coeffects :all-contacts [])))
  (rf/reg-fx
    ::h/init-store
    (fn []
      nil)))

(deftest basic-sync
  (run-test-sync
    (test-fixtures)
    (rf/dispatch [:initialize-db])
    (let [contacts        (rf/subscribe [:get-contacts])
          global-commands (rf/subscribe [:get :global-commands])]

      ;;Assert the initial state
      (is (and (map? @contacts) (empty? @contacts)))
      (is (nil? @global-commands))

      (rf/dispatch [:load-contacts]))))
