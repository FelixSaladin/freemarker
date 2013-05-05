001: ${usernames?first}
002: ${usernames?last}
003: ${usernames?seq_contains("Felix")?string("有", "无")}
004: ${usernames?seq_index_of("Justin")}<#-- 第0个开始向后找 -->
005: ${usernames?seq_index_of("Justin", 1)}<#-- 第1个开始向后找 -->
006: ${usernames?seq_last_index_of("Justin")}<#-- 最后一个开始向前找 -->
007: ${usernames?seq_last_index_of("Justin", 1)}<#-- 第1个开始向前找 -->
008: ${usernames?size}
009: <#list usernames?reverse as username>${username} </#list><#-- usernames不变 -->
010: <#list usernames?sort as username>${username} </#list><#-- usernames不变 -->
011: <#list users?sort_by(['username', 'first']) as user>${user.username.first} </#list>
012: 
    <#list [0,1,2,3,4,5,6,7,8,9]?chunk(5) as nn>
    <#list nn as n>${n}</#list>
    </#list>
