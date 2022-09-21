@Id
===
    neo4j里默认会创建一个自增id，在官网和一些书籍里面都补建议使用它，它是Long类自增的，并且在在删除原来的节点后
    它可能还会创建一个相同的id出现，所以不建议使用。这里我们自己创建一个uuid作为主键，但是这个主键并不会创建索引
    ，如果需要索引，需要我们自己创建
数据库备份
===
    neo4j目前有三种备份方式：    
    （1）java在线备份，通过java程序可在neo4j启动状态下备份数据，也可远程备份（社区版本目前不支持）    
    （2）neo4j-admin工具，可在neo4j数据库关闭情况下本地备份    
    （3）neo4j-backup工具，可在neo4j启动状态下在线备份，可远程备份。    
      采用以上备份之前，需要在conf/neo4j.conf中配置如下内容：    
    　　dbms.backup.enabled=true    
    　　dbms.backup.address=<主机名或者ip>:6362
Linux备份脚本
===
    time=date '+%y-%m-%d %H:%M:%S' 
    file=date '+%y-%m-%d' 
    echo $time 
    echo $file 
    echo ‘开始备份…’ 
    /home/neo4j/neo4j-enterprise-2.3.1/bin/ neo4j-admin backup  --from 192.168.0.10 --backup-dir=/home/noe4j/databackup/$file --name=graph.db
    echo ‘备份完成’
    
问题
===
    如何创建指定类型的数据
    是否支持集群
    如何使用索引
    sql优化
    
    创建的数据必须唯一，不可有重复记录，如何自定义id
