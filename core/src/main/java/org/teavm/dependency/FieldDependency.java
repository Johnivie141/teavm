/*
 *  Copyright 2014 Alexey Andreev.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.teavm.dependency;

import org.teavm.model.FieldReader;
import org.teavm.model.FieldReference;

/**
 *
 * @author Alexey Andreev
 */
public class FieldDependency implements FieldDependencyInfo {
    private DependencyNode value;
    private FieldReader field;
    private FieldReference reference;

    FieldDependency(DependencyNode value, FieldReader field, FieldReference reference) {
        this.value = value;
        this.field = field;
        this.reference = reference;
    }

    @Override
    public DependencyNode getValue() {
        return value;
    }

    public FieldReader getField() {
        return field;
    }

    @Override
    public FieldReference getReference() {
        return reference;
    }

    @Override
    public boolean isMissing() {
        return field == null;
    }
}