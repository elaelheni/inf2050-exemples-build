PROGRAM = application.jar
JAVA_FILE_LIST := list.javas

all: $(PROGRAM)

$(JAVA_FILE_LIST):
	find . -name '*.java' > $@

compile: $(JAVA_FILE_LIST)
	javac @$<

$(PROGRAM): compile
	jar cfm $@ manifest *.class

clean:
	-rm -f *.class
	-rm -f $(PROGRAM)

.INTERMEDIATE: $(JAVA_FILE_LIST)
.PHONY: all compile clean 
