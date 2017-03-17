
`Object.freeze(Object.prototype)` breaks Closure Library:


```
=>> node main.js
/Users/chen/repo/gist/freeze/main.js:166
Ca.prototype.toString = function(a) {
                      ^

TypeError: Cannot assign to read only property 'toString' of object '#<Ca>'
    at Object.<anonymous> (/Users/chen/repo/gist/freeze/main.js:166:23)
    at Module._compile (module.js:571:32)
    at Object.Module._extensions..js (module.js:580:10)
    at Module.load (module.js:488:32)
    at tryModuleLoad (module.js:447:12)
    at Function.Module._load (module.js:439:3)
    at Module.runMain (module.js:605:10)
    at run (bootstrap_node.js:418:7)
    at startup (bootstrap_node.js:139:9)
    at bootstrap_node.js:533:3
```

In Weex, they use `Object.freeze`. In ClojureScript we use Closure Library. And BOOM! https://youtu.be/I69pGyHbfgI

Would be fixed with `Object.seal` https://github.com/apache/incubator-weex/pull/109
