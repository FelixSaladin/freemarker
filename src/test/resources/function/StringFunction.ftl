001: ${"hello world"[0]}
001: ${"hello world"[0..5]}
001: ${"hello world"?substring(0)}
002: ${"hello world"?substring(0,1)}
003: ${"hello world"?cap_first}<#-- 首字母大写 -->
004: ${"HELLO WORLD"?uncap_first}<#-- 首字母小写 -->
005: ${"hello world"?upper_case}
006: ${"HELLO WORLD"?lower_case}
007: ${"hello world"?index_of("o")}
008: ${"hello world"?last_index_of("o")}
009: ${"hello world"?capitalize}<#-- 单词首字母大写 -->
010: ${"2.14"?number + 1}
011: ${"hello world"?starts_with("hello")?string}
012: ${"hello world"?ends_with("world")?string}
013: ${" hello world "?trim}
014: ${"hello world"?length}
015: ${"hello world"?contains("world")?string}
016: ${"hello"?left_pad(10, "-")}
017: ${"hello"?right_pad(10, "-")}
018: ${"hello world"?replace("o", "O")}
019: ${"< > & \" '"?xml}
020: ${"< > & \" '"?html}
021: ${"< > & \" '"?xhtml}
${"\", \', \\, \n, \r, \t, \b, \f, \l, \g, \a"}
${r"${hello world}"}
022: ${"http://www.baidu.com?username=张 张"?url("UTF-8")}
023: ${"hello"?matches("hello*")?string}
024: ${"hello"?matches("hell*")?string}
025: 
    <#list "rmb/Kg; rmb/m;"?matches("(\\w[^/]+)/([^;]+);") as m>
    ${m} is ${m?groups[1]} per ${m?groups[2]}
    </#list>
026:
    <#list "hello,world"?split(",") as x>
    ${x}
    </#list>
027:
    <#list "I love you"?word_list as x>
    ${x}
    </#list>
028: ${'["hello"],["world"]'?json_string}
029: ${"hello'world"?js_string}
030: ${'hello"world'?j_string}