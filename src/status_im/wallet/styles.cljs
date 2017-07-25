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
  {:padding 16
   :background-color common/color-blue4})

(def wallet-name
  {:font-size 16
   :color common/color-white})

(def total-balance
  {:flex-direction :row})

(def total-balance-value
  {:font-size 24
   :color common/color-white})

(def total-balance-currency
  {:font-size 24
   :color common/color-gray7})

(def value-variation
  {:flex-direction :row})

(def value-variation-title
  {:font-size 14
   :color common/color-gray7})

(def today-variation-container
  {:border-radius 10
   :background-color common/color-green-1})

(def today-variation
  {:font-size 14
   :color common/color-green-2})

;;;;;;;;;;;;;;;;;;;;;
;; Balance section ;;
;;;;;;;;;;;;;;;;;;;;;

(def balance-section
  {:background-color common/color-white
   :padding 16})

(def balance-section-title
  {:font-size 14
   :color common/color-gray4})

(def balance-list {})

(def balance-item-container
  {:flex-direction :row
   :align-items      :center
   :padding-vertical 10})

(def balance-item-currency-icon
  {:height 40
   :width 40})

(def balance-item-value-container
  {:flex 1
   :flex-direction :row})

(def balance-item-value
  {:font-size 16
   :color common/color-black})

(def balance-item-currency
  {:font-size 16
   :color common/color-gray4})

(def balance-item-details-icon
  {:flex-shrink 1
   :height 40
   :width 40})

(def balance-list-separator {})


;;;;;;;;;;;;;;;;;;;;
;; Action buttons ;;
;;;;;;;;;;;;;;;;;;;;

(def action-buttons-container
  {:flex-direction :row})

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
   :background-color common/color-light-blue5
   :padding 16})

(def transactions-button-icon {})
