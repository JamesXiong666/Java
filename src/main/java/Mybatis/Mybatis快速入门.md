## 搭建Mybatis开发环境
### 创建mysql数据库和表
数据库名ssm：表明student
```sql
CREATE TABLE `student` (
  `id` int(11) NOT NULL ,
  `name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

```