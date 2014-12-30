/*
 * Copyright 2014 Bauer-Live Softwaredevelopment.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.highfaces.component.api.impl;

import java.io.Serializable;
import org.highfaces.component.api.DataPoint;

/**
 *
 * @author Markus
 */
public class DefaultDataPoint implements Serializable, DataPoint {

    private static final long serialVersionUID = -1343548990268095084L;
    protected Number value;
    protected Object name;

    public DefaultDataPoint(Object name, Number value) {
        this.value = value;
        this.name = name;
    }

    public DefaultDataPoint() {
    }

    @Override
    public Number getValue() {
        return value;
    }

    public void setValue(Number value) {
        this.value = value;
    }

    @Override
    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

}
