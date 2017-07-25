(ns status-im.wallet.screen
  (:require-macros [status-im.utils.views :refer [defview]])
  (:require [clojure.string :as string]
            [re-frame.core :as rf]
            [status-im.components.common.common :as common]
            [status-im.components.drawer.view :as drawer]
            [status-im.components.react :as rn]
            [status-im.components.toolbar-new.view :as toolbar]
            [status-im.components.toolbar-new.actions :as act]
            [status-im.i18n :as i18n]
            [status-im.utils.listview :as lw]
            [status-im.utils.platform :refer [platform-specific]]
            [status-im.wallet.styles :as st]))

(defn toolbar-view [transactions]
  [toolbar/toolbar
   {:nav-action       (act/hamburger drawer/open-drawer)}])

(defn main-section []
  [rn/view {:style st/main-section}
   [rn/text {:style st/wallet-name} "Main wallet"]
   [rn/view {:style st/total-balance}
    [rn/text {:style st/total-balance-value} "12.435345"]
    [rn/text {:style st/total-balance-currency} "ETH"]]
   [rn/view {:style st/value-variation}
    [rn/text {:style st/value-variation-title} "Total value"]
    [rn/view {:style st/today-variation-container}
     [rn/text {:style st/today-variation} "+5.433% today"]]]])

(defn balance-list-item [[id {:keys [currency amount] :as row}]]
  [rn/view {:style st/balance-item-container}
   [rn/image {:source {:uri :icon_close_dark}
              :style st/balance-item-currency-icon}]
   [rn/view {:style st/balance-item-value-container}
    [rn/text {:style st/balance-item-value} (str amount)]
    [rn/text {:style      st/balance-item-currency
              :uppercase? true}
     id]]
   [rn/image {:source {:uri :icon_arrow_right_gray}
              :style st/balance-item-details-icon}]])

(defn render-separator-fn [balances-count]
  (fn [_ row-id _]
    (rn/list-item
     ^{:key row-id}
     [common/separator {} st/balance-list-separator])))

(defn render-row-fn [row _ _]
  (rn/list-item
   [rn/touchable-highlight {:on-press #()}
    [rn/view
     [balance-list-item row]]]))

(defn balance-section []
  (let [balances {"eth" {:currency :eth :amount 0.445}
                  "snt" {:currency :snt :amount 1}
                  "sgt" {:currency :sgt :amount 125455.555}
                  "gnt" {:currency :gnt :amount 0.024794}}]
    [rn/view {:style st/balance-section}
     [rn/text {:style st/balance-section-title} "Balance"]
     [rn/list-view {:style           st/balance-list
                    :dataSource      (lw/to-datasource balances)
                    :renderSeparator (render-separator-fn (count balances))
                    :renderRow       render-row-fn}]]))

(defn action-buttons []
  [rn/view {:style st/action-buttons-container}
   [rn/view {:style st/send-receive-container}
    [rn/view {:style st/send-button}
     [rn/image {:source {:uri :icon_arrow_right_gray}
                :style st/send-button-icon}]
     [rn/text {:style st/send-button-text} "Send"]]
    [rn/view {:style st/receive-button}
     [rn/image {:source {:uri :icon_arrow_left_gray}
                :style st/receive-button-icon}]
     [rn/text {:style st/receive-button-text} "Receive"]]]
   [rn/view {:style st/transactions-button-container}
    [rn/image {:source {:uri :icon_close_white}
               :style st/transactions-button-icon}]]])

(defview wallet []
  []
  {:component-did-mount #(rf/dispatch [:test-wallet])}
  [rn/view st/wallet-container
   [toolbar-view]
   [main-section]
   [balance-section]
   [action-buttons]])
