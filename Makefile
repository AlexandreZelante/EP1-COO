clean:
	rm -rf bin

build:
	make clean
	mkdir -p bin
	javac -g -d 'bin/' src/org/reuniao/*

run:
	java -cp bin reuniao.Main
