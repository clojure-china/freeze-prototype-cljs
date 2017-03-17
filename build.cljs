
(require '[lumo.build.api :as b])

(b/build "src"
  {:main 'freeze.main
   :output-to "main.js"
   :optimizations :advanced
   :target :nodejs})
