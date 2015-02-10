(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (* x -1)
    x))

(defn divides? [divisor n]
  (if (== 0 (mod n divisor)) true
    false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else ""))

(defn teen? [age]
  (if (>= age 13) (<= age 19)
    false))

(defn not-teen? [age]
  (cond
    (teen? age) false
    :else true))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (or (list? x) (vector? x)) (* (count x) 2)
    :else true))

(defn leap-year? [year]
  (if (divides? 4 year) 
    (if (divides? 100 year)
      (if (divides? 400 year) 
        true
        false)
    true)
  false))
