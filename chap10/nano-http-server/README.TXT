sbt test may cause a failed test, e.g.

[info] Light Server should
[error] x return the contents of available resource
[error]    'Date Thu Apr 19 17:51:55 CEST 2012' is not equal to 'Date Thu Apr 19 17:51:56 CEST 2012' (ServerSpecs.scala:10)
[error] Expected: ...:51:5[6] CEST...
[error] Actual:   ...:51:5[5] CEST...

This may be due to timing differences between your computer and the server where you lookup the data.

You have at least two options:
a) rerun with "sbt test" several times till the time difference is small enough to pass the test or
b) calibrate your computer to the internet time of a reference server e.g. ntp1.theremailer.net and rerun the test which will
   increase the possibility of a passed test. or
c) change the test to check for the data independent of the time e.g. with a regular expression match.

It's up to you :-)