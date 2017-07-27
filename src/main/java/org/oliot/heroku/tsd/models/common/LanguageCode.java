/*
 * Copyright 2017 Open Language for Internet of Things (Oliot)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.oliot.heroku.tsd.models.common;

import lombok.Data;
import org.springframework.data.annotation.PersistenceConstructor;


@Data
public final class LanguageCode {
    private final String value;

    @PersistenceConstructor
    public LanguageCode(String value) {
        // TODO: validate against ISO639
        if (value.length() == 2 && value.matches("[a-z]+")) {
            this.value = value;
        } else {
            throw new IllegalArgumentException("Invalid LanguageCode value");
        }
    }
}
