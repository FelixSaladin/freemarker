001: ${true?string}
002: ${false?string}
003: ${true?string("TURE", "FALSE")}
004: ${false?string("TURE", "FALSE")}
005: ${"hello"?is_string?string}
006: ${1?is_number?string}
007: ${true?is_boolean?string}
008: ${"2008-08-08"?date?is_date?string}
009: ${""?is_method?string}
010: ${""?is_transform?string}
011: ${""?is_macro?string}
012: ${""?is_hash?string}
013: ${""?is_hash_ex?string}
014: ${""?is_sequence?string}
015: ${""?is_collection?string}
016: ${""?is_enumerable?string}
017: ${""?is_indexable?string}
018: ${""?is_directive?string}
019: ${""?is_node?string}
