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

package org.oliot.heroku.tsd.models.modules.BasicProductInformation;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.constraints.Pattern;


@Getter
@RequiredArgsConstructor
public class TSD_TradeItemVariantTypeCode {
    /**
     * FLAVOUR: A quality that affects the sense of taste.
     * SCENT: A quality that affects the sense of scent
     */
    @Pattern(regexp = "FLAVOUR|SCENT", flags = Pattern.Flag.CASE_INSENSITIVE)
    private final String value;

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof TSD_TradeItemVariantTypeCode)) {
            return false;
        }

        TSD_TradeItemVariantTypeCode code = (TSD_TradeItemVariantTypeCode) obj;

        return new EqualsBuilder()
                .append(value, code.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(value)
                .toHashCode();
    }
}
