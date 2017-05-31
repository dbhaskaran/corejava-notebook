#My SQL Database Setup
## Docker Setup

```shell
$ docker pull mysql
$ docker run -d --name mysql_java -p 3306:3306 -v /Users/dbhaskaran/Documents/dockervol/mysql:/var/lib/mysql -e 'MYSQL_ROOT_NAME=root' -e 'MYSQL_ROOT_PASSWORD=tiger' mysql
$ docker exec -it mysql_java bash
$ mysql -uroot -p
```
```sql
show databases;
create database benjerry;
use benjerry;
show databases;

CREATE TABLE `Orders` (
  `id` mediumint(8) unsigned NOT NULL auto_increment,
  `FirstName` varchar(255) default NULL,
  `LastName` varchar(255) default NULL,
  `DOB` varchar(255),
  `Flavor` varchar(255) default NULL,
  PRIMARY KEY (`id`)
) AUTO_INCREMENT=1;

INSERT INTO `Orders` (`FirstName`,`LastName`,`DOB`,`Flavor`) VALUES ("Fletcher","Carpenter","10/05/1997","soups"),("Summer","Jones","11/09/1998","cereals"),("Tana","Lindsey","07/20/1985","pasta"),("Mallory","Houston","12/23/2009","salads"),("Jeremy","Cardenas","08/14/1983","stews"),("Tanner","Middleton","09/02/2013","sandwiches"),("Vance","Dudley","09/25/2014","pies"),("Burton","Gaines","04/02/2018","seafood"),("Priscilla","Rice","06/02/2016","sandwiches"),("Seth","Mcdonald","12/04/2017","pies");
INSERT INTO `Orders` (`FirstName`,`LastName`,`DOB`,`Flavor`) VALUES ("Janna","Holman","04/03/1995","desserts"),("Odysseus","Madden","11/13/1989","stews"),("Mannix","Hanson","06/06/1989","pies"),("Ruby","Pugh","03/10/2004","desserts"),("Ulric","Strickland","03/09/1984","pies"),("Brett","Shields","03/31/1991","cereals"),("Driscoll","Deleon","08/15/2014","pasta"),("Ciara","Horton","03/20/1995","cereals"),("Ray","Delaney","09/27/1993","soups"),("Megan","Nunez","07/23/2004","stews");
INSERT INTO `Orders` (`FirstName`,`LastName`,`DOB`,`Flavor`) VALUES ("Melodie","Roy","08/06/2007","soups"),("Peter","Mccarty","03/21/2011","seafood"),("Zephr","Arnold","04/08/2012","desserts"),("Kylan","Le","09/14/1986","stews"),("Tanisha","Singleton","09/23/2014","cereals"),("Neil","Valentine","04/13/1981","sandwiches"),("Bernard","Garner","03/12/2007","seafood"),("Brennan","Sparks","11/03/1982","pies"),("Emerald","Neal","07/19/1998","noodles"),("Fuller","Mcdonald","07/01/2017","salads");
INSERT INTO `Orders` (`FirstName`,`LastName`,`DOB`,`Flavor`) VALUES ("Caryn","Wells","08/24/2005","seafood"),("Jana","Calderon","07/04/1982","sandwiches"),("Ezekiel","Cook","10/06/2014","salads"),("Jacqueline","Ramsey","04/04/1997","desserts"),("Ciara","Swanson","12/26/1990","soups"),("Solomon","Sims","12/30/2000","soups"),("Shana","Lester","09/20/2012","noodles"),("MacKenzie","Kinney","01/21/1985","soups"),("Evelyn","Hammond","03/10/1997","desserts"),("Kenyon","Pittman","06/02/1993","soups");
INSERT INTO `Orders` (`FirstName`,`LastName`,`DOB`,`Flavor`) VALUES ("Kiayada","Frye","05/15/1996","soups"),("Quon","Parker","05/02/2011","noodles"),("Blair","Bartlett","07/17/2007","pasta"),("Charlotte","Alvarez","06/19/2005","stews"),("Clio","Leblanc","09/17/1983","seafood"),("Buffy","Ingram","07/05/2016","cereals"),("Dillon","Alvarez","10/26/2011","soups"),("Hedwig","Palmer","04/29/2011","sandwiches"),("Xandra","Kim","11/25/1985","seafood"),("Erich","Spears","09/10/1988","seafood");
INSERT INTO `Orders` (`FirstName`,`LastName`,`DOB`,`Flavor`) VALUES ("Naomi","Estrada","01/22/1986","stews"),("Grace","Hamilton","06/15/1987","soups"),("Lana","Phelps","11/03/1990","seafood"),("Isaac","Gibson","10/29/2000","salads"),("Ivy","Tyson","09/20/2015","cereals"),("Daryl","Combs","03/04/1998","pies"),("Paloma","Rosa","08/16/2005","sandwiches"),("Cole","Horn","07/14/1981","seafood"),("Shellie","Rivers","02/14/1987","seafood"),("Abra","Landry","01/11/2011","salads");
INSERT INTO `Orders` (`FirstName`,`LastName`,`DOB`,`Flavor`) VALUES ("Ila","Flowers","01/10/1988","desserts"),("Ezekiel","Cline","11/04/2001","salads"),("Solomon","Barrera","12/02/2015","pies"),("Sara","Howell","07/07/1986","noodles"),("Buckminster","Moss","10/21/2000","noodles"),("Valentine","Potts","05/02/1993","salads"),("Cade","Leach","11/08/1989","seafood"),("Jennifer","Singleton","12/25/2013","pies"),("Veronica","Whitley","06/13/1994","seafood"),("Jena","Cote","07/19/1995","salads");
INSERT INTO `Orders` (`FirstName`,`LastName`,`DOB`,`Flavor`) VALUES ("Jordan","Hester","04/15/2017","pies"),("Norman","Meyers","07/14/2009","noodles"),("Samantha","Mcfarland","08/08/1981","sandwiches"),("Arsenio","Peters","10/06/2012","seafood"),("Raphael","Wheeler","11/29/2003","salads"),("Zenaida","Hensley","12/10/2011","desserts"),("Ethan","Reyes","05/05/1981","pies"),("Marshall","Monroe","10/16/2013","stews"),("Amela","Burnett","08/19/2004","sandwiches"),("Clayton","Conner","04/11/1983","desserts");
INSERT INTO `Orders` (`FirstName`,`LastName`,`DOB`,`Flavor`) VALUES ("Geoffrey","Boyer","12/04/1994","cereals"),("Bernard","Ryan","05/22/1998","salads"),("Frances","Talley","11/01/1990","pasta"),("Debra","Ellison","08/24/1982","desserts"),("Bree","Sargent","09/14/1988","cereals"),("Suki","Kemp","01/18/2015","salads"),("Carson","Glass","03/27/1983","salads"),("Kylan","Morrison","06/17/1982","desserts"),("Richard","Fleming","12/23/1989","pasta"),("Victor","Patel","07/13/2013","noodles");
INSERT INTO `Orders` (`FirstName`,`LastName`,`DOB`,`Flavor`) VALUES ("Martena","Merritt","08/27/1993","stews"),("Robert","Randolph","04/07/2006","cereals"),("Lavinia","Goodman","07/23/1980","stews"),("Edan","Young","07/11/2010","stews"),("Len","Dodson","01/03/1997","soups"),("Honorato","Langley","11/11/1991","noodles"),("Desiree","Barr","01/05/2012","stews"),("Velma","Knox","11/28/1989","noodles"),("Blaze","Lucas","06/29/1994","seafood"),("Tamekah","Albert","01/12/1984","pies");
```