(ns com.appear.wild-bot.core
  "FIXME: my new org.corfield.new/scratch project.")

(defn exec
  "Invoke me with clojure -X wild-bot.wild-bot/exec"
  [opts]
  (println "exec with" opts))

(defn -main
  "Invoke me with clojure -M -m wild-bot.wild-bot"
  [& args]
  (println "-main with" args))
