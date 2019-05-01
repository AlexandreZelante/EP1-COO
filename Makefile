build:
	make clean
	mkdir -p bin
	javac -g -d 'bin/' src/org/reuniao/*

clean:
	rm -rf bin

run:
	java -cp bin reuniao.Main
