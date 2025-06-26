package com.metaverse.springpreparedemo;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Memo {
    private final String username;
    private String contents;
}
