/*
 * Copyright 2021 LinkedIn Corp.
 * Licensed under the BSD 2-Clause License (the "License").
 * See License in the project root for license information.
 */

package com.linkedin.avroutil1.model;

import java.util.Locale;

/**
 * parent class for all avro types
 */
public abstract class AvroSchema implements LocatedCode {
    protected final CodeLocation codeLocation;

    public AvroSchema(CodeLocation codeLocation) {
        this.codeLocation = codeLocation;
    }

    public abstract AvroType type();

    @Override
    public CodeLocation getCodeLocation() {
        return codeLocation;
    }

    @Override
    public String toString() {
        return type().name().toLowerCase(Locale.ROOT);
    }
}
