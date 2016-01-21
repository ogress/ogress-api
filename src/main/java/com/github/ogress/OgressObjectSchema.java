package com.github.ogress;

import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

public final class OgressObjectSchema {
    public final String typeName;
    public final Map<String, FieldAccessor> fields;

    public OgressObjectSchema(String typeName, Map<String, FieldAccessor> fields) {
        this.typeName = typeName;
        this.fields = fields;
    }

    public static class FieldAccessor {
        @Nullable
        Field field;
        @Nullable
        Method getter;
        @Nullable
        Method setter;

        public FieldAccessor(@Nullable Field field, @Nullable Method getter, @Nullable Method setter) {
            this.field = field;
            this.getter = getter;
            this.setter = setter;
        }
    }
}
