package me.xtrm.mod2xloader.util;

import lombok.Data;

public @Data class Library {

    private final String groupId, name, version;
    private String identifier = "jar";

}
