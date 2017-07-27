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

import lombok.Getter;
import org.springframework.data.annotation.PersistenceConstructor;


@Getter
public final class Description200 {
    private final String value;
    private final LanguageCode languageCode;

    @PersistenceConstructor
    public Description200(String value, LanguageCode languageCode) {
        if (value.length() <= 200) {
            this.value = value;
            this.languageCode = languageCode;
        } else {
            throw new IllegalArgumentException("Invalid Description200 value");
        }
    }
}
