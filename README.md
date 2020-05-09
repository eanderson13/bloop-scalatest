# bloop-scalatest

Demonstrates that bloop doesn't generate ScalaTest index.html

Steps to reproduce:

```
git clone git@github.com:eanderson13/bloop-scalatest.git
cd bloop-scalatest
sbt sbt/test
sbt bloopInstall
bloop test bloop
[ -f sbt/target/html/index.html ] && echo "sbt generates index.html" || echo "sbt doesn't generate index.html"
[ -f bloop/target/html/index.html ] && echo "bloop generates index.html" || echo "bloop doesn't generate index.html"
``` 