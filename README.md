# vmware-hackathon-noir

A website written in noir. 

## Usage

Use leiningen2 - https://github.com/technomancy/leiningen

```bash
lein deps
lein run
```

To create a war, run the following (check the sample leiningen2 profiles.clj in the docs/ folder for default plugins to use - copy to ~/.lein/ or merge with existing.)
```bash
lein ring uberwar
```

## License

Copyright (C) 2011 FIXME

Distributed under the Eclipse Public License, the same as Clojure.

