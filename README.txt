Modified by 201online:
* Switch to Jackson 2.x
* Minor API changes
** RequestFailedException is now a subclass of IOException, instead of the very high level Throwable

For example usage, see the integration tests in src/it/java. You'll need to create a file called mandrill.properties 
and put it somewhere on the classpath. It'll need the following properties.

apiKey=
email.from=
email.to.name1=
email.to.address1=
email.to.name2=
email.to.address2=
verify.email=