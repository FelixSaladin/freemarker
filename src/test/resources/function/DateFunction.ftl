001: ${birthday?date}
002: ${birthday?date?string.short}
003: ${birthday?date?string.medium}
004: ${birthday?date?string.long}
005: ${birthday?date?string.full}
006: ${birthday?date?string("yyyy-MM-dd")}

007: ${birthday?time}
008: ${birthday?time?string.short}
009: ${birthday?time?string.medium}
010: ${birthday?time?string.long}
011: ${birthday?time?string.full}
012: ${birthday?time?string("HH:mm:ss")}

013: ${birthday?datetime}
014: ${birthday?datetime?string.short}<#-- short同short_short -->
015: ${birthday?datetime?string.medium}<#-- medium同medium_medium -->
016: ${birthday?datetime?string.long}<#-- long同long_long -->
017: ${birthday?datetime?string.full}<#-- full同full_full -->
018: ${birthday?datetime?string("yyyy-MM-dd HH:mm:ss")}
<#-- utc: 本初子午线(0时区) -->
019: ${birthday?date?iso_utc}
020: ${birthday?time?iso_utc}
021: ${birthday?datetime?iso_utc}
<#-- local: 本地时区  -->
022: ${birthday?date?iso_local}
023: ${birthday?time?iso_local}
024: ${birthday?datetime?iso_local}
<#--
	h: 精确到 时
	m: 精确到 分
	ms:精确到 秒
 -->
025: ${birthday?date?iso_local_m}
026: ${birthday?time?iso_local_m}
027: ${birthday?datetime?iso_local_m}
<#-- nz: 不显示时区 -->
028: ${birthday?date?iso_local_nz}
029: ${birthday?time?iso_local_nz}
030: ${birthday?datetime?iso_local_nz}
<#-- 可按 iso_(utc|local)_(h|m|ms)_nz 的组合 -->
