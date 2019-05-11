install:
	(cd lib/skyapi && mvn clean install)

test-ci:
	(cd lib/skyapi && mvn test)
