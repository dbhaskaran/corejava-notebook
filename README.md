# corejava-notebook
A repository of some fun and interesting core java code that can be used to learn or revise core java concepts.

#### Prerequisite:
- [Java Development Kit](http://www.oracle.com/technetwork/java/javase/downloads/index-jsp-138363.html)
- [Eclipse IDE](http://www.eclipse.org/downloads/packages)

#### Core Java - Developer's Notebook
1. Hello World

#### Docker Containers
MySQL on Docker:
```shell
$ docker pull mysql
$ docker run -d --name mysql_java -p 3306:3306 -v /Users/mysql:/var/lib/mysql -e 'MYSQL_ROOT_NAME=root' -e 'MYSQL_ROOT_PASSWORD=tiger' mysql
$ docker exec -it mysql_java bash
$ mysql -uroot -p
```

MongoDB on Docker:
```shell
$ docker run -d --name mongoj -p 27017:27017 -v /Users/myapp:/data/db mongo
$ docker exec -it mongoj bash
```

---
##### Reference:
- [Head First Java, 2nd Edition](https://www.amazon.com/Head-First-Java-Kathy-Sierra/dp/0596009208)
- [Core Java Volume I--Fundamentals (10th Edition)](https://www.amazon.com/Core-Java-I-Fundamentals-10th/dp/0134177304)
- [Core Java, Volume II--Advanced Features (10th Edition)](https://www.amazon.com/Core-Java-II-Advanced-Features-10th/dp/0134177290)
- [Core Java for the Impatient](https://www.amazon.com/Core-Java-Impatient-Cay-Horstmann/dp/0321996321)
- [Java SE8 for the Really Impatient](https://www.amazon.com/Java-SE8-Really-Impatient-Course/dp/0321927761)
- [Java The Complete Reference, Ninth Edition](https://www.amazon.com/Java-Complete-Reference-Herbert-Schildt/dp/0071808558)
-