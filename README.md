# bloop-scalatest

Demonstrates that bloop doesn't generate ScalaTest index.html

Steps to reproduce:

```
git clone git@github.com:eanderson13/bloop-scalatest.git
cd bloop-scalatest
sbt assembly bloopInstall sbt/test
scala -cp target/scala-2.13/bloop-scalatest-assembly-0.1.0-SNAPSHOT.jar org.scalatest.tools.Runner -R target/scala-2.13/test-classes -h target/html
bloop test bloop
[ -f sbt/target/html/index.html ] && echo "sbt generates index.html" || echo "sbt doesn't generate index.html"
[ -f target/html/index.html ] && echo "runner generates index.html" || echo "runner doesn't generate index.html"
[ -f bloop/target/html/index.html ] && echo "bloop generates index.html" || echo "bloop doesn't generate index.html"
``` 