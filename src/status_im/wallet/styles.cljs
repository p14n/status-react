(ns status-im.wallet.styles
  (:require-macros [status-im.utils.styles :refer [defnstyle]])
  (:require [status-im.components.styles :as common]
            [status-im.utils.platform :as platform]))

(def wallet-container
  {:flex             1
   :background-color common/color-white})

;;;;;;;;;;;;;;;;;;
;; Main section ;;
;;;;;;;;;;;;;;;;;;

(def main-section
  {:flex 1
   :padding 16
   :background-color common/color-blue})

(def wallet-name
  {:font-size 16
   :color common/color-white})

(def total-balance
  {:flex 1
   :flex-direction :row})

(def total-balance-value
  {:font-size 24
   :color common/color-white})

(def total-balance-currency
  {:font-size 24
   :color common/color-gray})

(def value-variation
  {:flex 1
   :flex-direction :row})

(def value-variation-title
  {:font-size 14
   :color common/color-gray})

(def today-variation-container
  {:border-radius 10
   :background-color common/color-light-blue})

(def today-variation
  {:font-size 14
   :color common/color-light-blue2})

;;;;;;;;;;;;;;;;;;;;;
;; Balance section ;;
;;;;;;;;;;;;;;;;;;;;;

(def balance-section
  {:background-color common/color-white
   :padding 16})

(def balance-section-title
  {:font-size 14
   :color common/color-gray})

(def balance-list {})

(def balance-item-container
  {:flex 1
   :flex-direction :row
   :padding-vertical 10})

(def balance-item-currency-icon {})

(def balance-item-value
  {:font-size 16})

(def balance-item-currency
  {:font-size 16
   :color common/color-gray})

(def balance-item-details-icon {})

(def transactions-list-separator {})

;;;;;;;;;;;;;;;;;;;;
;; Action buttons ;;
;;;;;;;;;;;;;;;;;;;;

(def action-buttons-container
  {:flex 1
   :flex-direction :row})

(def send-receive-container
  {:flex 1
   :flex-direction :row
   :background-color common/color-blue
   :border-radius 10
   :padding 16})

(def send-button
  {:flex 1
   :flex-direction :row
   :padding-right 20})

(def send-button-icon {})
(def send-button-text
  {:font-size 16
   :color common/color-white})

(def receive-button
  {:flex 1
   :flex-direction :row
   :padding-left 20})

(def receive-button-icon {})
(def receive-button-text
  {:font-size 16
   :color common/color-white})

(def transactions-button-container
  {:border-radius 20
   :background-color common/color-light-blue
   :padding 16})

(def transactions-button-icon {})
