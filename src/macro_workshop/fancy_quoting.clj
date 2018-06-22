(ns macro-workshop.fancy-quoting)

(defn math-operations-set []
  `#{/ + * -})

;; Hint: you actually don't need to define any more vars to get this solved
;; Its the Maybe Monad
(defmacro construct-maybe
  ([] {:type `'None})
  ([x] :replace-me))

