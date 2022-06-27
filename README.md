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








