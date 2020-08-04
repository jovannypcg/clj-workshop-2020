(ns clj-workshop-2020.mounts.datascript
  (:require [clj-workshop-2020.data-modeling.util.db :as util.db]
            [datascript.core :as ds]
            [mount.core :refer [defstate]]))

(def schema util.db/db-schema)

(defn create-connection
  []
  (let [conn (ds/create-conn schema)]
    (do
      (util.db/seed conn)
      conn)))

(defstate connection :start (create-connection))
