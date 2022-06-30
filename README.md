# java-learning-blog

## 1. markdown
**Hello**
*Hello*
***Hello***
~~Hello~~

### 引用
> Hello

### 分割
---
***

### 圖片
![Hello](https://www.9900news.com/images/vimg/2104/202107130500070.webp)

### link
[go](https://github.com/Shuaigle)

### list
1. A
2. B
3. C
- A
- B
- C

### table
name|sex|birth
--|--|--|
kevin|male|1111

### code
```public static void main```
`Hello`


## java version

- javaSE standard
- ~~javaME~~ ~~已死~~
- javaEE web/server

## JDK JRE JVM 是啥
- JDK: Java Development Kit include JRE and JVM
- JRE: Java Runtime Environment include JVM
- JVM: Java Virtual Machine 
- ![JDK](https://devops.com.vn/wp-content/uploads/2018/07/jdk_jre_jvm.png)

## Install java17 on Mac
[Install](https://www.youtube.com/watch?v=SdKIBGnkhDY)
---
check if success-> open terminal ```java -version```

## Install intellij IDEA
[IDEA](https://www.jetbrains.com/idea/download/#section=mac)

## *new*
- when using `new` -> you construct object with new memory space names **heap**
- temp variable stores in **stack**

## `static`
- `static` belongs to the class, it can only be used by class\
- the `static {}` block is the first block that loaded when `new` an object\
- it was superior to the constructor\
- static block -> constructor block\
- `static` method can not be override by child class, since it was not an instance method.

## `final`
- if `public final Person {}` , then this class can not be inherited. Since the final appeared.

## `abstract`
- `abstract` is a class or method modifier
- some objects/class inherits from `abstract` method/class should override the methods of its parent's methods.
- `abstract` class can not be `new`

## `interface`
- can not write method -> always `abstract`
- default modifier of method is `public abstract`
- when a class `implements` an interface -> this class must `@Override` each method of **interface**

## nested class
- initiate inner class by outer class
- inner class can get outer class's private attributes
- a java class can only exist a `public` class

---
# TCP/IP

---
- ip
  - ipv4/ipv6
  - public/private
- port
  - public: 0~ 1023
  - process: Tomcat: 8080/ MySQL: 3306
  - dynamic
- 192.168.16.124:8888
- four layers
  - application: http/snmp/smtp/dns
  - transport: tcp
  - network: ip
  - data and link: ethernet/ieee 802.1A
  

# Thread

## properly stop a thread
- `thread.interrupt()` is a perfect way to stop a thread.\
- other than **flag** method, `interrupt` can immediately stop an interruptable thread.
- **flag** has to run through all block of call which spent more time and may not interrupt the thread.


# [JVM](https://docs.oracle.com/javase/specs/jvms/se17/jvms17.pdf) (Java Virtual Machine)
![JVM](https://simplesnippets.tech/wp-content/uploads/2018/03/java-execution-flow-diagram-1280x720.jpg)

![JVM wiki](https://upload.wikimedia.org/wikipedia/commons/d/dd/JvmSpec7.png)

# Introduction to MySQL
## Download
[Download MySQL](https://www.sqlshack.com/how-to-install-mysql-database-server-8-0-19-on-windows-10/)
## Connect to MySQL through terminal
1. set the PATH variable -> mysql/bin/
2. `mysql -u root -p` and enter the key
3. `show database;` list all dbs
4. `update mysql.user set authentication_string=password('yourpassword') where user='root' and Host='localhost'` change the password
5. `use database_name;` switch database by name
6. `show tables;` show tables in database
7. `describe table_name;` show Fields in the table by name
8. `create database your_database_name`
9. `exit`
10. `--` comment in sql
11. `/**/` multi-line comment in sql
## database operations
1. `CREATE DATABASE IF NOT EXIST database;` create database
2. `DROP DATABASE database;` delete database
3. ``USE `database`; ``
4. ``SELECT `user` FROM student;``
## [MyISAM vs InnoDB](https://hevodata.com/learn/myisam-vs-innodb/)
- My Indexed Sequential Access Method
- InnoDB has **row-level locking**. MyISAM only has full table-level locking.
- InnoDB has what is called **referential integrity** which involves supporting foreign keys (RDBMS) and relationship constraints, MyISAM does not (DMBS).
- InnoDB supports **transactions**, which means you can commit and roll back. MyISAM does not.
- InnoDB is more reliable as it uses **transactional logs** for auto recovery. MyISAM does not.
- InnoDB is faster to write, MyISAM is faster to read
- InnoDB supports to ACID
- InnoDB's file: *.frm and ibdata1 files
- MyISAM's file
  - *.frm -> table structure
  - *.MYD -> data
  - *.MYI -> index
## table setting
`charset=utf8` implements mandarin\
Alternatively set in my.ini file `character-set-server=utf8`
## update and delete table
- `ALTER TABLE teacher RENAME AS tc`
- `ALTER TABLE tc ADD age INT(9)`
- `ALTER TABLE tc MODIFY age VARCHAR(9)`
  - MODIFY the data type of the column
- `ALTER TABLE tc CHANGE age age1 INT(1)`
  - change column name
- [MODIFY vs CHANGE](https://stackoverflow.com/questions/14767174/modify-column-vs-change-column)
- `ALTER TABLE tc DROP age1`
- `DROP TABLE IF EXISTS tc`
## ADD FOREIGN KEY
- `ALTER TABLE student ADD CONSTRAINT FK_gradeid FOREIGN KEY(gradeid) REFERENCES grade(gradeid)` 
- if db exists too many relational tables, it will add fuzzy when deleting
- We only store merely table in sql, do not add any relation
- we add relation with code
## [DML](https://www.geeksforgeeks.org/sql-ddl-dql-dml-dcl-tcl-commands/) data manipulation language
- insert
  - `INSERT INTO tablename(colname1, colname2) VALUES('value1', 'value2'), ('value1', 'value2'), ('value1', 'value2')`
- update
  - `UPDATE tablename SET colname1='value1' WHERE colname2=value2`
  - [where condition operators](https://www.dataquest.io/blog/sql-operators/#:~:text=What%20are%20SQL%20operators%3F,buttons%20on%20a%20calculator%20function.)
- delete
  - `DELETE FROM tablename WHERE colname=value;`
  - `TRUNCATE tablename` -> clean table with data, but structure still exists
    - auto count will re-count
  - InnoDB delete table and restart db -> auto increment will restart from 1 -> since data store in cache -> restart will miss the data
  - MyISAM -> continue counting the auto increment value -> store in disk (file)
## DQL data query language
- select
  - `SELECT * FROM tablename` select all
  - `SELECT colname1 AS c1, colname2 AS c2 FROM tablename AS tb`
  - `SELECT CONCAT(Concatvalue, old_colname) AS new_colname FROM tablename`
  - `SELECT DISTINCT` 
  - `SELECT VERSION()` select system version
  - `SELECT @@auto_increment_increment`
- where
  - return value => boolean
  - [like](https://www.w3schools.com/sql/sql_like.asp)
  - explicit vs implicit
  - `SELECT * FROM table WHERE colname BETWEEN val1 AND val2`
  - `SELECT colname FORM table WHERE colname2 LIKE 'pattern%'` match the pattern*****
  - `SELECT colname FORM table WHERE colname2 LIKE 'pattern_'` match the pattern*
  - `SELECT colname FORM table WHERE colname2 LIKE '%pattern%'`
  - `SELECT colname FORM table WHERE colname2 IN(v1, v2, v3)`
- **[join](https://www.w3schools.com/sql/sql_join.asp)**
  - ![join](https://user-images.githubusercontent.com/47733530/152173611-fe092793-7eb2-4b1a-a4ce-c0ed807c1b6e.png)
  - [where clause vs on clause](https://stackoverflow.com/questions/354070/sql-join-where-clause-vs-on-clause)
  
## [Transaction](https://www.w3resource.com/sql/controlling-transactions.php#:~:text=A%20transaction%20is%20a%20sequence,(undone%20from%20the%20database).)
1. `SET autocommit = 0`
2. `START TRANSACTION` necessary
3. `UPDATE account SET money=money+100 WHERE name = 'a'`
4. `UPDATE account SET money=money-100 WHERE name = 'b'`
5. `COMMIT` if COMMIT -> data will save durability
6. `ROLLBACK` if transaction failed -> rollback
7. `SET autocommit = 1` default = 1





