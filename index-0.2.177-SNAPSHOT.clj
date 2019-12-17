{:namespaces
 ({:doc
   "The spec library specifies the structure of data or functions and provides\noperations to validate, conform, explain, describe, and generate data based on\nthe specs.\n\nRationale: https://clojure.org/about/spec\nGuide: https://clojure.org/guides/spec",
   :name "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha/clojure.spec.alpha-api.html",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj"}
  {:doc nil,
   :name "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha/clojure.spec.gen.alpha-api.html",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj"}
  {:doc nil,
   :name "clojure.spec.test.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha/clojure.spec.test.alpha-api.html",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/f23ea614b3cb658cff0044a027cacdd76831edcf/src/main/clojure/clojure/spec/test/alpha.clj"}),
 :vars
 ({:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "&",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L660",
   :line 660,
   :var-type "macro",
   :arglists ([re & preds]),
   :doc
   "takes a regex op re, and predicates. Returns a regex-op that consumes\ninput as per re but subjects the resulting value to the\nconjunction of the predicates, and any conforming they might perform.",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/&"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "*",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L609",
   :line 609,
   :var-type "macro",
   :arglists ([pred-form]),
   :doc
   "Returns a regex op that matches zero or more values matching\npred. Produces a vector of matches iff there is at least one match",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/*"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "*coll-check-limit*",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L36",
   :dynamic true,
   :line 36,
   :var-type "var",
   :arglists nil,
   :doc
   "The number of elements validated in a collection spec'ed with 'every'",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/*coll-check-limit*"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "*coll-error-limit*",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L40",
   :dynamic true,
   :line 40,
   :var-type "var",
   :arglists nil,
   :doc
   "The number of errors reported by explain in a collection spec'ed with 'every'",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/*coll-error-limit*"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "*compile-asserts*",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L1941",
   :dynamic true,
   :line 1941,
   :var-type "var",
   :arglists nil,
   :doc
   "If true, compiler will enable spec asserts, which are then\nsubject to runtime control via check-asserts? If false, compiler\nwill eliminate all spec assert overhead. See 'assert'.\n\nInitially set to boolean value of clojure.spec.compile-asserts\nsystem property. Defaults to true.",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/*compile-asserts*"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "*fspec-iterations*",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L32",
   :dynamic true,
   :line 32,
   :var-type "var",
   :arglists nil,
   :doc
   "The number of times an anonymous fn specified by fspec will be (generatively) tested during conform",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/*fspec-iterations*"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "*recursion-limit*",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L26",
   :dynamic true,
   :line 26,
   :var-type "var",
   :arglists nil,
   :doc
   "A soft limit on how many times a branching spec (or/alt/*/opt-keys/multi-spec)\ncan be recursed through during generation. After this a\nnon-recursive branch will be chosen.",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/*recursion-limit*"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "+",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L615",
   :line 615,
   :var-type "macro",
   :arglists ([pred-form]),
   :doc
   "Returns a regex op that matches one or more values matching\npred. Produces a vector of matches",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/+"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "?",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L621",
   :line 621,
   :var-type "macro",
   :arglists ([pred-form]),
   :doc
   "Returns a regex op that matches zero or one value matching\npred. Produces a single value (not a collection) if matched.",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/?"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "alt",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L627",
   :line 627,
   :var-type "macro",
   :arglists ([& key-pred-forms]),
   :doc
   "Takes key+pred pairs, e.g.\n\n(s/alt :even even? :small #(< % 42))\n\nReturns a regex op that returns a map entry containing the key of the\nfirst matching pred and the corresponding value. Thus the\n'key' and 'val' functions can be used to refer generically to the\ncomponents of the tagged return",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/alt"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "and",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L495",
   :line 495,
   :var-type "macro",
   :arglists ([& pred-forms]),
   :doc
   "Takes predicate/spec-forms, e.g.\n\n(s/and even? #(< % 42))\n\nReturns a spec that returns the conformed value. Successive\nconformed values propagate through rest of predicates.",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/and"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "assert",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L1977",
   :line 1977,
   :var-type "macro",
   :arglists ([spec x]),
   :doc
   "spec-checking assert expression. Returns x if x is valid? according\nto spec, else throws an ex-info with explain-data plus ::failure of\n:assertion-failed.\n\nCan be disabled at either compile time or runtime:\n\nIf *compile-asserts* is false at compile time, compiles to x. Defaults\nto value of 'clojure.spec.compile-asserts' system property, or true if\nnot set.\n\nIf (check-asserts?) is false at runtime, always returns x. Defaults to\nvalue of 'clojure.spec.check-asserts' system property, or false if not\nset. You can toggle check-asserts? with (check-asserts bool).",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/assert"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "assert*",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L1966",
   :line 1966,
   :var-type "function",
   :arglists ([spec x]),
   :doc "Do not call this directly, use 'assert'.",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/assert*"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "cat",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L644",
   :line 644,
   :var-type "macro",
   :arglists ([& key-pred-forms]),
   :doc
   "Takes key+pred pairs, e.g.\n\n(s/cat :e even? :o odd?)\n\nReturns a regex op that matches (all) values in sequence, returning a map\ncontaining the keys of each pred and the corresponding value.",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/cat"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "check-asserts",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L1957",
   :line 1957,
   :var-type "function",
   :arglists ([flag]),
   :doc
   "Enable or disable spec asserts that have been compiled\nwith '*compile-asserts*' true.  See 'assert'.\n\nInitially set to boolean value of clojure.spec.check-asserts\nsystem property. Defaults to false.",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/check-asserts"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "check-asserts?",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L1952",
   :line 1952,
   :var-type "function",
   :arglists ([]),
   :doc "Returns the value set by check-asserts.",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/check-asserts?"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "coll-of",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L581",
   :line 581,
   :var-type "macro",
   :arglists ([pred & opts]),
   :doc
   "Returns a spec for a collection of items satisfying pred. Unlike\n'every', coll-of will exhaustively conform every value.\n\nSame options as 'every'. conform will produce a collection\ncorresponding to :into if supplied, else will match the input collection,\navoiding rebuilding when possible.\n\nSee also - every, map-of",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/coll-of"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "conform",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L167",
   :line 167,
   :var-type "function",
   :arglists ([spec x]),
   :doc
   "Given a spec and a value, returns :clojure.spec.alpha/invalid \n\tif value does not match spec, else the (possibly destructured) value.",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/conform"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "conformer",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L668",
   :line 668,
   :var-type "macro",
   :arglists ([f] [f unf]),
   :doc
   "takes a predicate function with the semantics of conform i.e. it should return either a\n(possibly converted) value or :clojure.spec.alpha/invalid, and returns a\nspec that uses it as a predicate/conformer. Optionally takes a\nsecond fn that does unform of result of first",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/conformer"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "def",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L349",
   :line 349,
   :var-type "macro",
   :arglists ([k spec-form]),
   :doc
   "Given a namespace-qualified keyword or resolvable symbol k, and a\nspec, spec-name, predicate or regex-op makes an entry in the\nregistry mapping k to the spec. Use nil to remove an entry in\nthe registry for k.",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/def"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "describe",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L205",
   :line 205,
   :var-type "function",
   :arglists ([spec]),
   :doc "returns an abbreviated description of the spec as data",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/describe"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "double-in",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L1923",
   :line 1923,
   :var-type "macro",
   :arglists
   ([&
     {:keys [infinite? NaN? min max],
      :or {infinite? true, NaN? true},
      :as m}]),
   :doc
   "Specs a 64-bit floating point number. Options:\n\n:infinite? - whether +/- infinity allowed (default true)\n:NaN?      - whether NaN allowed (default true)\n:min       - minimum value (inclusive, default none)\n:max       - maximum value (inclusive, default none)",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/double-in"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "every",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L522",
   :line 522,
   :var-type "macro",
   :arglists
   ([pred
     &
     {:keys [into kind count max-count min-count distinct gen-max gen],
      :as opts}]),
   :doc
   "takes a pred and validates collection elements against that pred.\n\nNote that 'every' does not do exhaustive checking, rather it samples\n*coll-check-limit* elements. Nor (as a result) does it do any\nconforming of elements. 'explain' will report at most *coll-error-limit*\nproblems.  Thus 'every' should be suitable for potentially large\ncollections.\n\nTakes several kwargs options that further constrain the collection:\n\n:kind - a pred that the collection type must satisfy, e.g. vector?\n      (default nil) Note that if :kind is specified and :into is\n      not, this pred must generate in order for every to generate.\n:count - specifies coll has exactly this count (default nil)\n:min-count, :max-count - coll has count (<= min-count count max-count) (defaults nil)\n:distinct - all the elements are distinct (default nil)\n\nAnd additional args that control gen\n\n:gen-max - the maximum coll size to generate (default 20)\n:into - one of [], (), {}, #{} - the default collection to generate into\n    (default: empty coll as generated by :kind pred if supplied, else [])\n\nOptionally takes :gen generator-fn, which must be a fn of no args that\nreturns a test.check generator\n\nSee also - coll-of, every-kv",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/every"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "every-kv",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L570",
   :line 570,
   :var-type "macro",
   :arglists ([kpred vpred & opts]),
   :doc
   "like 'every' but takes separate key and val preds and works on associative collections.\n\nSame options as 'every', :into defaults to {}\n\nSee also - map-of",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/every-kv"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "exercise",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L1868",
   :line 1868,
   :var-type "function",
   :arglists ([spec] [spec n] [spec n overrides]),
   :doc
   "generates a number (default 10) of values compatible with spec and maps conform over them,\nreturning a sequence of [val conformed-val] tuples. Optionally takes\na generator overrides map as per gen",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/exercise"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "exercise-fn",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L1877",
   :line 1877,
   :var-type "function",
   :arglists ([sym] [sym n] [sym-or-f n fspec]),
   :doc
   "exercises the fn named by sym (a symbol) by applying it to\nn (default 10) generated samples of its args spec. When fspec is\nsupplied its arg spec is used, and sym-or-f can be a fn.  Returns a\nsequence of tuples of [args ret]. ",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/exercise-fn"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "explain",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L267",
   :line 267,
   :var-type "function",
   :arglists ([spec x]),
   :doc
   "Given a spec and a value that fails to conform, prints an explanation to *out*.",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/explain"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "explain-data",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L225",
   :line 225,
   :var-type "function",
   :arglists ([spec x]),
   :doc
   "Given a spec and a value x which ought to conform, returns nil if x\nconforms, else a map with at least the key ::problems whose value is\na collection of problem-maps, where problem-map has at least :path :pred and :val\nkeys describing the predicate and the value that failed at that\npath.",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/explain-data"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "explain-out",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L261",
   :line 261,
   :var-type "function",
   :arglists ([ed]),
   :doc
   "Prints explanation data (per 'explain-data') to *out* using the printer in *explain-out*,\nby default explain-printer.",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/explain-out"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "explain-printer",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L234",
   :line 234,
   :var-type "function",
   :arglists ([ed]),
   :doc
   "Default printer for explain-data. nil indicates a successful validation.",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/explain-printer"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "explain-str",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L272",
   :line 272,
   :var-type "function",
   :arglists ([spec x]),
   :doc
   "Given a spec and a value that fails to conform, returns an explanation as a string.",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/explain-str"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "fdef",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L716",
   :line 716,
   :var-type "macro",
   :arglists ([fn-sym & specs]),
   :doc
   "Takes a symbol naming a function, and one or more of the following:\n\n:args A regex spec for the function arguments as they were a list to be\n  passed to apply - in this way, a single spec can handle functions with\n  multiple arities\n:ret A spec for the function's return value\n:fn A spec of the relationship between args and ret - the\n  value passed is {:args conformed-args :ret conformed-ret} and is\n  expected to contain predicates that relate those values\n\nQualifies fn-sym with resolve, or using *ns* if no resolution found.\nRegisters an fspec in the global registry, where it can be retrieved\nby calling get-spec with the var or fully-qualified symbol.\n\nOnce registered, function specs are included in doc, checked by\ninstrument, tested by the runner clojure.spec.test.alpha/check, and (if\na macro) used to explain errors during macroexpansion.\n\nNote that :fn specs require the presence of :args and :ret specs to\nconform values, and so :fn specs will be ignored if :args or :ret\nare missing.\n\nReturns the qualified fn-sym.\n\nFor example, to register function specs for the symbol function:\n\n(s/fdef clojure.core/symbol\n  :args (s/alt :separate (s/cat :ns string? :n string?)\n               :str string?\n               :sym symbol?)\n  :ret symbol?)",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/fdef"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "form",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L180",
   :line 180,
   :var-type "function",
   :arglists ([spec]),
   :doc "returns the spec as data",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/form"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "fspec",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L676",
   :line 676,
   :var-type "macro",
   :arglists ([& {:keys [args ret fn gen], :or {ret 'any?}}]),
   :doc
   "takes :args :ret and (optional) :fn kwargs whose values are preds\nand returns a spec whose conform/explain take a fn and validates it\nusing generative testing. The conformed value is always the fn itself.\n\nSee 'fdef' for a single operation that creates an fspec and\nregisters it, as well as a full description of :args, :ret and :fn\n\nfspecs can generate functions that validate the arguments and\nfabricate a return value compliant with the :ret spec, ignoring\nthe :fn spec if present.\n\nOptionally takes :gen generator-fn, which must be a fn of no args\nthat returns a test.check generator.",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/fspec"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "gen",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L292",
   :line 292,
   :var-type "function",
   :arglists ([spec] [spec overrides]),
   :doc
   "Given a spec, returns the generator for it, or throws if none can\nbe constructed. Optionally an overrides map can be provided which\nshould map spec names or paths (vectors of keywords) to no-arg\ngenerator-creating fns. These will be used instead of the generators at those\nnames/paths. Note that parent generator (in the spec or overrides\nmap) will supersede those of any subtrees. A generator for a regex\nop must always return a sequential collection (i.e. a generator for\ns/? should return either an empty sequence/vector or a\nsequence/vector with one item in it)",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/gen"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "get-spec",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L363",
   :line 363,
   :var-type "function",
   :arglists ([k]),
   :doc "Returns spec registered for keyword/symbol/var k, or nil.",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/get-spec"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "inst-in",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L1898",
   :line 1898,
   :var-type "macro",
   :arglists ([start end]),
   :doc
   "Returns a spec that validates insts in the range from start\n(inclusive) to end (exclusive).",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/inst-in"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "inst-in-range?",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L1891",
   :line 1891,
   :var-type "function",
   :arglists ([start end inst]),
   :doc "Return true if inst at or after start and before end",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/inst-in-range?"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "int-in",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L1916",
   :line 1916,
   :var-type "macro",
   :arglists ([start end]),
   :doc
   "Returns a spec that validates fixed precision integers in the\nrange from start (inclusive) to end (exclusive).",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/int-in"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "int-in-range?",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L1910",
   :line 1910,
   :var-type "function",
   :arglists ([start end val]),
   :doc
   "Return true if start <= val, val < end and val is a fixed\nprecision integer.",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/int-in-range?"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "invalid?",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L162",
   :line 162,
   :var-type "function",
   :arglists ([ret]),
   :doc "tests the validity of a conform return value",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/invalid?"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "keys",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L416",
   :line 416,
   :var-type "macro",
   :arglists ([& {:keys [req req-un opt opt-un gen]}]),
   :doc
   "Creates and returns a map validating spec. :req and :opt are both\nvectors of namespaced-qualified keywords. The validator will ensure\nthe :req keys are present. The :opt keys serve as documentation and\nmay be used by the generator.\n\nThe :req key vector supports 'and' and 'or' for key groups:\n\n(s/keys :req [::x ::y (or ::secret (and ::user ::pwd))] :opt [::z])\n\nThere are also -un versions of :req and :opt. These allow\nyou to connect unqualified keys to specs.  In each case, fully\nqualfied keywords are passed, which name the specs, but unqualified\nkeys (with the same name component) are expected and checked at\nconform-time, and generated during gen:\n\n(s/keys :req-un [:my.ns/x :my.ns/y])\n\nThe above says keys :x and :y are required, and will be validated\nand generated by specs (if they exist) named :my.ns/x :my.ns/y \nrespectively.\n\nIn addition, the values of *all* namespace-qualified keys will be validated\n(and possibly destructured) by any registered specs. Note: there is\nno support for inline value specification, by design.\n\nOptionally takes :gen generator-fn, which must be a fn of no args that\nreturns a test.check generator.",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/keys"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "keys*",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L1796",
   :line 1796,
   :var-type "macro",
   :arglists ([& kspecs]),
   :doc
   "takes the same arguments as spec/keys and returns a regex op that matches sequences of key/values,\nconverts them into a map, and conforms that map with a corresponding\nspec/keys call:\n\nuser=> (s/conform (s/keys :req-un [::a ::c]) {:a 1 :c 2})\n{:a 1, :c 2}\nuser=> (s/conform (s/keys* :req-un [::a ::c]) [:a 1 :c 2])\n{:a 1, :c 2}\n\nthe resulting regex op can be composed into a larger regex:\n\nuser=> (s/conform (s/cat :i1 integer? :m (s/keys* :req-un [::a ::c]) :i2 integer?) [42 :a 1 :c 2 :d 4 99])\n{:i1 42, :m {:a 1, :c 2, :d 4}, :i2 99}",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/keys*"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "map-of",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L594",
   :line 594,
   :var-type "macro",
   :arglists ([kpred vpred & opts]),
   :doc
   "Returns a spec for a map whose keys satisfy kpred and vals satisfy\nvpred. Unlike 'every-kv', map-of will exhaustively conform every\nvalue.\n\nSame options as 'every', :kind defaults to map?, with the addition of:\n\n:conform-keys - conform keys as well as values (default false)\n\nSee also - every-kv",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/map-of"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "merge",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L505",
   :line 505,
   :var-type "macro",
   :arglists ([& pred-forms]),
   :doc
   "Takes map-validating specs (e.g. 'keys' specs) and\nreturns a spec that returns a conformed map satisfying all of the\nspecs.  Unlike 'and', merge can generate maps satisfying the\nunion of the predicates.",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/merge"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "multi-spec",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L387",
   :line 387,
   :var-type "macro",
   :arglists ([mm retag]),
   :doc
   "Takes the name of a spec/predicate-returning multimethod and a\ntag-restoring keyword or fn (retag).  Returns a spec that when\nconforming or explaining data will pass it to the multimethod to get\nan appropriate spec. You can e.g. use multi-spec to dynamically and\nextensibly associate specs with 'tagged' data (i.e. data where one\nof the fields indicates the shape of the rest of the structure).\n\n(defmulti mspec :tag)\n\nThe methods should ignore their argument and return a predicate/spec:\n(defmethod mspec :int [_] (s/keys :req-un [::tag ::i]))\n\nretag is used during generation to retag generated values with\nmatching tags. retag can either be a keyword, at which key the\ndispatch-tag will be assoc'ed, or a fn of generated value and\ndispatch-tag that should return an appropriately retagged value.\n\nNote that because the tags themselves comprise an open set,\nthe tag key spec cannot enumerate the values, but can e.g.\ntest for keyword?.\n\nNote also that the dispatch values of the multimethod will be\nincluded in the path, i.e. in reporting and gen overrides, even\nthough those values are not evident in the spec.",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/multi-spec"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "nilable",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L1862",
   :line 1862,
   :var-type "macro",
   :arglists ([pred]),
   :doc "returns a spec that accepts nil and values satisfying pred",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/nilable"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "or",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L478",
   :line 478,
   :var-type "macro",
   :arglists ([& key-pred-forms]),
   :doc
   "Takes key+pred pairs, e.g.\n\n(s/or :even even? :small #(< % 42))\n\nReturns a destructuring spec that returns a map entry containing the\nkey of the first matching pred and the corresponding value. Thus the\n'key' and 'val' functions can be used to refer generically to the\ncomponents of the tagged return.",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/or"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "regex?",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L85",
   :line 85,
   :var-type "function",
   :arglists ([x]),
   :doc
   "returns x if x is a (clojure.spec) regex op, else logical false",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/regex?"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "registry",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L358",
   :line 358,
   :var-type "function",
   :arglists ([]),
   :doc
   "returns the registry map, prefer 'get-spec' to lookup a spec by name",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/registry"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "spec",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L368",
   :line 368,
   :var-type "macro",
   :arglists ([form & {:keys [gen]}]),
   :doc
   "Takes a single predicate form, e.g. can be the name of a predicate,\nlike even?, or a fn literal like #(< % 42). Note that it is not\ngenerally necessary to wrap predicates in spec when using the rest\nof the spec macros, only to attach a unique generator\n\nCan also be passed the result of one of the regex ops -\ncat, alt, *, +, ?, in which case it will return a regex-conforming\nspec, useful when nesting an independent regex.\n---\n\nOptionally takes :gen generator-fn, which must be a fn of no args that\nreturns a test.check generator.\n\nReturns a spec.",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/spec"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "spec?",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L79",
   :line 79,
   :var-type "function",
   :arglists ([x]),
   :doc "returns x if x is a spec object, else logical false",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/spec?"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "tuple",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L696",
   :line 696,
   :var-type "macro",
   :arglists ([& preds]),
   :doc
   "takes one or more preds and returns a spec for a tuple, a vector\nwhere each element conforms to the corresponding pred. Each element\nwill be referred to in paths using its ordinal.",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/tuple"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "unform",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L173",
   :line 173,
   :var-type "function",
   :arglists ([spec x]),
   :doc
   "Given a spec and a value created by or compliant with a call to\n'conform' with the same spec, returns a value with all conform\ndestructuring undone.",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/unform"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "valid?",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L772",
   :line 772,
   :var-type "function",
   :arglists ([spec x] [spec x form]),
   :doc "Helper function that returns true when x is valid for spec.",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/valid?"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj",
   :name "with-gen",
   :file "src/main/clojure/clojure/spec/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/cd4aeb7edccbf7a881dcdc3c947313359508db3a/src/main/clojure/clojure/spec/alpha.clj#L210",
   :line 210,
   :var-type "function",
   :arglists ([spec gen-fn]),
   :doc
   "Takes a spec and a no-arg, generator-returning fn and returns a version of that spec that uses that generator",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#clojure.spec.alpha/with-gen"}
  {:keyword :clojure.spec.alpha/kvs->map,
   :spec
   (conformer
    (zipmap
     (map :clojure.spec.alpha/k %)
     (map :clojure.spec.alpha/v %))
    (map (fn [[k v]] #:clojure.spec.alpha{:k k, :v v}) %)),
   :var-type "spec",
   :namespace "clojure.spec.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.alpha-api.html#:clojure.spec.alpha/kvs->map"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "any",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L118",
   :line 118,
   :var-type "function",
   :arglists ([& args]),
   :doc "Fn returning clojure.test.check.generators/any",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/any"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "any-printable",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L118",
   :line 118,
   :var-type "function",
   :arglists ([& args]),
   :doc "Fn returning clojure.test.check.generators/any-printable",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/any-printable"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "bind",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L95",
   :line 95,
   :var-type "function",
   :arglists ([& args]),
   :doc "Lazy loaded version of clojure.test.check.generators/bind",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/bind"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "boolean",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L118",
   :line 118,
   :var-type "function",
   :arglists ([& args]),
   :doc "Fn returning clojure.test.check.generators/boolean",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/boolean"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "bytes",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L118",
   :line 118,
   :var-type "function",
   :arglists ([& args]),
   :doc "Fn returning clojure.test.check.generators/bytes",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/bytes"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "cat",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L122",
   :line 122,
   :var-type "function",
   :arglists ([& gens]),
   :doc
   "Returns a generator of a sequence catenated from results of\ngens, each of which should generate something sequential.",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/cat"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "char",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L118",
   :line 118,
   :var-type "function",
   :arglists ([& args]),
   :doc "Fn returning clojure.test.check.generators/char",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/char"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "char-alpha",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L118",
   :line 118,
   :var-type "function",
   :arglists ([& args]),
   :doc "Fn returning clojure.test.check.generators/char-alpha",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/char-alpha"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "char-alphanumeric",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L118",
   :line 118,
   :var-type "function",
   :arglists ([& args]),
   :doc "Fn returning clojure.test.check.generators/char-alphanumeric",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/char-alphanumeric"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "char-ascii",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L118",
   :line 118,
   :var-type "function",
   :arglists ([& args]),
   :doc "Fn returning clojure.test.check.generators/char-ascii",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/char-ascii"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "choose",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L95",
   :line 95,
   :var-type "function",
   :arglists ([& args]),
   :doc "Lazy loaded version of clojure.test.check.generators/choose",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/choose"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "delay",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L61",
   :line 61,
   :var-type "macro",
   :arglists ([& body]),
   :doc
   "given body that returns a generator, returns a\ngenerator that delegates to that, but delays\ncreation until used.",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/delay"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "double",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L118",
   :line 118,
   :var-type "function",
   :arglists ([& args]),
   :doc "Fn returning clojure.test.check.generators/double",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/double"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "double*",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L95",
   :line 95,
   :var-type "function",
   :arglists ([& args]),
   :doc "Lazy loaded version of clojure.test.check.generators/double*",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/double*"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "elements",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L95",
   :line 95,
   :var-type "function",
   :arglists ([& args]),
   :doc
   "Lazy loaded version of clojure.test.check.generators/elements",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/elements"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "fmap",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L95",
   :line 95,
   :var-type "function",
   :arglists ([& args]),
   :doc "Lazy loaded version of clojure.test.check.generators/fmap",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/fmap"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "for-all*",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L36",
   :line 36,
   :var-type "function",
   :arglists ([& args]),
   :doc "Dynamically loaded clojure.test.check.properties/for-all*.",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/for-all*"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "frequency",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L95",
   :line 95,
   :var-type "function",
   :arglists ([& args]),
   :doc
   "Lazy loaded version of clojure.test.check.generators/frequency",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/frequency"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "gen-for-name",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L68",
   :line 68,
   :var-type "function",
   :arglists ([s]),
   :doc "Dynamically loads test.check generator named s.",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/gen-for-name"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "gen-for-pred",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L190",
   :line 190,
   :var-type "function",
   :arglists ([pred]),
   :doc
   "Given a predicate, returns a built-in generator if one exists.",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/gen-for-pred"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "generate",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L50",
   :line 50,
   :var-type "function",
   :arglists ([generator]),
   :doc "Generate a single value using generator.",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/generate"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "hash-map",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L95",
   :line 95,
   :var-type "function",
   :arglists ([& args]),
   :doc
   "Lazy loaded version of clojure.test.check.generators/hash-map",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/hash-map"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "int",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L118",
   :line 118,
   :var-type "function",
   :arglists ([& args]),
   :doc "Fn returning clojure.test.check.generators/int",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/int"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "keyword",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L118",
   :line 118,
   :var-type "function",
   :arglists ([& args]),
   :doc "Fn returning clojure.test.check.generators/keyword",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/keyword"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "keyword-ns",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L118",
   :line 118,
   :var-type "function",
   :arglists ([& args]),
   :doc "Fn returning clojure.test.check.generators/keyword-ns",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/keyword-ns"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "large-integer",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L118",
   :line 118,
   :var-type "function",
   :arglists ([& args]),
   :doc "Fn returning clojure.test.check.generators/large-integer",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/large-integer"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "large-integer*",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L95",
   :line 95,
   :var-type "function",
   :arglists ([& args]),
   :doc
   "Lazy loaded version of clojure.test.check.generators/large-integer*",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/large-integer*"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "list",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L95",
   :line 95,
   :var-type "function",
   :arglists ([& args]),
   :doc "Lazy loaded version of clojure.test.check.generators/list",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/list"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "map",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L95",
   :line 95,
   :var-type "function",
   :arglists ([& args]),
   :doc "Lazy loaded version of clojure.test.check.generators/map",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/map"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "not-empty",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L95",
   :line 95,
   :var-type "function",
   :arglists ([& args]),
   :doc
   "Lazy loaded version of clojure.test.check.generators/not-empty",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/not-empty"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "one-of",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L95",
   :line 95,
   :var-type "function",
   :arglists ([& args]),
   :doc "Lazy loaded version of clojure.test.check.generators/one-of",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/one-of"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "ratio",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L118",
   :line 118,
   :var-type "function",
   :arglists ([& args]),
   :doc "Fn returning clojure.test.check.generators/ratio",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/ratio"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "return",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L95",
   :line 95,
   :var-type "function",
   :arglists ([& args]),
   :doc "Lazy loaded version of clojure.test.check.generators/return",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/return"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "sample",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L95",
   :line 95,
   :var-type "function",
   :arglists ([& args]),
   :doc "Lazy loaded version of clojure.test.check.generators/sample",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/sample"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "set",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L95",
   :line 95,
   :var-type "function",
   :arglists ([& args]),
   :doc "Lazy loaded version of clojure.test.check.generators/set",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/set"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "shuffle",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L95",
   :line 95,
   :var-type "function",
   :arglists ([& args]),
   :doc "Lazy loaded version of clojure.test.check.generators/shuffle",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/shuffle"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "simple-type",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L118",
   :line 118,
   :var-type "function",
   :arglists ([& args]),
   :doc "Fn returning clojure.test.check.generators/simple-type",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/simple-type"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "simple-type-printable",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L118",
   :line 118,
   :var-type "function",
   :arglists ([& args]),
   :doc
   "Fn returning clojure.test.check.generators/simple-type-printable",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/simple-type-printable"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "string",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L118",
   :line 118,
   :var-type "function",
   :arglists ([& args]),
   :doc "Fn returning clojure.test.check.generators/string",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/string"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "string-alphanumeric",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L118",
   :line 118,
   :var-type "function",
   :arglists ([& args]),
   :doc
   "Fn returning clojure.test.check.generators/string-alphanumeric",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/string-alphanumeric"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "string-ascii",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L118",
   :line 118,
   :var-type "function",
   :arglists ([& args]),
   :doc "Fn returning clojure.test.check.generators/string-ascii",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/string-ascii"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "such-that",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L95",
   :line 95,
   :var-type "function",
   :arglists ([& args]),
   :doc
   "Lazy loaded version of clojure.test.check.generators/such-that",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/such-that"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "symbol",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L118",
   :line 118,
   :var-type "function",
   :arglists ([& args]),
   :doc "Fn returning clojure.test.check.generators/symbol",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/symbol"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "symbol-ns",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L118",
   :line 118,
   :var-type "function",
   :arglists ([& args]),
   :doc "Fn returning clojure.test.check.generators/symbol-ns",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/symbol-ns"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "tuple",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L95",
   :line 95,
   :var-type "function",
   :arglists ([& args]),
   :doc "Lazy loaded version of clojure.test.check.generators/tuple",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/tuple"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "uuid",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L118",
   :line 118,
   :var-type "function",
   :arglists ([& args]),
   :doc "Fn returning clojure.test.check.generators/uuid",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/uuid"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "vector",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L95",
   :line 95,
   :var-type "function",
   :arglists ([& args]),
   :doc "Lazy loaded version of clojure.test.check.generators/vector",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/vector"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj",
   :name "vector-distinct",
   :file "src/main/clojure/clojure/spec/gen/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/31165fec69ff86129a1ada8b3f50864922dfc88a/src/main/clojure/clojure/spec/gen/alpha.clj#L95",
   :line 95,
   :var-type "function",
   :arglists ([& args]),
   :doc
   "Lazy loaded version of clojure.test.check.generators/vector-distinct",
   :namespace "clojure.spec.gen.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.gen.alpha-api.html#clojure.spec.gen.alpha/vector-distinct"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/f23ea614b3cb658cff0044a027cacdd76831edcf/src/main/clojure/clojure/spec/test/alpha.clj",
   :name "abbrev-result",
   :file "src/main/clojure/clojure/spec/test/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/f23ea614b3cb658cff0044a027cacdd76831edcf/src/main/clojure/clojure/spec/test/alpha.clj#L439",
   :line 439,
   :var-type "function",
   :arglists ([x]),
   :doc
   "Given a check result, returns an abbreviated version\nsuitable for summary use.",
   :namespace "clojure.spec.test.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.test.alpha-api.html#clojure.spec.test.alpha/abbrev-result"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/f23ea614b3cb658cff0044a027cacdd76831edcf/src/main/clojure/clojure/spec/test/alpha.clj",
   :name "check",
   :file "src/main/clojure/clojure/spec/test/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/f23ea614b3cb658cff0044a027cacdd76831edcf/src/main/clojure/clojure/spec/test/alpha.clj#L373",
   :line 373,
   :var-type "function",
   :arglists ([] [sym-or-syms] [sym-or-syms opts]),
   :doc
   "Run generative tests for spec conformance on vars named by\nsym-or-syms, a symbol or collection of symbols. If sym-or-syms\nis not specified, check all checkable vars.\n\nThe opts map includes the following optional keys, where stc\naliases clojure.spec.test.check: \n\n::stc/opts  opts to flow through test.check/quick-check\n:gen        map from spec names to generator overrides\n\nThe ::stc/opts include :num-tests in addition to the keys\ndocumented by test.check. Generator overrides are passed to\nspec/gen when generating function args.\n\nReturns a lazy sequence of check result maps with the following\nkeys\n\n:spec       the spec tested\n:sym        optional symbol naming the var tested\n:failure    optional test failure\n::stc/ret   optional value returned by test.check/quick-check\n\nThe value for :failure can be any exception. Exceptions thrown by\nspec itself will have an ::s/failure value in ex-data:\n\n:check-failed   at least one checked return did not conform\n:no-args-spec   no :args spec provided\n:no-fn          no fn provided\n:no-fspec       no fspec provided\n:no-gen         unable to generate :args\n:instrument     invalid args detected by instrument",
   :namespace "clojure.spec.test.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.test.alpha-api.html#clojure.spec.test.alpha/check"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/f23ea614b3cb658cff0044a027cacdd76831edcf/src/main/clojure/clojure/spec/test/alpha.clj",
   :name "check-fn",
   :file "src/main/clojure/clojure/spec/test/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/f23ea614b3cb658cff0044a027cacdd76831edcf/src/main/clojure/clojure/spec/test/alpha.clj#L356",
   :line 356,
   :var-type "function",
   :arglists ([f spec] [f spec opts]),
   :doc
   "Runs generative tests for fn f using spec and opts. See\n'check' for options and return.",
   :namespace "clojure.spec.test.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.test.alpha-api.html#clojure.spec.test.alpha/check-fn"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/f23ea614b3cb658cff0044a027cacdd76831edcf/src/main/clojure/clojure/spec/test/alpha.clj",
   :name "checkable-syms",
   :file "src/main/clojure/clojure/spec/test/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/f23ea614b3cb658cff0044a027cacdd76831edcf/src/main/clojure/clojure/spec/test/alpha.clj#L364",
   :line 364,
   :var-type "function",
   :arglists ([] [opts]),
   :doc
   "Given an opts map as per check, returns the set of syms that\ncan be checked.",
   :namespace "clojure.spec.test.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.test.alpha-api.html#clojure.spec.test.alpha/checkable-syms"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/f23ea614b3cb658cff0044a027cacdd76831edcf/src/main/clojure/clojure/spec/test/alpha.clj",
   :name "enumerate-namespace",
   :file "src/main/clojure/clojure/spec/test/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/f23ea614b3cb658cff0044a027cacdd76831edcf/src/main/clojure/clojure/spec/test/alpha.clj#L44",
   :line 44,
   :var-type "function",
   :arglists ([ns-sym-or-syms]),
   :doc
   "Given a symbol naming an ns, or a collection of such symbols,\nreturns the set of all symbols naming vars in those nses.",
   :namespace "clojure.spec.test.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.test.alpha-api.html#clojure.spec.test.alpha/enumerate-namespace"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/f23ea614b3cb658cff0044a027cacdd76831edcf/src/main/clojure/clojure/spec/test/alpha.clj",
   :name "instrument",
   :file "src/main/clojure/clojure/spec/test/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/f23ea614b3cb658cff0044a027cacdd76831edcf/src/main/clojure/clojure/spec/test/alpha.clj#L211",
   :line 211,
   :var-type "function",
   :arglists ([] [sym-or-syms] [sym-or-syms opts]),
   :doc
   "Instruments the vars named by sym-or-syms, a symbol or collection\nof symbols, or all instrumentable vars if sym-or-syms is not\nspecified.\n\nIf a var has an :args fn-spec, sets the var's root binding to a\nfn that checks arg conformance (throwing an exception on failure)\nbefore delegating to the original fn.\n\nThe opts map can be used to override registered specs, and/or to\nreplace fn implementations entirely. Opts for symbols not included\nin sym-or-syms are ignored. This facilitates sharing a common\noptions map across many different calls to instrument.\n\nThe opts map may have the following keys:\n\n  :spec     a map from var-name symbols to override specs\n  :stub     a set of var-name symbols to be replaced by stubs\n  :gen      a map from spec names to generator overrides\n  :replace  a map from var-name symbols to replacement fns\n\n:spec overrides registered fn-specs with specs your provide. Use\n:spec overrides to provide specs for libraries that do not have\nthem, or to constrain your own use of a fn to a subset of its\nspec'ed contract.\n\n:stub replaces a fn with a stub that checks :args, then uses the\n:ret spec to generate a return value.\n\n:gen overrides are used only for :stub generation.\n\n:replace replaces a fn with a fn that checks args conformance, then\ninvokes the fn you provide, enabling arbitrary stubbing and mocking.\n\n:spec can be used in combination with :stub or :replace.\n\nReturns a collection of syms naming the vars instrumented.",
   :namespace "clojure.spec.test.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.test.alpha-api.html#clojure.spec.test.alpha/instrument"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/f23ea614b3cb658cff0044a027cacdd76831edcf/src/main/clojure/clojure/spec/test/alpha.clj",
   :name "instrumentable-syms",
   :file "src/main/clojure/clojure/spec/test/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/f23ea614b3cb658cff0044a027cacdd76831edcf/src/main/clojure/clojure/spec/test/alpha.clj#L200",
   :line 200,
   :var-type "function",
   :arglists ([] [opts]),
   :doc
   "Given an opts map as per instrument, returns the set of syms\nthat can be instrumented.",
   :namespace "clojure.spec.test.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.test.alpha-api.html#clojure.spec.test.alpha/instrumentable-syms"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/f23ea614b3cb658cff0044a027cacdd76831edcf/src/main/clojure/clojure/spec/test/alpha.clj",
   :name "summarize-results",
   :file "src/main/clojure/clojure/spec/test/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/f23ea614b3cb658cff0044a027cacdd76831edcf/src/main/clojure/clojure/spec/test/alpha.clj#L449",
   :line 449,
   :var-type "function",
   :arglists ([check-results] [check-results summary-result]),
   :doc
   "Given a collection of check-results, e.g. from 'check', pretty\nprints the summary-result (default abbrev-result) of each.\n\nReturns a map with :total, the total number of results, plus a\nkey with a count for each different :type of result.",
   :namespace "clojure.spec.test.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.test.alpha-api.html#clojure.spec.test.alpha/summarize-results"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/f23ea614b3cb658cff0044a027cacdd76831edcf/src/main/clojure/clojure/spec/test/alpha.clj",
   :name "unstrument",
   :file "src/main/clojure/clojure/spec/test/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/f23ea614b3cb658cff0044a027cacdd76831edcf/src/main/clojure/clojure/spec/test/alpha.clj#L260",
   :line 260,
   :var-type "function",
   :arglists ([] [sym-or-syms]),
   :doc
   "Undoes instrument on the vars named by sym-or-syms, specified\nas in instrument. With no args, unstruments all instrumented vars.\nReturns a collection of syms naming the vars unstrumented.",
   :namespace "clojure.spec.test.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.test.alpha-api.html#clojure.spec.test.alpha/unstrument"}
  {:raw-source-url
   "https://github.com/clojure/spec.alpha/raw/f23ea614b3cb658cff0044a027cacdd76831edcf/src/main/clojure/clojure/spec/test/alpha.clj",
   :name "with-instrument-disabled",
   :file "src/main/clojure/clojure/spec/test/alpha.clj",
   :source-url
   "https://github.com/clojure/spec.alpha/blob/f23ea614b3cb658cff0044a027cacdd76831edcf/src/main/clojure/clojure/spec/test/alpha.clj#L68",
   :line 68,
   :var-type "macro",
   :arglists ([& body]),
   :doc "Disables instrument's checking of calls, within a scope.",
   :namespace "clojure.spec.test.alpha",
   :wiki-url
   "https://clojure.github.io/spec.alpha//clojure.spec.test.alpha-api.html#clojure.spec.test.alpha/with-instrument-disabled"})}
