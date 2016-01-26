package com.github.ogress;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface OgressObjectSerializer {
    @NotNull
    byte[] toRawData(@NotNull Object object);

    @Nullable
    Object fromRawData(@NotNull byte[] bytes, @NotNull OgressFieldInfo fieldInfo);
}
